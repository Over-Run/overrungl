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
/// ### maxImageDimension1D
/// [VarHandle][#VH_maxImageDimension1D] - [Getter][#maxImageDimension1D()] - [Setter][#maxImageDimension1D(int)]
/// ### maxImageDimension2D
/// [VarHandle][#VH_maxImageDimension2D] - [Getter][#maxImageDimension2D()] - [Setter][#maxImageDimension2D(int)]
/// ### maxImageDimension3D
/// [VarHandle][#VH_maxImageDimension3D] - [Getter][#maxImageDimension3D()] - [Setter][#maxImageDimension3D(int)]
/// ### maxImageDimensionCube
/// [VarHandle][#VH_maxImageDimensionCube] - [Getter][#maxImageDimensionCube()] - [Setter][#maxImageDimensionCube(int)]
/// ### maxImageArrayLayers
/// [VarHandle][#VH_maxImageArrayLayers] - [Getter][#maxImageArrayLayers()] - [Setter][#maxImageArrayLayers(int)]
/// ### maxTexelBufferElements
/// [VarHandle][#VH_maxTexelBufferElements] - [Getter][#maxTexelBufferElements()] - [Setter][#maxTexelBufferElements(int)]
/// ### maxUniformBufferRange
/// [VarHandle][#VH_maxUniformBufferRange] - [Getter][#maxUniformBufferRange()] - [Setter][#maxUniformBufferRange(int)]
/// ### maxStorageBufferRange
/// [VarHandle][#VH_maxStorageBufferRange] - [Getter][#maxStorageBufferRange()] - [Setter][#maxStorageBufferRange(int)]
/// ### maxPushConstantsSize
/// [VarHandle][#VH_maxPushConstantsSize] - [Getter][#maxPushConstantsSize()] - [Setter][#maxPushConstantsSize(int)]
/// ### maxMemoryAllocationCount
/// [VarHandle][#VH_maxMemoryAllocationCount] - [Getter][#maxMemoryAllocationCount()] - [Setter][#maxMemoryAllocationCount(int)]
/// ### maxSamplerAllocationCount
/// [VarHandle][#VH_maxSamplerAllocationCount] - [Getter][#maxSamplerAllocationCount()] - [Setter][#maxSamplerAllocationCount(int)]
/// ### bufferImageGranularity
/// [VarHandle][#VH_bufferImageGranularity] - [Getter][#bufferImageGranularity()] - [Setter][#bufferImageGranularity(long)]
/// ### sparseAddressSpaceSize
/// [VarHandle][#VH_sparseAddressSpaceSize] - [Getter][#sparseAddressSpaceSize()] - [Setter][#sparseAddressSpaceSize(long)]
/// ### maxBoundDescriptorSets
/// [VarHandle][#VH_maxBoundDescriptorSets] - [Getter][#maxBoundDescriptorSets()] - [Setter][#maxBoundDescriptorSets(int)]
/// ### maxPerStageDescriptorSamplers
/// [VarHandle][#VH_maxPerStageDescriptorSamplers] - [Getter][#maxPerStageDescriptorSamplers()] - [Setter][#maxPerStageDescriptorSamplers(int)]
/// ### maxPerStageDescriptorUniformBuffers
/// [VarHandle][#VH_maxPerStageDescriptorUniformBuffers] - [Getter][#maxPerStageDescriptorUniformBuffers()] - [Setter][#maxPerStageDescriptorUniformBuffers(int)]
/// ### maxPerStageDescriptorStorageBuffers
/// [VarHandle][#VH_maxPerStageDescriptorStorageBuffers] - [Getter][#maxPerStageDescriptorStorageBuffers()] - [Setter][#maxPerStageDescriptorStorageBuffers(int)]
/// ### maxPerStageDescriptorSampledImages
/// [VarHandle][#VH_maxPerStageDescriptorSampledImages] - [Getter][#maxPerStageDescriptorSampledImages()] - [Setter][#maxPerStageDescriptorSampledImages(int)]
/// ### maxPerStageDescriptorStorageImages
/// [VarHandle][#VH_maxPerStageDescriptorStorageImages] - [Getter][#maxPerStageDescriptorStorageImages()] - [Setter][#maxPerStageDescriptorStorageImages(int)]
/// ### maxPerStageDescriptorInputAttachments
/// [VarHandle][#VH_maxPerStageDescriptorInputAttachments] - [Getter][#maxPerStageDescriptorInputAttachments()] - [Setter][#maxPerStageDescriptorInputAttachments(int)]
/// ### maxPerStageResources
/// [VarHandle][#VH_maxPerStageResources] - [Getter][#maxPerStageResources()] - [Setter][#maxPerStageResources(int)]
/// ### maxDescriptorSetSamplers
/// [VarHandle][#VH_maxDescriptorSetSamplers] - [Getter][#maxDescriptorSetSamplers()] - [Setter][#maxDescriptorSetSamplers(int)]
/// ### maxDescriptorSetUniformBuffers
/// [VarHandle][#VH_maxDescriptorSetUniformBuffers] - [Getter][#maxDescriptorSetUniformBuffers()] - [Setter][#maxDescriptorSetUniformBuffers(int)]
/// ### maxDescriptorSetUniformBuffersDynamic
/// [VarHandle][#VH_maxDescriptorSetUniformBuffersDynamic] - [Getter][#maxDescriptorSetUniformBuffersDynamic()] - [Setter][#maxDescriptorSetUniformBuffersDynamic(int)]
/// ### maxDescriptorSetStorageBuffers
/// [VarHandle][#VH_maxDescriptorSetStorageBuffers] - [Getter][#maxDescriptorSetStorageBuffers()] - [Setter][#maxDescriptorSetStorageBuffers(int)]
/// ### maxDescriptorSetStorageBuffersDynamic
/// [VarHandle][#VH_maxDescriptorSetStorageBuffersDynamic] - [Getter][#maxDescriptorSetStorageBuffersDynamic()] - [Setter][#maxDescriptorSetStorageBuffersDynamic(int)]
/// ### maxDescriptorSetSampledImages
/// [VarHandle][#VH_maxDescriptorSetSampledImages] - [Getter][#maxDescriptorSetSampledImages()] - [Setter][#maxDescriptorSetSampledImages(int)]
/// ### maxDescriptorSetStorageImages
/// [VarHandle][#VH_maxDescriptorSetStorageImages] - [Getter][#maxDescriptorSetStorageImages()] - [Setter][#maxDescriptorSetStorageImages(int)]
/// ### maxDescriptorSetInputAttachments
/// [VarHandle][#VH_maxDescriptorSetInputAttachments] - [Getter][#maxDescriptorSetInputAttachments()] - [Setter][#maxDescriptorSetInputAttachments(int)]
/// ### maxVertexInputAttributes
/// [VarHandle][#VH_maxVertexInputAttributes] - [Getter][#maxVertexInputAttributes()] - [Setter][#maxVertexInputAttributes(int)]
/// ### maxVertexInputBindings
/// [VarHandle][#VH_maxVertexInputBindings] - [Getter][#maxVertexInputBindings()] - [Setter][#maxVertexInputBindings(int)]
/// ### maxVertexInputAttributeOffset
/// [VarHandle][#VH_maxVertexInputAttributeOffset] - [Getter][#maxVertexInputAttributeOffset()] - [Setter][#maxVertexInputAttributeOffset(int)]
/// ### maxVertexInputBindingStride
/// [VarHandle][#VH_maxVertexInputBindingStride] - [Getter][#maxVertexInputBindingStride()] - [Setter][#maxVertexInputBindingStride(int)]
/// ### maxVertexOutputComponents
/// [VarHandle][#VH_maxVertexOutputComponents] - [Getter][#maxVertexOutputComponents()] - [Setter][#maxVertexOutputComponents(int)]
/// ### maxTessellationGenerationLevel
/// [VarHandle][#VH_maxTessellationGenerationLevel] - [Getter][#maxTessellationGenerationLevel()] - [Setter][#maxTessellationGenerationLevel(int)]
/// ### maxTessellationPatchSize
/// [VarHandle][#VH_maxTessellationPatchSize] - [Getter][#maxTessellationPatchSize()] - [Setter][#maxTessellationPatchSize(int)]
/// ### maxTessellationControlPerVertexInputComponents
/// [VarHandle][#VH_maxTessellationControlPerVertexInputComponents] - [Getter][#maxTessellationControlPerVertexInputComponents()] - [Setter][#maxTessellationControlPerVertexInputComponents(int)]
/// ### maxTessellationControlPerVertexOutputComponents
/// [VarHandle][#VH_maxTessellationControlPerVertexOutputComponents] - [Getter][#maxTessellationControlPerVertexOutputComponents()] - [Setter][#maxTessellationControlPerVertexOutputComponents(int)]
/// ### maxTessellationControlPerPatchOutputComponents
/// [VarHandle][#VH_maxTessellationControlPerPatchOutputComponents] - [Getter][#maxTessellationControlPerPatchOutputComponents()] - [Setter][#maxTessellationControlPerPatchOutputComponents(int)]
/// ### maxTessellationControlTotalOutputComponents
/// [VarHandle][#VH_maxTessellationControlTotalOutputComponents] - [Getter][#maxTessellationControlTotalOutputComponents()] - [Setter][#maxTessellationControlTotalOutputComponents(int)]
/// ### maxTessellationEvaluationInputComponents
/// [VarHandle][#VH_maxTessellationEvaluationInputComponents] - [Getter][#maxTessellationEvaluationInputComponents()] - [Setter][#maxTessellationEvaluationInputComponents(int)]
/// ### maxTessellationEvaluationOutputComponents
/// [VarHandle][#VH_maxTessellationEvaluationOutputComponents] - [Getter][#maxTessellationEvaluationOutputComponents()] - [Setter][#maxTessellationEvaluationOutputComponents(int)]
/// ### maxGeometryShaderInvocations
/// [VarHandle][#VH_maxGeometryShaderInvocations] - [Getter][#maxGeometryShaderInvocations()] - [Setter][#maxGeometryShaderInvocations(int)]
/// ### maxGeometryInputComponents
/// [VarHandle][#VH_maxGeometryInputComponents] - [Getter][#maxGeometryInputComponents()] - [Setter][#maxGeometryInputComponents(int)]
/// ### maxGeometryOutputComponents
/// [VarHandle][#VH_maxGeometryOutputComponents] - [Getter][#maxGeometryOutputComponents()] - [Setter][#maxGeometryOutputComponents(int)]
/// ### maxGeometryOutputVertices
/// [VarHandle][#VH_maxGeometryOutputVertices] - [Getter][#maxGeometryOutputVertices()] - [Setter][#maxGeometryOutputVertices(int)]
/// ### maxGeometryTotalOutputComponents
/// [VarHandle][#VH_maxGeometryTotalOutputComponents] - [Getter][#maxGeometryTotalOutputComponents()] - [Setter][#maxGeometryTotalOutputComponents(int)]
/// ### maxFragmentInputComponents
/// [VarHandle][#VH_maxFragmentInputComponents] - [Getter][#maxFragmentInputComponents()] - [Setter][#maxFragmentInputComponents(int)]
/// ### maxFragmentOutputAttachments
/// [VarHandle][#VH_maxFragmentOutputAttachments] - [Getter][#maxFragmentOutputAttachments()] - [Setter][#maxFragmentOutputAttachments(int)]
/// ### maxFragmentDualSrcAttachments
/// [VarHandle][#VH_maxFragmentDualSrcAttachments] - [Getter][#maxFragmentDualSrcAttachments()] - [Setter][#maxFragmentDualSrcAttachments(int)]
/// ### maxFragmentCombinedOutputResources
/// [VarHandle][#VH_maxFragmentCombinedOutputResources] - [Getter][#maxFragmentCombinedOutputResources()] - [Setter][#maxFragmentCombinedOutputResources(int)]
/// ### maxComputeSharedMemorySize
/// [VarHandle][#VH_maxComputeSharedMemorySize] - [Getter][#maxComputeSharedMemorySize()] - [Setter][#maxComputeSharedMemorySize(int)]
/// ### maxComputeWorkGroupCount
/// [Byte offset][#OFFSET_maxComputeWorkGroupCount] - [Memory layout][#ML_maxComputeWorkGroupCount] - [Getter][#maxComputeWorkGroupCount()] - [Setter][#maxComputeWorkGroupCount(java.lang.foreign.MemorySegment)]
/// ### maxComputeWorkGroupInvocations
/// [VarHandle][#VH_maxComputeWorkGroupInvocations] - [Getter][#maxComputeWorkGroupInvocations()] - [Setter][#maxComputeWorkGroupInvocations(int)]
/// ### maxComputeWorkGroupSize
/// [Byte offset][#OFFSET_maxComputeWorkGroupSize] - [Memory layout][#ML_maxComputeWorkGroupSize] - [Getter][#maxComputeWorkGroupSize()] - [Setter][#maxComputeWorkGroupSize(java.lang.foreign.MemorySegment)]
/// ### subPixelPrecisionBits
/// [VarHandle][#VH_subPixelPrecisionBits] - [Getter][#subPixelPrecisionBits()] - [Setter][#subPixelPrecisionBits(int)]
/// ### subTexelPrecisionBits
/// [VarHandle][#VH_subTexelPrecisionBits] - [Getter][#subTexelPrecisionBits()] - [Setter][#subTexelPrecisionBits(int)]
/// ### mipmapPrecisionBits
/// [VarHandle][#VH_mipmapPrecisionBits] - [Getter][#mipmapPrecisionBits()] - [Setter][#mipmapPrecisionBits(int)]
/// ### maxDrawIndexedIndexValue
/// [VarHandle][#VH_maxDrawIndexedIndexValue] - [Getter][#maxDrawIndexedIndexValue()] - [Setter][#maxDrawIndexedIndexValue(int)]
/// ### maxDrawIndirectCount
/// [VarHandle][#VH_maxDrawIndirectCount] - [Getter][#maxDrawIndirectCount()] - [Setter][#maxDrawIndirectCount(int)]
/// ### maxSamplerLodBias
/// [VarHandle][#VH_maxSamplerLodBias] - [Getter][#maxSamplerLodBias()] - [Setter][#maxSamplerLodBias(float)]
/// ### maxSamplerAnisotropy
/// [VarHandle][#VH_maxSamplerAnisotropy] - [Getter][#maxSamplerAnisotropy()] - [Setter][#maxSamplerAnisotropy(float)]
/// ### maxViewports
/// [VarHandle][#VH_maxViewports] - [Getter][#maxViewports()] - [Setter][#maxViewports(int)]
/// ### maxViewportDimensions
/// [Byte offset][#OFFSET_maxViewportDimensions] - [Memory layout][#ML_maxViewportDimensions] - [Getter][#maxViewportDimensions()] - [Setter][#maxViewportDimensions(java.lang.foreign.MemorySegment)]
/// ### viewportBoundsRange
/// [Byte offset][#OFFSET_viewportBoundsRange] - [Memory layout][#ML_viewportBoundsRange] - [Getter][#viewportBoundsRange()] - [Setter][#viewportBoundsRange(java.lang.foreign.MemorySegment)]
/// ### viewportSubPixelBits
/// [VarHandle][#VH_viewportSubPixelBits] - [Getter][#viewportSubPixelBits()] - [Setter][#viewportSubPixelBits(int)]
/// ### minMemoryMapAlignment
/// [VarHandle][#VH_minMemoryMapAlignment] - [Getter][#minMemoryMapAlignment()] - [Setter][#minMemoryMapAlignment(long)]
/// ### minTexelBufferOffsetAlignment
/// [VarHandle][#VH_minTexelBufferOffsetAlignment] - [Getter][#minTexelBufferOffsetAlignment()] - [Setter][#minTexelBufferOffsetAlignment(long)]
/// ### minUniformBufferOffsetAlignment
/// [VarHandle][#VH_minUniformBufferOffsetAlignment] - [Getter][#minUniformBufferOffsetAlignment()] - [Setter][#minUniformBufferOffsetAlignment(long)]
/// ### minStorageBufferOffsetAlignment
/// [VarHandle][#VH_minStorageBufferOffsetAlignment] - [Getter][#minStorageBufferOffsetAlignment()] - [Setter][#minStorageBufferOffsetAlignment(long)]
/// ### minTexelOffset
/// [VarHandle][#VH_minTexelOffset] - [Getter][#minTexelOffset()] - [Setter][#minTexelOffset(int)]
/// ### maxTexelOffset
/// [VarHandle][#VH_maxTexelOffset] - [Getter][#maxTexelOffset()] - [Setter][#maxTexelOffset(int)]
/// ### minTexelGatherOffset
/// [VarHandle][#VH_minTexelGatherOffset] - [Getter][#minTexelGatherOffset()] - [Setter][#minTexelGatherOffset(int)]
/// ### maxTexelGatherOffset
/// [VarHandle][#VH_maxTexelGatherOffset] - [Getter][#maxTexelGatherOffset()] - [Setter][#maxTexelGatherOffset(int)]
/// ### minInterpolationOffset
/// [VarHandle][#VH_minInterpolationOffset] - [Getter][#minInterpolationOffset()] - [Setter][#minInterpolationOffset(float)]
/// ### maxInterpolationOffset
/// [VarHandle][#VH_maxInterpolationOffset] - [Getter][#maxInterpolationOffset()] - [Setter][#maxInterpolationOffset(float)]
/// ### subPixelInterpolationOffsetBits
/// [VarHandle][#VH_subPixelInterpolationOffsetBits] - [Getter][#subPixelInterpolationOffsetBits()] - [Setter][#subPixelInterpolationOffsetBits(int)]
/// ### maxFramebufferWidth
/// [VarHandle][#VH_maxFramebufferWidth] - [Getter][#maxFramebufferWidth()] - [Setter][#maxFramebufferWidth(int)]
/// ### maxFramebufferHeight
/// [VarHandle][#VH_maxFramebufferHeight] - [Getter][#maxFramebufferHeight()] - [Setter][#maxFramebufferHeight(int)]
/// ### maxFramebufferLayers
/// [VarHandle][#VH_maxFramebufferLayers] - [Getter][#maxFramebufferLayers()] - [Setter][#maxFramebufferLayers(int)]
/// ### framebufferColorSampleCounts
/// [VarHandle][#VH_framebufferColorSampleCounts] - [Getter][#framebufferColorSampleCounts()] - [Setter][#framebufferColorSampleCounts(int)]
/// ### framebufferDepthSampleCounts
/// [VarHandle][#VH_framebufferDepthSampleCounts] - [Getter][#framebufferDepthSampleCounts()] - [Setter][#framebufferDepthSampleCounts(int)]
/// ### framebufferStencilSampleCounts
/// [VarHandle][#VH_framebufferStencilSampleCounts] - [Getter][#framebufferStencilSampleCounts()] - [Setter][#framebufferStencilSampleCounts(int)]
/// ### framebufferNoAttachmentsSampleCounts
/// [VarHandle][#VH_framebufferNoAttachmentsSampleCounts] - [Getter][#framebufferNoAttachmentsSampleCounts()] - [Setter][#framebufferNoAttachmentsSampleCounts(int)]
/// ### maxColorAttachments
/// [VarHandle][#VH_maxColorAttachments] - [Getter][#maxColorAttachments()] - [Setter][#maxColorAttachments(int)]
/// ### sampledImageColorSampleCounts
/// [VarHandle][#VH_sampledImageColorSampleCounts] - [Getter][#sampledImageColorSampleCounts()] - [Setter][#sampledImageColorSampleCounts(int)]
/// ### sampledImageIntegerSampleCounts
/// [VarHandle][#VH_sampledImageIntegerSampleCounts] - [Getter][#sampledImageIntegerSampleCounts()] - [Setter][#sampledImageIntegerSampleCounts(int)]
/// ### sampledImageDepthSampleCounts
/// [VarHandle][#VH_sampledImageDepthSampleCounts] - [Getter][#sampledImageDepthSampleCounts()] - [Setter][#sampledImageDepthSampleCounts(int)]
/// ### sampledImageStencilSampleCounts
/// [VarHandle][#VH_sampledImageStencilSampleCounts] - [Getter][#sampledImageStencilSampleCounts()] - [Setter][#sampledImageStencilSampleCounts(int)]
/// ### storageImageSampleCounts
/// [VarHandle][#VH_storageImageSampleCounts] - [Getter][#storageImageSampleCounts()] - [Setter][#storageImageSampleCounts(int)]
/// ### maxSampleMaskWords
/// [VarHandle][#VH_maxSampleMaskWords] - [Getter][#maxSampleMaskWords()] - [Setter][#maxSampleMaskWords(int)]
/// ### timestampComputeAndGraphics
/// [VarHandle][#VH_timestampComputeAndGraphics] - [Getter][#timestampComputeAndGraphics()] - [Setter][#timestampComputeAndGraphics(int)]
/// ### timestampPeriod
/// [VarHandle][#VH_timestampPeriod] - [Getter][#timestampPeriod()] - [Setter][#timestampPeriod(float)]
/// ### maxClipDistances
/// [VarHandle][#VH_maxClipDistances] - [Getter][#maxClipDistances()] - [Setter][#maxClipDistances(int)]
/// ### maxCullDistances
/// [VarHandle][#VH_maxCullDistances] - [Getter][#maxCullDistances()] - [Setter][#maxCullDistances(int)]
/// ### maxCombinedClipAndCullDistances
/// [VarHandle][#VH_maxCombinedClipAndCullDistances] - [Getter][#maxCombinedClipAndCullDistances()] - [Setter][#maxCombinedClipAndCullDistances(int)]
/// ### discreteQueuePriorities
/// [VarHandle][#VH_discreteQueuePriorities] - [Getter][#discreteQueuePriorities()] - [Setter][#discreteQueuePriorities(int)]
/// ### pointSizeRange
/// [Byte offset][#OFFSET_pointSizeRange] - [Memory layout][#ML_pointSizeRange] - [Getter][#pointSizeRange()] - [Setter][#pointSizeRange(java.lang.foreign.MemorySegment)]
/// ### lineWidthRange
/// [Byte offset][#OFFSET_lineWidthRange] - [Memory layout][#ML_lineWidthRange] - [Getter][#lineWidthRange()] - [Setter][#lineWidthRange(java.lang.foreign.MemorySegment)]
/// ### pointSizeGranularity
/// [VarHandle][#VH_pointSizeGranularity] - [Getter][#pointSizeGranularity()] - [Setter][#pointSizeGranularity(float)]
/// ### lineWidthGranularity
/// [VarHandle][#VH_lineWidthGranularity] - [Getter][#lineWidthGranularity()] - [Setter][#lineWidthGranularity(float)]
/// ### strictLines
/// [VarHandle][#VH_strictLines] - [Getter][#strictLines()] - [Setter][#strictLines(int)]
/// ### standardSampleLocations
/// [VarHandle][#VH_standardSampleLocations] - [Getter][#standardSampleLocations()] - [Setter][#standardSampleLocations(int)]
/// ### optimalBufferCopyOffsetAlignment
/// [VarHandle][#VH_optimalBufferCopyOffsetAlignment] - [Getter][#optimalBufferCopyOffsetAlignment()] - [Setter][#optimalBufferCopyOffsetAlignment(long)]
/// ### optimalBufferCopyRowPitchAlignment
/// [VarHandle][#VH_optimalBufferCopyRowPitchAlignment] - [Getter][#optimalBufferCopyRowPitchAlignment()] - [Setter][#optimalBufferCopyRowPitchAlignment(long)]
/// ### nonCoherentAtomSize
/// [VarHandle][#VH_nonCoherentAtomSize] - [Getter][#nonCoherentAtomSize()] - [Setter][#nonCoherentAtomSize(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceLimits {
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
///     uint32_t[3] maxComputeWorkGroupCount;
///     uint32_t maxComputeWorkGroupInvocations;
///     uint32_t[3] maxComputeWorkGroupSize;
///     uint32_t subPixelPrecisionBits;
///     uint32_t subTexelPrecisionBits;
///     uint32_t mipmapPrecisionBits;
///     uint32_t maxDrawIndexedIndexValue;
///     uint32_t maxDrawIndirectCount;
///     float maxSamplerLodBias;
///     float maxSamplerAnisotropy;
///     uint32_t maxViewports;
///     uint32_t[2] maxViewportDimensions;
///     float[2] viewportBoundsRange;
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
///     float[2] pointSizeRange;
///     float[2] lineWidthRange;
///     float pointSizeGranularity;
///     float lineWidthGranularity;
///     VkBool32 strictLines;
///     VkBool32 standardSampleLocations;
///     VkDeviceSize optimalBufferCopyOffsetAlignment;
///     VkDeviceSize optimalBufferCopyRowPitchAlignment;
///     VkDeviceSize nonCoherentAtomSize;
/// } VkPhysicalDeviceLimits;
/// ```
public sealed class VkPhysicalDeviceLimits extends Struct {
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
        ValueLayout.JAVA_LONG.withName("minMemoryMapAlignment"),
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
    /// The [VarHandle] of `maxImageDimension1D` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxImageDimension1D = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxImageDimension1D"));
    /// The [VarHandle] of `maxImageDimension2D` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxImageDimension2D = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxImageDimension2D"));
    /// The [VarHandle] of `maxImageDimension3D` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxImageDimension3D = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxImageDimension3D"));
    /// The [VarHandle] of `maxImageDimensionCube` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxImageDimensionCube = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxImageDimensionCube"));
    /// The [VarHandle] of `maxImageArrayLayers` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxImageArrayLayers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxImageArrayLayers"));
    /// The [VarHandle] of `maxTexelBufferElements` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxTexelBufferElements = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTexelBufferElements"));
    /// The [VarHandle] of `maxUniformBufferRange` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxUniformBufferRange = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxUniformBufferRange"));
    /// The [VarHandle] of `maxStorageBufferRange` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxStorageBufferRange = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxStorageBufferRange"));
    /// The [VarHandle] of `maxPushConstantsSize` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxPushConstantsSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPushConstantsSize"));
    /// The [VarHandle] of `maxMemoryAllocationCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxMemoryAllocationCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxMemoryAllocationCount"));
    /// The [VarHandle] of `maxSamplerAllocationCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxSamplerAllocationCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSamplerAllocationCount"));
    /// The [VarHandle] of `bufferImageGranularity` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_bufferImageGranularity = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferImageGranularity"));
    /// The [VarHandle] of `sparseAddressSpaceSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_sparseAddressSpaceSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sparseAddressSpaceSize"));
    /// The [VarHandle] of `maxBoundDescriptorSets` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxBoundDescriptorSets = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxBoundDescriptorSets"));
    /// The [VarHandle] of `maxPerStageDescriptorSamplers` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxPerStageDescriptorSamplers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorSamplers"));
    /// The [VarHandle] of `maxPerStageDescriptorUniformBuffers` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxPerStageDescriptorUniformBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorUniformBuffers"));
    /// The [VarHandle] of `maxPerStageDescriptorStorageBuffers` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxPerStageDescriptorStorageBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorStorageBuffers"));
    /// The [VarHandle] of `maxPerStageDescriptorSampledImages` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxPerStageDescriptorSampledImages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorSampledImages"));
    /// The [VarHandle] of `maxPerStageDescriptorStorageImages` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxPerStageDescriptorStorageImages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorStorageImages"));
    /// The [VarHandle] of `maxPerStageDescriptorInputAttachments` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxPerStageDescriptorInputAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorInputAttachments"));
    /// The [VarHandle] of `maxPerStageResources` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxPerStageResources = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageResources"));
    /// The [VarHandle] of `maxDescriptorSetSamplers` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxDescriptorSetSamplers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetSamplers"));
    /// The [VarHandle] of `maxDescriptorSetUniformBuffers` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxDescriptorSetUniformBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUniformBuffers"));
    /// The [VarHandle] of `maxDescriptorSetUniformBuffersDynamic` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxDescriptorSetUniformBuffersDynamic = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUniformBuffersDynamic"));
    /// The [VarHandle] of `maxDescriptorSetStorageBuffers` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxDescriptorSetStorageBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetStorageBuffers"));
    /// The [VarHandle] of `maxDescriptorSetStorageBuffersDynamic` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxDescriptorSetStorageBuffersDynamic = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetStorageBuffersDynamic"));
    /// The [VarHandle] of `maxDescriptorSetSampledImages` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxDescriptorSetSampledImages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetSampledImages"));
    /// The [VarHandle] of `maxDescriptorSetStorageImages` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxDescriptorSetStorageImages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetStorageImages"));
    /// The [VarHandle] of `maxDescriptorSetInputAttachments` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxDescriptorSetInputAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetInputAttachments"));
    /// The [VarHandle] of `maxVertexInputAttributes` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxVertexInputAttributes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxVertexInputAttributes"));
    /// The [VarHandle] of `maxVertexInputBindings` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxVertexInputBindings = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxVertexInputBindings"));
    /// The [VarHandle] of `maxVertexInputAttributeOffset` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxVertexInputAttributeOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxVertexInputAttributeOffset"));
    /// The [VarHandle] of `maxVertexInputBindingStride` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxVertexInputBindingStride = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxVertexInputBindingStride"));
    /// The [VarHandle] of `maxVertexOutputComponents` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxVertexOutputComponents = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxVertexOutputComponents"));
    /// The [VarHandle] of `maxTessellationGenerationLevel` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxTessellationGenerationLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTessellationGenerationLevel"));
    /// The [VarHandle] of `maxTessellationPatchSize` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxTessellationPatchSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTessellationPatchSize"));
    /// The [VarHandle] of `maxTessellationControlPerVertexInputComponents` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxTessellationControlPerVertexInputComponents = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTessellationControlPerVertexInputComponents"));
    /// The [VarHandle] of `maxTessellationControlPerVertexOutputComponents` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxTessellationControlPerVertexOutputComponents = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTessellationControlPerVertexOutputComponents"));
    /// The [VarHandle] of `maxTessellationControlPerPatchOutputComponents` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxTessellationControlPerPatchOutputComponents = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTessellationControlPerPatchOutputComponents"));
    /// The [VarHandle] of `maxTessellationControlTotalOutputComponents` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxTessellationControlTotalOutputComponents = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTessellationControlTotalOutputComponents"));
    /// The [VarHandle] of `maxTessellationEvaluationInputComponents` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxTessellationEvaluationInputComponents = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTessellationEvaluationInputComponents"));
    /// The [VarHandle] of `maxTessellationEvaluationOutputComponents` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxTessellationEvaluationOutputComponents = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTessellationEvaluationOutputComponents"));
    /// The [VarHandle] of `maxGeometryShaderInvocations` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxGeometryShaderInvocations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxGeometryShaderInvocations"));
    /// The [VarHandle] of `maxGeometryInputComponents` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxGeometryInputComponents = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxGeometryInputComponents"));
    /// The [VarHandle] of `maxGeometryOutputComponents` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxGeometryOutputComponents = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxGeometryOutputComponents"));
    /// The [VarHandle] of `maxGeometryOutputVertices` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxGeometryOutputVertices = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxGeometryOutputVertices"));
    /// The [VarHandle] of `maxGeometryTotalOutputComponents` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxGeometryTotalOutputComponents = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxGeometryTotalOutputComponents"));
    /// The [VarHandle] of `maxFragmentInputComponents` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxFragmentInputComponents = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxFragmentInputComponents"));
    /// The [VarHandle] of `maxFragmentOutputAttachments` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxFragmentOutputAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxFragmentOutputAttachments"));
    /// The [VarHandle] of `maxFragmentDualSrcAttachments` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxFragmentDualSrcAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxFragmentDualSrcAttachments"));
    /// The [VarHandle] of `maxFragmentCombinedOutputResources` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxFragmentCombinedOutputResources = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxFragmentCombinedOutputResources"));
    /// The [VarHandle] of `maxComputeSharedMemorySize` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxComputeSharedMemorySize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxComputeSharedMemorySize"));
    /// The byte offset of `maxComputeWorkGroupCount`.
    public static final long OFFSET_maxComputeWorkGroupCount = LAYOUT.byteOffset(PathElement.groupElement("maxComputeWorkGroupCount"));
    /// The memory layout of `maxComputeWorkGroupCount`.
    public static final MemoryLayout ML_maxComputeWorkGroupCount = LAYOUT.select(PathElement.groupElement("maxComputeWorkGroupCount"));
    /// The [VarHandle] of `maxComputeWorkGroupInvocations` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxComputeWorkGroupInvocations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxComputeWorkGroupInvocations"));
    /// The byte offset of `maxComputeWorkGroupSize`.
    public static final long OFFSET_maxComputeWorkGroupSize = LAYOUT.byteOffset(PathElement.groupElement("maxComputeWorkGroupSize"));
    /// The memory layout of `maxComputeWorkGroupSize`.
    public static final MemoryLayout ML_maxComputeWorkGroupSize = LAYOUT.select(PathElement.groupElement("maxComputeWorkGroupSize"));
    /// The [VarHandle] of `subPixelPrecisionBits` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_subPixelPrecisionBits = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subPixelPrecisionBits"));
    /// The [VarHandle] of `subTexelPrecisionBits` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_subTexelPrecisionBits = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subTexelPrecisionBits"));
    /// The [VarHandle] of `mipmapPrecisionBits` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_mipmapPrecisionBits = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mipmapPrecisionBits"));
    /// The [VarHandle] of `maxDrawIndexedIndexValue` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxDrawIndexedIndexValue = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDrawIndexedIndexValue"));
    /// The [VarHandle] of `maxDrawIndirectCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxDrawIndirectCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDrawIndirectCount"));
    /// The [VarHandle] of `maxSamplerLodBias` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_maxSamplerLodBias = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSamplerLodBias"));
    /// The [VarHandle] of `maxSamplerAnisotropy` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_maxSamplerAnisotropy = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSamplerAnisotropy"));
    /// The [VarHandle] of `maxViewports` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxViewports = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxViewports"));
    /// The byte offset of `maxViewportDimensions`.
    public static final long OFFSET_maxViewportDimensions = LAYOUT.byteOffset(PathElement.groupElement("maxViewportDimensions"));
    /// The memory layout of `maxViewportDimensions`.
    public static final MemoryLayout ML_maxViewportDimensions = LAYOUT.select(PathElement.groupElement("maxViewportDimensions"));
    /// The byte offset of `viewportBoundsRange`.
    public static final long OFFSET_viewportBoundsRange = LAYOUT.byteOffset(PathElement.groupElement("viewportBoundsRange"));
    /// The memory layout of `viewportBoundsRange`.
    public static final MemoryLayout ML_viewportBoundsRange = LAYOUT.select(PathElement.groupElement("viewportBoundsRange"));
    /// The [VarHandle] of `viewportSubPixelBits` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_viewportSubPixelBits = LAYOUT.arrayElementVarHandle(PathElement.groupElement("viewportSubPixelBits"));
    /// The [VarHandle] of `minMemoryMapAlignment` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_minMemoryMapAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minMemoryMapAlignment"));
    /// The [VarHandle] of `minTexelBufferOffsetAlignment` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_minTexelBufferOffsetAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minTexelBufferOffsetAlignment"));
    /// The [VarHandle] of `minUniformBufferOffsetAlignment` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_minUniformBufferOffsetAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minUniformBufferOffsetAlignment"));
    /// The [VarHandle] of `minStorageBufferOffsetAlignment` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_minStorageBufferOffsetAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minStorageBufferOffsetAlignment"));
    /// The [VarHandle] of `minTexelOffset` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_minTexelOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minTexelOffset"));
    /// The [VarHandle] of `maxTexelOffset` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxTexelOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTexelOffset"));
    /// The [VarHandle] of `minTexelGatherOffset` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_minTexelGatherOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minTexelGatherOffset"));
    /// The [VarHandle] of `maxTexelGatherOffset` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxTexelGatherOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTexelGatherOffset"));
    /// The [VarHandle] of `minInterpolationOffset` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_minInterpolationOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minInterpolationOffset"));
    /// The [VarHandle] of `maxInterpolationOffset` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_maxInterpolationOffset = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxInterpolationOffset"));
    /// The [VarHandle] of `subPixelInterpolationOffsetBits` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_subPixelInterpolationOffsetBits = LAYOUT.arrayElementVarHandle(PathElement.groupElement("subPixelInterpolationOffsetBits"));
    /// The [VarHandle] of `maxFramebufferWidth` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxFramebufferWidth = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxFramebufferWidth"));
    /// The [VarHandle] of `maxFramebufferHeight` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxFramebufferHeight = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxFramebufferHeight"));
    /// The [VarHandle] of `maxFramebufferLayers` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxFramebufferLayers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxFramebufferLayers"));
    /// The [VarHandle] of `framebufferColorSampleCounts` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_framebufferColorSampleCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("framebufferColorSampleCounts"));
    /// The [VarHandle] of `framebufferDepthSampleCounts` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_framebufferDepthSampleCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("framebufferDepthSampleCounts"));
    /// The [VarHandle] of `framebufferStencilSampleCounts` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_framebufferStencilSampleCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("framebufferStencilSampleCounts"));
    /// The [VarHandle] of `framebufferNoAttachmentsSampleCounts` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_framebufferNoAttachmentsSampleCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("framebufferNoAttachmentsSampleCounts"));
    /// The [VarHandle] of `maxColorAttachments` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxColorAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxColorAttachments"));
    /// The [VarHandle] of `sampledImageColorSampleCounts` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sampledImageColorSampleCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampledImageColorSampleCounts"));
    /// The [VarHandle] of `sampledImageIntegerSampleCounts` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sampledImageIntegerSampleCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampledImageIntegerSampleCounts"));
    /// The [VarHandle] of `sampledImageDepthSampleCounts` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sampledImageDepthSampleCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampledImageDepthSampleCounts"));
    /// The [VarHandle] of `sampledImageStencilSampleCounts` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sampledImageStencilSampleCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sampledImageStencilSampleCounts"));
    /// The [VarHandle] of `storageImageSampleCounts` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_storageImageSampleCounts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("storageImageSampleCounts"));
    /// The [VarHandle] of `maxSampleMaskWords` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxSampleMaskWords = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSampleMaskWords"));
    /// The [VarHandle] of `timestampComputeAndGraphics` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_timestampComputeAndGraphics = LAYOUT.arrayElementVarHandle(PathElement.groupElement("timestampComputeAndGraphics"));
    /// The [VarHandle] of `timestampPeriod` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_timestampPeriod = LAYOUT.arrayElementVarHandle(PathElement.groupElement("timestampPeriod"));
    /// The [VarHandle] of `maxClipDistances` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxClipDistances = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxClipDistances"));
    /// The [VarHandle] of `maxCullDistances` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxCullDistances = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxCullDistances"));
    /// The [VarHandle] of `maxCombinedClipAndCullDistances` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxCombinedClipAndCullDistances = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxCombinedClipAndCullDistances"));
    /// The [VarHandle] of `discreteQueuePriorities` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_discreteQueuePriorities = LAYOUT.arrayElementVarHandle(PathElement.groupElement("discreteQueuePriorities"));
    /// The byte offset of `pointSizeRange`.
    public static final long OFFSET_pointSizeRange = LAYOUT.byteOffset(PathElement.groupElement("pointSizeRange"));
    /// The memory layout of `pointSizeRange`.
    public static final MemoryLayout ML_pointSizeRange = LAYOUT.select(PathElement.groupElement("pointSizeRange"));
    /// The byte offset of `lineWidthRange`.
    public static final long OFFSET_lineWidthRange = LAYOUT.byteOffset(PathElement.groupElement("lineWidthRange"));
    /// The memory layout of `lineWidthRange`.
    public static final MemoryLayout ML_lineWidthRange = LAYOUT.select(PathElement.groupElement("lineWidthRange"));
    /// The [VarHandle] of `pointSizeGranularity` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_pointSizeGranularity = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pointSizeGranularity"));
    /// The [VarHandle] of `lineWidthGranularity` of type `(MemorySegment base, long baseOffset, long index)float`.
    public static final VarHandle VH_lineWidthGranularity = LAYOUT.arrayElementVarHandle(PathElement.groupElement("lineWidthGranularity"));
    /// The [VarHandle] of `strictLines` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_strictLines = LAYOUT.arrayElementVarHandle(PathElement.groupElement("strictLines"));
    /// The [VarHandle] of `standardSampleLocations` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_standardSampleLocations = LAYOUT.arrayElementVarHandle(PathElement.groupElement("standardSampleLocations"));
    /// The [VarHandle] of `optimalBufferCopyOffsetAlignment` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_optimalBufferCopyOffsetAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("optimalBufferCopyOffsetAlignment"));
    /// The [VarHandle] of `optimalBufferCopyRowPitchAlignment` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_optimalBufferCopyRowPitchAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("optimalBufferCopyRowPitchAlignment"));
    /// The [VarHandle] of `nonCoherentAtomSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_nonCoherentAtomSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("nonCoherentAtomSize"));

