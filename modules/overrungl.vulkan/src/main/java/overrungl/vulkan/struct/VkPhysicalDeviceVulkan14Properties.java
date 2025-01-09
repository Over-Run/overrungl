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
import static overrungl.vulkan.VK10.*;

/// ## Members
/// ### sType
/// [VarHandle][#VH_sType] - [Getter][#sType()] - [Setter][#sType(int)]
/// ### pNext
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### lineSubPixelPrecisionBits
/// [VarHandle][#VH_lineSubPixelPrecisionBits] - [Getter][#lineSubPixelPrecisionBits()] - [Setter][#lineSubPixelPrecisionBits(int)]
/// ### maxVertexAttribDivisor
/// [VarHandle][#VH_maxVertexAttribDivisor] - [Getter][#maxVertexAttribDivisor()] - [Setter][#maxVertexAttribDivisor(int)]
/// ### supportsNonZeroFirstInstance
/// [VarHandle][#VH_supportsNonZeroFirstInstance] - [Getter][#supportsNonZeroFirstInstance()] - [Setter][#supportsNonZeroFirstInstance(int)]
/// ### maxPushDescriptors
/// [VarHandle][#VH_maxPushDescriptors] - [Getter][#maxPushDescriptors()] - [Setter][#maxPushDescriptors(int)]
/// ### dynamicRenderingLocalReadDepthStencilAttachments
/// [VarHandle][#VH_dynamicRenderingLocalReadDepthStencilAttachments] - [Getter][#dynamicRenderingLocalReadDepthStencilAttachments()] - [Setter][#dynamicRenderingLocalReadDepthStencilAttachments(int)]
/// ### dynamicRenderingLocalReadMultisampledAttachments
/// [VarHandle][#VH_dynamicRenderingLocalReadMultisampledAttachments] - [Getter][#dynamicRenderingLocalReadMultisampledAttachments()] - [Setter][#dynamicRenderingLocalReadMultisampledAttachments(int)]
/// ### earlyFragmentMultisampleCoverageAfterSampleCounting
/// [VarHandle][#VH_earlyFragmentMultisampleCoverageAfterSampleCounting] - [Getter][#earlyFragmentMultisampleCoverageAfterSampleCounting()] - [Setter][#earlyFragmentMultisampleCoverageAfterSampleCounting(int)]
/// ### earlyFragmentSampleMaskTestBeforeSampleCounting
/// [VarHandle][#VH_earlyFragmentSampleMaskTestBeforeSampleCounting] - [Getter][#earlyFragmentSampleMaskTestBeforeSampleCounting()] - [Setter][#earlyFragmentSampleMaskTestBeforeSampleCounting(int)]
/// ### depthStencilSwizzleOneSupport
/// [VarHandle][#VH_depthStencilSwizzleOneSupport] - [Getter][#depthStencilSwizzleOneSupport()] - [Setter][#depthStencilSwizzleOneSupport(int)]
/// ### polygonModePointSize
/// [VarHandle][#VH_polygonModePointSize] - [Getter][#polygonModePointSize()] - [Setter][#polygonModePointSize(int)]
/// ### nonStrictSinglePixelWideLinesUseParallelogram
/// [VarHandle][#VH_nonStrictSinglePixelWideLinesUseParallelogram] - [Getter][#nonStrictSinglePixelWideLinesUseParallelogram()] - [Setter][#nonStrictSinglePixelWideLinesUseParallelogram(int)]
/// ### nonStrictWideLinesUseParallelogram
/// [VarHandle][#VH_nonStrictWideLinesUseParallelogram] - [Getter][#nonStrictWideLinesUseParallelogram()] - [Setter][#nonStrictWideLinesUseParallelogram(int)]
/// ### blockTexelViewCompatibleMultipleLayers
/// [VarHandle][#VH_blockTexelViewCompatibleMultipleLayers] - [Getter][#blockTexelViewCompatibleMultipleLayers()] - [Setter][#blockTexelViewCompatibleMultipleLayers(int)]
/// ### maxCombinedImageSamplerDescriptorCount
/// [VarHandle][#VH_maxCombinedImageSamplerDescriptorCount] - [Getter][#maxCombinedImageSamplerDescriptorCount()] - [Setter][#maxCombinedImageSamplerDescriptorCount(int)]
/// ### fragmentShadingRateClampCombinerInputs
/// [VarHandle][#VH_fragmentShadingRateClampCombinerInputs] - [Getter][#fragmentShadingRateClampCombinerInputs()] - [Setter][#fragmentShadingRateClampCombinerInputs(int)]
/// ### defaultRobustnessStorageBuffers
/// [VarHandle][#VH_defaultRobustnessStorageBuffers] - [Getter][#defaultRobustnessStorageBuffers()] - [Setter][#defaultRobustnessStorageBuffers(int)]
/// ### defaultRobustnessUniformBuffers
/// [VarHandle][#VH_defaultRobustnessUniformBuffers] - [Getter][#defaultRobustnessUniformBuffers()] - [Setter][#defaultRobustnessUniformBuffers(int)]
/// ### defaultRobustnessVertexInputs
/// [VarHandle][#VH_defaultRobustnessVertexInputs] - [Getter][#defaultRobustnessVertexInputs()] - [Setter][#defaultRobustnessVertexInputs(int)]
/// ### defaultRobustnessImages
/// [VarHandle][#VH_defaultRobustnessImages] - [Getter][#defaultRobustnessImages()] - [Setter][#defaultRobustnessImages(int)]
/// ### copySrcLayoutCount
/// [VarHandle][#VH_copySrcLayoutCount] - [Getter][#copySrcLayoutCount()] - [Setter][#copySrcLayoutCount(int)]
/// ### pCopySrcLayouts
/// [VarHandle][#VH_pCopySrcLayouts] - [Getter][#pCopySrcLayouts()] - [Setter][#pCopySrcLayouts(java.lang.foreign.MemorySegment)]
/// ### copyDstLayoutCount
/// [VarHandle][#VH_copyDstLayoutCount] - [Getter][#copyDstLayoutCount()] - [Setter][#copyDstLayoutCount(int)]
/// ### pCopyDstLayouts
/// [VarHandle][#VH_pCopyDstLayouts] - [Getter][#pCopyDstLayouts()] - [Setter][#pCopyDstLayouts(java.lang.foreign.MemorySegment)]
/// ### optimalTilingLayoutUUID
/// [Byte offset handle][#MH_optimalTilingLayoutUUID] - [Memory layout][#ML_optimalTilingLayoutUUID] - [Getter][#optimalTilingLayoutUUID(long)] - [Setter][#optimalTilingLayoutUUID(long, java.lang.foreign.MemorySegment)]
/// ### identicalMemoryTypeRequirements
/// [VarHandle][#VH_identicalMemoryTypeRequirements] - [Getter][#identicalMemoryTypeRequirements()] - [Setter][#identicalMemoryTypeRequirements(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceVulkan14Properties {
///     VkStructureType sType;
///     void * pNext;
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
///     VkImageLayout * pCopySrcLayouts;
///     uint32_t copyDstLayoutCount;
///     VkImageLayout * pCopyDstLayouts;
///     uint8_t[VK_UUID_SIZE] optimalTilingLayoutUUID;
///     VkBool32 identicalMemoryTypeRequirements;
/// } VkPhysicalDeviceVulkan14Properties;
/// ```
public final class VkPhysicalDeviceVulkan14Properties extends Struct {
    /// The struct layout of `VkPhysicalDeviceVulkan14Properties`.
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
        MemoryLayout.sequenceLayout(VK_UUID_SIZE, ValueLayout.JAVA_BYTE).withName("optimalTilingLayoutUUID"),
        ValueLayout.JAVA_INT.withName("identicalMemoryTypeRequirements")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `lineSubPixelPrecisionBits` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_lineSubPixelPrecisionBits = LAYOUT.arrayElementVarHandle(PathElement.groupElement("lineSubPixelPrecisionBits"));
    /// The [VarHandle] of `maxVertexAttribDivisor` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxVertexAttribDivisor = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxVertexAttribDivisor"));
    /// The [VarHandle] of `supportsNonZeroFirstInstance` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_supportsNonZeroFirstInstance = LAYOUT.arrayElementVarHandle(PathElement.groupElement("supportsNonZeroFirstInstance"));
    /// The [VarHandle] of `maxPushDescriptors` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxPushDescriptors = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPushDescriptors"));
    /// The [VarHandle] of `dynamicRenderingLocalReadDepthStencilAttachments` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_dynamicRenderingLocalReadDepthStencilAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dynamicRenderingLocalReadDepthStencilAttachments"));
    /// The [VarHandle] of `dynamicRenderingLocalReadMultisampledAttachments` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_dynamicRenderingLocalReadMultisampledAttachments = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dynamicRenderingLocalReadMultisampledAttachments"));
    /// The [VarHandle] of `earlyFragmentMultisampleCoverageAfterSampleCounting` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_earlyFragmentMultisampleCoverageAfterSampleCounting = LAYOUT.arrayElementVarHandle(PathElement.groupElement("earlyFragmentMultisampleCoverageAfterSampleCounting"));
    /// The [VarHandle] of `earlyFragmentSampleMaskTestBeforeSampleCounting` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_earlyFragmentSampleMaskTestBeforeSampleCounting = LAYOUT.arrayElementVarHandle(PathElement.groupElement("earlyFragmentSampleMaskTestBeforeSampleCounting"));
    /// The [VarHandle] of `depthStencilSwizzleOneSupport` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_depthStencilSwizzleOneSupport = LAYOUT.arrayElementVarHandle(PathElement.groupElement("depthStencilSwizzleOneSupport"));
    /// The [VarHandle] of `polygonModePointSize` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_polygonModePointSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("polygonModePointSize"));
    /// The [VarHandle] of `nonStrictSinglePixelWideLinesUseParallelogram` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_nonStrictSinglePixelWideLinesUseParallelogram = LAYOUT.arrayElementVarHandle(PathElement.groupElement("nonStrictSinglePixelWideLinesUseParallelogram"));
    /// The [VarHandle] of `nonStrictWideLinesUseParallelogram` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_nonStrictWideLinesUseParallelogram = LAYOUT.arrayElementVarHandle(PathElement.groupElement("nonStrictWideLinesUseParallelogram"));
    /// The [VarHandle] of `blockTexelViewCompatibleMultipleLayers` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_blockTexelViewCompatibleMultipleLayers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("blockTexelViewCompatibleMultipleLayers"));
    /// The [VarHandle] of `maxCombinedImageSamplerDescriptorCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxCombinedImageSamplerDescriptorCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxCombinedImageSamplerDescriptorCount"));
    /// The [VarHandle] of `fragmentShadingRateClampCombinerInputs` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_fragmentShadingRateClampCombinerInputs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("fragmentShadingRateClampCombinerInputs"));
    /// The [VarHandle] of `defaultRobustnessStorageBuffers` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_defaultRobustnessStorageBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("defaultRobustnessStorageBuffers"));
    /// The [VarHandle] of `defaultRobustnessUniformBuffers` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_defaultRobustnessUniformBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("defaultRobustnessUniformBuffers"));
    /// The [VarHandle] of `defaultRobustnessVertexInputs` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_defaultRobustnessVertexInputs = LAYOUT.arrayElementVarHandle(PathElement.groupElement("defaultRobustnessVertexInputs"));
    /// The [VarHandle] of `defaultRobustnessImages` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_defaultRobustnessImages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("defaultRobustnessImages"));
    /// The [VarHandle] of `copySrcLayoutCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_copySrcLayoutCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("copySrcLayoutCount"));
    /// The [VarHandle] of `pCopySrcLayouts` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pCopySrcLayouts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCopySrcLayouts"));
    /// The [VarHandle] of `copyDstLayoutCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_copyDstLayoutCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("copyDstLayoutCount"));
    /// The [VarHandle] of `pCopyDstLayouts` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pCopyDstLayouts = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pCopyDstLayouts"));
    /// The byte offset handle of `optimalTilingLayoutUUID` of type `(long baseOffset, long elementIndex)long`.
    public static final MethodHandle MH_optimalTilingLayoutUUID = LAYOUT.byteOffsetHandle(PathElement.groupElement("optimalTilingLayoutUUID"), PathElement.sequenceElement());
    /// The memory layout of `optimalTilingLayoutUUID`.
    public static final MemoryLayout ML_optimalTilingLayoutUUID = LAYOUT.select(PathElement.groupElement("optimalTilingLayoutUUID"));
    /// The [VarHandle] of `identicalMemoryTypeRequirements` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_identicalMemoryTypeRequirements = LAYOUT.arrayElementVarHandle(PathElement.groupElement("identicalMemoryTypeRequirements"));

