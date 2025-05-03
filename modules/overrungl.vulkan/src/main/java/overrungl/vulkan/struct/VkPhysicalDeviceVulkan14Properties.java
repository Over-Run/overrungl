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
//@formatter:off
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkPhysicalDeviceVulkan14Properties {
///     (int) VkStructureType sType;
///     void* pNext;
///     uint32_t lineSubPixelPrecisionBits;
///     uint32_t maxVertexAttribDivisor;
///     (uint32_t) VkBool32 supportsNonZeroFirstInstance;
///     uint32_t maxPushDescriptors;
///     (uint32_t) VkBool32 dynamicRenderingLocalReadDepthStencilAttachments;
///     (uint32_t) VkBool32 dynamicRenderingLocalReadMultisampledAttachments;
///     (uint32_t) VkBool32 earlyFragmentMultisampleCoverageAfterSampleCounting;
///     (uint32_t) VkBool32 earlyFragmentSampleMaskTestBeforeSampleCounting;
///     (uint32_t) VkBool32 depthStencilSwizzleOneSupport;
///     (uint32_t) VkBool32 polygonModePointSize;
///     (uint32_t) VkBool32 nonStrictSinglePixelWideLinesUseParallelogram;
///     (uint32_t) VkBool32 nonStrictWideLinesUseParallelogram;
///     (uint32_t) VkBool32 blockTexelViewCompatibleMultipleLayers;
///     uint32_t maxCombinedImageSamplerDescriptorCount;
///     (uint32_t) VkBool32 fragmentShadingRateClampCombinerInputs;
///     (int) VkPipelineRobustnessBufferBehavior defaultRobustnessStorageBuffers;
///     (int) VkPipelineRobustnessBufferBehavior defaultRobustnessUniformBuffers;
///     (int) VkPipelineRobustnessBufferBehavior defaultRobustnessVertexInputs;
///     (int) VkPipelineRobustnessImageBehavior defaultRobustnessImages;
///     uint32_t copySrcLayoutCount;
///     VkImageLayout* pCopySrcLayouts;
///     uint32_t copyDstLayoutCount;
///     VkImageLayout* pCopyDstLayouts;
///     uint8_t optimalTilingLayoutUUID[16];
///     (uint32_t) VkBool32 identicalMemoryTypeRequirements;
/// };
/// ```
public sealed class VkPhysicalDeviceVulkan14Properties extends GroupType {
    /// The struct layout of `VkPhysicalDeviceVulkan14Properties`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
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
        MemoryLayout.sequenceLayout(16, ValueLayout.JAVA_BYTE).withName("optimalTilingLayoutUUID"),
        ValueLayout.JAVA_INT.withName("identicalMemoryTypeRequirements")
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
    /// The byte offset of `lineSubPixelPrecisionBits`.
    public static final long OFFSET_lineSubPixelPrecisionBits = LAYOUT.byteOffset(PathElement.groupElement("lineSubPixelPrecisionBits"));
    /// The memory layout of `lineSubPixelPrecisionBits`.
    public static final MemoryLayout LAYOUT_lineSubPixelPrecisionBits = LAYOUT.select(PathElement.groupElement("lineSubPixelPrecisionBits"));
    /// The [VarHandle] of `lineSubPixelPrecisionBits` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_lineSubPixelPrecisionBits = LAYOUT.arrayElementVarHandle(PathElement.groupElement("lineSubPixelPrecisionBits"));
    /// The byte offset of `maxVertexAttribDivisor`.
    public static final long OFFSET_maxVertexAttribDivisor = LAYOUT.byteOffset(PathElement.groupElement("maxVertexAttribDivisor"));
    /// The memory layout of `maxVertexAttribDivisor`.
    public static final MemoryLayout LAYOUT_maxVertexAttribDivisor = LAYOUT.select(PathElement.groupElement("maxVertexAttribDivisor"));
    /// The [VarHandle] of `maxVertexAttribDivisor` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxVertexAttribDivisor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxVertexAttribDivisor"));
    /// The byte offset of `supportsNonZeroFirstInstance`.
    public static final long OFFSET_supportsNonZeroFirstInstance = LAYOUT.byteOffset(PathElement.groupElement("supportsNonZeroFirstInstance"));
    /// The memory layout of `supportsNonZeroFirstInstance`.
    public static final MemoryLayout LAYOUT_supportsNonZeroFirstInstance = LAYOUT.select(PathElement.groupElement("supportsNonZeroFirstInstance"));
    /// The [VarHandle] of `supportsNonZeroFirstInstance` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_supportsNonZeroFirstInstance = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportsNonZeroFirstInstance"));
    /// The byte offset of `maxPushDescriptors`.
    public static final long OFFSET_maxPushDescriptors = LAYOUT.byteOffset(PathElement.groupElement("maxPushDescriptors"));
    /// The memory layout of `maxPushDescriptors`.
    public static final MemoryLayout LAYOUT_maxPushDescriptors = LAYOUT.select(PathElement.groupElement("maxPushDescriptors"));
    /// The [VarHandle] of `maxPushDescriptors` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxPushDescriptors = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPushDescriptors"));
    /// The byte offset of `dynamicRenderingLocalReadDepthStencilAttachments`.
    public static final long OFFSET_dynamicRenderingLocalReadDepthStencilAttachments = LAYOUT.byteOffset(PathElement.groupElement("dynamicRenderingLocalReadDepthStencilAttachments"));
    /// The memory layout of `dynamicRenderingLocalReadDepthStencilAttachments`.
    public static final MemoryLayout LAYOUT_dynamicRenderingLocalReadDepthStencilAttachments = LAYOUT.select(PathElement.groupElement("dynamicRenderingLocalReadDepthStencilAttachments"));
    /// The [VarHandle] of `dynamicRenderingLocalReadDepthStencilAttachments` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dynamicRenderingLocalReadDepthStencilAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dynamicRenderingLocalReadDepthStencilAttachments"));
    /// The byte offset of `dynamicRenderingLocalReadMultisampledAttachments`.
    public static final long OFFSET_dynamicRenderingLocalReadMultisampledAttachments = LAYOUT.byteOffset(PathElement.groupElement("dynamicRenderingLocalReadMultisampledAttachments"));
    /// The memory layout of `dynamicRenderingLocalReadMultisampledAttachments`.
    public static final MemoryLayout LAYOUT_dynamicRenderingLocalReadMultisampledAttachments = LAYOUT.select(PathElement.groupElement("dynamicRenderingLocalReadMultisampledAttachments"));
    /// The [VarHandle] of `dynamicRenderingLocalReadMultisampledAttachments` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dynamicRenderingLocalReadMultisampledAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dynamicRenderingLocalReadMultisampledAttachments"));
    /// The byte offset of `earlyFragmentMultisampleCoverageAfterSampleCounting`.
    public static final long OFFSET_earlyFragmentMultisampleCoverageAfterSampleCounting = LAYOUT.byteOffset(PathElement.groupElement("earlyFragmentMultisampleCoverageAfterSampleCounting"));
    /// The memory layout of `earlyFragmentMultisampleCoverageAfterSampleCounting`.
    public static final MemoryLayout LAYOUT_earlyFragmentMultisampleCoverageAfterSampleCounting = LAYOUT.select(PathElement.groupElement("earlyFragmentMultisampleCoverageAfterSampleCounting"));
    /// The [VarHandle] of `earlyFragmentMultisampleCoverageAfterSampleCounting` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_earlyFragmentMultisampleCoverageAfterSampleCounting = LAYOUT.arrayElementVarHandle(PathElement.groupElement("earlyFragmentMultisampleCoverageAfterSampleCounting"));
    /// The byte offset of `earlyFragmentSampleMaskTestBeforeSampleCounting`.
    public static final long OFFSET_earlyFragmentSampleMaskTestBeforeSampleCounting = LAYOUT.byteOffset(PathElement.groupElement("earlyFragmentSampleMaskTestBeforeSampleCounting"));
    /// The memory layout of `earlyFragmentSampleMaskTestBeforeSampleCounting`.
    public static final MemoryLayout LAYOUT_earlyFragmentSampleMaskTestBeforeSampleCounting = LAYOUT.select(PathElement.groupElement("earlyFragmentSampleMaskTestBeforeSampleCounting"));
    /// The [VarHandle] of `earlyFragmentSampleMaskTestBeforeSampleCounting` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_earlyFragmentSampleMaskTestBeforeSampleCounting = LAYOUT.arrayElementVarHandle(PathElement.groupElement("earlyFragmentSampleMaskTestBeforeSampleCounting"));
    /// The byte offset of `depthStencilSwizzleOneSupport`.
    public static final long OFFSET_depthStencilSwizzleOneSupport = LAYOUT.byteOffset(PathElement.groupElement("depthStencilSwizzleOneSupport"));
    /// The memory layout of `depthStencilSwizzleOneSupport`.
    public static final MemoryLayout LAYOUT_depthStencilSwizzleOneSupport = LAYOUT.select(PathElement.groupElement("depthStencilSwizzleOneSupport"));
    /// The [VarHandle] of `depthStencilSwizzleOneSupport` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_depthStencilSwizzleOneSupport = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthStencilSwizzleOneSupport"));
    /// The byte offset of `polygonModePointSize`.
    public static final long OFFSET_polygonModePointSize = LAYOUT.byteOffset(PathElement.groupElement("polygonModePointSize"));
    /// The memory layout of `polygonModePointSize`.
    public static final MemoryLayout LAYOUT_polygonModePointSize = LAYOUT.select(PathElement.groupElement("polygonModePointSize"));
    /// The [VarHandle] of `polygonModePointSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_polygonModePointSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("polygonModePointSize"));
    /// The byte offset of `nonStrictSinglePixelWideLinesUseParallelogram`.
    public static final long OFFSET_nonStrictSinglePixelWideLinesUseParallelogram = LAYOUT.byteOffset(PathElement.groupElement("nonStrictSinglePixelWideLinesUseParallelogram"));
    /// The memory layout of `nonStrictSinglePixelWideLinesUseParallelogram`.
    public static final MemoryLayout LAYOUT_nonStrictSinglePixelWideLinesUseParallelogram = LAYOUT.select(PathElement.groupElement("nonStrictSinglePixelWideLinesUseParallelogram"));
    /// The [VarHandle] of `nonStrictSinglePixelWideLinesUseParallelogram` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_nonStrictSinglePixelWideLinesUseParallelogram = LAYOUT.arrayElementVarHandle(PathElement.groupElement("nonStrictSinglePixelWideLinesUseParallelogram"));
    /// The byte offset of `nonStrictWideLinesUseParallelogram`.
    public static final long OFFSET_nonStrictWideLinesUseParallelogram = LAYOUT.byteOffset(PathElement.groupElement("nonStrictWideLinesUseParallelogram"));
    /// The memory layout of `nonStrictWideLinesUseParallelogram`.
    public static final MemoryLayout LAYOUT_nonStrictWideLinesUseParallelogram = LAYOUT.select(PathElement.groupElement("nonStrictWideLinesUseParallelogram"));
    /// The [VarHandle] of `nonStrictWideLinesUseParallelogram` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_nonStrictWideLinesUseParallelogram = LAYOUT.arrayElementVarHandle(PathElement.groupElement("nonStrictWideLinesUseParallelogram"));
    /// The byte offset of `blockTexelViewCompatibleMultipleLayers`.
    public static final long OFFSET_blockTexelViewCompatibleMultipleLayers = LAYOUT.byteOffset(PathElement.groupElement("blockTexelViewCompatibleMultipleLayers"));
    /// The memory layout of `blockTexelViewCompatibleMultipleLayers`.
    public static final MemoryLayout LAYOUT_blockTexelViewCompatibleMultipleLayers = LAYOUT.select(PathElement.groupElement("blockTexelViewCompatibleMultipleLayers"));
    /// The [VarHandle] of `blockTexelViewCompatibleMultipleLayers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_blockTexelViewCompatibleMultipleLayers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("blockTexelViewCompatibleMultipleLayers"));
    /// The byte offset of `maxCombinedImageSamplerDescriptorCount`.
    public static final long OFFSET_maxCombinedImageSamplerDescriptorCount = LAYOUT.byteOffset(PathElement.groupElement("maxCombinedImageSamplerDescriptorCount"));
    /// The memory layout of `maxCombinedImageSamplerDescriptorCount`.
    public static final MemoryLayout LAYOUT_maxCombinedImageSamplerDescriptorCount = LAYOUT.select(PathElement.groupElement("maxCombinedImageSamplerDescriptorCount"));
    /// The [VarHandle] of `maxCombinedImageSamplerDescriptorCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxCombinedImageSamplerDescriptorCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxCombinedImageSamplerDescriptorCount"));
    /// The byte offset of `fragmentShadingRateClampCombinerInputs`.
    public static final long OFFSET_fragmentShadingRateClampCombinerInputs = LAYOUT.byteOffset(PathElement.groupElement("fragmentShadingRateClampCombinerInputs"));
    /// The memory layout of `fragmentShadingRateClampCombinerInputs`.
    public static final MemoryLayout LAYOUT_fragmentShadingRateClampCombinerInputs = LAYOUT.select(PathElement.groupElement("fragmentShadingRateClampCombinerInputs"));
    /// The [VarHandle] of `fragmentShadingRateClampCombinerInputs` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_fragmentShadingRateClampCombinerInputs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentShadingRateClampCombinerInputs"));
    /// The byte offset of `defaultRobustnessStorageBuffers`.
    public static final long OFFSET_defaultRobustnessStorageBuffers = LAYOUT.byteOffset(PathElement.groupElement("defaultRobustnessStorageBuffers"));
    /// The memory layout of `defaultRobustnessStorageBuffers`.
    public static final MemoryLayout LAYOUT_defaultRobustnessStorageBuffers = LAYOUT.select(PathElement.groupElement("defaultRobustnessStorageBuffers"));
    /// The [VarHandle] of `defaultRobustnessStorageBuffers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_defaultRobustnessStorageBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("defaultRobustnessStorageBuffers"));
    /// The byte offset of `defaultRobustnessUniformBuffers`.
    public static final long OFFSET_defaultRobustnessUniformBuffers = LAYOUT.byteOffset(PathElement.groupElement("defaultRobustnessUniformBuffers"));
    /// The memory layout of `defaultRobustnessUniformBuffers`.
    public static final MemoryLayout LAYOUT_defaultRobustnessUniformBuffers = LAYOUT.select(PathElement.groupElement("defaultRobustnessUniformBuffers"));
    /// The [VarHandle] of `defaultRobustnessUniformBuffers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_defaultRobustnessUniformBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("defaultRobustnessUniformBuffers"));
    /// The byte offset of `defaultRobustnessVertexInputs`.
    public static final long OFFSET_defaultRobustnessVertexInputs = LAYOUT.byteOffset(PathElement.groupElement("defaultRobustnessVertexInputs"));
    /// The memory layout of `defaultRobustnessVertexInputs`.
    public static final MemoryLayout LAYOUT_defaultRobustnessVertexInputs = LAYOUT.select(PathElement.groupElement("defaultRobustnessVertexInputs"));
    /// The [VarHandle] of `defaultRobustnessVertexInputs` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_defaultRobustnessVertexInputs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("defaultRobustnessVertexInputs"));
    /// The byte offset of `defaultRobustnessImages`.
    public static final long OFFSET_defaultRobustnessImages = LAYOUT.byteOffset(PathElement.groupElement("defaultRobustnessImages"));
    /// The memory layout of `defaultRobustnessImages`.
    public static final MemoryLayout LAYOUT_defaultRobustnessImages = LAYOUT.select(PathElement.groupElement("defaultRobustnessImages"));
    /// The [VarHandle] of `defaultRobustnessImages` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_defaultRobustnessImages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("defaultRobustnessImages"));
    /// The byte offset of `copySrcLayoutCount`.
    public static final long OFFSET_copySrcLayoutCount = LAYOUT.byteOffset(PathElement.groupElement("copySrcLayoutCount"));
    /// The memory layout of `copySrcLayoutCount`.
    public static final MemoryLayout LAYOUT_copySrcLayoutCount = LAYOUT.select(PathElement.groupElement("copySrcLayoutCount"));
    /// The [VarHandle] of `copySrcLayoutCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_copySrcLayoutCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("copySrcLayoutCount"));
    /// The byte offset of `pCopySrcLayouts`.
    public static final long OFFSET_pCopySrcLayouts = LAYOUT.byteOffset(PathElement.groupElement("pCopySrcLayouts"));
    /// The memory layout of `pCopySrcLayouts`.
    public static final MemoryLayout LAYOUT_pCopySrcLayouts = LAYOUT.select(PathElement.groupElement("pCopySrcLayouts"));
    /// The [VarHandle] of `pCopySrcLayouts` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pCopySrcLayouts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCopySrcLayouts"));
    /// The byte offset of `copyDstLayoutCount`.
    public static final long OFFSET_copyDstLayoutCount = LAYOUT.byteOffset(PathElement.groupElement("copyDstLayoutCount"));
    /// The memory layout of `copyDstLayoutCount`.
    public static final MemoryLayout LAYOUT_copyDstLayoutCount = LAYOUT.select(PathElement.groupElement("copyDstLayoutCount"));
    /// The [VarHandle] of `copyDstLayoutCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_copyDstLayoutCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("copyDstLayoutCount"));
    /// The byte offset of `pCopyDstLayouts`.
    public static final long OFFSET_pCopyDstLayouts = LAYOUT.byteOffset(PathElement.groupElement("pCopyDstLayouts"));
    /// The memory layout of `pCopyDstLayouts`.
    public static final MemoryLayout LAYOUT_pCopyDstLayouts = LAYOUT.select(PathElement.groupElement("pCopyDstLayouts"));
    /// The [VarHandle] of `pCopyDstLayouts` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pCopyDstLayouts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCopyDstLayouts"));
    /// The byte offset of `optimalTilingLayoutUUID`.
    public static final long OFFSET_optimalTilingLayoutUUID = LAYOUT.byteOffset(PathElement.groupElement("optimalTilingLayoutUUID"));
    /// The memory layout of `optimalTilingLayoutUUID`.
    public static final MemoryLayout LAYOUT_optimalTilingLayoutUUID = LAYOUT.select(PathElement.groupElement("optimalTilingLayoutUUID"));
    /// The [VarHandle] of `optimalTilingLayoutUUID` of type `(MemorySegment base, long baseOffset, long index, long index0)MemorySegment`.
    public static final VarHandle VH_optimalTilingLayoutUUID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("optimalTilingLayoutUUID"), PathElement.sequenceElement());
    /// The byte offset of `identicalMemoryTypeRequirements`.
    public static final long OFFSET_identicalMemoryTypeRequirements = LAYOUT.byteOffset(PathElement.groupElement("identicalMemoryTypeRequirements"));
    /// The memory layout of `identicalMemoryTypeRequirements`.
    public static final MemoryLayout LAYOUT_identicalMemoryTypeRequirements = LAYOUT.select(PathElement.groupElement("identicalMemoryTypeRequirements"));
    /// The [VarHandle] of `identicalMemoryTypeRequirements` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_identicalMemoryTypeRequirements = LAYOUT.arrayElementVarHandle(PathElement.groupElement("identicalMemoryTypeRequirements"));

    /// Creates `VkPhysicalDeviceVulkan14Properties` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceVulkan14Properties(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceVulkan14Properties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkPhysicalDeviceVulkan14Properties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVulkan14Properties ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkan14Properties(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkPhysicalDeviceVulkan14Properties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkPhysicalDeviceVulkan14Properties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceVulkan14Properties`
    public static VkPhysicalDeviceVulkan14Properties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceVulkan14Properties(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceVulkan14Properties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceVulkan14Properties`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties copyFrom(VkPhysicalDeviceVulkan14Properties src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

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
    public VkPhysicalDeviceVulkan14Properties sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkPhysicalDeviceVulkan14Properties pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `lineSubPixelPrecisionBits` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int lineSubPixelPrecisionBits(MemorySegment segment, long index) { return (int) VH_lineSubPixelPrecisionBits.get(segment, 0L, index); }
    /// {@return `lineSubPixelPrecisionBits`}
    public int lineSubPixelPrecisionBits() { return lineSubPixelPrecisionBits(this.segment(), 0L); }
    /// Sets `lineSubPixelPrecisionBits` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void lineSubPixelPrecisionBits(MemorySegment segment, long index, int value) { VH_lineSubPixelPrecisionBits.set(segment, 0L, index, value); }
    /// Sets `lineSubPixelPrecisionBits` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties lineSubPixelPrecisionBits(int value) { lineSubPixelPrecisionBits(this.segment(), 0L, value); return this; }

    /// {@return `maxVertexAttribDivisor` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxVertexAttribDivisor(MemorySegment segment, long index) { return (int) VH_maxVertexAttribDivisor.get(segment, 0L, index); }
    /// {@return `maxVertexAttribDivisor`}
    public int maxVertexAttribDivisor() { return maxVertexAttribDivisor(this.segment(), 0L); }
    /// Sets `maxVertexAttribDivisor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxVertexAttribDivisor(MemorySegment segment, long index, int value) { VH_maxVertexAttribDivisor.set(segment, 0L, index, value); }
    /// Sets `maxVertexAttribDivisor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties maxVertexAttribDivisor(int value) { maxVertexAttribDivisor(this.segment(), 0L, value); return this; }

    /// {@return `supportsNonZeroFirstInstance` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int supportsNonZeroFirstInstance(MemorySegment segment, long index) { return (int) VH_supportsNonZeroFirstInstance.get(segment, 0L, index); }
    /// {@return `supportsNonZeroFirstInstance`}
    public int supportsNonZeroFirstInstance() { return supportsNonZeroFirstInstance(this.segment(), 0L); }
    /// Sets `supportsNonZeroFirstInstance` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void supportsNonZeroFirstInstance(MemorySegment segment, long index, int value) { VH_supportsNonZeroFirstInstance.set(segment, 0L, index, value); }
    /// Sets `supportsNonZeroFirstInstance` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties supportsNonZeroFirstInstance(int value) { supportsNonZeroFirstInstance(this.segment(), 0L, value); return this; }

    /// {@return `maxPushDescriptors` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxPushDescriptors(MemorySegment segment, long index) { return (int) VH_maxPushDescriptors.get(segment, 0L, index); }
    /// {@return `maxPushDescriptors`}
    public int maxPushDescriptors() { return maxPushDescriptors(this.segment(), 0L); }
    /// Sets `maxPushDescriptors` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxPushDescriptors(MemorySegment segment, long index, int value) { VH_maxPushDescriptors.set(segment, 0L, index, value); }
    /// Sets `maxPushDescriptors` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties maxPushDescriptors(int value) { maxPushDescriptors(this.segment(), 0L, value); return this; }

    /// {@return `dynamicRenderingLocalReadDepthStencilAttachments` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int dynamicRenderingLocalReadDepthStencilAttachments(MemorySegment segment, long index) { return (int) VH_dynamicRenderingLocalReadDepthStencilAttachments.get(segment, 0L, index); }
    /// {@return `dynamicRenderingLocalReadDepthStencilAttachments`}
    public int dynamicRenderingLocalReadDepthStencilAttachments() { return dynamicRenderingLocalReadDepthStencilAttachments(this.segment(), 0L); }
    /// Sets `dynamicRenderingLocalReadDepthStencilAttachments` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dynamicRenderingLocalReadDepthStencilAttachments(MemorySegment segment, long index, int value) { VH_dynamicRenderingLocalReadDepthStencilAttachments.set(segment, 0L, index, value); }
    /// Sets `dynamicRenderingLocalReadDepthStencilAttachments` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties dynamicRenderingLocalReadDepthStencilAttachments(int value) { dynamicRenderingLocalReadDepthStencilAttachments(this.segment(), 0L, value); return this; }

    /// {@return `dynamicRenderingLocalReadMultisampledAttachments` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int dynamicRenderingLocalReadMultisampledAttachments(MemorySegment segment, long index) { return (int) VH_dynamicRenderingLocalReadMultisampledAttachments.get(segment, 0L, index); }
    /// {@return `dynamicRenderingLocalReadMultisampledAttachments`}
    public int dynamicRenderingLocalReadMultisampledAttachments() { return dynamicRenderingLocalReadMultisampledAttachments(this.segment(), 0L); }
    /// Sets `dynamicRenderingLocalReadMultisampledAttachments` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dynamicRenderingLocalReadMultisampledAttachments(MemorySegment segment, long index, int value) { VH_dynamicRenderingLocalReadMultisampledAttachments.set(segment, 0L, index, value); }
    /// Sets `dynamicRenderingLocalReadMultisampledAttachments` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties dynamicRenderingLocalReadMultisampledAttachments(int value) { dynamicRenderingLocalReadMultisampledAttachments(this.segment(), 0L, value); return this; }

    /// {@return `earlyFragmentMultisampleCoverageAfterSampleCounting` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int earlyFragmentMultisampleCoverageAfterSampleCounting(MemorySegment segment, long index) { return (int) VH_earlyFragmentMultisampleCoverageAfterSampleCounting.get(segment, 0L, index); }
    /// {@return `earlyFragmentMultisampleCoverageAfterSampleCounting`}
    public int earlyFragmentMultisampleCoverageAfterSampleCounting() { return earlyFragmentMultisampleCoverageAfterSampleCounting(this.segment(), 0L); }
    /// Sets `earlyFragmentMultisampleCoverageAfterSampleCounting` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void earlyFragmentMultisampleCoverageAfterSampleCounting(MemorySegment segment, long index, int value) { VH_earlyFragmentMultisampleCoverageAfterSampleCounting.set(segment, 0L, index, value); }
    /// Sets `earlyFragmentMultisampleCoverageAfterSampleCounting` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties earlyFragmentMultisampleCoverageAfterSampleCounting(int value) { earlyFragmentMultisampleCoverageAfterSampleCounting(this.segment(), 0L, value); return this; }

    /// {@return `earlyFragmentSampleMaskTestBeforeSampleCounting` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int earlyFragmentSampleMaskTestBeforeSampleCounting(MemorySegment segment, long index) { return (int) VH_earlyFragmentSampleMaskTestBeforeSampleCounting.get(segment, 0L, index); }
    /// {@return `earlyFragmentSampleMaskTestBeforeSampleCounting`}
    public int earlyFragmentSampleMaskTestBeforeSampleCounting() { return earlyFragmentSampleMaskTestBeforeSampleCounting(this.segment(), 0L); }
    /// Sets `earlyFragmentSampleMaskTestBeforeSampleCounting` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void earlyFragmentSampleMaskTestBeforeSampleCounting(MemorySegment segment, long index, int value) { VH_earlyFragmentSampleMaskTestBeforeSampleCounting.set(segment, 0L, index, value); }
    /// Sets `earlyFragmentSampleMaskTestBeforeSampleCounting` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties earlyFragmentSampleMaskTestBeforeSampleCounting(int value) { earlyFragmentSampleMaskTestBeforeSampleCounting(this.segment(), 0L, value); return this; }

    /// {@return `depthStencilSwizzleOneSupport` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int depthStencilSwizzleOneSupport(MemorySegment segment, long index) { return (int) VH_depthStencilSwizzleOneSupport.get(segment, 0L, index); }
    /// {@return `depthStencilSwizzleOneSupport`}
    public int depthStencilSwizzleOneSupport() { return depthStencilSwizzleOneSupport(this.segment(), 0L); }
    /// Sets `depthStencilSwizzleOneSupport` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void depthStencilSwizzleOneSupport(MemorySegment segment, long index, int value) { VH_depthStencilSwizzleOneSupport.set(segment, 0L, index, value); }
    /// Sets `depthStencilSwizzleOneSupport` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties depthStencilSwizzleOneSupport(int value) { depthStencilSwizzleOneSupport(this.segment(), 0L, value); return this; }

    /// {@return `polygonModePointSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int polygonModePointSize(MemorySegment segment, long index) { return (int) VH_polygonModePointSize.get(segment, 0L, index); }
    /// {@return `polygonModePointSize`}
    public int polygonModePointSize() { return polygonModePointSize(this.segment(), 0L); }
    /// Sets `polygonModePointSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void polygonModePointSize(MemorySegment segment, long index, int value) { VH_polygonModePointSize.set(segment, 0L, index, value); }
    /// Sets `polygonModePointSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties polygonModePointSize(int value) { polygonModePointSize(this.segment(), 0L, value); return this; }

    /// {@return `nonStrictSinglePixelWideLinesUseParallelogram` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int nonStrictSinglePixelWideLinesUseParallelogram(MemorySegment segment, long index) { return (int) VH_nonStrictSinglePixelWideLinesUseParallelogram.get(segment, 0L, index); }
    /// {@return `nonStrictSinglePixelWideLinesUseParallelogram`}
    public int nonStrictSinglePixelWideLinesUseParallelogram() { return nonStrictSinglePixelWideLinesUseParallelogram(this.segment(), 0L); }
    /// Sets `nonStrictSinglePixelWideLinesUseParallelogram` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void nonStrictSinglePixelWideLinesUseParallelogram(MemorySegment segment, long index, int value) { VH_nonStrictSinglePixelWideLinesUseParallelogram.set(segment, 0L, index, value); }
    /// Sets `nonStrictSinglePixelWideLinesUseParallelogram` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties nonStrictSinglePixelWideLinesUseParallelogram(int value) { nonStrictSinglePixelWideLinesUseParallelogram(this.segment(), 0L, value); return this; }

    /// {@return `nonStrictWideLinesUseParallelogram` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int nonStrictWideLinesUseParallelogram(MemorySegment segment, long index) { return (int) VH_nonStrictWideLinesUseParallelogram.get(segment, 0L, index); }
    /// {@return `nonStrictWideLinesUseParallelogram`}
    public int nonStrictWideLinesUseParallelogram() { return nonStrictWideLinesUseParallelogram(this.segment(), 0L); }
    /// Sets `nonStrictWideLinesUseParallelogram` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void nonStrictWideLinesUseParallelogram(MemorySegment segment, long index, int value) { VH_nonStrictWideLinesUseParallelogram.set(segment, 0L, index, value); }
    /// Sets `nonStrictWideLinesUseParallelogram` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties nonStrictWideLinesUseParallelogram(int value) { nonStrictWideLinesUseParallelogram(this.segment(), 0L, value); return this; }

    /// {@return `blockTexelViewCompatibleMultipleLayers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int blockTexelViewCompatibleMultipleLayers(MemorySegment segment, long index) { return (int) VH_blockTexelViewCompatibleMultipleLayers.get(segment, 0L, index); }
    /// {@return `blockTexelViewCompatibleMultipleLayers`}
    public int blockTexelViewCompatibleMultipleLayers() { return blockTexelViewCompatibleMultipleLayers(this.segment(), 0L); }
    /// Sets `blockTexelViewCompatibleMultipleLayers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void blockTexelViewCompatibleMultipleLayers(MemorySegment segment, long index, int value) { VH_blockTexelViewCompatibleMultipleLayers.set(segment, 0L, index, value); }
    /// Sets `blockTexelViewCompatibleMultipleLayers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties blockTexelViewCompatibleMultipleLayers(int value) { blockTexelViewCompatibleMultipleLayers(this.segment(), 0L, value); return this; }

    /// {@return `maxCombinedImageSamplerDescriptorCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxCombinedImageSamplerDescriptorCount(MemorySegment segment, long index) { return (int) VH_maxCombinedImageSamplerDescriptorCount.get(segment, 0L, index); }
    /// {@return `maxCombinedImageSamplerDescriptorCount`}
    public int maxCombinedImageSamplerDescriptorCount() { return maxCombinedImageSamplerDescriptorCount(this.segment(), 0L); }
    /// Sets `maxCombinedImageSamplerDescriptorCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxCombinedImageSamplerDescriptorCount(MemorySegment segment, long index, int value) { VH_maxCombinedImageSamplerDescriptorCount.set(segment, 0L, index, value); }
    /// Sets `maxCombinedImageSamplerDescriptorCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties maxCombinedImageSamplerDescriptorCount(int value) { maxCombinedImageSamplerDescriptorCount(this.segment(), 0L, value); return this; }

    /// {@return `fragmentShadingRateClampCombinerInputs` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int fragmentShadingRateClampCombinerInputs(MemorySegment segment, long index) { return (int) VH_fragmentShadingRateClampCombinerInputs.get(segment, 0L, index); }
    /// {@return `fragmentShadingRateClampCombinerInputs`}
    public int fragmentShadingRateClampCombinerInputs() { return fragmentShadingRateClampCombinerInputs(this.segment(), 0L); }
    /// Sets `fragmentShadingRateClampCombinerInputs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void fragmentShadingRateClampCombinerInputs(MemorySegment segment, long index, int value) { VH_fragmentShadingRateClampCombinerInputs.set(segment, 0L, index, value); }
    /// Sets `fragmentShadingRateClampCombinerInputs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties fragmentShadingRateClampCombinerInputs(int value) { fragmentShadingRateClampCombinerInputs(this.segment(), 0L, value); return this; }

    /// {@return `defaultRobustnessStorageBuffers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int defaultRobustnessStorageBuffers(MemorySegment segment, long index) { return (int) VH_defaultRobustnessStorageBuffers.get(segment, 0L, index); }
    /// {@return `defaultRobustnessStorageBuffers`}
    public int defaultRobustnessStorageBuffers() { return defaultRobustnessStorageBuffers(this.segment(), 0L); }
    /// Sets `defaultRobustnessStorageBuffers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void defaultRobustnessStorageBuffers(MemorySegment segment, long index, int value) { VH_defaultRobustnessStorageBuffers.set(segment, 0L, index, value); }
    /// Sets `defaultRobustnessStorageBuffers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties defaultRobustnessStorageBuffers(int value) { defaultRobustnessStorageBuffers(this.segment(), 0L, value); return this; }

    /// {@return `defaultRobustnessUniformBuffers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int defaultRobustnessUniformBuffers(MemorySegment segment, long index) { return (int) VH_defaultRobustnessUniformBuffers.get(segment, 0L, index); }
    /// {@return `defaultRobustnessUniformBuffers`}
    public int defaultRobustnessUniformBuffers() { return defaultRobustnessUniformBuffers(this.segment(), 0L); }
    /// Sets `defaultRobustnessUniformBuffers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void defaultRobustnessUniformBuffers(MemorySegment segment, long index, int value) { VH_defaultRobustnessUniformBuffers.set(segment, 0L, index, value); }
    /// Sets `defaultRobustnessUniformBuffers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties defaultRobustnessUniformBuffers(int value) { defaultRobustnessUniformBuffers(this.segment(), 0L, value); return this; }

    /// {@return `defaultRobustnessVertexInputs` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int defaultRobustnessVertexInputs(MemorySegment segment, long index) { return (int) VH_defaultRobustnessVertexInputs.get(segment, 0L, index); }
    /// {@return `defaultRobustnessVertexInputs`}
    public int defaultRobustnessVertexInputs() { return defaultRobustnessVertexInputs(this.segment(), 0L); }
    /// Sets `defaultRobustnessVertexInputs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void defaultRobustnessVertexInputs(MemorySegment segment, long index, int value) { VH_defaultRobustnessVertexInputs.set(segment, 0L, index, value); }
    /// Sets `defaultRobustnessVertexInputs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties defaultRobustnessVertexInputs(int value) { defaultRobustnessVertexInputs(this.segment(), 0L, value); return this; }

    /// {@return `defaultRobustnessImages` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int defaultRobustnessImages(MemorySegment segment, long index) { return (int) VH_defaultRobustnessImages.get(segment, 0L, index); }
    /// {@return `defaultRobustnessImages`}
    public int defaultRobustnessImages() { return defaultRobustnessImages(this.segment(), 0L); }
    /// Sets `defaultRobustnessImages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void defaultRobustnessImages(MemorySegment segment, long index, int value) { VH_defaultRobustnessImages.set(segment, 0L, index, value); }
    /// Sets `defaultRobustnessImages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties defaultRobustnessImages(int value) { defaultRobustnessImages(this.segment(), 0L, value); return this; }

    /// {@return `copySrcLayoutCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int copySrcLayoutCount(MemorySegment segment, long index) { return (int) VH_copySrcLayoutCount.get(segment, 0L, index); }
    /// {@return `copySrcLayoutCount`}
    public int copySrcLayoutCount() { return copySrcLayoutCount(this.segment(), 0L); }
    /// Sets `copySrcLayoutCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void copySrcLayoutCount(MemorySegment segment, long index, int value) { VH_copySrcLayoutCount.set(segment, 0L, index, value); }
    /// Sets `copySrcLayoutCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties copySrcLayoutCount(int value) { copySrcLayoutCount(this.segment(), 0L, value); return this; }

    /// {@return `pCopySrcLayouts` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pCopySrcLayouts(MemorySegment segment, long index) { return (MemorySegment) VH_pCopySrcLayouts.get(segment, 0L, index); }
    /// {@return `pCopySrcLayouts`}
    public MemorySegment pCopySrcLayouts() { return pCopySrcLayouts(this.segment(), 0L); }
    /// Sets `pCopySrcLayouts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pCopySrcLayouts(MemorySegment segment, long index, MemorySegment value) { VH_pCopySrcLayouts.set(segment, 0L, index, value); }
    /// Sets `pCopySrcLayouts` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties pCopySrcLayouts(MemorySegment value) { pCopySrcLayouts(this.segment(), 0L, value); return this; }

    /// {@return `copyDstLayoutCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int copyDstLayoutCount(MemorySegment segment, long index) { return (int) VH_copyDstLayoutCount.get(segment, 0L, index); }
    /// {@return `copyDstLayoutCount`}
    public int copyDstLayoutCount() { return copyDstLayoutCount(this.segment(), 0L); }
    /// Sets `copyDstLayoutCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void copyDstLayoutCount(MemorySegment segment, long index, int value) { VH_copyDstLayoutCount.set(segment, 0L, index, value); }
    /// Sets `copyDstLayoutCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties copyDstLayoutCount(int value) { copyDstLayoutCount(this.segment(), 0L, value); return this; }

    /// {@return `pCopyDstLayouts` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pCopyDstLayouts(MemorySegment segment, long index) { return (MemorySegment) VH_pCopyDstLayouts.get(segment, 0L, index); }
    /// {@return `pCopyDstLayouts`}
    public MemorySegment pCopyDstLayouts() { return pCopyDstLayouts(this.segment(), 0L); }
    /// Sets `pCopyDstLayouts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pCopyDstLayouts(MemorySegment segment, long index, MemorySegment value) { VH_pCopyDstLayouts.set(segment, 0L, index, value); }
    /// Sets `pCopyDstLayouts` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties pCopyDstLayouts(MemorySegment value) { pCopyDstLayouts(this.segment(), 0L, value); return this; }

    /// {@return `optimalTilingLayoutUUID` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment optimalTilingLayoutUUID(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_optimalTilingLayoutUUID, index), LAYOUT_optimalTilingLayoutUUID); }
    /// {@return `optimalTilingLayoutUUID` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    public static byte optimalTilingLayoutUUID(MemorySegment segment, long index, long index0) { return (byte) VH_optimalTilingLayoutUUID.get(segment, 0L, index, index0); }
    /// {@return `optimalTilingLayoutUUID`}
    public MemorySegment optimalTilingLayoutUUID() { return optimalTilingLayoutUUID(this.segment(), 0L); }
    /// {@return `optimalTilingLayoutUUID`}
    /// @param index0 the Index 0 of the array
    public byte optimalTilingLayoutUUID(long index0) { return optimalTilingLayoutUUID(this.segment(), 0L, index0); }
    /// Sets `optimalTilingLayoutUUID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void optimalTilingLayoutUUID(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_optimalTilingLayoutUUID, index), LAYOUT_optimalTilingLayoutUUID.byteSize()); }
    /// Sets `optimalTilingLayoutUUID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param index0 the Index 0 of the array
    /// @param value the value
    public static void optimalTilingLayoutUUID(MemorySegment segment, long index, long index0, byte value) { VH_optimalTilingLayoutUUID.set(segment, 0L, index, index0, value); }
    /// Sets `optimalTilingLayoutUUID` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties optimalTilingLayoutUUID(MemorySegment value) { optimalTilingLayoutUUID(this.segment(), 0L, value); return this; }
    /// Sets `optimalTilingLayoutUUID` with the given value.
    /// @param index0 the Index 0 of the array
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties optimalTilingLayoutUUID(long index0, byte value) { optimalTilingLayoutUUID(this.segment(), 0L, index0, value); return this; }

    /// {@return `identicalMemoryTypeRequirements` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int identicalMemoryTypeRequirements(MemorySegment segment, long index) { return (int) VH_identicalMemoryTypeRequirements.get(segment, 0L, index); }
    /// {@return `identicalMemoryTypeRequirements`}
    public int identicalMemoryTypeRequirements() { return identicalMemoryTypeRequirements(this.segment(), 0L); }
    /// Sets `identicalMemoryTypeRequirements` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void identicalMemoryTypeRequirements(MemorySegment segment, long index, int value) { VH_identicalMemoryTypeRequirements.set(segment, 0L, index, value); }
    /// Sets `identicalMemoryTypeRequirements` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties identicalMemoryTypeRequirements(int value) { identicalMemoryTypeRequirements(this.segment(), 0L, value); return this; }

    /// A buffer of [VkPhysicalDeviceVulkan14Properties].
    public static final class Buffer extends VkPhysicalDeviceVulkan14Properties {
        private final long elementCount;

        /// Creates `VkPhysicalDeviceVulkan14Properties.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkPhysicalDeviceVulkan14Properties`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkPhysicalDeviceVulkan14Properties`
        public VkPhysicalDeviceVulkan14Properties asSlice(long index) { return new VkPhysicalDeviceVulkan14Properties(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkPhysicalDeviceVulkan14Properties`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkPhysicalDeviceVulkan14Properties`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index of the struct buffer
        public int sTypeAt(long index) { return sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

        /// {@return `lineSubPixelPrecisionBits` at the given index}
        /// @param index the index of the struct buffer
        public int lineSubPixelPrecisionBitsAt(long index) { return lineSubPixelPrecisionBits(this.segment(), index); }
        /// Sets `lineSubPixelPrecisionBits` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer lineSubPixelPrecisionBitsAt(long index, int value) { lineSubPixelPrecisionBits(this.segment(), index, value); return this; }

        /// {@return `maxVertexAttribDivisor` at the given index}
        /// @param index the index of the struct buffer
        public int maxVertexAttribDivisorAt(long index) { return maxVertexAttribDivisor(this.segment(), index); }
        /// Sets `maxVertexAttribDivisor` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxVertexAttribDivisorAt(long index, int value) { maxVertexAttribDivisor(this.segment(), index, value); return this; }

        /// {@return `supportsNonZeroFirstInstance` at the given index}
        /// @param index the index of the struct buffer
        public int supportsNonZeroFirstInstanceAt(long index) { return supportsNonZeroFirstInstance(this.segment(), index); }
        /// Sets `supportsNonZeroFirstInstance` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer supportsNonZeroFirstInstanceAt(long index, int value) { supportsNonZeroFirstInstance(this.segment(), index, value); return this; }

        /// {@return `maxPushDescriptors` at the given index}
        /// @param index the index of the struct buffer
        public int maxPushDescriptorsAt(long index) { return maxPushDescriptors(this.segment(), index); }
        /// Sets `maxPushDescriptors` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxPushDescriptorsAt(long index, int value) { maxPushDescriptors(this.segment(), index, value); return this; }

        /// {@return `dynamicRenderingLocalReadDepthStencilAttachments` at the given index}
        /// @param index the index of the struct buffer
        public int dynamicRenderingLocalReadDepthStencilAttachmentsAt(long index) { return dynamicRenderingLocalReadDepthStencilAttachments(this.segment(), index); }
        /// Sets `dynamicRenderingLocalReadDepthStencilAttachments` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer dynamicRenderingLocalReadDepthStencilAttachmentsAt(long index, int value) { dynamicRenderingLocalReadDepthStencilAttachments(this.segment(), index, value); return this; }

        /// {@return `dynamicRenderingLocalReadMultisampledAttachments` at the given index}
        /// @param index the index of the struct buffer
        public int dynamicRenderingLocalReadMultisampledAttachmentsAt(long index) { return dynamicRenderingLocalReadMultisampledAttachments(this.segment(), index); }
        /// Sets `dynamicRenderingLocalReadMultisampledAttachments` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer dynamicRenderingLocalReadMultisampledAttachmentsAt(long index, int value) { dynamicRenderingLocalReadMultisampledAttachments(this.segment(), index, value); return this; }

        /// {@return `earlyFragmentMultisampleCoverageAfterSampleCounting` at the given index}
        /// @param index the index of the struct buffer
        public int earlyFragmentMultisampleCoverageAfterSampleCountingAt(long index) { return earlyFragmentMultisampleCoverageAfterSampleCounting(this.segment(), index); }
        /// Sets `earlyFragmentMultisampleCoverageAfterSampleCounting` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer earlyFragmentMultisampleCoverageAfterSampleCountingAt(long index, int value) { earlyFragmentMultisampleCoverageAfterSampleCounting(this.segment(), index, value); return this; }

        /// {@return `earlyFragmentSampleMaskTestBeforeSampleCounting` at the given index}
        /// @param index the index of the struct buffer
        public int earlyFragmentSampleMaskTestBeforeSampleCountingAt(long index) { return earlyFragmentSampleMaskTestBeforeSampleCounting(this.segment(), index); }
        /// Sets `earlyFragmentSampleMaskTestBeforeSampleCounting` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer earlyFragmentSampleMaskTestBeforeSampleCountingAt(long index, int value) { earlyFragmentSampleMaskTestBeforeSampleCounting(this.segment(), index, value); return this; }

        /// {@return `depthStencilSwizzleOneSupport` at the given index}
        /// @param index the index of the struct buffer
        public int depthStencilSwizzleOneSupportAt(long index) { return depthStencilSwizzleOneSupport(this.segment(), index); }
        /// Sets `depthStencilSwizzleOneSupport` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer depthStencilSwizzleOneSupportAt(long index, int value) { depthStencilSwizzleOneSupport(this.segment(), index, value); return this; }

        /// {@return `polygonModePointSize` at the given index}
        /// @param index the index of the struct buffer
        public int polygonModePointSizeAt(long index) { return polygonModePointSize(this.segment(), index); }
        /// Sets `polygonModePointSize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer polygonModePointSizeAt(long index, int value) { polygonModePointSize(this.segment(), index, value); return this; }

        /// {@return `nonStrictSinglePixelWideLinesUseParallelogram` at the given index}
        /// @param index the index of the struct buffer
        public int nonStrictSinglePixelWideLinesUseParallelogramAt(long index) { return nonStrictSinglePixelWideLinesUseParallelogram(this.segment(), index); }
        /// Sets `nonStrictSinglePixelWideLinesUseParallelogram` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer nonStrictSinglePixelWideLinesUseParallelogramAt(long index, int value) { nonStrictSinglePixelWideLinesUseParallelogram(this.segment(), index, value); return this; }

        /// {@return `nonStrictWideLinesUseParallelogram` at the given index}
        /// @param index the index of the struct buffer
        public int nonStrictWideLinesUseParallelogramAt(long index) { return nonStrictWideLinesUseParallelogram(this.segment(), index); }
        /// Sets `nonStrictWideLinesUseParallelogram` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer nonStrictWideLinesUseParallelogramAt(long index, int value) { nonStrictWideLinesUseParallelogram(this.segment(), index, value); return this; }

        /// {@return `blockTexelViewCompatibleMultipleLayers` at the given index}
        /// @param index the index of the struct buffer
        public int blockTexelViewCompatibleMultipleLayersAt(long index) { return blockTexelViewCompatibleMultipleLayers(this.segment(), index); }
        /// Sets `blockTexelViewCompatibleMultipleLayers` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer blockTexelViewCompatibleMultipleLayersAt(long index, int value) { blockTexelViewCompatibleMultipleLayers(this.segment(), index, value); return this; }

        /// {@return `maxCombinedImageSamplerDescriptorCount` at the given index}
        /// @param index the index of the struct buffer
        public int maxCombinedImageSamplerDescriptorCountAt(long index) { return maxCombinedImageSamplerDescriptorCount(this.segment(), index); }
        /// Sets `maxCombinedImageSamplerDescriptorCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxCombinedImageSamplerDescriptorCountAt(long index, int value) { maxCombinedImageSamplerDescriptorCount(this.segment(), index, value); return this; }

        /// {@return `fragmentShadingRateClampCombinerInputs` at the given index}
        /// @param index the index of the struct buffer
        public int fragmentShadingRateClampCombinerInputsAt(long index) { return fragmentShadingRateClampCombinerInputs(this.segment(), index); }
        /// Sets `fragmentShadingRateClampCombinerInputs` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer fragmentShadingRateClampCombinerInputsAt(long index, int value) { fragmentShadingRateClampCombinerInputs(this.segment(), index, value); return this; }

        /// {@return `defaultRobustnessStorageBuffers` at the given index}
        /// @param index the index of the struct buffer
        public int defaultRobustnessStorageBuffersAt(long index) { return defaultRobustnessStorageBuffers(this.segment(), index); }
        /// Sets `defaultRobustnessStorageBuffers` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer defaultRobustnessStorageBuffersAt(long index, int value) { defaultRobustnessStorageBuffers(this.segment(), index, value); return this; }

        /// {@return `defaultRobustnessUniformBuffers` at the given index}
        /// @param index the index of the struct buffer
        public int defaultRobustnessUniformBuffersAt(long index) { return defaultRobustnessUniformBuffers(this.segment(), index); }
        /// Sets `defaultRobustnessUniformBuffers` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer defaultRobustnessUniformBuffersAt(long index, int value) { defaultRobustnessUniformBuffers(this.segment(), index, value); return this; }

        /// {@return `defaultRobustnessVertexInputs` at the given index}
        /// @param index the index of the struct buffer
        public int defaultRobustnessVertexInputsAt(long index) { return defaultRobustnessVertexInputs(this.segment(), index); }
        /// Sets `defaultRobustnessVertexInputs` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer defaultRobustnessVertexInputsAt(long index, int value) { defaultRobustnessVertexInputs(this.segment(), index, value); return this; }

        /// {@return `defaultRobustnessImages` at the given index}
        /// @param index the index of the struct buffer
        public int defaultRobustnessImagesAt(long index) { return defaultRobustnessImages(this.segment(), index); }
        /// Sets `defaultRobustnessImages` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer defaultRobustnessImagesAt(long index, int value) { defaultRobustnessImages(this.segment(), index, value); return this; }

        /// {@return `copySrcLayoutCount` at the given index}
        /// @param index the index of the struct buffer
        public int copySrcLayoutCountAt(long index) { return copySrcLayoutCount(this.segment(), index); }
        /// Sets `copySrcLayoutCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer copySrcLayoutCountAt(long index, int value) { copySrcLayoutCount(this.segment(), index, value); return this; }

        /// {@return `pCopySrcLayouts` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pCopySrcLayoutsAt(long index) { return pCopySrcLayouts(this.segment(), index); }
        /// Sets `pCopySrcLayouts` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pCopySrcLayoutsAt(long index, MemorySegment value) { pCopySrcLayouts(this.segment(), index, value); return this; }

        /// {@return `copyDstLayoutCount` at the given index}
        /// @param index the index of the struct buffer
        public int copyDstLayoutCountAt(long index) { return copyDstLayoutCount(this.segment(), index); }
        /// Sets `copyDstLayoutCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer copyDstLayoutCountAt(long index, int value) { copyDstLayoutCount(this.segment(), index, value); return this; }

        /// {@return `pCopyDstLayouts` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pCopyDstLayoutsAt(long index) { return pCopyDstLayouts(this.segment(), index); }
        /// Sets `pCopyDstLayouts` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pCopyDstLayoutsAt(long index, MemorySegment value) { pCopyDstLayouts(this.segment(), index, value); return this; }

        /// {@return `optimalTilingLayoutUUID` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment optimalTilingLayoutUUIDAt(long index) { return optimalTilingLayoutUUID(this.segment(), index); }
        /// {@return `optimalTilingLayoutUUID` at the given index}
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        public byte optimalTilingLayoutUUIDAt(long index, long index0) { return optimalTilingLayoutUUID(this.segment(), index, index0); }
        /// Sets `optimalTilingLayoutUUID` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer optimalTilingLayoutUUIDAt(long index, MemorySegment value) { optimalTilingLayoutUUID(this.segment(), index, value); return this; }
        /// Sets `optimalTilingLayoutUUID` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param index0 the Index 0 of the array
        /// @param value the value
        /// @return `this`
        public Buffer optimalTilingLayoutUUIDAt(long index, long index0, byte value) { optimalTilingLayoutUUID(this.segment(), index, index0, value); return this; }

        /// {@return `identicalMemoryTypeRequirements` at the given index}
        /// @param index the index of the struct buffer
        public int identicalMemoryTypeRequirementsAt(long index) { return identicalMemoryTypeRequirements(this.segment(), index); }
        /// Sets `identicalMemoryTypeRequirements` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer identicalMemoryTypeRequirementsAt(long index, int value) { identicalMemoryTypeRequirements(this.segment(), index, value); return this; }

    }
}