    /// Creates `VkPhysicalDeviceLimits` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceLimits(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceLimits` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceLimits of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceLimits(segment); }

    /// Creates `VkPhysicalDeviceLimits` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceLimits` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceLimits ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceLimits(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceLimits` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkPhysicalDeviceLimits` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceLimits`
    public static VkPhysicalDeviceLimits alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceLimits(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceLimits` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceLimits`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkPhysicalDeviceLimits` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceLimits`
    public static VkPhysicalDeviceLimits allocInit(SegmentAllocator allocator, @CType("uint32_t") int maxImageDimension1D, @CType("uint32_t") int maxImageDimension2D, @CType("uint32_t") int maxImageDimension3D, @CType("uint32_t") int maxImageDimensionCube, @CType("uint32_t") int maxImageArrayLayers, @CType("uint32_t") int maxTexelBufferElements, @CType("uint32_t") int maxUniformBufferRange, @CType("uint32_t") int maxStorageBufferRange, @CType("uint32_t") int maxPushConstantsSize, @CType("uint32_t") int maxMemoryAllocationCount, @CType("uint32_t") int maxSamplerAllocationCount, @CType("VkDeviceSize") long bufferImageGranularity, @CType("VkDeviceSize") long sparseAddressSpaceSize, @CType("uint32_t") int maxBoundDescriptorSets, @CType("uint32_t") int maxPerStageDescriptorSamplers, @CType("uint32_t") int maxPerStageDescriptorUniformBuffers, @CType("uint32_t") int maxPerStageDescriptorStorageBuffers, @CType("uint32_t") int maxPerStageDescriptorSampledImages, @CType("uint32_t") int maxPerStageDescriptorStorageImages, @CType("uint32_t") int maxPerStageDescriptorInputAttachments, @CType("uint32_t") int maxPerStageResources, @CType("uint32_t") int maxDescriptorSetSamplers, @CType("uint32_t") int maxDescriptorSetUniformBuffers, @CType("uint32_t") int maxDescriptorSetUniformBuffersDynamic, @CType("uint32_t") int maxDescriptorSetStorageBuffers, @CType("uint32_t") int maxDescriptorSetStorageBuffersDynamic, @CType("uint32_t") int maxDescriptorSetSampledImages, @CType("uint32_t") int maxDescriptorSetStorageImages, @CType("uint32_t") int maxDescriptorSetInputAttachments, @CType("uint32_t") int maxVertexInputAttributes, @CType("uint32_t") int maxVertexInputBindings, @CType("uint32_t") int maxVertexInputAttributeOffset, @CType("uint32_t") int maxVertexInputBindingStride, @CType("uint32_t") int maxVertexOutputComponents, @CType("uint32_t") int maxTessellationGenerationLevel, @CType("uint32_t") int maxTessellationPatchSize, @CType("uint32_t") int maxTessellationControlPerVertexInputComponents, @CType("uint32_t") int maxTessellationControlPerVertexOutputComponents, @CType("uint32_t") int maxTessellationControlPerPatchOutputComponents, @CType("uint32_t") int maxTessellationControlTotalOutputComponents, @CType("uint32_t") int maxTessellationEvaluationInputComponents, @CType("uint32_t") int maxTessellationEvaluationOutputComponents, @CType("uint32_t") int maxGeometryShaderInvocations, @CType("uint32_t") int maxGeometryInputComponents, @CType("uint32_t") int maxGeometryOutputComponents, @CType("uint32_t") int maxGeometryOutputVertices, @CType("uint32_t") int maxGeometryTotalOutputComponents, @CType("uint32_t") int maxFragmentInputComponents, @CType("uint32_t") int maxFragmentOutputAttachments, @CType("uint32_t") int maxFragmentDualSrcAttachments, @CType("uint32_t") int maxFragmentCombinedOutputResources, @CType("uint32_t") int maxComputeSharedMemorySize, @CType("uint32_t[3]") java.lang.foreign.MemorySegment maxComputeWorkGroupCount, @CType("uint32_t") int maxComputeWorkGroupInvocations, @CType("uint32_t[3]") java.lang.foreign.MemorySegment maxComputeWorkGroupSize, @CType("uint32_t") int subPixelPrecisionBits, @CType("uint32_t") int subTexelPrecisionBits, @CType("uint32_t") int mipmapPrecisionBits, @CType("uint32_t") int maxDrawIndexedIndexValue, @CType("uint32_t") int maxDrawIndirectCount, @CType("float") float maxSamplerLodBias, @CType("float") float maxSamplerAnisotropy, @CType("uint32_t") int maxViewports, @CType("uint32_t[2]") java.lang.foreign.MemorySegment maxViewportDimensions, @CType("float[2]") java.lang.foreign.MemorySegment viewportBoundsRange, @CType("uint32_t") int viewportSubPixelBits, @CType("size_t") long minMemoryMapAlignment, @CType("VkDeviceSize") long minTexelBufferOffsetAlignment, @CType("VkDeviceSize") long minUniformBufferOffsetAlignment, @CType("VkDeviceSize") long minStorageBufferOffsetAlignment, @CType("int32_t") int minTexelOffset, @CType("uint32_t") int maxTexelOffset, @CType("int32_t") int minTexelGatherOffset, @CType("uint32_t") int maxTexelGatherOffset, @CType("float") float minInterpolationOffset, @CType("float") float maxInterpolationOffset, @CType("uint32_t") int subPixelInterpolationOffsetBits, @CType("uint32_t") int maxFramebufferWidth, @CType("uint32_t") int maxFramebufferHeight, @CType("uint32_t") int maxFramebufferLayers, @CType("VkSampleCountFlags") int framebufferColorSampleCounts, @CType("VkSampleCountFlags") int framebufferDepthSampleCounts, @CType("VkSampleCountFlags") int framebufferStencilSampleCounts, @CType("VkSampleCountFlags") int framebufferNoAttachmentsSampleCounts, @CType("uint32_t") int maxColorAttachments, @CType("VkSampleCountFlags") int sampledImageColorSampleCounts, @CType("VkSampleCountFlags") int sampledImageIntegerSampleCounts, @CType("VkSampleCountFlags") int sampledImageDepthSampleCounts, @CType("VkSampleCountFlags") int sampledImageStencilSampleCounts, @CType("VkSampleCountFlags") int storageImageSampleCounts, @CType("uint32_t") int maxSampleMaskWords, @CType("VkBool32") int timestampComputeAndGraphics, @CType("float") float timestampPeriod, @CType("uint32_t") int maxClipDistances, @CType("uint32_t") int maxCullDistances, @CType("uint32_t") int maxCombinedClipAndCullDistances, @CType("uint32_t") int discreteQueuePriorities, @CType("float[2]") java.lang.foreign.MemorySegment pointSizeRange, @CType("float[2]") java.lang.foreign.MemorySegment lineWidthRange, @CType("float") float pointSizeGranularity, @CType("float") float lineWidthGranularity, @CType("VkBool32") int strictLines, @CType("VkBool32") int standardSampleLocations, @CType("VkDeviceSize") long optimalBufferCopyOffsetAlignment, @CType("VkDeviceSize") long optimalBufferCopyRowPitchAlignment, @CType("VkDeviceSize") long nonCoherentAtomSize) { return alloc(allocator).maxImageDimension1D(maxImageDimension1D).maxImageDimension2D(maxImageDimension2D).maxImageDimension3D(maxImageDimension3D).maxImageDimensionCube(maxImageDimensionCube).maxImageArrayLayers(maxImageArrayLayers).maxTexelBufferElements(maxTexelBufferElements).maxUniformBufferRange(maxUniformBufferRange).maxStorageBufferRange(maxStorageBufferRange).maxPushConstantsSize(maxPushConstantsSize).maxMemoryAllocationCount(maxMemoryAllocationCount).maxSamplerAllocationCount(maxSamplerAllocationCount).bufferImageGranularity(bufferImageGranularity).sparseAddressSpaceSize(sparseAddressSpaceSize).maxBoundDescriptorSets(maxBoundDescriptorSets).maxPerStageDescriptorSamplers(maxPerStageDescriptorSamplers).maxPerStageDescriptorUniformBuffers(maxPerStageDescriptorUniformBuffers).maxPerStageDescriptorStorageBuffers(maxPerStageDescriptorStorageBuffers).maxPerStageDescriptorSampledImages(maxPerStageDescriptorSampledImages).maxPerStageDescriptorStorageImages(maxPerStageDescriptorStorageImages).maxPerStageDescriptorInputAttachments(maxPerStageDescriptorInputAttachments).maxPerStageResources(maxPerStageResources).maxDescriptorSetSamplers(maxDescriptorSetSamplers).maxDescriptorSetUniformBuffers(maxDescriptorSetUniformBuffers).maxDescriptorSetUniformBuffersDynamic(maxDescriptorSetUniformBuffersDynamic).maxDescriptorSetStorageBuffers(maxDescriptorSetStorageBuffers).maxDescriptorSetStorageBuffersDynamic(maxDescriptorSetStorageBuffersDynamic).maxDescriptorSetSampledImages(maxDescriptorSetSampledImages).maxDescriptorSetStorageImages(maxDescriptorSetStorageImages).maxDescriptorSetInputAttachments(maxDescriptorSetInputAttachments).maxVertexInputAttributes(maxVertexInputAttributes).maxVertexInputBindings(maxVertexInputBindings).maxVertexInputAttributeOffset(maxVertexInputAttributeOffset).maxVertexInputBindingStride(maxVertexInputBindingStride).maxVertexOutputComponents(maxVertexOutputComponents).maxTessellationGenerationLevel(maxTessellationGenerationLevel).maxTessellationPatchSize(maxTessellationPatchSize).maxTessellationControlPerVertexInputComponents(maxTessellationControlPerVertexInputComponents).maxTessellationControlPerVertexOutputComponents(maxTessellationControlPerVertexOutputComponents).maxTessellationControlPerPatchOutputComponents(maxTessellationControlPerPatchOutputComponents).maxTessellationControlTotalOutputComponents(maxTessellationControlTotalOutputComponents).maxTessellationEvaluationInputComponents(maxTessellationEvaluationInputComponents).maxTessellationEvaluationOutputComponents(maxTessellationEvaluationOutputComponents).maxGeometryShaderInvocations(maxGeometryShaderInvocations).maxGeometryInputComponents(maxGeometryInputComponents).maxGeometryOutputComponents(maxGeometryOutputComponents).maxGeometryOutputVertices(maxGeometryOutputVertices).maxGeometryTotalOutputComponents(maxGeometryTotalOutputComponents).maxFragmentInputComponents(maxFragmentInputComponents).maxFragmentOutputAttachments(maxFragmentOutputAttachments).maxFragmentDualSrcAttachments(maxFragmentDualSrcAttachments).maxFragmentCombinedOutputResources(maxFragmentCombinedOutputResources).maxComputeSharedMemorySize(maxComputeSharedMemorySize).maxComputeWorkGroupCount(maxComputeWorkGroupCount).maxComputeWorkGroupInvocations(maxComputeWorkGroupInvocations).maxComputeWorkGroupSize(maxComputeWorkGroupSize).subPixelPrecisionBits(subPixelPrecisionBits).subTexelPrecisionBits(subTexelPrecisionBits).mipmapPrecisionBits(mipmapPrecisionBits).maxDrawIndexedIndexValue(maxDrawIndexedIndexValue).maxDrawIndirectCount(maxDrawIndirectCount).maxSamplerLodBias(maxSamplerLodBias).maxSamplerAnisotropy(maxSamplerAnisotropy).maxViewports(maxViewports).maxViewportDimensions(maxViewportDimensions).viewportBoundsRange(viewportBoundsRange).viewportSubPixelBits(viewportSubPixelBits).minMemoryMapAlignment(minMemoryMapAlignment).minTexelBufferOffsetAlignment(minTexelBufferOffsetAlignment).minUniformBufferOffsetAlignment(minUniformBufferOffsetAlignment).minStorageBufferOffsetAlignment(minStorageBufferOffsetAlignment).minTexelOffset(minTexelOffset).maxTexelOffset(maxTexelOffset).minTexelGatherOffset(minTexelGatherOffset).maxTexelGatherOffset(maxTexelGatherOffset).minInterpolationOffset(minInterpolationOffset).maxInterpolationOffset(maxInterpolationOffset).subPixelInterpolationOffsetBits(subPixelInterpolationOffsetBits).maxFramebufferWidth(maxFramebufferWidth).maxFramebufferHeight(maxFramebufferHeight).maxFramebufferLayers(maxFramebufferLayers).framebufferColorSampleCounts(framebufferColorSampleCounts).framebufferDepthSampleCounts(framebufferDepthSampleCounts).framebufferStencilSampleCounts(framebufferStencilSampleCounts).framebufferNoAttachmentsSampleCounts(framebufferNoAttachmentsSampleCounts).maxColorAttachments(maxColorAttachments).sampledImageColorSampleCounts(sampledImageColorSampleCounts).sampledImageIntegerSampleCounts(sampledImageIntegerSampleCounts).sampledImageDepthSampleCounts(sampledImageDepthSampleCounts).sampledImageStencilSampleCounts(sampledImageStencilSampleCounts).storageImageSampleCounts(storageImageSampleCounts).maxSampleMaskWords(maxSampleMaskWords).timestampComputeAndGraphics(timestampComputeAndGraphics).timestampPeriod(timestampPeriod).maxClipDistances(maxClipDistances).maxCullDistances(maxCullDistances).maxCombinedClipAndCullDistances(maxCombinedClipAndCullDistances).discreteQueuePriorities(discreteQueuePriorities).pointSizeRange(pointSizeRange).lineWidthRange(lineWidthRange).pointSizeGranularity(pointSizeGranularity).lineWidthGranularity(lineWidthGranularity).strictLines(strictLines).standardSampleLocations(standardSampleLocations).optimalBufferCopyOffsetAlignment(optimalBufferCopyOffsetAlignment).optimalBufferCopyRowPitchAlignment(optimalBufferCopyRowPitchAlignment).nonCoherentAtomSize(nonCoherentAtomSize); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceLimits copyFrom(VkPhysicalDeviceLimits src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `maxImageDimension1D` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxImageDimension1D(MemorySegment segment, long index) { return (int) VH_maxImageDimension1D.get(segment, 0L, index); }
    /// {@return `maxImageDimension1D`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxImageDimension1D(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxImageDimension1D(segment, 0L); }
    /// {@return `maxImageDimension1D`}
    public @CType("uint32_t") int maxImageDimension1D() { return VkPhysicalDeviceLimits.get_maxImageDimension1D(this.segment()); }
    /// Sets `maxImageDimension1D` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxImageDimension1D(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxImageDimension1D.set(segment, 0L, index, value); }
    /// Sets `maxImageDimension1D` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxImageDimension1D(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxImageDimension1D(segment, 0L, value); }
    /// Sets `maxImageDimension1D` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxImageDimension1D(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxImageDimension1D(this.segment(), value); return this; }

    /// {@return `maxImageDimension2D` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxImageDimension2D(MemorySegment segment, long index) { return (int) VH_maxImageDimension2D.get(segment, 0L, index); }
    /// {@return `maxImageDimension2D`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxImageDimension2D(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxImageDimension2D(segment, 0L); }
    /// {@return `maxImageDimension2D`}
    public @CType("uint32_t") int maxImageDimension2D() { return VkPhysicalDeviceLimits.get_maxImageDimension2D(this.segment()); }
    /// Sets `maxImageDimension2D` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxImageDimension2D(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxImageDimension2D.set(segment, 0L, index, value); }
    /// Sets `maxImageDimension2D` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxImageDimension2D(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxImageDimension2D(segment, 0L, value); }
    /// Sets `maxImageDimension2D` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxImageDimension2D(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxImageDimension2D(this.segment(), value); return this; }

    /// {@return `maxImageDimension3D` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxImageDimension3D(MemorySegment segment, long index) { return (int) VH_maxImageDimension3D.get(segment, 0L, index); }
    /// {@return `maxImageDimension3D`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxImageDimension3D(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxImageDimension3D(segment, 0L); }
    /// {@return `maxImageDimension3D`}
    public @CType("uint32_t") int maxImageDimension3D() { return VkPhysicalDeviceLimits.get_maxImageDimension3D(this.segment()); }
    /// Sets `maxImageDimension3D` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxImageDimension3D(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxImageDimension3D.set(segment, 0L, index, value); }
    /// Sets `maxImageDimension3D` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxImageDimension3D(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxImageDimension3D(segment, 0L, value); }
    /// Sets `maxImageDimension3D` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxImageDimension3D(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxImageDimension3D(this.segment(), value); return this; }

    /// {@return `maxImageDimensionCube` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxImageDimensionCube(MemorySegment segment, long index) { return (int) VH_maxImageDimensionCube.get(segment, 0L, index); }
    /// {@return `maxImageDimensionCube`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxImageDimensionCube(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxImageDimensionCube(segment, 0L); }
    /// {@return `maxImageDimensionCube`}
    public @CType("uint32_t") int maxImageDimensionCube() { return VkPhysicalDeviceLimits.get_maxImageDimensionCube(this.segment()); }
    /// Sets `maxImageDimensionCube` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxImageDimensionCube(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxImageDimensionCube.set(segment, 0L, index, value); }
    /// Sets `maxImageDimensionCube` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxImageDimensionCube(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxImageDimensionCube(segment, 0L, value); }
    /// Sets `maxImageDimensionCube` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxImageDimensionCube(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxImageDimensionCube(this.segment(), value); return this; }

    /// {@return `maxImageArrayLayers` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxImageArrayLayers(MemorySegment segment, long index) { return (int) VH_maxImageArrayLayers.get(segment, 0L, index); }
    /// {@return `maxImageArrayLayers`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxImageArrayLayers(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxImageArrayLayers(segment, 0L); }
    /// {@return `maxImageArrayLayers`}
    public @CType("uint32_t") int maxImageArrayLayers() { return VkPhysicalDeviceLimits.get_maxImageArrayLayers(this.segment()); }
    /// Sets `maxImageArrayLayers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxImageArrayLayers(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxImageArrayLayers.set(segment, 0L, index, value); }
    /// Sets `maxImageArrayLayers` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxImageArrayLayers(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxImageArrayLayers(segment, 0L, value); }
    /// Sets `maxImageArrayLayers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxImageArrayLayers(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxImageArrayLayers(this.segment(), value); return this; }

    /// {@return `maxTexelBufferElements` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxTexelBufferElements(MemorySegment segment, long index) { return (int) VH_maxTexelBufferElements.get(segment, 0L, index); }
    /// {@return `maxTexelBufferElements`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxTexelBufferElements(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxTexelBufferElements(segment, 0L); }
    /// {@return `maxTexelBufferElements`}
    public @CType("uint32_t") int maxTexelBufferElements() { return VkPhysicalDeviceLimits.get_maxTexelBufferElements(this.segment()); }
    /// Sets `maxTexelBufferElements` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxTexelBufferElements(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxTexelBufferElements.set(segment, 0L, index, value); }
    /// Sets `maxTexelBufferElements` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxTexelBufferElements(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxTexelBufferElements(segment, 0L, value); }
    /// Sets `maxTexelBufferElements` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxTexelBufferElements(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxTexelBufferElements(this.segment(), value); return this; }

    /// {@return `maxUniformBufferRange` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxUniformBufferRange(MemorySegment segment, long index) { return (int) VH_maxUniformBufferRange.get(segment, 0L, index); }
    /// {@return `maxUniformBufferRange`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxUniformBufferRange(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxUniformBufferRange(segment, 0L); }
    /// {@return `maxUniformBufferRange`}
    public @CType("uint32_t") int maxUniformBufferRange() { return VkPhysicalDeviceLimits.get_maxUniformBufferRange(this.segment()); }
    /// Sets `maxUniformBufferRange` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxUniformBufferRange(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxUniformBufferRange.set(segment, 0L, index, value); }
    /// Sets `maxUniformBufferRange` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxUniformBufferRange(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxUniformBufferRange(segment, 0L, value); }
    /// Sets `maxUniformBufferRange` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxUniformBufferRange(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxUniformBufferRange(this.segment(), value); return this; }

    /// {@return `maxStorageBufferRange` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxStorageBufferRange(MemorySegment segment, long index) { return (int) VH_maxStorageBufferRange.get(segment, 0L, index); }
    /// {@return `maxStorageBufferRange`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxStorageBufferRange(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxStorageBufferRange(segment, 0L); }
    /// {@return `maxStorageBufferRange`}
    public @CType("uint32_t") int maxStorageBufferRange() { return VkPhysicalDeviceLimits.get_maxStorageBufferRange(this.segment()); }
    /// Sets `maxStorageBufferRange` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxStorageBufferRange(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxStorageBufferRange.set(segment, 0L, index, value); }
    /// Sets `maxStorageBufferRange` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxStorageBufferRange(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxStorageBufferRange(segment, 0L, value); }
    /// Sets `maxStorageBufferRange` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxStorageBufferRange(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxStorageBufferRange(this.segment(), value); return this; }

    /// {@return `maxPushConstantsSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxPushConstantsSize(MemorySegment segment, long index) { return (int) VH_maxPushConstantsSize.get(segment, 0L, index); }
    /// {@return `maxPushConstantsSize`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxPushConstantsSize(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxPushConstantsSize(segment, 0L); }
    /// {@return `maxPushConstantsSize`}
    public @CType("uint32_t") int maxPushConstantsSize() { return VkPhysicalDeviceLimits.get_maxPushConstantsSize(this.segment()); }
    /// Sets `maxPushConstantsSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxPushConstantsSize(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxPushConstantsSize.set(segment, 0L, index, value); }
    /// Sets `maxPushConstantsSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxPushConstantsSize(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxPushConstantsSize(segment, 0L, value); }
    /// Sets `maxPushConstantsSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxPushConstantsSize(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxPushConstantsSize(this.segment(), value); return this; }

    /// {@return `maxMemoryAllocationCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxMemoryAllocationCount(MemorySegment segment, long index) { return (int) VH_maxMemoryAllocationCount.get(segment, 0L, index); }
    /// {@return `maxMemoryAllocationCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxMemoryAllocationCount(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxMemoryAllocationCount(segment, 0L); }
    /// {@return `maxMemoryAllocationCount`}
    public @CType("uint32_t") int maxMemoryAllocationCount() { return VkPhysicalDeviceLimits.get_maxMemoryAllocationCount(this.segment()); }
    /// Sets `maxMemoryAllocationCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxMemoryAllocationCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxMemoryAllocationCount.set(segment, 0L, index, value); }
    /// Sets `maxMemoryAllocationCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxMemoryAllocationCount(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxMemoryAllocationCount(segment, 0L, value); }
    /// Sets `maxMemoryAllocationCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxMemoryAllocationCount(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxMemoryAllocationCount(this.segment(), value); return this; }

    /// {@return `maxSamplerAllocationCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxSamplerAllocationCount(MemorySegment segment, long index) { return (int) VH_maxSamplerAllocationCount.get(segment, 0L, index); }
    /// {@return `maxSamplerAllocationCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxSamplerAllocationCount(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxSamplerAllocationCount(segment, 0L); }
    /// {@return `maxSamplerAllocationCount`}
    public @CType("uint32_t") int maxSamplerAllocationCount() { return VkPhysicalDeviceLimits.get_maxSamplerAllocationCount(this.segment()); }
    /// Sets `maxSamplerAllocationCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxSamplerAllocationCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxSamplerAllocationCount.set(segment, 0L, index, value); }
    /// Sets `maxSamplerAllocationCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxSamplerAllocationCount(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxSamplerAllocationCount(segment, 0L, value); }
    /// Sets `maxSamplerAllocationCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxSamplerAllocationCount(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxSamplerAllocationCount(this.segment(), value); return this; }

    /// {@return `bufferImageGranularity` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_bufferImageGranularity(MemorySegment segment, long index) { return (long) VH_bufferImageGranularity.get(segment, 0L, index); }
    /// {@return `bufferImageGranularity`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_bufferImageGranularity(MemorySegment segment) { return VkPhysicalDeviceLimits.get_bufferImageGranularity(segment, 0L); }
    /// {@return `bufferImageGranularity`}
    public @CType("VkDeviceSize") long bufferImageGranularity() { return VkPhysicalDeviceLimits.get_bufferImageGranularity(this.segment()); }
    /// Sets `bufferImageGranularity` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_bufferImageGranularity(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_bufferImageGranularity.set(segment, 0L, index, value); }
    /// Sets `bufferImageGranularity` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_bufferImageGranularity(MemorySegment segment, @CType("VkDeviceSize") long value) { VkPhysicalDeviceLimits.set_bufferImageGranularity(segment, 0L, value); }
    /// Sets `bufferImageGranularity` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits bufferImageGranularity(@CType("VkDeviceSize") long value) { VkPhysicalDeviceLimits.set_bufferImageGranularity(this.segment(), value); return this; }

    /// {@return `sparseAddressSpaceSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_sparseAddressSpaceSize(MemorySegment segment, long index) { return (long) VH_sparseAddressSpaceSize.get(segment, 0L, index); }
    /// {@return `sparseAddressSpaceSize`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_sparseAddressSpaceSize(MemorySegment segment) { return VkPhysicalDeviceLimits.get_sparseAddressSpaceSize(segment, 0L); }
    /// {@return `sparseAddressSpaceSize`}
    public @CType("VkDeviceSize") long sparseAddressSpaceSize() { return VkPhysicalDeviceLimits.get_sparseAddressSpaceSize(this.segment()); }
    /// Sets `sparseAddressSpaceSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sparseAddressSpaceSize(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_sparseAddressSpaceSize.set(segment, 0L, index, value); }
    /// Sets `sparseAddressSpaceSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sparseAddressSpaceSize(MemorySegment segment, @CType("VkDeviceSize") long value) { VkPhysicalDeviceLimits.set_sparseAddressSpaceSize(segment, 0L, value); }
    /// Sets `sparseAddressSpaceSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits sparseAddressSpaceSize(@CType("VkDeviceSize") long value) { VkPhysicalDeviceLimits.set_sparseAddressSpaceSize(this.segment(), value); return this; }

    /// {@return `maxBoundDescriptorSets` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxBoundDescriptorSets(MemorySegment segment, long index) { return (int) VH_maxBoundDescriptorSets.get(segment, 0L, index); }
    /// {@return `maxBoundDescriptorSets`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxBoundDescriptorSets(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxBoundDescriptorSets(segment, 0L); }
    /// {@return `maxBoundDescriptorSets`}
    public @CType("uint32_t") int maxBoundDescriptorSets() { return VkPhysicalDeviceLimits.get_maxBoundDescriptorSets(this.segment()); }
    /// Sets `maxBoundDescriptorSets` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxBoundDescriptorSets(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxBoundDescriptorSets.set(segment, 0L, index, value); }
    /// Sets `maxBoundDescriptorSets` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxBoundDescriptorSets(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxBoundDescriptorSets(segment, 0L, value); }
    /// Sets `maxBoundDescriptorSets` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxBoundDescriptorSets(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxBoundDescriptorSets(this.segment(), value); return this; }

    /// {@return `maxPerStageDescriptorSamplers` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxPerStageDescriptorSamplers(MemorySegment segment, long index) { return (int) VH_maxPerStageDescriptorSamplers.get(segment, 0L, index); }
    /// {@return `maxPerStageDescriptorSamplers`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxPerStageDescriptorSamplers(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxPerStageDescriptorSamplers(segment, 0L); }
    /// {@return `maxPerStageDescriptorSamplers`}
    public @CType("uint32_t") int maxPerStageDescriptorSamplers() { return VkPhysicalDeviceLimits.get_maxPerStageDescriptorSamplers(this.segment()); }
    /// Sets `maxPerStageDescriptorSamplers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxPerStageDescriptorSamplers(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxPerStageDescriptorSamplers.set(segment, 0L, index, value); }
    /// Sets `maxPerStageDescriptorSamplers` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxPerStageDescriptorSamplers(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxPerStageDescriptorSamplers(segment, 0L, value); }
    /// Sets `maxPerStageDescriptorSamplers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxPerStageDescriptorSamplers(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxPerStageDescriptorSamplers(this.segment(), value); return this; }

    /// {@return `maxPerStageDescriptorUniformBuffers` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxPerStageDescriptorUniformBuffers(MemorySegment segment, long index) { return (int) VH_maxPerStageDescriptorUniformBuffers.get(segment, 0L, index); }
    /// {@return `maxPerStageDescriptorUniformBuffers`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxPerStageDescriptorUniformBuffers(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxPerStageDescriptorUniformBuffers(segment, 0L); }
    /// {@return `maxPerStageDescriptorUniformBuffers`}
    public @CType("uint32_t") int maxPerStageDescriptorUniformBuffers() { return VkPhysicalDeviceLimits.get_maxPerStageDescriptorUniformBuffers(this.segment()); }
    /// Sets `maxPerStageDescriptorUniformBuffers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxPerStageDescriptorUniformBuffers(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxPerStageDescriptorUniformBuffers.set(segment, 0L, index, value); }
    /// Sets `maxPerStageDescriptorUniformBuffers` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxPerStageDescriptorUniformBuffers(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxPerStageDescriptorUniformBuffers(segment, 0L, value); }
    /// Sets `maxPerStageDescriptorUniformBuffers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxPerStageDescriptorUniformBuffers(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxPerStageDescriptorUniformBuffers(this.segment(), value); return this; }

    /// {@return `maxPerStageDescriptorStorageBuffers` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxPerStageDescriptorStorageBuffers(MemorySegment segment, long index) { return (int) VH_maxPerStageDescriptorStorageBuffers.get(segment, 0L, index); }
    /// {@return `maxPerStageDescriptorStorageBuffers`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxPerStageDescriptorStorageBuffers(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxPerStageDescriptorStorageBuffers(segment, 0L); }
    /// {@return `maxPerStageDescriptorStorageBuffers`}
    public @CType("uint32_t") int maxPerStageDescriptorStorageBuffers() { return VkPhysicalDeviceLimits.get_maxPerStageDescriptorStorageBuffers(this.segment()); }
    /// Sets `maxPerStageDescriptorStorageBuffers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxPerStageDescriptorStorageBuffers(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxPerStageDescriptorStorageBuffers.set(segment, 0L, index, value); }
    /// Sets `maxPerStageDescriptorStorageBuffers` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxPerStageDescriptorStorageBuffers(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxPerStageDescriptorStorageBuffers(segment, 0L, value); }
    /// Sets `maxPerStageDescriptorStorageBuffers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxPerStageDescriptorStorageBuffers(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxPerStageDescriptorStorageBuffers(this.segment(), value); return this; }

    /// {@return `maxPerStageDescriptorSampledImages` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxPerStageDescriptorSampledImages(MemorySegment segment, long index) { return (int) VH_maxPerStageDescriptorSampledImages.get(segment, 0L, index); }
    /// {@return `maxPerStageDescriptorSampledImages`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxPerStageDescriptorSampledImages(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxPerStageDescriptorSampledImages(segment, 0L); }
    /// {@return `maxPerStageDescriptorSampledImages`}
    public @CType("uint32_t") int maxPerStageDescriptorSampledImages() { return VkPhysicalDeviceLimits.get_maxPerStageDescriptorSampledImages(this.segment()); }
    /// Sets `maxPerStageDescriptorSampledImages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxPerStageDescriptorSampledImages(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxPerStageDescriptorSampledImages.set(segment, 0L, index, value); }
    /// Sets `maxPerStageDescriptorSampledImages` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxPerStageDescriptorSampledImages(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxPerStageDescriptorSampledImages(segment, 0L, value); }
    /// Sets `maxPerStageDescriptorSampledImages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxPerStageDescriptorSampledImages(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxPerStageDescriptorSampledImages(this.segment(), value); return this; }

    /// {@return `maxPerStageDescriptorStorageImages` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxPerStageDescriptorStorageImages(MemorySegment segment, long index) { return (int) VH_maxPerStageDescriptorStorageImages.get(segment, 0L, index); }
    /// {@return `maxPerStageDescriptorStorageImages`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxPerStageDescriptorStorageImages(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxPerStageDescriptorStorageImages(segment, 0L); }
    /// {@return `maxPerStageDescriptorStorageImages`}
    public @CType("uint32_t") int maxPerStageDescriptorStorageImages() { return VkPhysicalDeviceLimits.get_maxPerStageDescriptorStorageImages(this.segment()); }
    /// Sets `maxPerStageDescriptorStorageImages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxPerStageDescriptorStorageImages(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxPerStageDescriptorStorageImages.set(segment, 0L, index, value); }
    /// Sets `maxPerStageDescriptorStorageImages` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxPerStageDescriptorStorageImages(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxPerStageDescriptorStorageImages(segment, 0L, value); }
    /// Sets `maxPerStageDescriptorStorageImages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxPerStageDescriptorStorageImages(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxPerStageDescriptorStorageImages(this.segment(), value); return this; }

    /// {@return `maxPerStageDescriptorInputAttachments` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxPerStageDescriptorInputAttachments(MemorySegment segment, long index) { return (int) VH_maxPerStageDescriptorInputAttachments.get(segment, 0L, index); }
    /// {@return `maxPerStageDescriptorInputAttachments`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxPerStageDescriptorInputAttachments(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxPerStageDescriptorInputAttachments(segment, 0L); }
    /// {@return `maxPerStageDescriptorInputAttachments`}
    public @CType("uint32_t") int maxPerStageDescriptorInputAttachments() { return VkPhysicalDeviceLimits.get_maxPerStageDescriptorInputAttachments(this.segment()); }
    /// Sets `maxPerStageDescriptorInputAttachments` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxPerStageDescriptorInputAttachments(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxPerStageDescriptorInputAttachments.set(segment, 0L, index, value); }
    /// Sets `maxPerStageDescriptorInputAttachments` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxPerStageDescriptorInputAttachments(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxPerStageDescriptorInputAttachments(segment, 0L, value); }
    /// Sets `maxPerStageDescriptorInputAttachments` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxPerStageDescriptorInputAttachments(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxPerStageDescriptorInputAttachments(this.segment(), value); return this; }

    /// {@return `maxPerStageResources` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxPerStageResources(MemorySegment segment, long index) { return (int) VH_maxPerStageResources.get(segment, 0L, index); }
    /// {@return `maxPerStageResources`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxPerStageResources(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxPerStageResources(segment, 0L); }
    /// {@return `maxPerStageResources`}
    public @CType("uint32_t") int maxPerStageResources() { return VkPhysicalDeviceLimits.get_maxPerStageResources(this.segment()); }
    /// Sets `maxPerStageResources` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxPerStageResources(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxPerStageResources.set(segment, 0L, index, value); }
    /// Sets `maxPerStageResources` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxPerStageResources(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxPerStageResources(segment, 0L, value); }
    /// Sets `maxPerStageResources` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxPerStageResources(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxPerStageResources(this.segment(), value); return this; }

    /// {@return `maxDescriptorSetSamplers` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxDescriptorSetSamplers(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetSamplers.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetSamplers`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxDescriptorSetSamplers(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxDescriptorSetSamplers(segment, 0L); }
    /// {@return `maxDescriptorSetSamplers`}
    public @CType("uint32_t") int maxDescriptorSetSamplers() { return VkPhysicalDeviceLimits.get_maxDescriptorSetSamplers(this.segment()); }
    /// Sets `maxDescriptorSetSamplers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxDescriptorSetSamplers(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxDescriptorSetSamplers.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetSamplers` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxDescriptorSetSamplers(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxDescriptorSetSamplers(segment, 0L, value); }
    /// Sets `maxDescriptorSetSamplers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxDescriptorSetSamplers(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxDescriptorSetSamplers(this.segment(), value); return this; }

    /// {@return `maxDescriptorSetUniformBuffers` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxDescriptorSetUniformBuffers(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetUniformBuffers.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetUniformBuffers`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxDescriptorSetUniformBuffers(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxDescriptorSetUniformBuffers(segment, 0L); }
    /// {@return `maxDescriptorSetUniformBuffers`}
    public @CType("uint32_t") int maxDescriptorSetUniformBuffers() { return VkPhysicalDeviceLimits.get_maxDescriptorSetUniformBuffers(this.segment()); }
    /// Sets `maxDescriptorSetUniformBuffers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxDescriptorSetUniformBuffers(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxDescriptorSetUniformBuffers.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetUniformBuffers` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxDescriptorSetUniformBuffers(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxDescriptorSetUniformBuffers(segment, 0L, value); }
    /// Sets `maxDescriptorSetUniformBuffers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxDescriptorSetUniformBuffers(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxDescriptorSetUniformBuffers(this.segment(), value); return this; }

    /// {@return `maxDescriptorSetUniformBuffersDynamic` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxDescriptorSetUniformBuffersDynamic(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetUniformBuffersDynamic.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetUniformBuffersDynamic`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxDescriptorSetUniformBuffersDynamic(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxDescriptorSetUniformBuffersDynamic(segment, 0L); }
    /// {@return `maxDescriptorSetUniformBuffersDynamic`}
    public @CType("uint32_t") int maxDescriptorSetUniformBuffersDynamic() { return VkPhysicalDeviceLimits.get_maxDescriptorSetUniformBuffersDynamic(this.segment()); }
    /// Sets `maxDescriptorSetUniformBuffersDynamic` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxDescriptorSetUniformBuffersDynamic(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxDescriptorSetUniformBuffersDynamic.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetUniformBuffersDynamic` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxDescriptorSetUniformBuffersDynamic(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxDescriptorSetUniformBuffersDynamic(segment, 0L, value); }
    /// Sets `maxDescriptorSetUniformBuffersDynamic` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxDescriptorSetUniformBuffersDynamic(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxDescriptorSetUniformBuffersDynamic(this.segment(), value); return this; }

    /// {@return `maxDescriptorSetStorageBuffers` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxDescriptorSetStorageBuffers(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetStorageBuffers.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetStorageBuffers`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxDescriptorSetStorageBuffers(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxDescriptorSetStorageBuffers(segment, 0L); }
    /// {@return `maxDescriptorSetStorageBuffers`}
    public @CType("uint32_t") int maxDescriptorSetStorageBuffers() { return VkPhysicalDeviceLimits.get_maxDescriptorSetStorageBuffers(this.segment()); }
    /// Sets `maxDescriptorSetStorageBuffers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxDescriptorSetStorageBuffers(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxDescriptorSetStorageBuffers.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetStorageBuffers` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxDescriptorSetStorageBuffers(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxDescriptorSetStorageBuffers(segment, 0L, value); }
    /// Sets `maxDescriptorSetStorageBuffers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxDescriptorSetStorageBuffers(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxDescriptorSetStorageBuffers(this.segment(), value); return this; }

    /// {@return `maxDescriptorSetStorageBuffersDynamic` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxDescriptorSetStorageBuffersDynamic(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetStorageBuffersDynamic.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetStorageBuffersDynamic`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxDescriptorSetStorageBuffersDynamic(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxDescriptorSetStorageBuffersDynamic(segment, 0L); }
    /// {@return `maxDescriptorSetStorageBuffersDynamic`}
    public @CType("uint32_t") int maxDescriptorSetStorageBuffersDynamic() { return VkPhysicalDeviceLimits.get_maxDescriptorSetStorageBuffersDynamic(this.segment()); }
    /// Sets `maxDescriptorSetStorageBuffersDynamic` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxDescriptorSetStorageBuffersDynamic(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxDescriptorSetStorageBuffersDynamic.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetStorageBuffersDynamic` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxDescriptorSetStorageBuffersDynamic(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxDescriptorSetStorageBuffersDynamic(segment, 0L, value); }
    /// Sets `maxDescriptorSetStorageBuffersDynamic` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxDescriptorSetStorageBuffersDynamic(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxDescriptorSetStorageBuffersDynamic(this.segment(), value); return this; }

    /// {@return `maxDescriptorSetSampledImages` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxDescriptorSetSampledImages(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetSampledImages.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetSampledImages`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxDescriptorSetSampledImages(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxDescriptorSetSampledImages(segment, 0L); }
    /// {@return `maxDescriptorSetSampledImages`}
    public @CType("uint32_t") int maxDescriptorSetSampledImages() { return VkPhysicalDeviceLimits.get_maxDescriptorSetSampledImages(this.segment()); }
    /// Sets `maxDescriptorSetSampledImages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxDescriptorSetSampledImages(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxDescriptorSetSampledImages.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetSampledImages` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxDescriptorSetSampledImages(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxDescriptorSetSampledImages(segment, 0L, value); }
    /// Sets `maxDescriptorSetSampledImages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxDescriptorSetSampledImages(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxDescriptorSetSampledImages(this.segment(), value); return this; }

    /// {@return `maxDescriptorSetStorageImages` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxDescriptorSetStorageImages(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetStorageImages.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetStorageImages`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxDescriptorSetStorageImages(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxDescriptorSetStorageImages(segment, 0L); }
    /// {@return `maxDescriptorSetStorageImages`}
    public @CType("uint32_t") int maxDescriptorSetStorageImages() { return VkPhysicalDeviceLimits.get_maxDescriptorSetStorageImages(this.segment()); }
    /// Sets `maxDescriptorSetStorageImages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxDescriptorSetStorageImages(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxDescriptorSetStorageImages.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetStorageImages` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxDescriptorSetStorageImages(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxDescriptorSetStorageImages(segment, 0L, value); }
    /// Sets `maxDescriptorSetStorageImages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxDescriptorSetStorageImages(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxDescriptorSetStorageImages(this.segment(), value); return this; }

    /// {@return `maxDescriptorSetInputAttachments` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxDescriptorSetInputAttachments(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetInputAttachments.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetInputAttachments`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxDescriptorSetInputAttachments(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxDescriptorSetInputAttachments(segment, 0L); }
    /// {@return `maxDescriptorSetInputAttachments`}
    public @CType("uint32_t") int maxDescriptorSetInputAttachments() { return VkPhysicalDeviceLimits.get_maxDescriptorSetInputAttachments(this.segment()); }
    /// Sets `maxDescriptorSetInputAttachments` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxDescriptorSetInputAttachments(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxDescriptorSetInputAttachments.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetInputAttachments` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxDescriptorSetInputAttachments(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxDescriptorSetInputAttachments(segment, 0L, value); }
    /// Sets `maxDescriptorSetInputAttachments` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxDescriptorSetInputAttachments(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxDescriptorSetInputAttachments(this.segment(), value); return this; }

    /// {@return `maxVertexInputAttributes` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxVertexInputAttributes(MemorySegment segment, long index) { return (int) VH_maxVertexInputAttributes.get(segment, 0L, index); }
    /// {@return `maxVertexInputAttributes`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxVertexInputAttributes(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxVertexInputAttributes(segment, 0L); }
    /// {@return `maxVertexInputAttributes`}
    public @CType("uint32_t") int maxVertexInputAttributes() { return VkPhysicalDeviceLimits.get_maxVertexInputAttributes(this.segment()); }
    /// Sets `maxVertexInputAttributes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxVertexInputAttributes(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxVertexInputAttributes.set(segment, 0L, index, value); }
    /// Sets `maxVertexInputAttributes` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxVertexInputAttributes(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxVertexInputAttributes(segment, 0L, value); }
    /// Sets `maxVertexInputAttributes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxVertexInputAttributes(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxVertexInputAttributes(this.segment(), value); return this; }

    /// {@return `maxVertexInputBindings` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxVertexInputBindings(MemorySegment segment, long index) { return (int) VH_maxVertexInputBindings.get(segment, 0L, index); }
    /// {@return `maxVertexInputBindings`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxVertexInputBindings(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxVertexInputBindings(segment, 0L); }
    /// {@return `maxVertexInputBindings`}
    public @CType("uint32_t") int maxVertexInputBindings() { return VkPhysicalDeviceLimits.get_maxVertexInputBindings(this.segment()); }
    /// Sets `maxVertexInputBindings` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxVertexInputBindings(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxVertexInputBindings.set(segment, 0L, index, value); }
    /// Sets `maxVertexInputBindings` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxVertexInputBindings(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxVertexInputBindings(segment, 0L, value); }
    /// Sets `maxVertexInputBindings` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxVertexInputBindings(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxVertexInputBindings(this.segment(), value); return this; }

    /// {@return `maxVertexInputAttributeOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxVertexInputAttributeOffset(MemorySegment segment, long index) { return (int) VH_maxVertexInputAttributeOffset.get(segment, 0L, index); }
    /// {@return `maxVertexInputAttributeOffset`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxVertexInputAttributeOffset(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxVertexInputAttributeOffset(segment, 0L); }
    /// {@return `maxVertexInputAttributeOffset`}
    public @CType("uint32_t") int maxVertexInputAttributeOffset() { return VkPhysicalDeviceLimits.get_maxVertexInputAttributeOffset(this.segment()); }
    /// Sets `maxVertexInputAttributeOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxVertexInputAttributeOffset(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxVertexInputAttributeOffset.set(segment, 0L, index, value); }
    /// Sets `maxVertexInputAttributeOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxVertexInputAttributeOffset(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxVertexInputAttributeOffset(segment, 0L, value); }
    /// Sets `maxVertexInputAttributeOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxVertexInputAttributeOffset(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxVertexInputAttributeOffset(this.segment(), value); return this; }

    /// {@return `maxVertexInputBindingStride` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxVertexInputBindingStride(MemorySegment segment, long index) { return (int) VH_maxVertexInputBindingStride.get(segment, 0L, index); }
    /// {@return `maxVertexInputBindingStride`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxVertexInputBindingStride(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxVertexInputBindingStride(segment, 0L); }
    /// {@return `maxVertexInputBindingStride`}
    public @CType("uint32_t") int maxVertexInputBindingStride() { return VkPhysicalDeviceLimits.get_maxVertexInputBindingStride(this.segment()); }
    /// Sets `maxVertexInputBindingStride` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxVertexInputBindingStride(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxVertexInputBindingStride.set(segment, 0L, index, value); }
    /// Sets `maxVertexInputBindingStride` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxVertexInputBindingStride(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxVertexInputBindingStride(segment, 0L, value); }
    /// Sets `maxVertexInputBindingStride` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxVertexInputBindingStride(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxVertexInputBindingStride(this.segment(), value); return this; }

    /// {@return `maxVertexOutputComponents` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxVertexOutputComponents(MemorySegment segment, long index) { return (int) VH_maxVertexOutputComponents.get(segment, 0L, index); }
    /// {@return `maxVertexOutputComponents`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxVertexOutputComponents(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxVertexOutputComponents(segment, 0L); }
    /// {@return `maxVertexOutputComponents`}
    public @CType("uint32_t") int maxVertexOutputComponents() { return VkPhysicalDeviceLimits.get_maxVertexOutputComponents(this.segment()); }
    /// Sets `maxVertexOutputComponents` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxVertexOutputComponents(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxVertexOutputComponents.set(segment, 0L, index, value); }
    /// Sets `maxVertexOutputComponents` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxVertexOutputComponents(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxVertexOutputComponents(segment, 0L, value); }
    /// Sets `maxVertexOutputComponents` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxVertexOutputComponents(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxVertexOutputComponents(this.segment(), value); return this; }

    /// {@return `maxTessellationGenerationLevel` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxTessellationGenerationLevel(MemorySegment segment, long index) { return (int) VH_maxTessellationGenerationLevel.get(segment, 0L, index); }
    /// {@return `maxTessellationGenerationLevel`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxTessellationGenerationLevel(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxTessellationGenerationLevel(segment, 0L); }
    /// {@return `maxTessellationGenerationLevel`}
    public @CType("uint32_t") int maxTessellationGenerationLevel() { return VkPhysicalDeviceLimits.get_maxTessellationGenerationLevel(this.segment()); }
    /// Sets `maxTessellationGenerationLevel` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxTessellationGenerationLevel(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxTessellationGenerationLevel.set(segment, 0L, index, value); }
    /// Sets `maxTessellationGenerationLevel` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxTessellationGenerationLevel(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxTessellationGenerationLevel(segment, 0L, value); }
    /// Sets `maxTessellationGenerationLevel` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxTessellationGenerationLevel(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxTessellationGenerationLevel(this.segment(), value); return this; }

    /// {@return `maxTessellationPatchSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxTessellationPatchSize(MemorySegment segment, long index) { return (int) VH_maxTessellationPatchSize.get(segment, 0L, index); }
    /// {@return `maxTessellationPatchSize`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxTessellationPatchSize(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxTessellationPatchSize(segment, 0L); }
    /// {@return `maxTessellationPatchSize`}
    public @CType("uint32_t") int maxTessellationPatchSize() { return VkPhysicalDeviceLimits.get_maxTessellationPatchSize(this.segment()); }
    /// Sets `maxTessellationPatchSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxTessellationPatchSize(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxTessellationPatchSize.set(segment, 0L, index, value); }
    /// Sets `maxTessellationPatchSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxTessellationPatchSize(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxTessellationPatchSize(segment, 0L, value); }
    /// Sets `maxTessellationPatchSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxTessellationPatchSize(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxTessellationPatchSize(this.segment(), value); return this; }

    /// {@return `maxTessellationControlPerVertexInputComponents` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxTessellationControlPerVertexInputComponents(MemorySegment segment, long index) { return (int) VH_maxTessellationControlPerVertexInputComponents.get(segment, 0L, index); }
    /// {@return `maxTessellationControlPerVertexInputComponents`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxTessellationControlPerVertexInputComponents(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxTessellationControlPerVertexInputComponents(segment, 0L); }
    /// {@return `maxTessellationControlPerVertexInputComponents`}
    public @CType("uint32_t") int maxTessellationControlPerVertexInputComponents() { return VkPhysicalDeviceLimits.get_maxTessellationControlPerVertexInputComponents(this.segment()); }
    /// Sets `maxTessellationControlPerVertexInputComponents` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxTessellationControlPerVertexInputComponents(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxTessellationControlPerVertexInputComponents.set(segment, 0L, index, value); }
    /// Sets `maxTessellationControlPerVertexInputComponents` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxTessellationControlPerVertexInputComponents(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxTessellationControlPerVertexInputComponents(segment, 0L, value); }
    /// Sets `maxTessellationControlPerVertexInputComponents` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxTessellationControlPerVertexInputComponents(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxTessellationControlPerVertexInputComponents(this.segment(), value); return this; }

    /// {@return `maxTessellationControlPerVertexOutputComponents` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxTessellationControlPerVertexOutputComponents(MemorySegment segment, long index) { return (int) VH_maxTessellationControlPerVertexOutputComponents.get(segment, 0L, index); }
    /// {@return `maxTessellationControlPerVertexOutputComponents`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxTessellationControlPerVertexOutputComponents(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxTessellationControlPerVertexOutputComponents(segment, 0L); }
    /// {@return `maxTessellationControlPerVertexOutputComponents`}
    public @CType("uint32_t") int maxTessellationControlPerVertexOutputComponents() { return VkPhysicalDeviceLimits.get_maxTessellationControlPerVertexOutputComponents(this.segment()); }
    /// Sets `maxTessellationControlPerVertexOutputComponents` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxTessellationControlPerVertexOutputComponents(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxTessellationControlPerVertexOutputComponents.set(segment, 0L, index, value); }
    /// Sets `maxTessellationControlPerVertexOutputComponents` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxTessellationControlPerVertexOutputComponents(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxTessellationControlPerVertexOutputComponents(segment, 0L, value); }
    /// Sets `maxTessellationControlPerVertexOutputComponents` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxTessellationControlPerVertexOutputComponents(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxTessellationControlPerVertexOutputComponents(this.segment(), value); return this; }

    /// {@return `maxTessellationControlPerPatchOutputComponents` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxTessellationControlPerPatchOutputComponents(MemorySegment segment, long index) { return (int) VH_maxTessellationControlPerPatchOutputComponents.get(segment, 0L, index); }
    /// {@return `maxTessellationControlPerPatchOutputComponents`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxTessellationControlPerPatchOutputComponents(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxTessellationControlPerPatchOutputComponents(segment, 0L); }
    /// {@return `maxTessellationControlPerPatchOutputComponents`}
    public @CType("uint32_t") int maxTessellationControlPerPatchOutputComponents() { return VkPhysicalDeviceLimits.get_maxTessellationControlPerPatchOutputComponents(this.segment()); }
    /// Sets `maxTessellationControlPerPatchOutputComponents` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxTessellationControlPerPatchOutputComponents(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxTessellationControlPerPatchOutputComponents.set(segment, 0L, index, value); }
    /// Sets `maxTessellationControlPerPatchOutputComponents` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxTessellationControlPerPatchOutputComponents(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxTessellationControlPerPatchOutputComponents(segment, 0L, value); }
    /// Sets `maxTessellationControlPerPatchOutputComponents` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxTessellationControlPerPatchOutputComponents(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxTessellationControlPerPatchOutputComponents(this.segment(), value); return this; }

    /// {@return `maxTessellationControlTotalOutputComponents` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxTessellationControlTotalOutputComponents(MemorySegment segment, long index) { return (int) VH_maxTessellationControlTotalOutputComponents.get(segment, 0L, index); }
    /// {@return `maxTessellationControlTotalOutputComponents`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxTessellationControlTotalOutputComponents(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxTessellationControlTotalOutputComponents(segment, 0L); }
    /// {@return `maxTessellationControlTotalOutputComponents`}
    public @CType("uint32_t") int maxTessellationControlTotalOutputComponents() { return VkPhysicalDeviceLimits.get_maxTessellationControlTotalOutputComponents(this.segment()); }
    /// Sets `maxTessellationControlTotalOutputComponents` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxTessellationControlTotalOutputComponents(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxTessellationControlTotalOutputComponents.set(segment, 0L, index, value); }
    /// Sets `maxTessellationControlTotalOutputComponents` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxTessellationControlTotalOutputComponents(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxTessellationControlTotalOutputComponents(segment, 0L, value); }
    /// Sets `maxTessellationControlTotalOutputComponents` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxTessellationControlTotalOutputComponents(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxTessellationControlTotalOutputComponents(this.segment(), value); return this; }

    /// {@return `maxTessellationEvaluationInputComponents` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxTessellationEvaluationInputComponents(MemorySegment segment, long index) { return (int) VH_maxTessellationEvaluationInputComponents.get(segment, 0L, index); }
    /// {@return `maxTessellationEvaluationInputComponents`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxTessellationEvaluationInputComponents(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxTessellationEvaluationInputComponents(segment, 0L); }
    /// {@return `maxTessellationEvaluationInputComponents`}
    public @CType("uint32_t") int maxTessellationEvaluationInputComponents() { return VkPhysicalDeviceLimits.get_maxTessellationEvaluationInputComponents(this.segment()); }
    /// Sets `maxTessellationEvaluationInputComponents` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxTessellationEvaluationInputComponents(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxTessellationEvaluationInputComponents.set(segment, 0L, index, value); }
    /// Sets `maxTessellationEvaluationInputComponents` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxTessellationEvaluationInputComponents(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxTessellationEvaluationInputComponents(segment, 0L, value); }
    /// Sets `maxTessellationEvaluationInputComponents` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxTessellationEvaluationInputComponents(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxTessellationEvaluationInputComponents(this.segment(), value); return this; }

    /// {@return `maxTessellationEvaluationOutputComponents` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxTessellationEvaluationOutputComponents(MemorySegment segment, long index) { return (int) VH_maxTessellationEvaluationOutputComponents.get(segment, 0L, index); }
    /// {@return `maxTessellationEvaluationOutputComponents`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxTessellationEvaluationOutputComponents(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxTessellationEvaluationOutputComponents(segment, 0L); }
    /// {@return `maxTessellationEvaluationOutputComponents`}
    public @CType("uint32_t") int maxTessellationEvaluationOutputComponents() { return VkPhysicalDeviceLimits.get_maxTessellationEvaluationOutputComponents(this.segment()); }
    /// Sets `maxTessellationEvaluationOutputComponents` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxTessellationEvaluationOutputComponents(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxTessellationEvaluationOutputComponents.set(segment, 0L, index, value); }
    /// Sets `maxTessellationEvaluationOutputComponents` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxTessellationEvaluationOutputComponents(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxTessellationEvaluationOutputComponents(segment, 0L, value); }
    /// Sets `maxTessellationEvaluationOutputComponents` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxTessellationEvaluationOutputComponents(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxTessellationEvaluationOutputComponents(this.segment(), value); return this; }

    /// {@return `maxGeometryShaderInvocations` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxGeometryShaderInvocations(MemorySegment segment, long index) { return (int) VH_maxGeometryShaderInvocations.get(segment, 0L, index); }
    /// {@return `maxGeometryShaderInvocations`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxGeometryShaderInvocations(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxGeometryShaderInvocations(segment, 0L); }
    /// {@return `maxGeometryShaderInvocations`}
    public @CType("uint32_t") int maxGeometryShaderInvocations() { return VkPhysicalDeviceLimits.get_maxGeometryShaderInvocations(this.segment()); }
    /// Sets `maxGeometryShaderInvocations` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxGeometryShaderInvocations(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxGeometryShaderInvocations.set(segment, 0L, index, value); }
    /// Sets `maxGeometryShaderInvocations` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxGeometryShaderInvocations(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxGeometryShaderInvocations(segment, 0L, value); }
    /// Sets `maxGeometryShaderInvocations` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxGeometryShaderInvocations(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxGeometryShaderInvocations(this.segment(), value); return this; }

    /// {@return `maxGeometryInputComponents` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxGeometryInputComponents(MemorySegment segment, long index) { return (int) VH_maxGeometryInputComponents.get(segment, 0L, index); }
    /// {@return `maxGeometryInputComponents`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxGeometryInputComponents(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxGeometryInputComponents(segment, 0L); }
    /// {@return `maxGeometryInputComponents`}
    public @CType("uint32_t") int maxGeometryInputComponents() { return VkPhysicalDeviceLimits.get_maxGeometryInputComponents(this.segment()); }
    /// Sets `maxGeometryInputComponents` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxGeometryInputComponents(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxGeometryInputComponents.set(segment, 0L, index, value); }
    /// Sets `maxGeometryInputComponents` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxGeometryInputComponents(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxGeometryInputComponents(segment, 0L, value); }
    /// Sets `maxGeometryInputComponents` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxGeometryInputComponents(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxGeometryInputComponents(this.segment(), value); return this; }

    /// {@return `maxGeometryOutputComponents` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxGeometryOutputComponents(MemorySegment segment, long index) { return (int) VH_maxGeometryOutputComponents.get(segment, 0L, index); }
    /// {@return `maxGeometryOutputComponents`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxGeometryOutputComponents(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxGeometryOutputComponents(segment, 0L); }
    /// {@return `maxGeometryOutputComponents`}
    public @CType("uint32_t") int maxGeometryOutputComponents() { return VkPhysicalDeviceLimits.get_maxGeometryOutputComponents(this.segment()); }
    /// Sets `maxGeometryOutputComponents` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxGeometryOutputComponents(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxGeometryOutputComponents.set(segment, 0L, index, value); }
    /// Sets `maxGeometryOutputComponents` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxGeometryOutputComponents(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxGeometryOutputComponents(segment, 0L, value); }
    /// Sets `maxGeometryOutputComponents` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxGeometryOutputComponents(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxGeometryOutputComponents(this.segment(), value); return this; }

    /// {@return `maxGeometryOutputVertices` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxGeometryOutputVertices(MemorySegment segment, long index) { return (int) VH_maxGeometryOutputVertices.get(segment, 0L, index); }
    /// {@return `maxGeometryOutputVertices`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxGeometryOutputVertices(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxGeometryOutputVertices(segment, 0L); }
    /// {@return `maxGeometryOutputVertices`}
    public @CType("uint32_t") int maxGeometryOutputVertices() { return VkPhysicalDeviceLimits.get_maxGeometryOutputVertices(this.segment()); }
    /// Sets `maxGeometryOutputVertices` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxGeometryOutputVertices(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxGeometryOutputVertices.set(segment, 0L, index, value); }
    /// Sets `maxGeometryOutputVertices` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxGeometryOutputVertices(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxGeometryOutputVertices(segment, 0L, value); }
    /// Sets `maxGeometryOutputVertices` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxGeometryOutputVertices(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxGeometryOutputVertices(this.segment(), value); return this; }

    /// {@return `maxGeometryTotalOutputComponents` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxGeometryTotalOutputComponents(MemorySegment segment, long index) { return (int) VH_maxGeometryTotalOutputComponents.get(segment, 0L, index); }
    /// {@return `maxGeometryTotalOutputComponents`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxGeometryTotalOutputComponents(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxGeometryTotalOutputComponents(segment, 0L); }
    /// {@return `maxGeometryTotalOutputComponents`}
    public @CType("uint32_t") int maxGeometryTotalOutputComponents() { return VkPhysicalDeviceLimits.get_maxGeometryTotalOutputComponents(this.segment()); }
    /// Sets `maxGeometryTotalOutputComponents` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxGeometryTotalOutputComponents(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxGeometryTotalOutputComponents.set(segment, 0L, index, value); }
    /// Sets `maxGeometryTotalOutputComponents` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxGeometryTotalOutputComponents(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxGeometryTotalOutputComponents(segment, 0L, value); }
    /// Sets `maxGeometryTotalOutputComponents` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxGeometryTotalOutputComponents(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxGeometryTotalOutputComponents(this.segment(), value); return this; }

    /// {@return `maxFragmentInputComponents` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxFragmentInputComponents(MemorySegment segment, long index) { return (int) VH_maxFragmentInputComponents.get(segment, 0L, index); }
    /// {@return `maxFragmentInputComponents`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxFragmentInputComponents(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxFragmentInputComponents(segment, 0L); }
    /// {@return `maxFragmentInputComponents`}
    public @CType("uint32_t") int maxFragmentInputComponents() { return VkPhysicalDeviceLimits.get_maxFragmentInputComponents(this.segment()); }
    /// Sets `maxFragmentInputComponents` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxFragmentInputComponents(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxFragmentInputComponents.set(segment, 0L, index, value); }
    /// Sets `maxFragmentInputComponents` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxFragmentInputComponents(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxFragmentInputComponents(segment, 0L, value); }
    /// Sets `maxFragmentInputComponents` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxFragmentInputComponents(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxFragmentInputComponents(this.segment(), value); return this; }

    /// {@return `maxFragmentOutputAttachments` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxFragmentOutputAttachments(MemorySegment segment, long index) { return (int) VH_maxFragmentOutputAttachments.get(segment, 0L, index); }
    /// {@return `maxFragmentOutputAttachments`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxFragmentOutputAttachments(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxFragmentOutputAttachments(segment, 0L); }
    /// {@return `maxFragmentOutputAttachments`}
    public @CType("uint32_t") int maxFragmentOutputAttachments() { return VkPhysicalDeviceLimits.get_maxFragmentOutputAttachments(this.segment()); }
    /// Sets `maxFragmentOutputAttachments` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxFragmentOutputAttachments(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxFragmentOutputAttachments.set(segment, 0L, index, value); }
    /// Sets `maxFragmentOutputAttachments` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxFragmentOutputAttachments(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxFragmentOutputAttachments(segment, 0L, value); }
    /// Sets `maxFragmentOutputAttachments` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxFragmentOutputAttachments(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxFragmentOutputAttachments(this.segment(), value); return this; }

    /// {@return `maxFragmentDualSrcAttachments` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxFragmentDualSrcAttachments(MemorySegment segment, long index) { return (int) VH_maxFragmentDualSrcAttachments.get(segment, 0L, index); }
    /// {@return `maxFragmentDualSrcAttachments`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxFragmentDualSrcAttachments(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxFragmentDualSrcAttachments(segment, 0L); }
    /// {@return `maxFragmentDualSrcAttachments`}
    public @CType("uint32_t") int maxFragmentDualSrcAttachments() { return VkPhysicalDeviceLimits.get_maxFragmentDualSrcAttachments(this.segment()); }
    /// Sets `maxFragmentDualSrcAttachments` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxFragmentDualSrcAttachments(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxFragmentDualSrcAttachments.set(segment, 0L, index, value); }
    /// Sets `maxFragmentDualSrcAttachments` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxFragmentDualSrcAttachments(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxFragmentDualSrcAttachments(segment, 0L, value); }
    /// Sets `maxFragmentDualSrcAttachments` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxFragmentDualSrcAttachments(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxFragmentDualSrcAttachments(this.segment(), value); return this; }

    /// {@return `maxFragmentCombinedOutputResources` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxFragmentCombinedOutputResources(MemorySegment segment, long index) { return (int) VH_maxFragmentCombinedOutputResources.get(segment, 0L, index); }
    /// {@return `maxFragmentCombinedOutputResources`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxFragmentCombinedOutputResources(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxFragmentCombinedOutputResources(segment, 0L); }
    /// {@return `maxFragmentCombinedOutputResources`}
    public @CType("uint32_t") int maxFragmentCombinedOutputResources() { return VkPhysicalDeviceLimits.get_maxFragmentCombinedOutputResources(this.segment()); }
    /// Sets `maxFragmentCombinedOutputResources` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxFragmentCombinedOutputResources(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxFragmentCombinedOutputResources.set(segment, 0L, index, value); }
    /// Sets `maxFragmentCombinedOutputResources` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxFragmentCombinedOutputResources(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxFragmentCombinedOutputResources(segment, 0L, value); }
    /// Sets `maxFragmentCombinedOutputResources` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxFragmentCombinedOutputResources(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxFragmentCombinedOutputResources(this.segment(), value); return this; }

    /// {@return `maxComputeSharedMemorySize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxComputeSharedMemorySize(MemorySegment segment, long index) { return (int) VH_maxComputeSharedMemorySize.get(segment, 0L, index); }
    /// {@return `maxComputeSharedMemorySize`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxComputeSharedMemorySize(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxComputeSharedMemorySize(segment, 0L); }
    /// {@return `maxComputeSharedMemorySize`}
    public @CType("uint32_t") int maxComputeSharedMemorySize() { return VkPhysicalDeviceLimits.get_maxComputeSharedMemorySize(this.segment()); }
    /// Sets `maxComputeSharedMemorySize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxComputeSharedMemorySize(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxComputeSharedMemorySize.set(segment, 0L, index, value); }
    /// Sets `maxComputeSharedMemorySize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxComputeSharedMemorySize(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxComputeSharedMemorySize(segment, 0L, value); }
    /// Sets `maxComputeSharedMemorySize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxComputeSharedMemorySize(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxComputeSharedMemorySize(this.segment(), value); return this; }

    /// {@return `maxComputeWorkGroupCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t[3]") java.lang.foreign.MemorySegment get_maxComputeWorkGroupCount(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxComputeWorkGroupCount, index), ML_maxComputeWorkGroupCount); }
    /// {@return `maxComputeWorkGroupCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t[3]") java.lang.foreign.MemorySegment get_maxComputeWorkGroupCount(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxComputeWorkGroupCount(segment, 0L); }
    /// {@return `maxComputeWorkGroupCount`}
    public @CType("uint32_t[3]") java.lang.foreign.MemorySegment maxComputeWorkGroupCount() { return VkPhysicalDeviceLimits.get_maxComputeWorkGroupCount(this.segment()); }
    /// Sets `maxComputeWorkGroupCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxComputeWorkGroupCount(MemorySegment segment, long index, @CType("uint32_t[3]") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxComputeWorkGroupCount, index), ML_maxComputeWorkGroupCount.byteSize()); }
    /// Sets `maxComputeWorkGroupCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxComputeWorkGroupCount(MemorySegment segment, @CType("uint32_t[3]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceLimits.set_maxComputeWorkGroupCount(segment, 0L, value); }
    /// Sets `maxComputeWorkGroupCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxComputeWorkGroupCount(@CType("uint32_t[3]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceLimits.set_maxComputeWorkGroupCount(this.segment(), value); return this; }

    /// {@return `maxComputeWorkGroupInvocations` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxComputeWorkGroupInvocations(MemorySegment segment, long index) { return (int) VH_maxComputeWorkGroupInvocations.get(segment, 0L, index); }
    /// {@return `maxComputeWorkGroupInvocations`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxComputeWorkGroupInvocations(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxComputeWorkGroupInvocations(segment, 0L); }
    /// {@return `maxComputeWorkGroupInvocations`}
    public @CType("uint32_t") int maxComputeWorkGroupInvocations() { return VkPhysicalDeviceLimits.get_maxComputeWorkGroupInvocations(this.segment()); }
    /// Sets `maxComputeWorkGroupInvocations` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxComputeWorkGroupInvocations(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxComputeWorkGroupInvocations.set(segment, 0L, index, value); }
    /// Sets `maxComputeWorkGroupInvocations` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxComputeWorkGroupInvocations(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxComputeWorkGroupInvocations(segment, 0L, value); }
    /// Sets `maxComputeWorkGroupInvocations` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxComputeWorkGroupInvocations(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxComputeWorkGroupInvocations(this.segment(), value); return this; }

    /// {@return `maxComputeWorkGroupSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t[3]") java.lang.foreign.MemorySegment get_maxComputeWorkGroupSize(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxComputeWorkGroupSize, index), ML_maxComputeWorkGroupSize); }
    /// {@return `maxComputeWorkGroupSize`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t[3]") java.lang.foreign.MemorySegment get_maxComputeWorkGroupSize(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxComputeWorkGroupSize(segment, 0L); }
    /// {@return `maxComputeWorkGroupSize`}
    public @CType("uint32_t[3]") java.lang.foreign.MemorySegment maxComputeWorkGroupSize() { return VkPhysicalDeviceLimits.get_maxComputeWorkGroupSize(this.segment()); }
    /// Sets `maxComputeWorkGroupSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxComputeWorkGroupSize(MemorySegment segment, long index, @CType("uint32_t[3]") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxComputeWorkGroupSize, index), ML_maxComputeWorkGroupSize.byteSize()); }
    /// Sets `maxComputeWorkGroupSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxComputeWorkGroupSize(MemorySegment segment, @CType("uint32_t[3]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceLimits.set_maxComputeWorkGroupSize(segment, 0L, value); }
    /// Sets `maxComputeWorkGroupSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxComputeWorkGroupSize(@CType("uint32_t[3]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceLimits.set_maxComputeWorkGroupSize(this.segment(), value); return this; }

    /// {@return `subPixelPrecisionBits` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_subPixelPrecisionBits(MemorySegment segment, long index) { return (int) VH_subPixelPrecisionBits.get(segment, 0L, index); }
    /// {@return `subPixelPrecisionBits`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_subPixelPrecisionBits(MemorySegment segment) { return VkPhysicalDeviceLimits.get_subPixelPrecisionBits(segment, 0L); }
    /// {@return `subPixelPrecisionBits`}
    public @CType("uint32_t") int subPixelPrecisionBits() { return VkPhysicalDeviceLimits.get_subPixelPrecisionBits(this.segment()); }
    /// Sets `subPixelPrecisionBits` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_subPixelPrecisionBits(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_subPixelPrecisionBits.set(segment, 0L, index, value); }
    /// Sets `subPixelPrecisionBits` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_subPixelPrecisionBits(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_subPixelPrecisionBits(segment, 0L, value); }
    /// Sets `subPixelPrecisionBits` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits subPixelPrecisionBits(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_subPixelPrecisionBits(this.segment(), value); return this; }

    /// {@return `subTexelPrecisionBits` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_subTexelPrecisionBits(MemorySegment segment, long index) { return (int) VH_subTexelPrecisionBits.get(segment, 0L, index); }
    /// {@return `subTexelPrecisionBits`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_subTexelPrecisionBits(MemorySegment segment) { return VkPhysicalDeviceLimits.get_subTexelPrecisionBits(segment, 0L); }
    /// {@return `subTexelPrecisionBits`}
    public @CType("uint32_t") int subTexelPrecisionBits() { return VkPhysicalDeviceLimits.get_subTexelPrecisionBits(this.segment()); }
    /// Sets `subTexelPrecisionBits` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_subTexelPrecisionBits(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_subTexelPrecisionBits.set(segment, 0L, index, value); }
    /// Sets `subTexelPrecisionBits` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_subTexelPrecisionBits(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_subTexelPrecisionBits(segment, 0L, value); }
    /// Sets `subTexelPrecisionBits` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits subTexelPrecisionBits(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_subTexelPrecisionBits(this.segment(), value); return this; }

    /// {@return `mipmapPrecisionBits` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_mipmapPrecisionBits(MemorySegment segment, long index) { return (int) VH_mipmapPrecisionBits.get(segment, 0L, index); }
    /// {@return `mipmapPrecisionBits`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_mipmapPrecisionBits(MemorySegment segment) { return VkPhysicalDeviceLimits.get_mipmapPrecisionBits(segment, 0L); }
    /// {@return `mipmapPrecisionBits`}
    public @CType("uint32_t") int mipmapPrecisionBits() { return VkPhysicalDeviceLimits.get_mipmapPrecisionBits(this.segment()); }
    /// Sets `mipmapPrecisionBits` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_mipmapPrecisionBits(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_mipmapPrecisionBits.set(segment, 0L, index, value); }
    /// Sets `mipmapPrecisionBits` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_mipmapPrecisionBits(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_mipmapPrecisionBits(segment, 0L, value); }
    /// Sets `mipmapPrecisionBits` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits mipmapPrecisionBits(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_mipmapPrecisionBits(this.segment(), value); return this; }

    /// {@return `maxDrawIndexedIndexValue` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxDrawIndexedIndexValue(MemorySegment segment, long index) { return (int) VH_maxDrawIndexedIndexValue.get(segment, 0L, index); }
    /// {@return `maxDrawIndexedIndexValue`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxDrawIndexedIndexValue(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxDrawIndexedIndexValue(segment, 0L); }
    /// {@return `maxDrawIndexedIndexValue`}
    public @CType("uint32_t") int maxDrawIndexedIndexValue() { return VkPhysicalDeviceLimits.get_maxDrawIndexedIndexValue(this.segment()); }
    /// Sets `maxDrawIndexedIndexValue` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxDrawIndexedIndexValue(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxDrawIndexedIndexValue.set(segment, 0L, index, value); }
    /// Sets `maxDrawIndexedIndexValue` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxDrawIndexedIndexValue(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxDrawIndexedIndexValue(segment, 0L, value); }
    /// Sets `maxDrawIndexedIndexValue` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxDrawIndexedIndexValue(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxDrawIndexedIndexValue(this.segment(), value); return this; }

    /// {@return `maxDrawIndirectCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxDrawIndirectCount(MemorySegment segment, long index) { return (int) VH_maxDrawIndirectCount.get(segment, 0L, index); }
    /// {@return `maxDrawIndirectCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxDrawIndirectCount(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxDrawIndirectCount(segment, 0L); }
    /// {@return `maxDrawIndirectCount`}
    public @CType("uint32_t") int maxDrawIndirectCount() { return VkPhysicalDeviceLimits.get_maxDrawIndirectCount(this.segment()); }
    /// Sets `maxDrawIndirectCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxDrawIndirectCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxDrawIndirectCount.set(segment, 0L, index, value); }
    /// Sets `maxDrawIndirectCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxDrawIndirectCount(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxDrawIndirectCount(segment, 0L, value); }
    /// Sets `maxDrawIndirectCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxDrawIndirectCount(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxDrawIndirectCount(this.segment(), value); return this; }

    /// {@return `maxSamplerLodBias` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_maxSamplerLodBias(MemorySegment segment, long index) { return (float) VH_maxSamplerLodBias.get(segment, 0L, index); }
    /// {@return `maxSamplerLodBias`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_maxSamplerLodBias(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxSamplerLodBias(segment, 0L); }
    /// {@return `maxSamplerLodBias`}
    public @CType("float") float maxSamplerLodBias() { return VkPhysicalDeviceLimits.get_maxSamplerLodBias(this.segment()); }
    /// Sets `maxSamplerLodBias` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxSamplerLodBias(MemorySegment segment, long index, @CType("float") float value) { VH_maxSamplerLodBias.set(segment, 0L, index, value); }
    /// Sets `maxSamplerLodBias` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxSamplerLodBias(MemorySegment segment, @CType("float") float value) { VkPhysicalDeviceLimits.set_maxSamplerLodBias(segment, 0L, value); }
    /// Sets `maxSamplerLodBias` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxSamplerLodBias(@CType("float") float value) { VkPhysicalDeviceLimits.set_maxSamplerLodBias(this.segment(), value); return this; }

    /// {@return `maxSamplerAnisotropy` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_maxSamplerAnisotropy(MemorySegment segment, long index) { return (float) VH_maxSamplerAnisotropy.get(segment, 0L, index); }
    /// {@return `maxSamplerAnisotropy`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_maxSamplerAnisotropy(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxSamplerAnisotropy(segment, 0L); }
    /// {@return `maxSamplerAnisotropy`}
    public @CType("float") float maxSamplerAnisotropy() { return VkPhysicalDeviceLimits.get_maxSamplerAnisotropy(this.segment()); }
    /// Sets `maxSamplerAnisotropy` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxSamplerAnisotropy(MemorySegment segment, long index, @CType("float") float value) { VH_maxSamplerAnisotropy.set(segment, 0L, index, value); }
    /// Sets `maxSamplerAnisotropy` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxSamplerAnisotropy(MemorySegment segment, @CType("float") float value) { VkPhysicalDeviceLimits.set_maxSamplerAnisotropy(segment, 0L, value); }
    /// Sets `maxSamplerAnisotropy` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxSamplerAnisotropy(@CType("float") float value) { VkPhysicalDeviceLimits.set_maxSamplerAnisotropy(this.segment(), value); return this; }

    /// {@return `maxViewports` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxViewports(MemorySegment segment, long index) { return (int) VH_maxViewports.get(segment, 0L, index); }
    /// {@return `maxViewports`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxViewports(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxViewports(segment, 0L); }
    /// {@return `maxViewports`}
    public @CType("uint32_t") int maxViewports() { return VkPhysicalDeviceLimits.get_maxViewports(this.segment()); }
    /// Sets `maxViewports` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxViewports(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxViewports.set(segment, 0L, index, value); }
    /// Sets `maxViewports` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxViewports(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxViewports(segment, 0L, value); }
    /// Sets `maxViewports` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxViewports(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxViewports(this.segment(), value); return this; }

    /// {@return `maxViewportDimensions` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t[2]") java.lang.foreign.MemorySegment get_maxViewportDimensions(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxViewportDimensions, index), ML_maxViewportDimensions); }
    /// {@return `maxViewportDimensions`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t[2]") java.lang.foreign.MemorySegment get_maxViewportDimensions(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxViewportDimensions(segment, 0L); }
    /// {@return `maxViewportDimensions`}
    public @CType("uint32_t[2]") java.lang.foreign.MemorySegment maxViewportDimensions() { return VkPhysicalDeviceLimits.get_maxViewportDimensions(this.segment()); }
    /// Sets `maxViewportDimensions` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxViewportDimensions(MemorySegment segment, long index, @CType("uint32_t[2]") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxViewportDimensions, index), ML_maxViewportDimensions.byteSize()); }
    /// Sets `maxViewportDimensions` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxViewportDimensions(MemorySegment segment, @CType("uint32_t[2]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceLimits.set_maxViewportDimensions(segment, 0L, value); }
    /// Sets `maxViewportDimensions` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxViewportDimensions(@CType("uint32_t[2]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceLimits.set_maxViewportDimensions(this.segment(), value); return this; }

    /// {@return `viewportBoundsRange` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float[2]") java.lang.foreign.MemorySegment get_viewportBoundsRange(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_viewportBoundsRange, index), ML_viewportBoundsRange); }
    /// {@return `viewportBoundsRange`}
    /// @param segment the segment of the struct
    public static @CType("float[2]") java.lang.foreign.MemorySegment get_viewportBoundsRange(MemorySegment segment) { return VkPhysicalDeviceLimits.get_viewportBoundsRange(segment, 0L); }
    /// {@return `viewportBoundsRange`}
    public @CType("float[2]") java.lang.foreign.MemorySegment viewportBoundsRange() { return VkPhysicalDeviceLimits.get_viewportBoundsRange(this.segment()); }
    /// Sets `viewportBoundsRange` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_viewportBoundsRange(MemorySegment segment, long index, @CType("float[2]") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_viewportBoundsRange, index), ML_viewportBoundsRange.byteSize()); }
    /// Sets `viewportBoundsRange` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_viewportBoundsRange(MemorySegment segment, @CType("float[2]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceLimits.set_viewportBoundsRange(segment, 0L, value); }
    /// Sets `viewportBoundsRange` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits viewportBoundsRange(@CType("float[2]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceLimits.set_viewportBoundsRange(this.segment(), value); return this; }

    /// {@return `viewportSubPixelBits` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_viewportSubPixelBits(MemorySegment segment, long index) { return (int) VH_viewportSubPixelBits.get(segment, 0L, index); }
    /// {@return `viewportSubPixelBits`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_viewportSubPixelBits(MemorySegment segment) { return VkPhysicalDeviceLimits.get_viewportSubPixelBits(segment, 0L); }
    /// {@return `viewportSubPixelBits`}
    public @CType("uint32_t") int viewportSubPixelBits() { return VkPhysicalDeviceLimits.get_viewportSubPixelBits(this.segment()); }
    /// Sets `viewportSubPixelBits` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_viewportSubPixelBits(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_viewportSubPixelBits.set(segment, 0L, index, value); }
    /// Sets `viewportSubPixelBits` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_viewportSubPixelBits(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_viewportSubPixelBits(segment, 0L, value); }
    /// Sets `viewportSubPixelBits` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits viewportSubPixelBits(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_viewportSubPixelBits(this.segment(), value); return this; }

    /// {@return `minMemoryMapAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("size_t") long get_minMemoryMapAlignment(MemorySegment segment, long index) { return (long) VH_minMemoryMapAlignment.get(segment, 0L, index); }
    /// {@return `minMemoryMapAlignment`}
    /// @param segment the segment of the struct
    public static @CType("size_t") long get_minMemoryMapAlignment(MemorySegment segment) { return VkPhysicalDeviceLimits.get_minMemoryMapAlignment(segment, 0L); }
    /// {@return `minMemoryMapAlignment`}
    public @CType("size_t") long minMemoryMapAlignment() { return VkPhysicalDeviceLimits.get_minMemoryMapAlignment(this.segment()); }
    /// Sets `minMemoryMapAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_minMemoryMapAlignment(MemorySegment segment, long index, @CType("size_t") long value) { VH_minMemoryMapAlignment.set(segment, 0L, index, value); }
    /// Sets `minMemoryMapAlignment` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_minMemoryMapAlignment(MemorySegment segment, @CType("size_t") long value) { VkPhysicalDeviceLimits.set_minMemoryMapAlignment(segment, 0L, value); }
    /// Sets `minMemoryMapAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits minMemoryMapAlignment(@CType("size_t") long value) { VkPhysicalDeviceLimits.set_minMemoryMapAlignment(this.segment(), value); return this; }

    /// {@return `minTexelBufferOffsetAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_minTexelBufferOffsetAlignment(MemorySegment segment, long index) { return (long) VH_minTexelBufferOffsetAlignment.get(segment, 0L, index); }
    /// {@return `minTexelBufferOffsetAlignment`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_minTexelBufferOffsetAlignment(MemorySegment segment) { return VkPhysicalDeviceLimits.get_minTexelBufferOffsetAlignment(segment, 0L); }
    /// {@return `minTexelBufferOffsetAlignment`}
    public @CType("VkDeviceSize") long minTexelBufferOffsetAlignment() { return VkPhysicalDeviceLimits.get_minTexelBufferOffsetAlignment(this.segment()); }
    /// Sets `minTexelBufferOffsetAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_minTexelBufferOffsetAlignment(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_minTexelBufferOffsetAlignment.set(segment, 0L, index, value); }
    /// Sets `minTexelBufferOffsetAlignment` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_minTexelBufferOffsetAlignment(MemorySegment segment, @CType("VkDeviceSize") long value) { VkPhysicalDeviceLimits.set_minTexelBufferOffsetAlignment(segment, 0L, value); }
    /// Sets `minTexelBufferOffsetAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits minTexelBufferOffsetAlignment(@CType("VkDeviceSize") long value) { VkPhysicalDeviceLimits.set_minTexelBufferOffsetAlignment(this.segment(), value); return this; }

    /// {@return `minUniformBufferOffsetAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_minUniformBufferOffsetAlignment(MemorySegment segment, long index) { return (long) VH_minUniformBufferOffsetAlignment.get(segment, 0L, index); }
    /// {@return `minUniformBufferOffsetAlignment`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_minUniformBufferOffsetAlignment(MemorySegment segment) { return VkPhysicalDeviceLimits.get_minUniformBufferOffsetAlignment(segment, 0L); }
    /// {@return `minUniformBufferOffsetAlignment`}
    public @CType("VkDeviceSize") long minUniformBufferOffsetAlignment() { return VkPhysicalDeviceLimits.get_minUniformBufferOffsetAlignment(this.segment()); }
    /// Sets `minUniformBufferOffsetAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_minUniformBufferOffsetAlignment(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_minUniformBufferOffsetAlignment.set(segment, 0L, index, value); }
    /// Sets `minUniformBufferOffsetAlignment` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_minUniformBufferOffsetAlignment(MemorySegment segment, @CType("VkDeviceSize") long value) { VkPhysicalDeviceLimits.set_minUniformBufferOffsetAlignment(segment, 0L, value); }
    /// Sets `minUniformBufferOffsetAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits minUniformBufferOffsetAlignment(@CType("VkDeviceSize") long value) { VkPhysicalDeviceLimits.set_minUniformBufferOffsetAlignment(this.segment(), value); return this; }

    /// {@return `minStorageBufferOffsetAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_minStorageBufferOffsetAlignment(MemorySegment segment, long index) { return (long) VH_minStorageBufferOffsetAlignment.get(segment, 0L, index); }
    /// {@return `minStorageBufferOffsetAlignment`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_minStorageBufferOffsetAlignment(MemorySegment segment) { return VkPhysicalDeviceLimits.get_minStorageBufferOffsetAlignment(segment, 0L); }
    /// {@return `minStorageBufferOffsetAlignment`}
    public @CType("VkDeviceSize") long minStorageBufferOffsetAlignment() { return VkPhysicalDeviceLimits.get_minStorageBufferOffsetAlignment(this.segment()); }
    /// Sets `minStorageBufferOffsetAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_minStorageBufferOffsetAlignment(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_minStorageBufferOffsetAlignment.set(segment, 0L, index, value); }
    /// Sets `minStorageBufferOffsetAlignment` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_minStorageBufferOffsetAlignment(MemorySegment segment, @CType("VkDeviceSize") long value) { VkPhysicalDeviceLimits.set_minStorageBufferOffsetAlignment(segment, 0L, value); }
    /// Sets `minStorageBufferOffsetAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits minStorageBufferOffsetAlignment(@CType("VkDeviceSize") long value) { VkPhysicalDeviceLimits.set_minStorageBufferOffsetAlignment(this.segment(), value); return this; }

    /// {@return `minTexelOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int32_t") int get_minTexelOffset(MemorySegment segment, long index) { return (int) VH_minTexelOffset.get(segment, 0L, index); }
    /// {@return `minTexelOffset`}
    /// @param segment the segment of the struct
    public static @CType("int32_t") int get_minTexelOffset(MemorySegment segment) { return VkPhysicalDeviceLimits.get_minTexelOffset(segment, 0L); }
    /// {@return `minTexelOffset`}
    public @CType("int32_t") int minTexelOffset() { return VkPhysicalDeviceLimits.get_minTexelOffset(this.segment()); }
    /// Sets `minTexelOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_minTexelOffset(MemorySegment segment, long index, @CType("int32_t") int value) { VH_minTexelOffset.set(segment, 0L, index, value); }
    /// Sets `minTexelOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_minTexelOffset(MemorySegment segment, @CType("int32_t") int value) { VkPhysicalDeviceLimits.set_minTexelOffset(segment, 0L, value); }
    /// Sets `minTexelOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits minTexelOffset(@CType("int32_t") int value) { VkPhysicalDeviceLimits.set_minTexelOffset(this.segment(), value); return this; }

    /// {@return `maxTexelOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxTexelOffset(MemorySegment segment, long index) { return (int) VH_maxTexelOffset.get(segment, 0L, index); }
    /// {@return `maxTexelOffset`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxTexelOffset(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxTexelOffset(segment, 0L); }
    /// {@return `maxTexelOffset`}
    public @CType("uint32_t") int maxTexelOffset() { return VkPhysicalDeviceLimits.get_maxTexelOffset(this.segment()); }
    /// Sets `maxTexelOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxTexelOffset(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxTexelOffset.set(segment, 0L, index, value); }
    /// Sets `maxTexelOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxTexelOffset(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxTexelOffset(segment, 0L, value); }
    /// Sets `maxTexelOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxTexelOffset(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxTexelOffset(this.segment(), value); return this; }

    /// {@return `minTexelGatherOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int32_t") int get_minTexelGatherOffset(MemorySegment segment, long index) { return (int) VH_minTexelGatherOffset.get(segment, 0L, index); }
    /// {@return `minTexelGatherOffset`}
    /// @param segment the segment of the struct
    public static @CType("int32_t") int get_minTexelGatherOffset(MemorySegment segment) { return VkPhysicalDeviceLimits.get_minTexelGatherOffset(segment, 0L); }
    /// {@return `minTexelGatherOffset`}
    public @CType("int32_t") int minTexelGatherOffset() { return VkPhysicalDeviceLimits.get_minTexelGatherOffset(this.segment()); }
    /// Sets `minTexelGatherOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_minTexelGatherOffset(MemorySegment segment, long index, @CType("int32_t") int value) { VH_minTexelGatherOffset.set(segment, 0L, index, value); }
    /// Sets `minTexelGatherOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_minTexelGatherOffset(MemorySegment segment, @CType("int32_t") int value) { VkPhysicalDeviceLimits.set_minTexelGatherOffset(segment, 0L, value); }
    /// Sets `minTexelGatherOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits minTexelGatherOffset(@CType("int32_t") int value) { VkPhysicalDeviceLimits.set_minTexelGatherOffset(this.segment(), value); return this; }

    /// {@return `maxTexelGatherOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxTexelGatherOffset(MemorySegment segment, long index) { return (int) VH_maxTexelGatherOffset.get(segment, 0L, index); }
    /// {@return `maxTexelGatherOffset`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxTexelGatherOffset(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxTexelGatherOffset(segment, 0L); }
    /// {@return `maxTexelGatherOffset`}
    public @CType("uint32_t") int maxTexelGatherOffset() { return VkPhysicalDeviceLimits.get_maxTexelGatherOffset(this.segment()); }
    /// Sets `maxTexelGatherOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxTexelGatherOffset(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxTexelGatherOffset.set(segment, 0L, index, value); }
    /// Sets `maxTexelGatherOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxTexelGatherOffset(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxTexelGatherOffset(segment, 0L, value); }
    /// Sets `maxTexelGatherOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxTexelGatherOffset(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxTexelGatherOffset(this.segment(), value); return this; }

    /// {@return `minInterpolationOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_minInterpolationOffset(MemorySegment segment, long index) { return (float) VH_minInterpolationOffset.get(segment, 0L, index); }
    /// {@return `minInterpolationOffset`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_minInterpolationOffset(MemorySegment segment) { return VkPhysicalDeviceLimits.get_minInterpolationOffset(segment, 0L); }
    /// {@return `minInterpolationOffset`}
    public @CType("float") float minInterpolationOffset() { return VkPhysicalDeviceLimits.get_minInterpolationOffset(this.segment()); }
    /// Sets `minInterpolationOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_minInterpolationOffset(MemorySegment segment, long index, @CType("float") float value) { VH_minInterpolationOffset.set(segment, 0L, index, value); }
    /// Sets `minInterpolationOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_minInterpolationOffset(MemorySegment segment, @CType("float") float value) { VkPhysicalDeviceLimits.set_minInterpolationOffset(segment, 0L, value); }
    /// Sets `minInterpolationOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits minInterpolationOffset(@CType("float") float value) { VkPhysicalDeviceLimits.set_minInterpolationOffset(this.segment(), value); return this; }

    /// {@return `maxInterpolationOffset` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_maxInterpolationOffset(MemorySegment segment, long index) { return (float) VH_maxInterpolationOffset.get(segment, 0L, index); }
    /// {@return `maxInterpolationOffset`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_maxInterpolationOffset(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxInterpolationOffset(segment, 0L); }
    /// {@return `maxInterpolationOffset`}
    public @CType("float") float maxInterpolationOffset() { return VkPhysicalDeviceLimits.get_maxInterpolationOffset(this.segment()); }
    /// Sets `maxInterpolationOffset` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxInterpolationOffset(MemorySegment segment, long index, @CType("float") float value) { VH_maxInterpolationOffset.set(segment, 0L, index, value); }
    /// Sets `maxInterpolationOffset` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxInterpolationOffset(MemorySegment segment, @CType("float") float value) { VkPhysicalDeviceLimits.set_maxInterpolationOffset(segment, 0L, value); }
    /// Sets `maxInterpolationOffset` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxInterpolationOffset(@CType("float") float value) { VkPhysicalDeviceLimits.set_maxInterpolationOffset(this.segment(), value); return this; }

    /// {@return `subPixelInterpolationOffsetBits` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_subPixelInterpolationOffsetBits(MemorySegment segment, long index) { return (int) VH_subPixelInterpolationOffsetBits.get(segment, 0L, index); }
    /// {@return `subPixelInterpolationOffsetBits`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_subPixelInterpolationOffsetBits(MemorySegment segment) { return VkPhysicalDeviceLimits.get_subPixelInterpolationOffsetBits(segment, 0L); }
    /// {@return `subPixelInterpolationOffsetBits`}
    public @CType("uint32_t") int subPixelInterpolationOffsetBits() { return VkPhysicalDeviceLimits.get_subPixelInterpolationOffsetBits(this.segment()); }
    /// Sets `subPixelInterpolationOffsetBits` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_subPixelInterpolationOffsetBits(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_subPixelInterpolationOffsetBits.set(segment, 0L, index, value); }
    /// Sets `subPixelInterpolationOffsetBits` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_subPixelInterpolationOffsetBits(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_subPixelInterpolationOffsetBits(segment, 0L, value); }
    /// Sets `subPixelInterpolationOffsetBits` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits subPixelInterpolationOffsetBits(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_subPixelInterpolationOffsetBits(this.segment(), value); return this; }

    /// {@return `maxFramebufferWidth` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxFramebufferWidth(MemorySegment segment, long index) { return (int) VH_maxFramebufferWidth.get(segment, 0L, index); }
    /// {@return `maxFramebufferWidth`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxFramebufferWidth(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxFramebufferWidth(segment, 0L); }
    /// {@return `maxFramebufferWidth`}
    public @CType("uint32_t") int maxFramebufferWidth() { return VkPhysicalDeviceLimits.get_maxFramebufferWidth(this.segment()); }
    /// Sets `maxFramebufferWidth` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxFramebufferWidth(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxFramebufferWidth.set(segment, 0L, index, value); }
    /// Sets `maxFramebufferWidth` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxFramebufferWidth(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxFramebufferWidth(segment, 0L, value); }
    /// Sets `maxFramebufferWidth` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxFramebufferWidth(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxFramebufferWidth(this.segment(), value); return this; }

    /// {@return `maxFramebufferHeight` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxFramebufferHeight(MemorySegment segment, long index) { return (int) VH_maxFramebufferHeight.get(segment, 0L, index); }
    /// {@return `maxFramebufferHeight`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxFramebufferHeight(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxFramebufferHeight(segment, 0L); }
    /// {@return `maxFramebufferHeight`}
    public @CType("uint32_t") int maxFramebufferHeight() { return VkPhysicalDeviceLimits.get_maxFramebufferHeight(this.segment()); }
    /// Sets `maxFramebufferHeight` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxFramebufferHeight(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxFramebufferHeight.set(segment, 0L, index, value); }
    /// Sets `maxFramebufferHeight` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxFramebufferHeight(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxFramebufferHeight(segment, 0L, value); }
    /// Sets `maxFramebufferHeight` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxFramebufferHeight(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxFramebufferHeight(this.segment(), value); return this; }

    /// {@return `maxFramebufferLayers` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxFramebufferLayers(MemorySegment segment, long index) { return (int) VH_maxFramebufferLayers.get(segment, 0L, index); }
    /// {@return `maxFramebufferLayers`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxFramebufferLayers(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxFramebufferLayers(segment, 0L); }
    /// {@return `maxFramebufferLayers`}
    public @CType("uint32_t") int maxFramebufferLayers() { return VkPhysicalDeviceLimits.get_maxFramebufferLayers(this.segment()); }
    /// Sets `maxFramebufferLayers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxFramebufferLayers(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxFramebufferLayers.set(segment, 0L, index, value); }
    /// Sets `maxFramebufferLayers` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxFramebufferLayers(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxFramebufferLayers(segment, 0L, value); }
    /// Sets `maxFramebufferLayers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxFramebufferLayers(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxFramebufferLayers(this.segment(), value); return this; }

    /// {@return `framebufferColorSampleCounts` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSampleCountFlags") int get_framebufferColorSampleCounts(MemorySegment segment, long index) { return (int) VH_framebufferColorSampleCounts.get(segment, 0L, index); }
    /// {@return `framebufferColorSampleCounts`}
    /// @param segment the segment of the struct
    public static @CType("VkSampleCountFlags") int get_framebufferColorSampleCounts(MemorySegment segment) { return VkPhysicalDeviceLimits.get_framebufferColorSampleCounts(segment, 0L); }
    /// {@return `framebufferColorSampleCounts`}
    public @CType("VkSampleCountFlags") int framebufferColorSampleCounts() { return VkPhysicalDeviceLimits.get_framebufferColorSampleCounts(this.segment()); }
    /// Sets `framebufferColorSampleCounts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_framebufferColorSampleCounts(MemorySegment segment, long index, @CType("VkSampleCountFlags") int value) { VH_framebufferColorSampleCounts.set(segment, 0L, index, value); }
    /// Sets `framebufferColorSampleCounts` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_framebufferColorSampleCounts(MemorySegment segment, @CType("VkSampleCountFlags") int value) { VkPhysicalDeviceLimits.set_framebufferColorSampleCounts(segment, 0L, value); }
    /// Sets `framebufferColorSampleCounts` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits framebufferColorSampleCounts(@CType("VkSampleCountFlags") int value) { VkPhysicalDeviceLimits.set_framebufferColorSampleCounts(this.segment(), value); return this; }

    /// {@return `framebufferDepthSampleCounts` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSampleCountFlags") int get_framebufferDepthSampleCounts(MemorySegment segment, long index) { return (int) VH_framebufferDepthSampleCounts.get(segment, 0L, index); }
    /// {@return `framebufferDepthSampleCounts`}
    /// @param segment the segment of the struct
    public static @CType("VkSampleCountFlags") int get_framebufferDepthSampleCounts(MemorySegment segment) { return VkPhysicalDeviceLimits.get_framebufferDepthSampleCounts(segment, 0L); }
    /// {@return `framebufferDepthSampleCounts`}
    public @CType("VkSampleCountFlags") int framebufferDepthSampleCounts() { return VkPhysicalDeviceLimits.get_framebufferDepthSampleCounts(this.segment()); }
    /// Sets `framebufferDepthSampleCounts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_framebufferDepthSampleCounts(MemorySegment segment, long index, @CType("VkSampleCountFlags") int value) { VH_framebufferDepthSampleCounts.set(segment, 0L, index, value); }
    /// Sets `framebufferDepthSampleCounts` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_framebufferDepthSampleCounts(MemorySegment segment, @CType("VkSampleCountFlags") int value) { VkPhysicalDeviceLimits.set_framebufferDepthSampleCounts(segment, 0L, value); }
    /// Sets `framebufferDepthSampleCounts` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits framebufferDepthSampleCounts(@CType("VkSampleCountFlags") int value) { VkPhysicalDeviceLimits.set_framebufferDepthSampleCounts(this.segment(), value); return this; }

    /// {@return `framebufferStencilSampleCounts` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSampleCountFlags") int get_framebufferStencilSampleCounts(MemorySegment segment, long index) { return (int) VH_framebufferStencilSampleCounts.get(segment, 0L, index); }
    /// {@return `framebufferStencilSampleCounts`}
    /// @param segment the segment of the struct
    public static @CType("VkSampleCountFlags") int get_framebufferStencilSampleCounts(MemorySegment segment) { return VkPhysicalDeviceLimits.get_framebufferStencilSampleCounts(segment, 0L); }
    /// {@return `framebufferStencilSampleCounts`}
    public @CType("VkSampleCountFlags") int framebufferStencilSampleCounts() { return VkPhysicalDeviceLimits.get_framebufferStencilSampleCounts(this.segment()); }
    /// Sets `framebufferStencilSampleCounts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_framebufferStencilSampleCounts(MemorySegment segment, long index, @CType("VkSampleCountFlags") int value) { VH_framebufferStencilSampleCounts.set(segment, 0L, index, value); }
    /// Sets `framebufferStencilSampleCounts` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_framebufferStencilSampleCounts(MemorySegment segment, @CType("VkSampleCountFlags") int value) { VkPhysicalDeviceLimits.set_framebufferStencilSampleCounts(segment, 0L, value); }
    /// Sets `framebufferStencilSampleCounts` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits framebufferStencilSampleCounts(@CType("VkSampleCountFlags") int value) { VkPhysicalDeviceLimits.set_framebufferStencilSampleCounts(this.segment(), value); return this; }

    /// {@return `framebufferNoAttachmentsSampleCounts` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSampleCountFlags") int get_framebufferNoAttachmentsSampleCounts(MemorySegment segment, long index) { return (int) VH_framebufferNoAttachmentsSampleCounts.get(segment, 0L, index); }
    /// {@return `framebufferNoAttachmentsSampleCounts`}
    /// @param segment the segment of the struct
    public static @CType("VkSampleCountFlags") int get_framebufferNoAttachmentsSampleCounts(MemorySegment segment) { return VkPhysicalDeviceLimits.get_framebufferNoAttachmentsSampleCounts(segment, 0L); }
    /// {@return `framebufferNoAttachmentsSampleCounts`}
    public @CType("VkSampleCountFlags") int framebufferNoAttachmentsSampleCounts() { return VkPhysicalDeviceLimits.get_framebufferNoAttachmentsSampleCounts(this.segment()); }
    /// Sets `framebufferNoAttachmentsSampleCounts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_framebufferNoAttachmentsSampleCounts(MemorySegment segment, long index, @CType("VkSampleCountFlags") int value) { VH_framebufferNoAttachmentsSampleCounts.set(segment, 0L, index, value); }
    /// Sets `framebufferNoAttachmentsSampleCounts` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_framebufferNoAttachmentsSampleCounts(MemorySegment segment, @CType("VkSampleCountFlags") int value) { VkPhysicalDeviceLimits.set_framebufferNoAttachmentsSampleCounts(segment, 0L, value); }
    /// Sets `framebufferNoAttachmentsSampleCounts` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits framebufferNoAttachmentsSampleCounts(@CType("VkSampleCountFlags") int value) { VkPhysicalDeviceLimits.set_framebufferNoAttachmentsSampleCounts(this.segment(), value); return this; }

    /// {@return `maxColorAttachments` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxColorAttachments(MemorySegment segment, long index) { return (int) VH_maxColorAttachments.get(segment, 0L, index); }
    /// {@return `maxColorAttachments`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxColorAttachments(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxColorAttachments(segment, 0L); }
    /// {@return `maxColorAttachments`}
    public @CType("uint32_t") int maxColorAttachments() { return VkPhysicalDeviceLimits.get_maxColorAttachments(this.segment()); }
    /// Sets `maxColorAttachments` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxColorAttachments(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxColorAttachments.set(segment, 0L, index, value); }
    /// Sets `maxColorAttachments` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxColorAttachments(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxColorAttachments(segment, 0L, value); }
    /// Sets `maxColorAttachments` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxColorAttachments(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxColorAttachments(this.segment(), value); return this; }

    /// {@return `sampledImageColorSampleCounts` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSampleCountFlags") int get_sampledImageColorSampleCounts(MemorySegment segment, long index) { return (int) VH_sampledImageColorSampleCounts.get(segment, 0L, index); }
    /// {@return `sampledImageColorSampleCounts`}
    /// @param segment the segment of the struct
    public static @CType("VkSampleCountFlags") int get_sampledImageColorSampleCounts(MemorySegment segment) { return VkPhysicalDeviceLimits.get_sampledImageColorSampleCounts(segment, 0L); }
    /// {@return `sampledImageColorSampleCounts`}
    public @CType("VkSampleCountFlags") int sampledImageColorSampleCounts() { return VkPhysicalDeviceLimits.get_sampledImageColorSampleCounts(this.segment()); }
    /// Sets `sampledImageColorSampleCounts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sampledImageColorSampleCounts(MemorySegment segment, long index, @CType("VkSampleCountFlags") int value) { VH_sampledImageColorSampleCounts.set(segment, 0L, index, value); }
    /// Sets `sampledImageColorSampleCounts` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sampledImageColorSampleCounts(MemorySegment segment, @CType("VkSampleCountFlags") int value) { VkPhysicalDeviceLimits.set_sampledImageColorSampleCounts(segment, 0L, value); }
    /// Sets `sampledImageColorSampleCounts` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits sampledImageColorSampleCounts(@CType("VkSampleCountFlags") int value) { VkPhysicalDeviceLimits.set_sampledImageColorSampleCounts(this.segment(), value); return this; }

    /// {@return `sampledImageIntegerSampleCounts` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSampleCountFlags") int get_sampledImageIntegerSampleCounts(MemorySegment segment, long index) { return (int) VH_sampledImageIntegerSampleCounts.get(segment, 0L, index); }
    /// {@return `sampledImageIntegerSampleCounts`}
    /// @param segment the segment of the struct
    public static @CType("VkSampleCountFlags") int get_sampledImageIntegerSampleCounts(MemorySegment segment) { return VkPhysicalDeviceLimits.get_sampledImageIntegerSampleCounts(segment, 0L); }
    /// {@return `sampledImageIntegerSampleCounts`}
    public @CType("VkSampleCountFlags") int sampledImageIntegerSampleCounts() { return VkPhysicalDeviceLimits.get_sampledImageIntegerSampleCounts(this.segment()); }
    /// Sets `sampledImageIntegerSampleCounts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sampledImageIntegerSampleCounts(MemorySegment segment, long index, @CType("VkSampleCountFlags") int value) { VH_sampledImageIntegerSampleCounts.set(segment, 0L, index, value); }
    /// Sets `sampledImageIntegerSampleCounts` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sampledImageIntegerSampleCounts(MemorySegment segment, @CType("VkSampleCountFlags") int value) { VkPhysicalDeviceLimits.set_sampledImageIntegerSampleCounts(segment, 0L, value); }
    /// Sets `sampledImageIntegerSampleCounts` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits sampledImageIntegerSampleCounts(@CType("VkSampleCountFlags") int value) { VkPhysicalDeviceLimits.set_sampledImageIntegerSampleCounts(this.segment(), value); return this; }

    /// {@return `sampledImageDepthSampleCounts` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSampleCountFlags") int get_sampledImageDepthSampleCounts(MemorySegment segment, long index) { return (int) VH_sampledImageDepthSampleCounts.get(segment, 0L, index); }
    /// {@return `sampledImageDepthSampleCounts`}
    /// @param segment the segment of the struct
    public static @CType("VkSampleCountFlags") int get_sampledImageDepthSampleCounts(MemorySegment segment) { return VkPhysicalDeviceLimits.get_sampledImageDepthSampleCounts(segment, 0L); }
    /// {@return `sampledImageDepthSampleCounts`}
    public @CType("VkSampleCountFlags") int sampledImageDepthSampleCounts() { return VkPhysicalDeviceLimits.get_sampledImageDepthSampleCounts(this.segment()); }
    /// Sets `sampledImageDepthSampleCounts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sampledImageDepthSampleCounts(MemorySegment segment, long index, @CType("VkSampleCountFlags") int value) { VH_sampledImageDepthSampleCounts.set(segment, 0L, index, value); }
    /// Sets `sampledImageDepthSampleCounts` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sampledImageDepthSampleCounts(MemorySegment segment, @CType("VkSampleCountFlags") int value) { VkPhysicalDeviceLimits.set_sampledImageDepthSampleCounts(segment, 0L, value); }
    /// Sets `sampledImageDepthSampleCounts` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits sampledImageDepthSampleCounts(@CType("VkSampleCountFlags") int value) { VkPhysicalDeviceLimits.set_sampledImageDepthSampleCounts(this.segment(), value); return this; }

    /// {@return `sampledImageStencilSampleCounts` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSampleCountFlags") int get_sampledImageStencilSampleCounts(MemorySegment segment, long index) { return (int) VH_sampledImageStencilSampleCounts.get(segment, 0L, index); }
    /// {@return `sampledImageStencilSampleCounts`}
    /// @param segment the segment of the struct
    public static @CType("VkSampleCountFlags") int get_sampledImageStencilSampleCounts(MemorySegment segment) { return VkPhysicalDeviceLimits.get_sampledImageStencilSampleCounts(segment, 0L); }
    /// {@return `sampledImageStencilSampleCounts`}
    public @CType("VkSampleCountFlags") int sampledImageStencilSampleCounts() { return VkPhysicalDeviceLimits.get_sampledImageStencilSampleCounts(this.segment()); }
    /// Sets `sampledImageStencilSampleCounts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sampledImageStencilSampleCounts(MemorySegment segment, long index, @CType("VkSampleCountFlags") int value) { VH_sampledImageStencilSampleCounts.set(segment, 0L, index, value); }
    /// Sets `sampledImageStencilSampleCounts` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sampledImageStencilSampleCounts(MemorySegment segment, @CType("VkSampleCountFlags") int value) { VkPhysicalDeviceLimits.set_sampledImageStencilSampleCounts(segment, 0L, value); }
    /// Sets `sampledImageStencilSampleCounts` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits sampledImageStencilSampleCounts(@CType("VkSampleCountFlags") int value) { VkPhysicalDeviceLimits.set_sampledImageStencilSampleCounts(this.segment(), value); return this; }

    /// {@return `storageImageSampleCounts` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkSampleCountFlags") int get_storageImageSampleCounts(MemorySegment segment, long index) { return (int) VH_storageImageSampleCounts.get(segment, 0L, index); }
    /// {@return `storageImageSampleCounts`}
    /// @param segment the segment of the struct
    public static @CType("VkSampleCountFlags") int get_storageImageSampleCounts(MemorySegment segment) { return VkPhysicalDeviceLimits.get_storageImageSampleCounts(segment, 0L); }
    /// {@return `storageImageSampleCounts`}
    public @CType("VkSampleCountFlags") int storageImageSampleCounts() { return VkPhysicalDeviceLimits.get_storageImageSampleCounts(this.segment()); }
    /// Sets `storageImageSampleCounts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_storageImageSampleCounts(MemorySegment segment, long index, @CType("VkSampleCountFlags") int value) { VH_storageImageSampleCounts.set(segment, 0L, index, value); }
    /// Sets `storageImageSampleCounts` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_storageImageSampleCounts(MemorySegment segment, @CType("VkSampleCountFlags") int value) { VkPhysicalDeviceLimits.set_storageImageSampleCounts(segment, 0L, value); }
    /// Sets `storageImageSampleCounts` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits storageImageSampleCounts(@CType("VkSampleCountFlags") int value) { VkPhysicalDeviceLimits.set_storageImageSampleCounts(this.segment(), value); return this; }

    /// {@return `maxSampleMaskWords` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxSampleMaskWords(MemorySegment segment, long index) { return (int) VH_maxSampleMaskWords.get(segment, 0L, index); }
    /// {@return `maxSampleMaskWords`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxSampleMaskWords(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxSampleMaskWords(segment, 0L); }
    /// {@return `maxSampleMaskWords`}
    public @CType("uint32_t") int maxSampleMaskWords() { return VkPhysicalDeviceLimits.get_maxSampleMaskWords(this.segment()); }
    /// Sets `maxSampleMaskWords` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxSampleMaskWords(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxSampleMaskWords.set(segment, 0L, index, value); }
    /// Sets `maxSampleMaskWords` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxSampleMaskWords(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxSampleMaskWords(segment, 0L, value); }
    /// Sets `maxSampleMaskWords` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxSampleMaskWords(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxSampleMaskWords(this.segment(), value); return this; }

    /// {@return `timestampComputeAndGraphics` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_timestampComputeAndGraphics(MemorySegment segment, long index) { return (int) VH_timestampComputeAndGraphics.get(segment, 0L, index); }
    /// {@return `timestampComputeAndGraphics`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_timestampComputeAndGraphics(MemorySegment segment) { return VkPhysicalDeviceLimits.get_timestampComputeAndGraphics(segment, 0L); }
    /// {@return `timestampComputeAndGraphics`}
    public @CType("VkBool32") int timestampComputeAndGraphics() { return VkPhysicalDeviceLimits.get_timestampComputeAndGraphics(this.segment()); }
    /// Sets `timestampComputeAndGraphics` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_timestampComputeAndGraphics(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_timestampComputeAndGraphics.set(segment, 0L, index, value); }
    /// Sets `timestampComputeAndGraphics` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_timestampComputeAndGraphics(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceLimits.set_timestampComputeAndGraphics(segment, 0L, value); }
    /// Sets `timestampComputeAndGraphics` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits timestampComputeAndGraphics(@CType("VkBool32") int value) { VkPhysicalDeviceLimits.set_timestampComputeAndGraphics(this.segment(), value); return this; }

    /// {@return `timestampPeriod` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_timestampPeriod(MemorySegment segment, long index) { return (float) VH_timestampPeriod.get(segment, 0L, index); }
    /// {@return `timestampPeriod`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_timestampPeriod(MemorySegment segment) { return VkPhysicalDeviceLimits.get_timestampPeriod(segment, 0L); }
    /// {@return `timestampPeriod`}
    public @CType("float") float timestampPeriod() { return VkPhysicalDeviceLimits.get_timestampPeriod(this.segment()); }
    /// Sets `timestampPeriod` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_timestampPeriod(MemorySegment segment, long index, @CType("float") float value) { VH_timestampPeriod.set(segment, 0L, index, value); }
    /// Sets `timestampPeriod` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_timestampPeriod(MemorySegment segment, @CType("float") float value) { VkPhysicalDeviceLimits.set_timestampPeriod(segment, 0L, value); }
    /// Sets `timestampPeriod` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits timestampPeriod(@CType("float") float value) { VkPhysicalDeviceLimits.set_timestampPeriod(this.segment(), value); return this; }

    /// {@return `maxClipDistances` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxClipDistances(MemorySegment segment, long index) { return (int) VH_maxClipDistances.get(segment, 0L, index); }
    /// {@return `maxClipDistances`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxClipDistances(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxClipDistances(segment, 0L); }
    /// {@return `maxClipDistances`}
    public @CType("uint32_t") int maxClipDistances() { return VkPhysicalDeviceLimits.get_maxClipDistances(this.segment()); }
    /// Sets `maxClipDistances` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxClipDistances(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxClipDistances.set(segment, 0L, index, value); }
    /// Sets `maxClipDistances` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxClipDistances(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxClipDistances(segment, 0L, value); }
    /// Sets `maxClipDistances` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxClipDistances(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxClipDistances(this.segment(), value); return this; }

    /// {@return `maxCullDistances` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxCullDistances(MemorySegment segment, long index) { return (int) VH_maxCullDistances.get(segment, 0L, index); }
    /// {@return `maxCullDistances`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxCullDistances(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxCullDistances(segment, 0L); }
    /// {@return `maxCullDistances`}
    public @CType("uint32_t") int maxCullDistances() { return VkPhysicalDeviceLimits.get_maxCullDistances(this.segment()); }
    /// Sets `maxCullDistances` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxCullDistances(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxCullDistances.set(segment, 0L, index, value); }
    /// Sets `maxCullDistances` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxCullDistances(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxCullDistances(segment, 0L, value); }
    /// Sets `maxCullDistances` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxCullDistances(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxCullDistances(this.segment(), value); return this; }

    /// {@return `maxCombinedClipAndCullDistances` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxCombinedClipAndCullDistances(MemorySegment segment, long index) { return (int) VH_maxCombinedClipAndCullDistances.get(segment, 0L, index); }
    /// {@return `maxCombinedClipAndCullDistances`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxCombinedClipAndCullDistances(MemorySegment segment) { return VkPhysicalDeviceLimits.get_maxCombinedClipAndCullDistances(segment, 0L); }
    /// {@return `maxCombinedClipAndCullDistances`}
    public @CType("uint32_t") int maxCombinedClipAndCullDistances() { return VkPhysicalDeviceLimits.get_maxCombinedClipAndCullDistances(this.segment()); }
    /// Sets `maxCombinedClipAndCullDistances` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxCombinedClipAndCullDistances(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxCombinedClipAndCullDistances.set(segment, 0L, index, value); }
    /// Sets `maxCombinedClipAndCullDistances` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxCombinedClipAndCullDistances(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxCombinedClipAndCullDistances(segment, 0L, value); }
    /// Sets `maxCombinedClipAndCullDistances` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits maxCombinedClipAndCullDistances(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxCombinedClipAndCullDistances(this.segment(), value); return this; }

    /// {@return `discreteQueuePriorities` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_discreteQueuePriorities(MemorySegment segment, long index) { return (int) VH_discreteQueuePriorities.get(segment, 0L, index); }
    /// {@return `discreteQueuePriorities`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_discreteQueuePriorities(MemorySegment segment) { return VkPhysicalDeviceLimits.get_discreteQueuePriorities(segment, 0L); }
    /// {@return `discreteQueuePriorities`}
    public @CType("uint32_t") int discreteQueuePriorities() { return VkPhysicalDeviceLimits.get_discreteQueuePriorities(this.segment()); }
    /// Sets `discreteQueuePriorities` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_discreteQueuePriorities(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_discreteQueuePriorities.set(segment, 0L, index, value); }
    /// Sets `discreteQueuePriorities` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_discreteQueuePriorities(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_discreteQueuePriorities(segment, 0L, value); }
    /// Sets `discreteQueuePriorities` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits discreteQueuePriorities(@CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_discreteQueuePriorities(this.segment(), value); return this; }

    /// {@return `pointSizeRange` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float[2]") java.lang.foreign.MemorySegment get_pointSizeRange(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_pointSizeRange, index), ML_pointSizeRange); }
    /// {@return `pointSizeRange`}
    /// @param segment the segment of the struct
    public static @CType("float[2]") java.lang.foreign.MemorySegment get_pointSizeRange(MemorySegment segment) { return VkPhysicalDeviceLimits.get_pointSizeRange(segment, 0L); }
    /// {@return `pointSizeRange`}
    public @CType("float[2]") java.lang.foreign.MemorySegment pointSizeRange() { return VkPhysicalDeviceLimits.get_pointSizeRange(this.segment()); }
    /// Sets `pointSizeRange` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pointSizeRange(MemorySegment segment, long index, @CType("float[2]") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_pointSizeRange, index), ML_pointSizeRange.byteSize()); }
    /// Sets `pointSizeRange` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pointSizeRange(MemorySegment segment, @CType("float[2]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceLimits.set_pointSizeRange(segment, 0L, value); }
    /// Sets `pointSizeRange` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits pointSizeRange(@CType("float[2]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceLimits.set_pointSizeRange(this.segment(), value); return this; }

    /// {@return `lineWidthRange` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float[2]") java.lang.foreign.MemorySegment get_lineWidthRange(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_lineWidthRange, index), ML_lineWidthRange); }
    /// {@return `lineWidthRange`}
    /// @param segment the segment of the struct
    public static @CType("float[2]") java.lang.foreign.MemorySegment get_lineWidthRange(MemorySegment segment) { return VkPhysicalDeviceLimits.get_lineWidthRange(segment, 0L); }
    /// {@return `lineWidthRange`}
    public @CType("float[2]") java.lang.foreign.MemorySegment lineWidthRange() { return VkPhysicalDeviceLimits.get_lineWidthRange(this.segment()); }
    /// Sets `lineWidthRange` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_lineWidthRange(MemorySegment segment, long index, @CType("float[2]") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_lineWidthRange, index), ML_lineWidthRange.byteSize()); }
    /// Sets `lineWidthRange` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_lineWidthRange(MemorySegment segment, @CType("float[2]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceLimits.set_lineWidthRange(segment, 0L, value); }
    /// Sets `lineWidthRange` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits lineWidthRange(@CType("float[2]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceLimits.set_lineWidthRange(this.segment(), value); return this; }

    /// {@return `pointSizeGranularity` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_pointSizeGranularity(MemorySegment segment, long index) { return (float) VH_pointSizeGranularity.get(segment, 0L, index); }
    /// {@return `pointSizeGranularity`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_pointSizeGranularity(MemorySegment segment) { return VkPhysicalDeviceLimits.get_pointSizeGranularity(segment, 0L); }
    /// {@return `pointSizeGranularity`}
    public @CType("float") float pointSizeGranularity() { return VkPhysicalDeviceLimits.get_pointSizeGranularity(this.segment()); }
    /// Sets `pointSizeGranularity` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pointSizeGranularity(MemorySegment segment, long index, @CType("float") float value) { VH_pointSizeGranularity.set(segment, 0L, index, value); }
    /// Sets `pointSizeGranularity` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pointSizeGranularity(MemorySegment segment, @CType("float") float value) { VkPhysicalDeviceLimits.set_pointSizeGranularity(segment, 0L, value); }
    /// Sets `pointSizeGranularity` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits pointSizeGranularity(@CType("float") float value) { VkPhysicalDeviceLimits.set_pointSizeGranularity(this.segment(), value); return this; }

    /// {@return `lineWidthGranularity` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("float") float get_lineWidthGranularity(MemorySegment segment, long index) { return (float) VH_lineWidthGranularity.get(segment, 0L, index); }
    /// {@return `lineWidthGranularity`}
    /// @param segment the segment of the struct
    public static @CType("float") float get_lineWidthGranularity(MemorySegment segment) { return VkPhysicalDeviceLimits.get_lineWidthGranularity(segment, 0L); }
    /// {@return `lineWidthGranularity`}
    public @CType("float") float lineWidthGranularity() { return VkPhysicalDeviceLimits.get_lineWidthGranularity(this.segment()); }
    /// Sets `lineWidthGranularity` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_lineWidthGranularity(MemorySegment segment, long index, @CType("float") float value) { VH_lineWidthGranularity.set(segment, 0L, index, value); }
    /// Sets `lineWidthGranularity` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_lineWidthGranularity(MemorySegment segment, @CType("float") float value) { VkPhysicalDeviceLimits.set_lineWidthGranularity(segment, 0L, value); }
    /// Sets `lineWidthGranularity` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits lineWidthGranularity(@CType("float") float value) { VkPhysicalDeviceLimits.set_lineWidthGranularity(this.segment(), value); return this; }

    /// {@return `strictLines` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_strictLines(MemorySegment segment, long index) { return (int) VH_strictLines.get(segment, 0L, index); }
    /// {@return `strictLines`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_strictLines(MemorySegment segment) { return VkPhysicalDeviceLimits.get_strictLines(segment, 0L); }
    /// {@return `strictLines`}
    public @CType("VkBool32") int strictLines() { return VkPhysicalDeviceLimits.get_strictLines(this.segment()); }
    /// Sets `strictLines` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_strictLines(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_strictLines.set(segment, 0L, index, value); }
    /// Sets `strictLines` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_strictLines(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceLimits.set_strictLines(segment, 0L, value); }
    /// Sets `strictLines` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits strictLines(@CType("VkBool32") int value) { VkPhysicalDeviceLimits.set_strictLines(this.segment(), value); return this; }

    /// {@return `standardSampleLocations` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_standardSampleLocations(MemorySegment segment, long index) { return (int) VH_standardSampleLocations.get(segment, 0L, index); }
    /// {@return `standardSampleLocations`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_standardSampleLocations(MemorySegment segment) { return VkPhysicalDeviceLimits.get_standardSampleLocations(segment, 0L); }
    /// {@return `standardSampleLocations`}
    public @CType("VkBool32") int standardSampleLocations() { return VkPhysicalDeviceLimits.get_standardSampleLocations(this.segment()); }
    /// Sets `standardSampleLocations` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_standardSampleLocations(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_standardSampleLocations.set(segment, 0L, index, value); }
    /// Sets `standardSampleLocations` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_standardSampleLocations(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceLimits.set_standardSampleLocations(segment, 0L, value); }
    /// Sets `standardSampleLocations` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits standardSampleLocations(@CType("VkBool32") int value) { VkPhysicalDeviceLimits.set_standardSampleLocations(this.segment(), value); return this; }

    /// {@return `optimalBufferCopyOffsetAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_optimalBufferCopyOffsetAlignment(MemorySegment segment, long index) { return (long) VH_optimalBufferCopyOffsetAlignment.get(segment, 0L, index); }
    /// {@return `optimalBufferCopyOffsetAlignment`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_optimalBufferCopyOffsetAlignment(MemorySegment segment) { return VkPhysicalDeviceLimits.get_optimalBufferCopyOffsetAlignment(segment, 0L); }
    /// {@return `optimalBufferCopyOffsetAlignment`}
    public @CType("VkDeviceSize") long optimalBufferCopyOffsetAlignment() { return VkPhysicalDeviceLimits.get_optimalBufferCopyOffsetAlignment(this.segment()); }
    /// Sets `optimalBufferCopyOffsetAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_optimalBufferCopyOffsetAlignment(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_optimalBufferCopyOffsetAlignment.set(segment, 0L, index, value); }
    /// Sets `optimalBufferCopyOffsetAlignment` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_optimalBufferCopyOffsetAlignment(MemorySegment segment, @CType("VkDeviceSize") long value) { VkPhysicalDeviceLimits.set_optimalBufferCopyOffsetAlignment(segment, 0L, value); }
    /// Sets `optimalBufferCopyOffsetAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits optimalBufferCopyOffsetAlignment(@CType("VkDeviceSize") long value) { VkPhysicalDeviceLimits.set_optimalBufferCopyOffsetAlignment(this.segment(), value); return this; }

    /// {@return `optimalBufferCopyRowPitchAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_optimalBufferCopyRowPitchAlignment(MemorySegment segment, long index) { return (long) VH_optimalBufferCopyRowPitchAlignment.get(segment, 0L, index); }
    /// {@return `optimalBufferCopyRowPitchAlignment`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_optimalBufferCopyRowPitchAlignment(MemorySegment segment) { return VkPhysicalDeviceLimits.get_optimalBufferCopyRowPitchAlignment(segment, 0L); }
    /// {@return `optimalBufferCopyRowPitchAlignment`}
    public @CType("VkDeviceSize") long optimalBufferCopyRowPitchAlignment() { return VkPhysicalDeviceLimits.get_optimalBufferCopyRowPitchAlignment(this.segment()); }
    /// Sets `optimalBufferCopyRowPitchAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_optimalBufferCopyRowPitchAlignment(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_optimalBufferCopyRowPitchAlignment.set(segment, 0L, index, value); }
    /// Sets `optimalBufferCopyRowPitchAlignment` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_optimalBufferCopyRowPitchAlignment(MemorySegment segment, @CType("VkDeviceSize") long value) { VkPhysicalDeviceLimits.set_optimalBufferCopyRowPitchAlignment(segment, 0L, value); }
    /// Sets `optimalBufferCopyRowPitchAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits optimalBufferCopyRowPitchAlignment(@CType("VkDeviceSize") long value) { VkPhysicalDeviceLimits.set_optimalBufferCopyRowPitchAlignment(this.segment(), value); return this; }

    /// {@return `nonCoherentAtomSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_nonCoherentAtomSize(MemorySegment segment, long index) { return (long) VH_nonCoherentAtomSize.get(segment, 0L, index); }
    /// {@return `nonCoherentAtomSize`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_nonCoherentAtomSize(MemorySegment segment) { return VkPhysicalDeviceLimits.get_nonCoherentAtomSize(segment, 0L); }
    /// {@return `nonCoherentAtomSize`}
    public @CType("VkDeviceSize") long nonCoherentAtomSize() { return VkPhysicalDeviceLimits.get_nonCoherentAtomSize(this.segment()); }
    /// Sets `nonCoherentAtomSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_nonCoherentAtomSize(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_nonCoherentAtomSize.set(segment, 0L, index, value); }
    /// Sets `nonCoherentAtomSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_nonCoherentAtomSize(MemorySegment segment, @CType("VkDeviceSize") long value) { VkPhysicalDeviceLimits.set_nonCoherentAtomSize(segment, 0L, value); }
    /// Sets `nonCoherentAtomSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceLimits nonCoherentAtomSize(@CType("VkDeviceSize") long value) { VkPhysicalDeviceLimits.set_nonCoherentAtomSize(this.segment(), value); return this; }

    /// A buffer of [VkPhysicalDeviceLimits].
    public static final class Buffer extends VkPhysicalDeviceLimits {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceLimits.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceLimits`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceLimits`
        public VkPhysicalDeviceLimits asSlice(long index) { return new VkPhysicalDeviceLimits(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceLimits`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceLimits`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `maxImageDimension1D` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxImageDimension1DAt(long index) { return VkPhysicalDeviceLimits.get_maxImageDimension1D(this.segment(), index); }
        /// Sets `maxImageDimension1D` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxImageDimension1DAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxImageDimension1D(this.segment(), index, value); return this; }

        /// {@return `maxImageDimension2D` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxImageDimension2DAt(long index) { return VkPhysicalDeviceLimits.get_maxImageDimension2D(this.segment(), index); }
        /// Sets `maxImageDimension2D` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxImageDimension2DAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxImageDimension2D(this.segment(), index, value); return this; }

        /// {@return `maxImageDimension3D` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxImageDimension3DAt(long index) { return VkPhysicalDeviceLimits.get_maxImageDimension3D(this.segment(), index); }
        /// Sets `maxImageDimension3D` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxImageDimension3DAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxImageDimension3D(this.segment(), index, value); return this; }

        /// {@return `maxImageDimensionCube` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxImageDimensionCubeAt(long index) { return VkPhysicalDeviceLimits.get_maxImageDimensionCube(this.segment(), index); }
        /// Sets `maxImageDimensionCube` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxImageDimensionCubeAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxImageDimensionCube(this.segment(), index, value); return this; }

        /// {@return `maxImageArrayLayers` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxImageArrayLayersAt(long index) { return VkPhysicalDeviceLimits.get_maxImageArrayLayers(this.segment(), index); }
        /// Sets `maxImageArrayLayers` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxImageArrayLayersAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxImageArrayLayers(this.segment(), index, value); return this; }

        /// {@return `maxTexelBufferElements` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxTexelBufferElementsAt(long index) { return VkPhysicalDeviceLimits.get_maxTexelBufferElements(this.segment(), index); }
        /// Sets `maxTexelBufferElements` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxTexelBufferElementsAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxTexelBufferElements(this.segment(), index, value); return this; }

        /// {@return `maxUniformBufferRange` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxUniformBufferRangeAt(long index) { return VkPhysicalDeviceLimits.get_maxUniformBufferRange(this.segment(), index); }
        /// Sets `maxUniformBufferRange` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxUniformBufferRangeAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxUniformBufferRange(this.segment(), index, value); return this; }

        /// {@return `maxStorageBufferRange` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxStorageBufferRangeAt(long index) { return VkPhysicalDeviceLimits.get_maxStorageBufferRange(this.segment(), index); }
        /// Sets `maxStorageBufferRange` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxStorageBufferRangeAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxStorageBufferRange(this.segment(), index, value); return this; }

        /// {@return `maxPushConstantsSize` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxPushConstantsSizeAt(long index) { return VkPhysicalDeviceLimits.get_maxPushConstantsSize(this.segment(), index); }
        /// Sets `maxPushConstantsSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxPushConstantsSizeAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxPushConstantsSize(this.segment(), index, value); return this; }

        /// {@return `maxMemoryAllocationCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxMemoryAllocationCountAt(long index) { return VkPhysicalDeviceLimits.get_maxMemoryAllocationCount(this.segment(), index); }
        /// Sets `maxMemoryAllocationCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxMemoryAllocationCountAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxMemoryAllocationCount(this.segment(), index, value); return this; }

        /// {@return `maxSamplerAllocationCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxSamplerAllocationCountAt(long index) { return VkPhysicalDeviceLimits.get_maxSamplerAllocationCount(this.segment(), index); }
        /// Sets `maxSamplerAllocationCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxSamplerAllocationCountAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxSamplerAllocationCount(this.segment(), index, value); return this; }

        /// {@return `bufferImageGranularity` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long bufferImageGranularityAt(long index) { return VkPhysicalDeviceLimits.get_bufferImageGranularity(this.segment(), index); }
        /// Sets `bufferImageGranularity` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer bufferImageGranularityAt(long index, @CType("VkDeviceSize") long value) { VkPhysicalDeviceLimits.set_bufferImageGranularity(this.segment(), index, value); return this; }

        /// {@return `sparseAddressSpaceSize` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long sparseAddressSpaceSizeAt(long index) { return VkPhysicalDeviceLimits.get_sparseAddressSpaceSize(this.segment(), index); }
        /// Sets `sparseAddressSpaceSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sparseAddressSpaceSizeAt(long index, @CType("VkDeviceSize") long value) { VkPhysicalDeviceLimits.set_sparseAddressSpaceSize(this.segment(), index, value); return this; }

        /// {@return `maxBoundDescriptorSets` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxBoundDescriptorSetsAt(long index) { return VkPhysicalDeviceLimits.get_maxBoundDescriptorSets(this.segment(), index); }
        /// Sets `maxBoundDescriptorSets` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxBoundDescriptorSetsAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxBoundDescriptorSets(this.segment(), index, value); return this; }

        /// {@return `maxPerStageDescriptorSamplers` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxPerStageDescriptorSamplersAt(long index) { return VkPhysicalDeviceLimits.get_maxPerStageDescriptorSamplers(this.segment(), index); }
        /// Sets `maxPerStageDescriptorSamplers` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxPerStageDescriptorSamplersAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxPerStageDescriptorSamplers(this.segment(), index, value); return this; }

        /// {@return `maxPerStageDescriptorUniformBuffers` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxPerStageDescriptorUniformBuffersAt(long index) { return VkPhysicalDeviceLimits.get_maxPerStageDescriptorUniformBuffers(this.segment(), index); }
        /// Sets `maxPerStageDescriptorUniformBuffers` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxPerStageDescriptorUniformBuffersAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxPerStageDescriptorUniformBuffers(this.segment(), index, value); return this; }

        /// {@return `maxPerStageDescriptorStorageBuffers` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxPerStageDescriptorStorageBuffersAt(long index) { return VkPhysicalDeviceLimits.get_maxPerStageDescriptorStorageBuffers(this.segment(), index); }
        /// Sets `maxPerStageDescriptorStorageBuffers` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxPerStageDescriptorStorageBuffersAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxPerStageDescriptorStorageBuffers(this.segment(), index, value); return this; }

        /// {@return `maxPerStageDescriptorSampledImages` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxPerStageDescriptorSampledImagesAt(long index) { return VkPhysicalDeviceLimits.get_maxPerStageDescriptorSampledImages(this.segment(), index); }
        /// Sets `maxPerStageDescriptorSampledImages` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxPerStageDescriptorSampledImagesAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxPerStageDescriptorSampledImages(this.segment(), index, value); return this; }

        /// {@return `maxPerStageDescriptorStorageImages` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxPerStageDescriptorStorageImagesAt(long index) { return VkPhysicalDeviceLimits.get_maxPerStageDescriptorStorageImages(this.segment(), index); }
        /// Sets `maxPerStageDescriptorStorageImages` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxPerStageDescriptorStorageImagesAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxPerStageDescriptorStorageImages(this.segment(), index, value); return this; }

        /// {@return `maxPerStageDescriptorInputAttachments` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxPerStageDescriptorInputAttachmentsAt(long index) { return VkPhysicalDeviceLimits.get_maxPerStageDescriptorInputAttachments(this.segment(), index); }
        /// Sets `maxPerStageDescriptorInputAttachments` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxPerStageDescriptorInputAttachmentsAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxPerStageDescriptorInputAttachments(this.segment(), index, value); return this; }

        /// {@return `maxPerStageResources` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxPerStageResourcesAt(long index) { return VkPhysicalDeviceLimits.get_maxPerStageResources(this.segment(), index); }
        /// Sets `maxPerStageResources` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxPerStageResourcesAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxPerStageResources(this.segment(), index, value); return this; }

        /// {@return `maxDescriptorSetSamplers` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxDescriptorSetSamplersAt(long index) { return VkPhysicalDeviceLimits.get_maxDescriptorSetSamplers(this.segment(), index); }
        /// Sets `maxDescriptorSetSamplers` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxDescriptorSetSamplersAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxDescriptorSetSamplers(this.segment(), index, value); return this; }

        /// {@return `maxDescriptorSetUniformBuffers` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxDescriptorSetUniformBuffersAt(long index) { return VkPhysicalDeviceLimits.get_maxDescriptorSetUniformBuffers(this.segment(), index); }
        /// Sets `maxDescriptorSetUniformBuffers` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxDescriptorSetUniformBuffersAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxDescriptorSetUniformBuffers(this.segment(), index, value); return this; }

        /// {@return `maxDescriptorSetUniformBuffersDynamic` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxDescriptorSetUniformBuffersDynamicAt(long index) { return VkPhysicalDeviceLimits.get_maxDescriptorSetUniformBuffersDynamic(this.segment(), index); }
        /// Sets `maxDescriptorSetUniformBuffersDynamic` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxDescriptorSetUniformBuffersDynamicAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxDescriptorSetUniformBuffersDynamic(this.segment(), index, value); return this; }

        /// {@return `maxDescriptorSetStorageBuffers` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxDescriptorSetStorageBuffersAt(long index) { return VkPhysicalDeviceLimits.get_maxDescriptorSetStorageBuffers(this.segment(), index); }
        /// Sets `maxDescriptorSetStorageBuffers` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxDescriptorSetStorageBuffersAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxDescriptorSetStorageBuffers(this.segment(), index, value); return this; }

        /// {@return `maxDescriptorSetStorageBuffersDynamic` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxDescriptorSetStorageBuffersDynamicAt(long index) { return VkPhysicalDeviceLimits.get_maxDescriptorSetStorageBuffersDynamic(this.segment(), index); }
        /// Sets `maxDescriptorSetStorageBuffersDynamic` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxDescriptorSetStorageBuffersDynamicAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxDescriptorSetStorageBuffersDynamic(this.segment(), index, value); return this; }

        /// {@return `maxDescriptorSetSampledImages` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxDescriptorSetSampledImagesAt(long index) { return VkPhysicalDeviceLimits.get_maxDescriptorSetSampledImages(this.segment(), index); }
        /// Sets `maxDescriptorSetSampledImages` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxDescriptorSetSampledImagesAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxDescriptorSetSampledImages(this.segment(), index, value); return this; }

        /// {@return `maxDescriptorSetStorageImages` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxDescriptorSetStorageImagesAt(long index) { return VkPhysicalDeviceLimits.get_maxDescriptorSetStorageImages(this.segment(), index); }
        /// Sets `maxDescriptorSetStorageImages` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxDescriptorSetStorageImagesAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxDescriptorSetStorageImages(this.segment(), index, value); return this; }

        /// {@return `maxDescriptorSetInputAttachments` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxDescriptorSetInputAttachmentsAt(long index) { return VkPhysicalDeviceLimits.get_maxDescriptorSetInputAttachments(this.segment(), index); }
        /// Sets `maxDescriptorSetInputAttachments` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxDescriptorSetInputAttachmentsAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxDescriptorSetInputAttachments(this.segment(), index, value); return this; }

        /// {@return `maxVertexInputAttributes` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxVertexInputAttributesAt(long index) { return VkPhysicalDeviceLimits.get_maxVertexInputAttributes(this.segment(), index); }
        /// Sets `maxVertexInputAttributes` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxVertexInputAttributesAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxVertexInputAttributes(this.segment(), index, value); return this; }

        /// {@return `maxVertexInputBindings` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxVertexInputBindingsAt(long index) { return VkPhysicalDeviceLimits.get_maxVertexInputBindings(this.segment(), index); }
        /// Sets `maxVertexInputBindings` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxVertexInputBindingsAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxVertexInputBindings(this.segment(), index, value); return this; }

        /// {@return `maxVertexInputAttributeOffset` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxVertexInputAttributeOffsetAt(long index) { return VkPhysicalDeviceLimits.get_maxVertexInputAttributeOffset(this.segment(), index); }
        /// Sets `maxVertexInputAttributeOffset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxVertexInputAttributeOffsetAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxVertexInputAttributeOffset(this.segment(), index, value); return this; }

        /// {@return `maxVertexInputBindingStride` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxVertexInputBindingStrideAt(long index) { return VkPhysicalDeviceLimits.get_maxVertexInputBindingStride(this.segment(), index); }
        /// Sets `maxVertexInputBindingStride` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxVertexInputBindingStrideAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxVertexInputBindingStride(this.segment(), index, value); return this; }

        /// {@return `maxVertexOutputComponents` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxVertexOutputComponentsAt(long index) { return VkPhysicalDeviceLimits.get_maxVertexOutputComponents(this.segment(), index); }
        /// Sets `maxVertexOutputComponents` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxVertexOutputComponentsAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxVertexOutputComponents(this.segment(), index, value); return this; }

        /// {@return `maxTessellationGenerationLevel` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxTessellationGenerationLevelAt(long index) { return VkPhysicalDeviceLimits.get_maxTessellationGenerationLevel(this.segment(), index); }
        /// Sets `maxTessellationGenerationLevel` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxTessellationGenerationLevelAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxTessellationGenerationLevel(this.segment(), index, value); return this; }

        /// {@return `maxTessellationPatchSize` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxTessellationPatchSizeAt(long index) { return VkPhysicalDeviceLimits.get_maxTessellationPatchSize(this.segment(), index); }
        /// Sets `maxTessellationPatchSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxTessellationPatchSizeAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxTessellationPatchSize(this.segment(), index, value); return this; }

        /// {@return `maxTessellationControlPerVertexInputComponents` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxTessellationControlPerVertexInputComponentsAt(long index) { return VkPhysicalDeviceLimits.get_maxTessellationControlPerVertexInputComponents(this.segment(), index); }
        /// Sets `maxTessellationControlPerVertexInputComponents` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxTessellationControlPerVertexInputComponentsAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxTessellationControlPerVertexInputComponents(this.segment(), index, value); return this; }

        /// {@return `maxTessellationControlPerVertexOutputComponents` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxTessellationControlPerVertexOutputComponentsAt(long index) { return VkPhysicalDeviceLimits.get_maxTessellationControlPerVertexOutputComponents(this.segment(), index); }
        /// Sets `maxTessellationControlPerVertexOutputComponents` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxTessellationControlPerVertexOutputComponentsAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxTessellationControlPerVertexOutputComponents(this.segment(), index, value); return this; }

        /// {@return `maxTessellationControlPerPatchOutputComponents` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxTessellationControlPerPatchOutputComponentsAt(long index) { return VkPhysicalDeviceLimits.get_maxTessellationControlPerPatchOutputComponents(this.segment(), index); }
        /// Sets `maxTessellationControlPerPatchOutputComponents` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxTessellationControlPerPatchOutputComponentsAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxTessellationControlPerPatchOutputComponents(this.segment(), index, value); return this; }

        /// {@return `maxTessellationControlTotalOutputComponents` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxTessellationControlTotalOutputComponentsAt(long index) { return VkPhysicalDeviceLimits.get_maxTessellationControlTotalOutputComponents(this.segment(), index); }
        /// Sets `maxTessellationControlTotalOutputComponents` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxTessellationControlTotalOutputComponentsAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxTessellationControlTotalOutputComponents(this.segment(), index, value); return this; }

        /// {@return `maxTessellationEvaluationInputComponents` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxTessellationEvaluationInputComponentsAt(long index) { return VkPhysicalDeviceLimits.get_maxTessellationEvaluationInputComponents(this.segment(), index); }
        /// Sets `maxTessellationEvaluationInputComponents` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxTessellationEvaluationInputComponentsAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxTessellationEvaluationInputComponents(this.segment(), index, value); return this; }

        /// {@return `maxTessellationEvaluationOutputComponents` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxTessellationEvaluationOutputComponentsAt(long index) { return VkPhysicalDeviceLimits.get_maxTessellationEvaluationOutputComponents(this.segment(), index); }
        /// Sets `maxTessellationEvaluationOutputComponents` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxTessellationEvaluationOutputComponentsAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxTessellationEvaluationOutputComponents(this.segment(), index, value); return this; }

        /// {@return `maxGeometryShaderInvocations` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxGeometryShaderInvocationsAt(long index) { return VkPhysicalDeviceLimits.get_maxGeometryShaderInvocations(this.segment(), index); }
        /// Sets `maxGeometryShaderInvocations` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxGeometryShaderInvocationsAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxGeometryShaderInvocations(this.segment(), index, value); return this; }

        /// {@return `maxGeometryInputComponents` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxGeometryInputComponentsAt(long index) { return VkPhysicalDeviceLimits.get_maxGeometryInputComponents(this.segment(), index); }
        /// Sets `maxGeometryInputComponents` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxGeometryInputComponentsAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxGeometryInputComponents(this.segment(), index, value); return this; }

        /// {@return `maxGeometryOutputComponents` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxGeometryOutputComponentsAt(long index) { return VkPhysicalDeviceLimits.get_maxGeometryOutputComponents(this.segment(), index); }
        /// Sets `maxGeometryOutputComponents` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxGeometryOutputComponentsAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxGeometryOutputComponents(this.segment(), index, value); return this; }

        /// {@return `maxGeometryOutputVertices` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxGeometryOutputVerticesAt(long index) { return VkPhysicalDeviceLimits.get_maxGeometryOutputVertices(this.segment(), index); }
        /// Sets `maxGeometryOutputVertices` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxGeometryOutputVerticesAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxGeometryOutputVertices(this.segment(), index, value); return this; }

        /// {@return `maxGeometryTotalOutputComponents` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxGeometryTotalOutputComponentsAt(long index) { return VkPhysicalDeviceLimits.get_maxGeometryTotalOutputComponents(this.segment(), index); }
        /// Sets `maxGeometryTotalOutputComponents` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxGeometryTotalOutputComponentsAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxGeometryTotalOutputComponents(this.segment(), index, value); return this; }

        /// {@return `maxFragmentInputComponents` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxFragmentInputComponentsAt(long index) { return VkPhysicalDeviceLimits.get_maxFragmentInputComponents(this.segment(), index); }
        /// Sets `maxFragmentInputComponents` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxFragmentInputComponentsAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxFragmentInputComponents(this.segment(), index, value); return this; }

        /// {@return `maxFragmentOutputAttachments` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxFragmentOutputAttachmentsAt(long index) { return VkPhysicalDeviceLimits.get_maxFragmentOutputAttachments(this.segment(), index); }
        /// Sets `maxFragmentOutputAttachments` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxFragmentOutputAttachmentsAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxFragmentOutputAttachments(this.segment(), index, value); return this; }

        /// {@return `maxFragmentDualSrcAttachments` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxFragmentDualSrcAttachmentsAt(long index) { return VkPhysicalDeviceLimits.get_maxFragmentDualSrcAttachments(this.segment(), index); }
        /// Sets `maxFragmentDualSrcAttachments` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxFragmentDualSrcAttachmentsAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxFragmentDualSrcAttachments(this.segment(), index, value); return this; }

        /// {@return `maxFragmentCombinedOutputResources` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxFragmentCombinedOutputResourcesAt(long index) { return VkPhysicalDeviceLimits.get_maxFragmentCombinedOutputResources(this.segment(), index); }
        /// Sets `maxFragmentCombinedOutputResources` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxFragmentCombinedOutputResourcesAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxFragmentCombinedOutputResources(this.segment(), index, value); return this; }

        /// {@return `maxComputeSharedMemorySize` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxComputeSharedMemorySizeAt(long index) { return VkPhysicalDeviceLimits.get_maxComputeSharedMemorySize(this.segment(), index); }
        /// Sets `maxComputeSharedMemorySize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxComputeSharedMemorySizeAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxComputeSharedMemorySize(this.segment(), index, value); return this; }

        /// {@return `maxComputeWorkGroupCount` at the given index}
        /// @param index the index
        public @CType("uint32_t[3]") java.lang.foreign.MemorySegment maxComputeWorkGroupCountAt(long index) { return VkPhysicalDeviceLimits.get_maxComputeWorkGroupCount(this.segment(), index); }
        /// Sets `maxComputeWorkGroupCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxComputeWorkGroupCountAt(long index, @CType("uint32_t[3]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceLimits.set_maxComputeWorkGroupCount(this.segment(), index, value); return this; }

        /// {@return `maxComputeWorkGroupInvocations` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxComputeWorkGroupInvocationsAt(long index) { return VkPhysicalDeviceLimits.get_maxComputeWorkGroupInvocations(this.segment(), index); }
        /// Sets `maxComputeWorkGroupInvocations` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxComputeWorkGroupInvocationsAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxComputeWorkGroupInvocations(this.segment(), index, value); return this; }

        /// {@return `maxComputeWorkGroupSize` at the given index}
        /// @param index the index
        public @CType("uint32_t[3]") java.lang.foreign.MemorySegment maxComputeWorkGroupSizeAt(long index) { return VkPhysicalDeviceLimits.get_maxComputeWorkGroupSize(this.segment(), index); }
        /// Sets `maxComputeWorkGroupSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxComputeWorkGroupSizeAt(long index, @CType("uint32_t[3]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceLimits.set_maxComputeWorkGroupSize(this.segment(), index, value); return this; }

        /// {@return `subPixelPrecisionBits` at the given index}
        /// @param index the index
        public @CType("uint32_t") int subPixelPrecisionBitsAt(long index) { return VkPhysicalDeviceLimits.get_subPixelPrecisionBits(this.segment(), index); }
        /// Sets `subPixelPrecisionBits` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer subPixelPrecisionBitsAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_subPixelPrecisionBits(this.segment(), index, value); return this; }

        /// {@return `subTexelPrecisionBits` at the given index}
        /// @param index the index
        public @CType("uint32_t") int subTexelPrecisionBitsAt(long index) { return VkPhysicalDeviceLimits.get_subTexelPrecisionBits(this.segment(), index); }
        /// Sets `subTexelPrecisionBits` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer subTexelPrecisionBitsAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_subTexelPrecisionBits(this.segment(), index, value); return this; }

        /// {@return `mipmapPrecisionBits` at the given index}
        /// @param index the index
        public @CType("uint32_t") int mipmapPrecisionBitsAt(long index) { return VkPhysicalDeviceLimits.get_mipmapPrecisionBits(this.segment(), index); }
        /// Sets `mipmapPrecisionBits` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer mipmapPrecisionBitsAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_mipmapPrecisionBits(this.segment(), index, value); return this; }

        /// {@return `maxDrawIndexedIndexValue` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxDrawIndexedIndexValueAt(long index) { return VkPhysicalDeviceLimits.get_maxDrawIndexedIndexValue(this.segment(), index); }
        /// Sets `maxDrawIndexedIndexValue` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxDrawIndexedIndexValueAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxDrawIndexedIndexValue(this.segment(), index, value); return this; }

        /// {@return `maxDrawIndirectCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxDrawIndirectCountAt(long index) { return VkPhysicalDeviceLimits.get_maxDrawIndirectCount(this.segment(), index); }
        /// Sets `maxDrawIndirectCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxDrawIndirectCountAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxDrawIndirectCount(this.segment(), index, value); return this; }

        /// {@return `maxSamplerLodBias` at the given index}
        /// @param index the index
        public @CType("float") float maxSamplerLodBiasAt(long index) { return VkPhysicalDeviceLimits.get_maxSamplerLodBias(this.segment(), index); }
        /// Sets `maxSamplerLodBias` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxSamplerLodBiasAt(long index, @CType("float") float value) { VkPhysicalDeviceLimits.set_maxSamplerLodBias(this.segment(), index, value); return this; }

        /// {@return `maxSamplerAnisotropy` at the given index}
        /// @param index the index
        public @CType("float") float maxSamplerAnisotropyAt(long index) { return VkPhysicalDeviceLimits.get_maxSamplerAnisotropy(this.segment(), index); }
        /// Sets `maxSamplerAnisotropy` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxSamplerAnisotropyAt(long index, @CType("float") float value) { VkPhysicalDeviceLimits.set_maxSamplerAnisotropy(this.segment(), index, value); return this; }

        /// {@return `maxViewports` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxViewportsAt(long index) { return VkPhysicalDeviceLimits.get_maxViewports(this.segment(), index); }
        /// Sets `maxViewports` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxViewportsAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxViewports(this.segment(), index, value); return this; }

        /// {@return `maxViewportDimensions` at the given index}
        /// @param index the index
        public @CType("uint32_t[2]") java.lang.foreign.MemorySegment maxViewportDimensionsAt(long index) { return VkPhysicalDeviceLimits.get_maxViewportDimensions(this.segment(), index); }
        /// Sets `maxViewportDimensions` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxViewportDimensionsAt(long index, @CType("uint32_t[2]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceLimits.set_maxViewportDimensions(this.segment(), index, value); return this; }

        /// {@return `viewportBoundsRange` at the given index}
        /// @param index the index
        public @CType("float[2]") java.lang.foreign.MemorySegment viewportBoundsRangeAt(long index) { return VkPhysicalDeviceLimits.get_viewportBoundsRange(this.segment(), index); }
        /// Sets `viewportBoundsRange` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer viewportBoundsRangeAt(long index, @CType("float[2]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceLimits.set_viewportBoundsRange(this.segment(), index, value); return this; }

        /// {@return `viewportSubPixelBits` at the given index}
        /// @param index the index
        public @CType("uint32_t") int viewportSubPixelBitsAt(long index) { return VkPhysicalDeviceLimits.get_viewportSubPixelBits(this.segment(), index); }
        /// Sets `viewportSubPixelBits` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer viewportSubPixelBitsAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_viewportSubPixelBits(this.segment(), index, value); return this; }

        /// {@return `minMemoryMapAlignment` at the given index}
        /// @param index the index
        public @CType("size_t") long minMemoryMapAlignmentAt(long index) { return VkPhysicalDeviceLimits.get_minMemoryMapAlignment(this.segment(), index); }
        /// Sets `minMemoryMapAlignment` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer minMemoryMapAlignmentAt(long index, @CType("size_t") long value) { VkPhysicalDeviceLimits.set_minMemoryMapAlignment(this.segment(), index, value); return this; }

        /// {@return `minTexelBufferOffsetAlignment` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long minTexelBufferOffsetAlignmentAt(long index) { return VkPhysicalDeviceLimits.get_minTexelBufferOffsetAlignment(this.segment(), index); }
        /// Sets `minTexelBufferOffsetAlignment` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer minTexelBufferOffsetAlignmentAt(long index, @CType("VkDeviceSize") long value) { VkPhysicalDeviceLimits.set_minTexelBufferOffsetAlignment(this.segment(), index, value); return this; }

        /// {@return `minUniformBufferOffsetAlignment` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long minUniformBufferOffsetAlignmentAt(long index) { return VkPhysicalDeviceLimits.get_minUniformBufferOffsetAlignment(this.segment(), index); }
        /// Sets `minUniformBufferOffsetAlignment` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer minUniformBufferOffsetAlignmentAt(long index, @CType("VkDeviceSize") long value) { VkPhysicalDeviceLimits.set_minUniformBufferOffsetAlignment(this.segment(), index, value); return this; }

        /// {@return `minStorageBufferOffsetAlignment` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long minStorageBufferOffsetAlignmentAt(long index) { return VkPhysicalDeviceLimits.get_minStorageBufferOffsetAlignment(this.segment(), index); }
        /// Sets `minStorageBufferOffsetAlignment` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer minStorageBufferOffsetAlignmentAt(long index, @CType("VkDeviceSize") long value) { VkPhysicalDeviceLimits.set_minStorageBufferOffsetAlignment(this.segment(), index, value); return this; }

        /// {@return `minTexelOffset` at the given index}
        /// @param index the index
        public @CType("int32_t") int minTexelOffsetAt(long index) { return VkPhysicalDeviceLimits.get_minTexelOffset(this.segment(), index); }
        /// Sets `minTexelOffset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer minTexelOffsetAt(long index, @CType("int32_t") int value) { VkPhysicalDeviceLimits.set_minTexelOffset(this.segment(), index, value); return this; }

        /// {@return `maxTexelOffset` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxTexelOffsetAt(long index) { return VkPhysicalDeviceLimits.get_maxTexelOffset(this.segment(), index); }
        /// Sets `maxTexelOffset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxTexelOffsetAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxTexelOffset(this.segment(), index, value); return this; }

        /// {@return `minTexelGatherOffset` at the given index}
        /// @param index the index
        public @CType("int32_t") int minTexelGatherOffsetAt(long index) { return VkPhysicalDeviceLimits.get_minTexelGatherOffset(this.segment(), index); }
        /// Sets `minTexelGatherOffset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer minTexelGatherOffsetAt(long index, @CType("int32_t") int value) { VkPhysicalDeviceLimits.set_minTexelGatherOffset(this.segment(), index, value); return this; }

        /// {@return `maxTexelGatherOffset` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxTexelGatherOffsetAt(long index) { return VkPhysicalDeviceLimits.get_maxTexelGatherOffset(this.segment(), index); }
        /// Sets `maxTexelGatherOffset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxTexelGatherOffsetAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxTexelGatherOffset(this.segment(), index, value); return this; }

        /// {@return `minInterpolationOffset` at the given index}
        /// @param index the index
        public @CType("float") float minInterpolationOffsetAt(long index) { return VkPhysicalDeviceLimits.get_minInterpolationOffset(this.segment(), index); }
        /// Sets `minInterpolationOffset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer minInterpolationOffsetAt(long index, @CType("float") float value) { VkPhysicalDeviceLimits.set_minInterpolationOffset(this.segment(), index, value); return this; }

        /// {@return `maxInterpolationOffset` at the given index}
        /// @param index the index
        public @CType("float") float maxInterpolationOffsetAt(long index) { return VkPhysicalDeviceLimits.get_maxInterpolationOffset(this.segment(), index); }
        /// Sets `maxInterpolationOffset` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxInterpolationOffsetAt(long index, @CType("float") float value) { VkPhysicalDeviceLimits.set_maxInterpolationOffset(this.segment(), index, value); return this; }

        /// {@return `subPixelInterpolationOffsetBits` at the given index}
        /// @param index the index
        public @CType("uint32_t") int subPixelInterpolationOffsetBitsAt(long index) { return VkPhysicalDeviceLimits.get_subPixelInterpolationOffsetBits(this.segment(), index); }
        /// Sets `subPixelInterpolationOffsetBits` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer subPixelInterpolationOffsetBitsAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_subPixelInterpolationOffsetBits(this.segment(), index, value); return this; }

        /// {@return `maxFramebufferWidth` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxFramebufferWidthAt(long index) { return VkPhysicalDeviceLimits.get_maxFramebufferWidth(this.segment(), index); }
        /// Sets `maxFramebufferWidth` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxFramebufferWidthAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxFramebufferWidth(this.segment(), index, value); return this; }

        /// {@return `maxFramebufferHeight` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxFramebufferHeightAt(long index) { return VkPhysicalDeviceLimits.get_maxFramebufferHeight(this.segment(), index); }
        /// Sets `maxFramebufferHeight` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxFramebufferHeightAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxFramebufferHeight(this.segment(), index, value); return this; }

        /// {@return `maxFramebufferLayers` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxFramebufferLayersAt(long index) { return VkPhysicalDeviceLimits.get_maxFramebufferLayers(this.segment(), index); }
        /// Sets `maxFramebufferLayers` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxFramebufferLayersAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxFramebufferLayers(this.segment(), index, value); return this; }

        /// {@return `framebufferColorSampleCounts` at the given index}
        /// @param index the index
        public @CType("VkSampleCountFlags") int framebufferColorSampleCountsAt(long index) { return VkPhysicalDeviceLimits.get_framebufferColorSampleCounts(this.segment(), index); }
        /// Sets `framebufferColorSampleCounts` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer framebufferColorSampleCountsAt(long index, @CType("VkSampleCountFlags") int value) { VkPhysicalDeviceLimits.set_framebufferColorSampleCounts(this.segment(), index, value); return this; }

        /// {@return `framebufferDepthSampleCounts` at the given index}
        /// @param index the index
        public @CType("VkSampleCountFlags") int framebufferDepthSampleCountsAt(long index) { return VkPhysicalDeviceLimits.get_framebufferDepthSampleCounts(this.segment(), index); }
        /// Sets `framebufferDepthSampleCounts` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer framebufferDepthSampleCountsAt(long index, @CType("VkSampleCountFlags") int value) { VkPhysicalDeviceLimits.set_framebufferDepthSampleCounts(this.segment(), index, value); return this; }

        /// {@return `framebufferStencilSampleCounts` at the given index}
        /// @param index the index
        public @CType("VkSampleCountFlags") int framebufferStencilSampleCountsAt(long index) { return VkPhysicalDeviceLimits.get_framebufferStencilSampleCounts(this.segment(), index); }
        /// Sets `framebufferStencilSampleCounts` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer framebufferStencilSampleCountsAt(long index, @CType("VkSampleCountFlags") int value) { VkPhysicalDeviceLimits.set_framebufferStencilSampleCounts(this.segment(), index, value); return this; }

        /// {@return `framebufferNoAttachmentsSampleCounts` at the given index}
        /// @param index the index
        public @CType("VkSampleCountFlags") int framebufferNoAttachmentsSampleCountsAt(long index) { return VkPhysicalDeviceLimits.get_framebufferNoAttachmentsSampleCounts(this.segment(), index); }
        /// Sets `framebufferNoAttachmentsSampleCounts` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer framebufferNoAttachmentsSampleCountsAt(long index, @CType("VkSampleCountFlags") int value) { VkPhysicalDeviceLimits.set_framebufferNoAttachmentsSampleCounts(this.segment(), index, value); return this; }

        /// {@return `maxColorAttachments` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxColorAttachmentsAt(long index) { return VkPhysicalDeviceLimits.get_maxColorAttachments(this.segment(), index); }
        /// Sets `maxColorAttachments` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxColorAttachmentsAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxColorAttachments(this.segment(), index, value); return this; }

        /// {@return `sampledImageColorSampleCounts` at the given index}
        /// @param index the index
        public @CType("VkSampleCountFlags") int sampledImageColorSampleCountsAt(long index) { return VkPhysicalDeviceLimits.get_sampledImageColorSampleCounts(this.segment(), index); }
        /// Sets `sampledImageColorSampleCounts` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sampledImageColorSampleCountsAt(long index, @CType("VkSampleCountFlags") int value) { VkPhysicalDeviceLimits.set_sampledImageColorSampleCounts(this.segment(), index, value); return this; }

        /// {@return `sampledImageIntegerSampleCounts` at the given index}
        /// @param index the index
        public @CType("VkSampleCountFlags") int sampledImageIntegerSampleCountsAt(long index) { return VkPhysicalDeviceLimits.get_sampledImageIntegerSampleCounts(this.segment(), index); }
        /// Sets `sampledImageIntegerSampleCounts` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sampledImageIntegerSampleCountsAt(long index, @CType("VkSampleCountFlags") int value) { VkPhysicalDeviceLimits.set_sampledImageIntegerSampleCounts(this.segment(), index, value); return this; }

        /// {@return `sampledImageDepthSampleCounts` at the given index}
        /// @param index the index
        public @CType("VkSampleCountFlags") int sampledImageDepthSampleCountsAt(long index) { return VkPhysicalDeviceLimits.get_sampledImageDepthSampleCounts(this.segment(), index); }
        /// Sets `sampledImageDepthSampleCounts` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sampledImageDepthSampleCountsAt(long index, @CType("VkSampleCountFlags") int value) { VkPhysicalDeviceLimits.set_sampledImageDepthSampleCounts(this.segment(), index, value); return this; }

        /// {@return `sampledImageStencilSampleCounts` at the given index}
        /// @param index the index
        public @CType("VkSampleCountFlags") int sampledImageStencilSampleCountsAt(long index) { return VkPhysicalDeviceLimits.get_sampledImageStencilSampleCounts(this.segment(), index); }
        /// Sets `sampledImageStencilSampleCounts` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sampledImageStencilSampleCountsAt(long index, @CType("VkSampleCountFlags") int value) { VkPhysicalDeviceLimits.set_sampledImageStencilSampleCounts(this.segment(), index, value); return this; }

        /// {@return `storageImageSampleCounts` at the given index}
        /// @param index the index
        public @CType("VkSampleCountFlags") int storageImageSampleCountsAt(long index) { return VkPhysicalDeviceLimits.get_storageImageSampleCounts(this.segment(), index); }
        /// Sets `storageImageSampleCounts` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer storageImageSampleCountsAt(long index, @CType("VkSampleCountFlags") int value) { VkPhysicalDeviceLimits.set_storageImageSampleCounts(this.segment(), index, value); return this; }

        /// {@return `maxSampleMaskWords` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxSampleMaskWordsAt(long index) { return VkPhysicalDeviceLimits.get_maxSampleMaskWords(this.segment(), index); }
        /// Sets `maxSampleMaskWords` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxSampleMaskWordsAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxSampleMaskWords(this.segment(), index, value); return this; }

        /// {@return `timestampComputeAndGraphics` at the given index}
        /// @param index the index
        public @CType("VkBool32") int timestampComputeAndGraphicsAt(long index) { return VkPhysicalDeviceLimits.get_timestampComputeAndGraphics(this.segment(), index); }
        /// Sets `timestampComputeAndGraphics` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer timestampComputeAndGraphicsAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceLimits.set_timestampComputeAndGraphics(this.segment(), index, value); return this; }

        /// {@return `timestampPeriod` at the given index}
        /// @param index the index
        public @CType("float") float timestampPeriodAt(long index) { return VkPhysicalDeviceLimits.get_timestampPeriod(this.segment(), index); }
        /// Sets `timestampPeriod` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer timestampPeriodAt(long index, @CType("float") float value) { VkPhysicalDeviceLimits.set_timestampPeriod(this.segment(), index, value); return this; }

        /// {@return `maxClipDistances` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxClipDistancesAt(long index) { return VkPhysicalDeviceLimits.get_maxClipDistances(this.segment(), index); }
        /// Sets `maxClipDistances` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxClipDistancesAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxClipDistances(this.segment(), index, value); return this; }

        /// {@return `maxCullDistances` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxCullDistancesAt(long index) { return VkPhysicalDeviceLimits.get_maxCullDistances(this.segment(), index); }
        /// Sets `maxCullDistances` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxCullDistancesAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxCullDistances(this.segment(), index, value); return this; }

        /// {@return `maxCombinedClipAndCullDistances` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxCombinedClipAndCullDistancesAt(long index) { return VkPhysicalDeviceLimits.get_maxCombinedClipAndCullDistances(this.segment(), index); }
        /// Sets `maxCombinedClipAndCullDistances` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxCombinedClipAndCullDistancesAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_maxCombinedClipAndCullDistances(this.segment(), index, value); return this; }

        /// {@return `discreteQueuePriorities` at the given index}
        /// @param index the index
        public @CType("uint32_t") int discreteQueuePrioritiesAt(long index) { return VkPhysicalDeviceLimits.get_discreteQueuePriorities(this.segment(), index); }
        /// Sets `discreteQueuePriorities` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer discreteQueuePrioritiesAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceLimits.set_discreteQueuePriorities(this.segment(), index, value); return this; }

        /// {@return `pointSizeRange` at the given index}
        /// @param index the index
        public @CType("float[2]") java.lang.foreign.MemorySegment pointSizeRangeAt(long index) { return VkPhysicalDeviceLimits.get_pointSizeRange(this.segment(), index); }
        /// Sets `pointSizeRange` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pointSizeRangeAt(long index, @CType("float[2]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceLimits.set_pointSizeRange(this.segment(), index, value); return this; }

        /// {@return `lineWidthRange` at the given index}
        /// @param index the index
        public @CType("float[2]") java.lang.foreign.MemorySegment lineWidthRangeAt(long index) { return VkPhysicalDeviceLimits.get_lineWidthRange(this.segment(), index); }
        /// Sets `lineWidthRange` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer lineWidthRangeAt(long index, @CType("float[2]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceLimits.set_lineWidthRange(this.segment(), index, value); return this; }

        /// {@return `pointSizeGranularity` at the given index}
        /// @param index the index
        public @CType("float") float pointSizeGranularityAt(long index) { return VkPhysicalDeviceLimits.get_pointSizeGranularity(this.segment(), index); }
        /// Sets `pointSizeGranularity` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pointSizeGranularityAt(long index, @CType("float") float value) { VkPhysicalDeviceLimits.set_pointSizeGranularity(this.segment(), index, value); return this; }

        /// {@return `lineWidthGranularity` at the given index}
        /// @param index the index
        public @CType("float") float lineWidthGranularityAt(long index) { return VkPhysicalDeviceLimits.get_lineWidthGranularity(this.segment(), index); }
        /// Sets `lineWidthGranularity` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer lineWidthGranularityAt(long index, @CType("float") float value) { VkPhysicalDeviceLimits.set_lineWidthGranularity(this.segment(), index, value); return this; }

        /// {@return `strictLines` at the given index}
        /// @param index the index
        public @CType("VkBool32") int strictLinesAt(long index) { return VkPhysicalDeviceLimits.get_strictLines(this.segment(), index); }
        /// Sets `strictLines` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer strictLinesAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceLimits.set_strictLines(this.segment(), index, value); return this; }

        /// {@return `standardSampleLocations` at the given index}
        /// @param index the index
        public @CType("VkBool32") int standardSampleLocationsAt(long index) { return VkPhysicalDeviceLimits.get_standardSampleLocations(this.segment(), index); }
        /// Sets `standardSampleLocations` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer standardSampleLocationsAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceLimits.set_standardSampleLocations(this.segment(), index, value); return this; }

        /// {@return `optimalBufferCopyOffsetAlignment` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long optimalBufferCopyOffsetAlignmentAt(long index) { return VkPhysicalDeviceLimits.get_optimalBufferCopyOffsetAlignment(this.segment(), index); }
        /// Sets `optimalBufferCopyOffsetAlignment` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer optimalBufferCopyOffsetAlignmentAt(long index, @CType("VkDeviceSize") long value) { VkPhysicalDeviceLimits.set_optimalBufferCopyOffsetAlignment(this.segment(), index, value); return this; }

        /// {@return `optimalBufferCopyRowPitchAlignment` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long optimalBufferCopyRowPitchAlignmentAt(long index) { return VkPhysicalDeviceLimits.get_optimalBufferCopyRowPitchAlignment(this.segment(), index); }
        /// Sets `optimalBufferCopyRowPitchAlignment` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer optimalBufferCopyRowPitchAlignmentAt(long index, @CType("VkDeviceSize") long value) { VkPhysicalDeviceLimits.set_optimalBufferCopyRowPitchAlignment(this.segment(), index, value); return this; }

        /// {@return `nonCoherentAtomSize` at the given index}
        /// @param index the index
        public @CType("VkDeviceSize") long nonCoherentAtomSizeAt(long index) { return VkPhysicalDeviceLimits.get_nonCoherentAtomSize(this.segment(), index); }
        /// Sets `nonCoherentAtomSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer nonCoherentAtomSizeAt(long index, @CType("VkDeviceSize") long value) { VkPhysicalDeviceLimits.set_nonCoherentAtomSize(this.segment(), index, value); return this; }

    }
}