    /// Creates `VkPhysicalDeviceVulkan14Properties` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceVulkan14Properties(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceVulkan14Properties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVulkan14Properties of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkan14Properties(segment); }

    /// Creates `VkPhysicalDeviceVulkan14Properties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVulkan14Properties ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkan14Properties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceVulkan14Properties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVulkan14Properties ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkan14Properties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceVulkan14Properties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceVulkan14Properties`
    public static VkPhysicalDeviceVulkan14Properties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceVulkan14Properties(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceVulkan14Properties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceVulkan14Properties`
    public static VkPhysicalDeviceVulkan14Properties alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceVulkan14Properties(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceVulkan14Properties.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceVulkan14Properties.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceVulkan14Properties.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceVulkan14Properties.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceVulkan14Properties.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties sType(@CType("VkStructureType") int value) { VkPhysicalDeviceVulkan14Properties.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceVulkan14Properties.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceVulkan14Properties.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceVulkan14Properties.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceVulkan14Properties.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceVulkan14Properties.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceVulkan14Properties.set_pNext(this.segment(), value); return this; }

    /// {@return `lineSubPixelPrecisionBits` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_lineSubPixelPrecisionBits(MemorySegment segment, long index) { return (int) VH_lineSubPixelPrecisionBits.get(segment, 0L, index); }
    /// {@return `lineSubPixelPrecisionBits`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_lineSubPixelPrecisionBits(MemorySegment segment) { return VkPhysicalDeviceVulkan14Properties.get_lineSubPixelPrecisionBits(segment, 0L); }
    /// {@return `lineSubPixelPrecisionBits` at the given index}
    /// @param index the index
    public @CType("uint32_t") int lineSubPixelPrecisionBitsAt(long index) { return VkPhysicalDeviceVulkan14Properties.get_lineSubPixelPrecisionBits(this.segment(), index); }
    /// {@return `lineSubPixelPrecisionBits`}
    public @CType("uint32_t") int lineSubPixelPrecisionBits() { return VkPhysicalDeviceVulkan14Properties.get_lineSubPixelPrecisionBits(this.segment()); }
    /// Sets `lineSubPixelPrecisionBits` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_lineSubPixelPrecisionBits(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_lineSubPixelPrecisionBits.set(segment, 0L, index, value); }
    /// Sets `lineSubPixelPrecisionBits` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_lineSubPixelPrecisionBits(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan14Properties.set_lineSubPixelPrecisionBits(segment, 0L, value); }
    /// Sets `lineSubPixelPrecisionBits` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties lineSubPixelPrecisionBitsAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan14Properties.set_lineSubPixelPrecisionBits(this.segment(), index, value); return this; }
    /// Sets `lineSubPixelPrecisionBits` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties lineSubPixelPrecisionBits(@CType("uint32_t") int value) { VkPhysicalDeviceVulkan14Properties.set_lineSubPixelPrecisionBits(this.segment(), value); return this; }

    /// {@return `maxVertexAttribDivisor` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxVertexAttribDivisor(MemorySegment segment, long index) { return (int) VH_maxVertexAttribDivisor.get(segment, 0L, index); }
    /// {@return `maxVertexAttribDivisor`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxVertexAttribDivisor(MemorySegment segment) { return VkPhysicalDeviceVulkan14Properties.get_maxVertexAttribDivisor(segment, 0L); }
    /// {@return `maxVertexAttribDivisor` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxVertexAttribDivisorAt(long index) { return VkPhysicalDeviceVulkan14Properties.get_maxVertexAttribDivisor(this.segment(), index); }
    /// {@return `maxVertexAttribDivisor`}
    public @CType("uint32_t") int maxVertexAttribDivisor() { return VkPhysicalDeviceVulkan14Properties.get_maxVertexAttribDivisor(this.segment()); }
    /// Sets `maxVertexAttribDivisor` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxVertexAttribDivisor(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxVertexAttribDivisor.set(segment, 0L, index, value); }
    /// Sets `maxVertexAttribDivisor` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxVertexAttribDivisor(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan14Properties.set_maxVertexAttribDivisor(segment, 0L, value); }
    /// Sets `maxVertexAttribDivisor` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties maxVertexAttribDivisorAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan14Properties.set_maxVertexAttribDivisor(this.segment(), index, value); return this; }
    /// Sets `maxVertexAttribDivisor` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties maxVertexAttribDivisor(@CType("uint32_t") int value) { VkPhysicalDeviceVulkan14Properties.set_maxVertexAttribDivisor(this.segment(), value); return this; }

    /// {@return `supportsNonZeroFirstInstance` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_supportsNonZeroFirstInstance(MemorySegment segment, long index) { return (int) VH_supportsNonZeroFirstInstance.get(segment, 0L, index); }
    /// {@return `supportsNonZeroFirstInstance`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_supportsNonZeroFirstInstance(MemorySegment segment) { return VkPhysicalDeviceVulkan14Properties.get_supportsNonZeroFirstInstance(segment, 0L); }
    /// {@return `supportsNonZeroFirstInstance` at the given index}
    /// @param index the index
    public @CType("VkBool32") int supportsNonZeroFirstInstanceAt(long index) { return VkPhysicalDeviceVulkan14Properties.get_supportsNonZeroFirstInstance(this.segment(), index); }
    /// {@return `supportsNonZeroFirstInstance`}
    public @CType("VkBool32") int supportsNonZeroFirstInstance() { return VkPhysicalDeviceVulkan14Properties.get_supportsNonZeroFirstInstance(this.segment()); }
    /// Sets `supportsNonZeroFirstInstance` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_supportsNonZeroFirstInstance(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_supportsNonZeroFirstInstance.set(segment, 0L, index, value); }
    /// Sets `supportsNonZeroFirstInstance` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_supportsNonZeroFirstInstance(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Properties.set_supportsNonZeroFirstInstance(segment, 0L, value); }
    /// Sets `supportsNonZeroFirstInstance` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties supportsNonZeroFirstInstanceAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Properties.set_supportsNonZeroFirstInstance(this.segment(), index, value); return this; }
    /// Sets `supportsNonZeroFirstInstance` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties supportsNonZeroFirstInstance(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Properties.set_supportsNonZeroFirstInstance(this.segment(), value); return this; }

    /// {@return `maxPushDescriptors` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxPushDescriptors(MemorySegment segment, long index) { return (int) VH_maxPushDescriptors.get(segment, 0L, index); }
    /// {@return `maxPushDescriptors`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxPushDescriptors(MemorySegment segment) { return VkPhysicalDeviceVulkan14Properties.get_maxPushDescriptors(segment, 0L); }
    /// {@return `maxPushDescriptors` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxPushDescriptorsAt(long index) { return VkPhysicalDeviceVulkan14Properties.get_maxPushDescriptors(this.segment(), index); }
    /// {@return `maxPushDescriptors`}
    public @CType("uint32_t") int maxPushDescriptors() { return VkPhysicalDeviceVulkan14Properties.get_maxPushDescriptors(this.segment()); }
    /// Sets `maxPushDescriptors` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxPushDescriptors(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxPushDescriptors.set(segment, 0L, index, value); }
    /// Sets `maxPushDescriptors` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxPushDescriptors(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan14Properties.set_maxPushDescriptors(segment, 0L, value); }
    /// Sets `maxPushDescriptors` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties maxPushDescriptorsAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan14Properties.set_maxPushDescriptors(this.segment(), index, value); return this; }
    /// Sets `maxPushDescriptors` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties maxPushDescriptors(@CType("uint32_t") int value) { VkPhysicalDeviceVulkan14Properties.set_maxPushDescriptors(this.segment(), value); return this; }

    /// {@return `dynamicRenderingLocalReadDepthStencilAttachments` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_dynamicRenderingLocalReadDepthStencilAttachments(MemorySegment segment, long index) { return (int) VH_dynamicRenderingLocalReadDepthStencilAttachments.get(segment, 0L, index); }
    /// {@return `dynamicRenderingLocalReadDepthStencilAttachments`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_dynamicRenderingLocalReadDepthStencilAttachments(MemorySegment segment) { return VkPhysicalDeviceVulkan14Properties.get_dynamicRenderingLocalReadDepthStencilAttachments(segment, 0L); }
    /// {@return `dynamicRenderingLocalReadDepthStencilAttachments` at the given index}
    /// @param index the index
    public @CType("VkBool32") int dynamicRenderingLocalReadDepthStencilAttachmentsAt(long index) { return VkPhysicalDeviceVulkan14Properties.get_dynamicRenderingLocalReadDepthStencilAttachments(this.segment(), index); }
    /// {@return `dynamicRenderingLocalReadDepthStencilAttachments`}
    public @CType("VkBool32") int dynamicRenderingLocalReadDepthStencilAttachments() { return VkPhysicalDeviceVulkan14Properties.get_dynamicRenderingLocalReadDepthStencilAttachments(this.segment()); }
    /// Sets `dynamicRenderingLocalReadDepthStencilAttachments` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dynamicRenderingLocalReadDepthStencilAttachments(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_dynamicRenderingLocalReadDepthStencilAttachments.set(segment, 0L, index, value); }
    /// Sets `dynamicRenderingLocalReadDepthStencilAttachments` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dynamicRenderingLocalReadDepthStencilAttachments(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Properties.set_dynamicRenderingLocalReadDepthStencilAttachments(segment, 0L, value); }
    /// Sets `dynamicRenderingLocalReadDepthStencilAttachments` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties dynamicRenderingLocalReadDepthStencilAttachmentsAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Properties.set_dynamicRenderingLocalReadDepthStencilAttachments(this.segment(), index, value); return this; }
    /// Sets `dynamicRenderingLocalReadDepthStencilAttachments` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties dynamicRenderingLocalReadDepthStencilAttachments(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Properties.set_dynamicRenderingLocalReadDepthStencilAttachments(this.segment(), value); return this; }

    /// {@return `dynamicRenderingLocalReadMultisampledAttachments` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_dynamicRenderingLocalReadMultisampledAttachments(MemorySegment segment, long index) { return (int) VH_dynamicRenderingLocalReadMultisampledAttachments.get(segment, 0L, index); }
    /// {@return `dynamicRenderingLocalReadMultisampledAttachments`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_dynamicRenderingLocalReadMultisampledAttachments(MemorySegment segment) { return VkPhysicalDeviceVulkan14Properties.get_dynamicRenderingLocalReadMultisampledAttachments(segment, 0L); }
    /// {@return `dynamicRenderingLocalReadMultisampledAttachments` at the given index}
    /// @param index the index
    public @CType("VkBool32") int dynamicRenderingLocalReadMultisampledAttachmentsAt(long index) { return VkPhysicalDeviceVulkan14Properties.get_dynamicRenderingLocalReadMultisampledAttachments(this.segment(), index); }
    /// {@return `dynamicRenderingLocalReadMultisampledAttachments`}
    public @CType("VkBool32") int dynamicRenderingLocalReadMultisampledAttachments() { return VkPhysicalDeviceVulkan14Properties.get_dynamicRenderingLocalReadMultisampledAttachments(this.segment()); }
    /// Sets `dynamicRenderingLocalReadMultisampledAttachments` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_dynamicRenderingLocalReadMultisampledAttachments(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_dynamicRenderingLocalReadMultisampledAttachments.set(segment, 0L, index, value); }
    /// Sets `dynamicRenderingLocalReadMultisampledAttachments` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_dynamicRenderingLocalReadMultisampledAttachments(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Properties.set_dynamicRenderingLocalReadMultisampledAttachments(segment, 0L, value); }
    /// Sets `dynamicRenderingLocalReadMultisampledAttachments` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties dynamicRenderingLocalReadMultisampledAttachmentsAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Properties.set_dynamicRenderingLocalReadMultisampledAttachments(this.segment(), index, value); return this; }
    /// Sets `dynamicRenderingLocalReadMultisampledAttachments` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties dynamicRenderingLocalReadMultisampledAttachments(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Properties.set_dynamicRenderingLocalReadMultisampledAttachments(this.segment(), value); return this; }

    /// {@return `earlyFragmentMultisampleCoverageAfterSampleCounting` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_earlyFragmentMultisampleCoverageAfterSampleCounting(MemorySegment segment, long index) { return (int) VH_earlyFragmentMultisampleCoverageAfterSampleCounting.get(segment, 0L, index); }
    /// {@return `earlyFragmentMultisampleCoverageAfterSampleCounting`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_earlyFragmentMultisampleCoverageAfterSampleCounting(MemorySegment segment) { return VkPhysicalDeviceVulkan14Properties.get_earlyFragmentMultisampleCoverageAfterSampleCounting(segment, 0L); }
    /// {@return `earlyFragmentMultisampleCoverageAfterSampleCounting` at the given index}
    /// @param index the index
    public @CType("VkBool32") int earlyFragmentMultisampleCoverageAfterSampleCountingAt(long index) { return VkPhysicalDeviceVulkan14Properties.get_earlyFragmentMultisampleCoverageAfterSampleCounting(this.segment(), index); }
    /// {@return `earlyFragmentMultisampleCoverageAfterSampleCounting`}
    public @CType("VkBool32") int earlyFragmentMultisampleCoverageAfterSampleCounting() { return VkPhysicalDeviceVulkan14Properties.get_earlyFragmentMultisampleCoverageAfterSampleCounting(this.segment()); }
    /// Sets `earlyFragmentMultisampleCoverageAfterSampleCounting` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_earlyFragmentMultisampleCoverageAfterSampleCounting(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_earlyFragmentMultisampleCoverageAfterSampleCounting.set(segment, 0L, index, value); }
    /// Sets `earlyFragmentMultisampleCoverageAfterSampleCounting` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_earlyFragmentMultisampleCoverageAfterSampleCounting(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Properties.set_earlyFragmentMultisampleCoverageAfterSampleCounting(segment, 0L, value); }
    /// Sets `earlyFragmentMultisampleCoverageAfterSampleCounting` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties earlyFragmentMultisampleCoverageAfterSampleCountingAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Properties.set_earlyFragmentMultisampleCoverageAfterSampleCounting(this.segment(), index, value); return this; }
    /// Sets `earlyFragmentMultisampleCoverageAfterSampleCounting` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties earlyFragmentMultisampleCoverageAfterSampleCounting(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Properties.set_earlyFragmentMultisampleCoverageAfterSampleCounting(this.segment(), value); return this; }

    /// {@return `earlyFragmentSampleMaskTestBeforeSampleCounting` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_earlyFragmentSampleMaskTestBeforeSampleCounting(MemorySegment segment, long index) { return (int) VH_earlyFragmentSampleMaskTestBeforeSampleCounting.get(segment, 0L, index); }
    /// {@return `earlyFragmentSampleMaskTestBeforeSampleCounting`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_earlyFragmentSampleMaskTestBeforeSampleCounting(MemorySegment segment) { return VkPhysicalDeviceVulkan14Properties.get_earlyFragmentSampleMaskTestBeforeSampleCounting(segment, 0L); }
    /// {@return `earlyFragmentSampleMaskTestBeforeSampleCounting` at the given index}
    /// @param index the index
    public @CType("VkBool32") int earlyFragmentSampleMaskTestBeforeSampleCountingAt(long index) { return VkPhysicalDeviceVulkan14Properties.get_earlyFragmentSampleMaskTestBeforeSampleCounting(this.segment(), index); }
    /// {@return `earlyFragmentSampleMaskTestBeforeSampleCounting`}
    public @CType("VkBool32") int earlyFragmentSampleMaskTestBeforeSampleCounting() { return VkPhysicalDeviceVulkan14Properties.get_earlyFragmentSampleMaskTestBeforeSampleCounting(this.segment()); }
    /// Sets `earlyFragmentSampleMaskTestBeforeSampleCounting` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_earlyFragmentSampleMaskTestBeforeSampleCounting(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_earlyFragmentSampleMaskTestBeforeSampleCounting.set(segment, 0L, index, value); }
    /// Sets `earlyFragmentSampleMaskTestBeforeSampleCounting` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_earlyFragmentSampleMaskTestBeforeSampleCounting(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Properties.set_earlyFragmentSampleMaskTestBeforeSampleCounting(segment, 0L, value); }
    /// Sets `earlyFragmentSampleMaskTestBeforeSampleCounting` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties earlyFragmentSampleMaskTestBeforeSampleCountingAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Properties.set_earlyFragmentSampleMaskTestBeforeSampleCounting(this.segment(), index, value); return this; }
    /// Sets `earlyFragmentSampleMaskTestBeforeSampleCounting` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties earlyFragmentSampleMaskTestBeforeSampleCounting(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Properties.set_earlyFragmentSampleMaskTestBeforeSampleCounting(this.segment(), value); return this; }

    /// {@return `depthStencilSwizzleOneSupport` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_depthStencilSwizzleOneSupport(MemorySegment segment, long index) { return (int) VH_depthStencilSwizzleOneSupport.get(segment, 0L, index); }
    /// {@return `depthStencilSwizzleOneSupport`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_depthStencilSwizzleOneSupport(MemorySegment segment) { return VkPhysicalDeviceVulkan14Properties.get_depthStencilSwizzleOneSupport(segment, 0L); }
    /// {@return `depthStencilSwizzleOneSupport` at the given index}
    /// @param index the index
    public @CType("VkBool32") int depthStencilSwizzleOneSupportAt(long index) { return VkPhysicalDeviceVulkan14Properties.get_depthStencilSwizzleOneSupport(this.segment(), index); }
    /// {@return `depthStencilSwizzleOneSupport`}
    public @CType("VkBool32") int depthStencilSwizzleOneSupport() { return VkPhysicalDeviceVulkan14Properties.get_depthStencilSwizzleOneSupport(this.segment()); }
    /// Sets `depthStencilSwizzleOneSupport` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_depthStencilSwizzleOneSupport(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_depthStencilSwizzleOneSupport.set(segment, 0L, index, value); }
    /// Sets `depthStencilSwizzleOneSupport` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_depthStencilSwizzleOneSupport(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Properties.set_depthStencilSwizzleOneSupport(segment, 0L, value); }
    /// Sets `depthStencilSwizzleOneSupport` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties depthStencilSwizzleOneSupportAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Properties.set_depthStencilSwizzleOneSupport(this.segment(), index, value); return this; }
    /// Sets `depthStencilSwizzleOneSupport` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties depthStencilSwizzleOneSupport(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Properties.set_depthStencilSwizzleOneSupport(this.segment(), value); return this; }

    /// {@return `polygonModePointSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_polygonModePointSize(MemorySegment segment, long index) { return (int) VH_polygonModePointSize.get(segment, 0L, index); }
    /// {@return `polygonModePointSize`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_polygonModePointSize(MemorySegment segment) { return VkPhysicalDeviceVulkan14Properties.get_polygonModePointSize(segment, 0L); }
    /// {@return `polygonModePointSize` at the given index}
    /// @param index the index
    public @CType("VkBool32") int polygonModePointSizeAt(long index) { return VkPhysicalDeviceVulkan14Properties.get_polygonModePointSize(this.segment(), index); }
    /// {@return `polygonModePointSize`}
    public @CType("VkBool32") int polygonModePointSize() { return VkPhysicalDeviceVulkan14Properties.get_polygonModePointSize(this.segment()); }
    /// Sets `polygonModePointSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_polygonModePointSize(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_polygonModePointSize.set(segment, 0L, index, value); }
    /// Sets `polygonModePointSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_polygonModePointSize(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Properties.set_polygonModePointSize(segment, 0L, value); }
    /// Sets `polygonModePointSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties polygonModePointSizeAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Properties.set_polygonModePointSize(this.segment(), index, value); return this; }
    /// Sets `polygonModePointSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties polygonModePointSize(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Properties.set_polygonModePointSize(this.segment(), value); return this; }

    /// {@return `nonStrictSinglePixelWideLinesUseParallelogram` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_nonStrictSinglePixelWideLinesUseParallelogram(MemorySegment segment, long index) { return (int) VH_nonStrictSinglePixelWideLinesUseParallelogram.get(segment, 0L, index); }
    /// {@return `nonStrictSinglePixelWideLinesUseParallelogram`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_nonStrictSinglePixelWideLinesUseParallelogram(MemorySegment segment) { return VkPhysicalDeviceVulkan14Properties.get_nonStrictSinglePixelWideLinesUseParallelogram(segment, 0L); }
    /// {@return `nonStrictSinglePixelWideLinesUseParallelogram` at the given index}
    /// @param index the index
    public @CType("VkBool32") int nonStrictSinglePixelWideLinesUseParallelogramAt(long index) { return VkPhysicalDeviceVulkan14Properties.get_nonStrictSinglePixelWideLinesUseParallelogram(this.segment(), index); }
    /// {@return `nonStrictSinglePixelWideLinesUseParallelogram`}
    public @CType("VkBool32") int nonStrictSinglePixelWideLinesUseParallelogram() { return VkPhysicalDeviceVulkan14Properties.get_nonStrictSinglePixelWideLinesUseParallelogram(this.segment()); }
    /// Sets `nonStrictSinglePixelWideLinesUseParallelogram` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_nonStrictSinglePixelWideLinesUseParallelogram(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_nonStrictSinglePixelWideLinesUseParallelogram.set(segment, 0L, index, value); }
    /// Sets `nonStrictSinglePixelWideLinesUseParallelogram` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_nonStrictSinglePixelWideLinesUseParallelogram(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Properties.set_nonStrictSinglePixelWideLinesUseParallelogram(segment, 0L, value); }
    /// Sets `nonStrictSinglePixelWideLinesUseParallelogram` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties nonStrictSinglePixelWideLinesUseParallelogramAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Properties.set_nonStrictSinglePixelWideLinesUseParallelogram(this.segment(), index, value); return this; }
    /// Sets `nonStrictSinglePixelWideLinesUseParallelogram` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties nonStrictSinglePixelWideLinesUseParallelogram(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Properties.set_nonStrictSinglePixelWideLinesUseParallelogram(this.segment(), value); return this; }

    /// {@return `nonStrictWideLinesUseParallelogram` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_nonStrictWideLinesUseParallelogram(MemorySegment segment, long index) { return (int) VH_nonStrictWideLinesUseParallelogram.get(segment, 0L, index); }
    /// {@return `nonStrictWideLinesUseParallelogram`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_nonStrictWideLinesUseParallelogram(MemorySegment segment) { return VkPhysicalDeviceVulkan14Properties.get_nonStrictWideLinesUseParallelogram(segment, 0L); }
    /// {@return `nonStrictWideLinesUseParallelogram` at the given index}
    /// @param index the index
    public @CType("VkBool32") int nonStrictWideLinesUseParallelogramAt(long index) { return VkPhysicalDeviceVulkan14Properties.get_nonStrictWideLinesUseParallelogram(this.segment(), index); }
    /// {@return `nonStrictWideLinesUseParallelogram`}
    public @CType("VkBool32") int nonStrictWideLinesUseParallelogram() { return VkPhysicalDeviceVulkan14Properties.get_nonStrictWideLinesUseParallelogram(this.segment()); }
    /// Sets `nonStrictWideLinesUseParallelogram` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_nonStrictWideLinesUseParallelogram(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_nonStrictWideLinesUseParallelogram.set(segment, 0L, index, value); }
    /// Sets `nonStrictWideLinesUseParallelogram` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_nonStrictWideLinesUseParallelogram(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Properties.set_nonStrictWideLinesUseParallelogram(segment, 0L, value); }
    /// Sets `nonStrictWideLinesUseParallelogram` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties nonStrictWideLinesUseParallelogramAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Properties.set_nonStrictWideLinesUseParallelogram(this.segment(), index, value); return this; }
    /// Sets `nonStrictWideLinesUseParallelogram` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties nonStrictWideLinesUseParallelogram(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Properties.set_nonStrictWideLinesUseParallelogram(this.segment(), value); return this; }

    /// {@return `blockTexelViewCompatibleMultipleLayers` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_blockTexelViewCompatibleMultipleLayers(MemorySegment segment, long index) { return (int) VH_blockTexelViewCompatibleMultipleLayers.get(segment, 0L, index); }
    /// {@return `blockTexelViewCompatibleMultipleLayers`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_blockTexelViewCompatibleMultipleLayers(MemorySegment segment) { return VkPhysicalDeviceVulkan14Properties.get_blockTexelViewCompatibleMultipleLayers(segment, 0L); }
    /// {@return `blockTexelViewCompatibleMultipleLayers` at the given index}
    /// @param index the index
    public @CType("VkBool32") int blockTexelViewCompatibleMultipleLayersAt(long index) { return VkPhysicalDeviceVulkan14Properties.get_blockTexelViewCompatibleMultipleLayers(this.segment(), index); }
    /// {@return `blockTexelViewCompatibleMultipleLayers`}
    public @CType("VkBool32") int blockTexelViewCompatibleMultipleLayers() { return VkPhysicalDeviceVulkan14Properties.get_blockTexelViewCompatibleMultipleLayers(this.segment()); }
    /// Sets `blockTexelViewCompatibleMultipleLayers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_blockTexelViewCompatibleMultipleLayers(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_blockTexelViewCompatibleMultipleLayers.set(segment, 0L, index, value); }
    /// Sets `blockTexelViewCompatibleMultipleLayers` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_blockTexelViewCompatibleMultipleLayers(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Properties.set_blockTexelViewCompatibleMultipleLayers(segment, 0L, value); }
    /// Sets `blockTexelViewCompatibleMultipleLayers` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties blockTexelViewCompatibleMultipleLayersAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Properties.set_blockTexelViewCompatibleMultipleLayers(this.segment(), index, value); return this; }
    /// Sets `blockTexelViewCompatibleMultipleLayers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties blockTexelViewCompatibleMultipleLayers(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Properties.set_blockTexelViewCompatibleMultipleLayers(this.segment(), value); return this; }

    /// {@return `maxCombinedImageSamplerDescriptorCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxCombinedImageSamplerDescriptorCount(MemorySegment segment, long index) { return (int) VH_maxCombinedImageSamplerDescriptorCount.get(segment, 0L, index); }
    /// {@return `maxCombinedImageSamplerDescriptorCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxCombinedImageSamplerDescriptorCount(MemorySegment segment) { return VkPhysicalDeviceVulkan14Properties.get_maxCombinedImageSamplerDescriptorCount(segment, 0L); }
    /// {@return `maxCombinedImageSamplerDescriptorCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxCombinedImageSamplerDescriptorCountAt(long index) { return VkPhysicalDeviceVulkan14Properties.get_maxCombinedImageSamplerDescriptorCount(this.segment(), index); }
    /// {@return `maxCombinedImageSamplerDescriptorCount`}
    public @CType("uint32_t") int maxCombinedImageSamplerDescriptorCount() { return VkPhysicalDeviceVulkan14Properties.get_maxCombinedImageSamplerDescriptorCount(this.segment()); }
    /// Sets `maxCombinedImageSamplerDescriptorCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxCombinedImageSamplerDescriptorCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxCombinedImageSamplerDescriptorCount.set(segment, 0L, index, value); }
    /// Sets `maxCombinedImageSamplerDescriptorCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxCombinedImageSamplerDescriptorCount(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan14Properties.set_maxCombinedImageSamplerDescriptorCount(segment, 0L, value); }
    /// Sets `maxCombinedImageSamplerDescriptorCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties maxCombinedImageSamplerDescriptorCountAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan14Properties.set_maxCombinedImageSamplerDescriptorCount(this.segment(), index, value); return this; }
    /// Sets `maxCombinedImageSamplerDescriptorCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties maxCombinedImageSamplerDescriptorCount(@CType("uint32_t") int value) { VkPhysicalDeviceVulkan14Properties.set_maxCombinedImageSamplerDescriptorCount(this.segment(), value); return this; }

    /// {@return `fragmentShadingRateClampCombinerInputs` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_fragmentShadingRateClampCombinerInputs(MemorySegment segment, long index) { return (int) VH_fragmentShadingRateClampCombinerInputs.get(segment, 0L, index); }
    /// {@return `fragmentShadingRateClampCombinerInputs`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_fragmentShadingRateClampCombinerInputs(MemorySegment segment) { return VkPhysicalDeviceVulkan14Properties.get_fragmentShadingRateClampCombinerInputs(segment, 0L); }
    /// {@return `fragmentShadingRateClampCombinerInputs` at the given index}
    /// @param index the index
    public @CType("VkBool32") int fragmentShadingRateClampCombinerInputsAt(long index) { return VkPhysicalDeviceVulkan14Properties.get_fragmentShadingRateClampCombinerInputs(this.segment(), index); }
    /// {@return `fragmentShadingRateClampCombinerInputs`}
    public @CType("VkBool32") int fragmentShadingRateClampCombinerInputs() { return VkPhysicalDeviceVulkan14Properties.get_fragmentShadingRateClampCombinerInputs(this.segment()); }
    /// Sets `fragmentShadingRateClampCombinerInputs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_fragmentShadingRateClampCombinerInputs(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_fragmentShadingRateClampCombinerInputs.set(segment, 0L, index, value); }
    /// Sets `fragmentShadingRateClampCombinerInputs` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_fragmentShadingRateClampCombinerInputs(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Properties.set_fragmentShadingRateClampCombinerInputs(segment, 0L, value); }
    /// Sets `fragmentShadingRateClampCombinerInputs` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties fragmentShadingRateClampCombinerInputsAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Properties.set_fragmentShadingRateClampCombinerInputs(this.segment(), index, value); return this; }
    /// Sets `fragmentShadingRateClampCombinerInputs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties fragmentShadingRateClampCombinerInputs(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Properties.set_fragmentShadingRateClampCombinerInputs(this.segment(), value); return this; }

    /// {@return `defaultRobustnessStorageBuffers` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineRobustnessBufferBehavior") int get_defaultRobustnessStorageBuffers(MemorySegment segment, long index) { return (int) VH_defaultRobustnessStorageBuffers.get(segment, 0L, index); }
    /// {@return `defaultRobustnessStorageBuffers`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineRobustnessBufferBehavior") int get_defaultRobustnessStorageBuffers(MemorySegment segment) { return VkPhysicalDeviceVulkan14Properties.get_defaultRobustnessStorageBuffers(segment, 0L); }
    /// {@return `defaultRobustnessStorageBuffers` at the given index}
    /// @param index the index
    public @CType("VkPipelineRobustnessBufferBehavior") int defaultRobustnessStorageBuffersAt(long index) { return VkPhysicalDeviceVulkan14Properties.get_defaultRobustnessStorageBuffers(this.segment(), index); }
    /// {@return `defaultRobustnessStorageBuffers`}
    public @CType("VkPipelineRobustnessBufferBehavior") int defaultRobustnessStorageBuffers() { return VkPhysicalDeviceVulkan14Properties.get_defaultRobustnessStorageBuffers(this.segment()); }
    /// Sets `defaultRobustnessStorageBuffers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_defaultRobustnessStorageBuffers(MemorySegment segment, long index, @CType("VkPipelineRobustnessBufferBehavior") int value) { VH_defaultRobustnessStorageBuffers.set(segment, 0L, index, value); }
    /// Sets `defaultRobustnessStorageBuffers` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_defaultRobustnessStorageBuffers(MemorySegment segment, @CType("VkPipelineRobustnessBufferBehavior") int value) { VkPhysicalDeviceVulkan14Properties.set_defaultRobustnessStorageBuffers(segment, 0L, value); }
    /// Sets `defaultRobustnessStorageBuffers` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties defaultRobustnessStorageBuffersAt(long index, @CType("VkPipelineRobustnessBufferBehavior") int value) { VkPhysicalDeviceVulkan14Properties.set_defaultRobustnessStorageBuffers(this.segment(), index, value); return this; }
    /// Sets `defaultRobustnessStorageBuffers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties defaultRobustnessStorageBuffers(@CType("VkPipelineRobustnessBufferBehavior") int value) { VkPhysicalDeviceVulkan14Properties.set_defaultRobustnessStorageBuffers(this.segment(), value); return this; }

    /// {@return `defaultRobustnessUniformBuffers` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineRobustnessBufferBehavior") int get_defaultRobustnessUniformBuffers(MemorySegment segment, long index) { return (int) VH_defaultRobustnessUniformBuffers.get(segment, 0L, index); }
    /// {@return `defaultRobustnessUniformBuffers`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineRobustnessBufferBehavior") int get_defaultRobustnessUniformBuffers(MemorySegment segment) { return VkPhysicalDeviceVulkan14Properties.get_defaultRobustnessUniformBuffers(segment, 0L); }
    /// {@return `defaultRobustnessUniformBuffers` at the given index}
    /// @param index the index
    public @CType("VkPipelineRobustnessBufferBehavior") int defaultRobustnessUniformBuffersAt(long index) { return VkPhysicalDeviceVulkan14Properties.get_defaultRobustnessUniformBuffers(this.segment(), index); }
    /// {@return `defaultRobustnessUniformBuffers`}
    public @CType("VkPipelineRobustnessBufferBehavior") int defaultRobustnessUniformBuffers() { return VkPhysicalDeviceVulkan14Properties.get_defaultRobustnessUniformBuffers(this.segment()); }
    /// Sets `defaultRobustnessUniformBuffers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_defaultRobustnessUniformBuffers(MemorySegment segment, long index, @CType("VkPipelineRobustnessBufferBehavior") int value) { VH_defaultRobustnessUniformBuffers.set(segment, 0L, index, value); }
    /// Sets `defaultRobustnessUniformBuffers` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_defaultRobustnessUniformBuffers(MemorySegment segment, @CType("VkPipelineRobustnessBufferBehavior") int value) { VkPhysicalDeviceVulkan14Properties.set_defaultRobustnessUniformBuffers(segment, 0L, value); }
    /// Sets `defaultRobustnessUniformBuffers` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties defaultRobustnessUniformBuffersAt(long index, @CType("VkPipelineRobustnessBufferBehavior") int value) { VkPhysicalDeviceVulkan14Properties.set_defaultRobustnessUniformBuffers(this.segment(), index, value); return this; }
    /// Sets `defaultRobustnessUniformBuffers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties defaultRobustnessUniformBuffers(@CType("VkPipelineRobustnessBufferBehavior") int value) { VkPhysicalDeviceVulkan14Properties.set_defaultRobustnessUniformBuffers(this.segment(), value); return this; }

    /// {@return `defaultRobustnessVertexInputs` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineRobustnessBufferBehavior") int get_defaultRobustnessVertexInputs(MemorySegment segment, long index) { return (int) VH_defaultRobustnessVertexInputs.get(segment, 0L, index); }
    /// {@return `defaultRobustnessVertexInputs`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineRobustnessBufferBehavior") int get_defaultRobustnessVertexInputs(MemorySegment segment) { return VkPhysicalDeviceVulkan14Properties.get_defaultRobustnessVertexInputs(segment, 0L); }
    /// {@return `defaultRobustnessVertexInputs` at the given index}
    /// @param index the index
    public @CType("VkPipelineRobustnessBufferBehavior") int defaultRobustnessVertexInputsAt(long index) { return VkPhysicalDeviceVulkan14Properties.get_defaultRobustnessVertexInputs(this.segment(), index); }
    /// {@return `defaultRobustnessVertexInputs`}
    public @CType("VkPipelineRobustnessBufferBehavior") int defaultRobustnessVertexInputs() { return VkPhysicalDeviceVulkan14Properties.get_defaultRobustnessVertexInputs(this.segment()); }
    /// Sets `defaultRobustnessVertexInputs` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_defaultRobustnessVertexInputs(MemorySegment segment, long index, @CType("VkPipelineRobustnessBufferBehavior") int value) { VH_defaultRobustnessVertexInputs.set(segment, 0L, index, value); }
    /// Sets `defaultRobustnessVertexInputs` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_defaultRobustnessVertexInputs(MemorySegment segment, @CType("VkPipelineRobustnessBufferBehavior") int value) { VkPhysicalDeviceVulkan14Properties.set_defaultRobustnessVertexInputs(segment, 0L, value); }
    /// Sets `defaultRobustnessVertexInputs` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties defaultRobustnessVertexInputsAt(long index, @CType("VkPipelineRobustnessBufferBehavior") int value) { VkPhysicalDeviceVulkan14Properties.set_defaultRobustnessVertexInputs(this.segment(), index, value); return this; }
    /// Sets `defaultRobustnessVertexInputs` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties defaultRobustnessVertexInputs(@CType("VkPipelineRobustnessBufferBehavior") int value) { VkPhysicalDeviceVulkan14Properties.set_defaultRobustnessVertexInputs(this.segment(), value); return this; }

    /// {@return `defaultRobustnessImages` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkPipelineRobustnessImageBehavior") int get_defaultRobustnessImages(MemorySegment segment, long index) { return (int) VH_defaultRobustnessImages.get(segment, 0L, index); }
    /// {@return `defaultRobustnessImages`}
    /// @param segment the segment of the struct
    public static @CType("VkPipelineRobustnessImageBehavior") int get_defaultRobustnessImages(MemorySegment segment) { return VkPhysicalDeviceVulkan14Properties.get_defaultRobustnessImages(segment, 0L); }
    /// {@return `defaultRobustnessImages` at the given index}
    /// @param index the index
    public @CType("VkPipelineRobustnessImageBehavior") int defaultRobustnessImagesAt(long index) { return VkPhysicalDeviceVulkan14Properties.get_defaultRobustnessImages(this.segment(), index); }
    /// {@return `defaultRobustnessImages`}
    public @CType("VkPipelineRobustnessImageBehavior") int defaultRobustnessImages() { return VkPhysicalDeviceVulkan14Properties.get_defaultRobustnessImages(this.segment()); }
    /// Sets `defaultRobustnessImages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_defaultRobustnessImages(MemorySegment segment, long index, @CType("VkPipelineRobustnessImageBehavior") int value) { VH_defaultRobustnessImages.set(segment, 0L, index, value); }
    /// Sets `defaultRobustnessImages` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_defaultRobustnessImages(MemorySegment segment, @CType("VkPipelineRobustnessImageBehavior") int value) { VkPhysicalDeviceVulkan14Properties.set_defaultRobustnessImages(segment, 0L, value); }
    /// Sets `defaultRobustnessImages` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties defaultRobustnessImagesAt(long index, @CType("VkPipelineRobustnessImageBehavior") int value) { VkPhysicalDeviceVulkan14Properties.set_defaultRobustnessImages(this.segment(), index, value); return this; }
    /// Sets `defaultRobustnessImages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties defaultRobustnessImages(@CType("VkPipelineRobustnessImageBehavior") int value) { VkPhysicalDeviceVulkan14Properties.set_defaultRobustnessImages(this.segment(), value); return this; }

    /// {@return `copySrcLayoutCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_copySrcLayoutCount(MemorySegment segment, long index) { return (int) VH_copySrcLayoutCount.get(segment, 0L, index); }
    /// {@return `copySrcLayoutCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_copySrcLayoutCount(MemorySegment segment) { return VkPhysicalDeviceVulkan14Properties.get_copySrcLayoutCount(segment, 0L); }
    /// {@return `copySrcLayoutCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int copySrcLayoutCountAt(long index) { return VkPhysicalDeviceVulkan14Properties.get_copySrcLayoutCount(this.segment(), index); }
    /// {@return `copySrcLayoutCount`}
    public @CType("uint32_t") int copySrcLayoutCount() { return VkPhysicalDeviceVulkan14Properties.get_copySrcLayoutCount(this.segment()); }
    /// Sets `copySrcLayoutCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_copySrcLayoutCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_copySrcLayoutCount.set(segment, 0L, index, value); }
    /// Sets `copySrcLayoutCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_copySrcLayoutCount(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan14Properties.set_copySrcLayoutCount(segment, 0L, value); }
    /// Sets `copySrcLayoutCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties copySrcLayoutCountAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan14Properties.set_copySrcLayoutCount(this.segment(), index, value); return this; }
    /// Sets `copySrcLayoutCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties copySrcLayoutCount(@CType("uint32_t") int value) { VkPhysicalDeviceVulkan14Properties.set_copySrcLayoutCount(this.segment(), value); return this; }

    /// {@return `pCopySrcLayouts` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageLayout *") java.lang.foreign.MemorySegment get_pCopySrcLayouts(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pCopySrcLayouts.get(segment, 0L, index); }
    /// {@return `pCopySrcLayouts`}
    /// @param segment the segment of the struct
    public static @CType("VkImageLayout *") java.lang.foreign.MemorySegment get_pCopySrcLayouts(MemorySegment segment) { return VkPhysicalDeviceVulkan14Properties.get_pCopySrcLayouts(segment, 0L); }
    /// {@return `pCopySrcLayouts` at the given index}
    /// @param index the index
    public @CType("VkImageLayout *") java.lang.foreign.MemorySegment pCopySrcLayoutsAt(long index) { return VkPhysicalDeviceVulkan14Properties.get_pCopySrcLayouts(this.segment(), index); }
    /// {@return `pCopySrcLayouts`}
    public @CType("VkImageLayout *") java.lang.foreign.MemorySegment pCopySrcLayouts() { return VkPhysicalDeviceVulkan14Properties.get_pCopySrcLayouts(this.segment()); }
    /// Sets `pCopySrcLayouts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pCopySrcLayouts(MemorySegment segment, long index, @CType("VkImageLayout *") java.lang.foreign.MemorySegment value) { VH_pCopySrcLayouts.set(segment, 0L, index, value); }
    /// Sets `pCopySrcLayouts` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pCopySrcLayouts(MemorySegment segment, @CType("VkImageLayout *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceVulkan14Properties.set_pCopySrcLayouts(segment, 0L, value); }
    /// Sets `pCopySrcLayouts` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties pCopySrcLayoutsAt(long index, @CType("VkImageLayout *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceVulkan14Properties.set_pCopySrcLayouts(this.segment(), index, value); return this; }
    /// Sets `pCopySrcLayouts` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties pCopySrcLayouts(@CType("VkImageLayout *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceVulkan14Properties.set_pCopySrcLayouts(this.segment(), value); return this; }

    /// {@return `copyDstLayoutCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_copyDstLayoutCount(MemorySegment segment, long index) { return (int) VH_copyDstLayoutCount.get(segment, 0L, index); }
    /// {@return `copyDstLayoutCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_copyDstLayoutCount(MemorySegment segment) { return VkPhysicalDeviceVulkan14Properties.get_copyDstLayoutCount(segment, 0L); }
    /// {@return `copyDstLayoutCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int copyDstLayoutCountAt(long index) { return VkPhysicalDeviceVulkan14Properties.get_copyDstLayoutCount(this.segment(), index); }
    /// {@return `copyDstLayoutCount`}
    public @CType("uint32_t") int copyDstLayoutCount() { return VkPhysicalDeviceVulkan14Properties.get_copyDstLayoutCount(this.segment()); }
    /// Sets `copyDstLayoutCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_copyDstLayoutCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_copyDstLayoutCount.set(segment, 0L, index, value); }
    /// Sets `copyDstLayoutCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_copyDstLayoutCount(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan14Properties.set_copyDstLayoutCount(segment, 0L, value); }
    /// Sets `copyDstLayoutCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties copyDstLayoutCountAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan14Properties.set_copyDstLayoutCount(this.segment(), index, value); return this; }
    /// Sets `copyDstLayoutCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties copyDstLayoutCount(@CType("uint32_t") int value) { VkPhysicalDeviceVulkan14Properties.set_copyDstLayoutCount(this.segment(), value); return this; }

    /// {@return `pCopyDstLayouts` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkImageLayout *") java.lang.foreign.MemorySegment get_pCopyDstLayouts(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pCopyDstLayouts.get(segment, 0L, index); }
    /// {@return `pCopyDstLayouts`}
    /// @param segment the segment of the struct
    public static @CType("VkImageLayout *") java.lang.foreign.MemorySegment get_pCopyDstLayouts(MemorySegment segment) { return VkPhysicalDeviceVulkan14Properties.get_pCopyDstLayouts(segment, 0L); }
    /// {@return `pCopyDstLayouts` at the given index}
    /// @param index the index
    public @CType("VkImageLayout *") java.lang.foreign.MemorySegment pCopyDstLayoutsAt(long index) { return VkPhysicalDeviceVulkan14Properties.get_pCopyDstLayouts(this.segment(), index); }
    /// {@return `pCopyDstLayouts`}
    public @CType("VkImageLayout *") java.lang.foreign.MemorySegment pCopyDstLayouts() { return VkPhysicalDeviceVulkan14Properties.get_pCopyDstLayouts(this.segment()); }
    /// Sets `pCopyDstLayouts` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pCopyDstLayouts(MemorySegment segment, long index, @CType("VkImageLayout *") java.lang.foreign.MemorySegment value) { VH_pCopyDstLayouts.set(segment, 0L, index, value); }
    /// Sets `pCopyDstLayouts` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pCopyDstLayouts(MemorySegment segment, @CType("VkImageLayout *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceVulkan14Properties.set_pCopyDstLayouts(segment, 0L, value); }
    /// Sets `pCopyDstLayouts` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties pCopyDstLayoutsAt(long index, @CType("VkImageLayout *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceVulkan14Properties.set_pCopyDstLayouts(this.segment(), index, value); return this; }
    /// Sets `pCopyDstLayouts` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties pCopyDstLayouts(@CType("VkImageLayout *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceVulkan14Properties.set_pCopyDstLayouts(this.segment(), value); return this; }

    /// {@return `optimalTilingLayoutUUID` at the given index}
    /// @param segment      the segment of the struct
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    public static @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment get_optimalTilingLayoutUUID(MemorySegment segment, long index, long elementIndex) {
        try { return segment.asSlice(LAYOUT.scale((long) MH_optimalTilingLayoutUUID.invokeExact(0L, elementIndex), index), ML_optimalTilingLayoutUUID); }
        catch (Throwable e) { throw new RuntimeException(e); }
    }
    /// {@return `optimalTilingLayoutUUID`}
    /// @param segment      the segment of the struct
    /// @param elementIndex the index of the element
    public static @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment get_optimalTilingLayoutUUID(MemorySegment segment, long elementIndex) { return VkPhysicalDeviceVulkan14Properties.get_optimalTilingLayoutUUID(segment, 0L, elementIndex); }
    /// {@return `optimalTilingLayoutUUID` at the given index}
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    public @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment optimalTilingLayoutUUIDAt(long index, long elementIndex) { return VkPhysicalDeviceVulkan14Properties.get_optimalTilingLayoutUUID(this.segment(), index, elementIndex); }
    /// {@return `optimalTilingLayoutUUID`}
    /// @param elementIndex the index of the element
    public @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment optimalTilingLayoutUUID(long elementIndex) { return VkPhysicalDeviceVulkan14Properties.get_optimalTilingLayoutUUID(this.segment(), elementIndex); }
    /// Sets `optimalTilingLayoutUUID` with the given value at the given index.
    /// @param segment      the segment of the struct
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    /// @param value        the value
    public static void set_optimalTilingLayoutUUID(MemorySegment segment, long index, long elementIndex, @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment value) {
        try { MemorySegment.copy(value, 0L, segment, LAYOUT.scale((long) MH_optimalTilingLayoutUUID.invokeExact(0L, elementIndex), index), ML_optimalTilingLayoutUUID.byteSize()); }
        catch (Throwable e) { throw new RuntimeException(e); }
    }
    /// Sets `optimalTilingLayoutUUID` with the given value.
    /// @param segment      the segment of the struct
    /// @param elementIndex the index of the element
    /// @param value        the value
    public static void set_optimalTilingLayoutUUID(MemorySegment segment, long elementIndex, @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceVulkan14Properties.set_optimalTilingLayoutUUID(segment, 0L, elementIndex, value); }
    /// Sets `optimalTilingLayoutUUID` with the given value at the given index.
    /// @param index        the index of the struct buffer
    /// @param elementIndex the index of the element
    /// @param value        the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties optimalTilingLayoutUUIDAt(long index, long elementIndex, @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceVulkan14Properties.set_optimalTilingLayoutUUID(this.segment(), index, elementIndex, value); return this; }
    /// Sets `optimalTilingLayoutUUID` with the given value.
    /// @param elementIndex the index of the element
    /// @param value        the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties optimalTilingLayoutUUID(long elementIndex, @CType("uint8_t[VK_UUID_SIZE]") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceVulkan14Properties.set_optimalTilingLayoutUUID(this.segment(), elementIndex, value); return this; }

    /// {@return `identicalMemoryTypeRequirements` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_identicalMemoryTypeRequirements(MemorySegment segment, long index) { return (int) VH_identicalMemoryTypeRequirements.get(segment, 0L, index); }
    /// {@return `identicalMemoryTypeRequirements`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_identicalMemoryTypeRequirements(MemorySegment segment) { return VkPhysicalDeviceVulkan14Properties.get_identicalMemoryTypeRequirements(segment, 0L); }
    /// {@return `identicalMemoryTypeRequirements` at the given index}
    /// @param index the index
    public @CType("VkBool32") int identicalMemoryTypeRequirementsAt(long index) { return VkPhysicalDeviceVulkan14Properties.get_identicalMemoryTypeRequirements(this.segment(), index); }
    /// {@return `identicalMemoryTypeRequirements`}
    public @CType("VkBool32") int identicalMemoryTypeRequirements() { return VkPhysicalDeviceVulkan14Properties.get_identicalMemoryTypeRequirements(this.segment()); }
    /// Sets `identicalMemoryTypeRequirements` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_identicalMemoryTypeRequirements(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_identicalMemoryTypeRequirements.set(segment, 0L, index, value); }
    /// Sets `identicalMemoryTypeRequirements` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_identicalMemoryTypeRequirements(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Properties.set_identicalMemoryTypeRequirements(segment, 0L, value); }
    /// Sets `identicalMemoryTypeRequirements` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties identicalMemoryTypeRequirementsAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Properties.set_identicalMemoryTypeRequirements(this.segment(), index, value); return this; }
    /// Sets `identicalMemoryTypeRequirements` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan14Properties identicalMemoryTypeRequirements(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan14Properties.set_identicalMemoryTypeRequirements(this.segment(), value); return this; }

}
