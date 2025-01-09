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
/// ### minSubgroupSize
/// [VarHandle][#VH_minSubgroupSize] - [Getter][#minSubgroupSize()] - [Setter][#minSubgroupSize(int)]
/// ### maxSubgroupSize
/// [VarHandle][#VH_maxSubgroupSize] - [Getter][#maxSubgroupSize()] - [Setter][#maxSubgroupSize(int)]
/// ### maxComputeWorkgroupSubgroups
/// [VarHandle][#VH_maxComputeWorkgroupSubgroups] - [Getter][#maxComputeWorkgroupSubgroups()] - [Setter][#maxComputeWorkgroupSubgroups(int)]
/// ### requiredSubgroupSizeStages
/// [VarHandle][#VH_requiredSubgroupSizeStages] - [Getter][#requiredSubgroupSizeStages()] - [Setter][#requiredSubgroupSizeStages(int)]
/// ### maxInlineUniformBlockSize
/// [VarHandle][#VH_maxInlineUniformBlockSize] - [Getter][#maxInlineUniformBlockSize()] - [Setter][#maxInlineUniformBlockSize(int)]
/// ### maxPerStageDescriptorInlineUniformBlocks
/// [VarHandle][#VH_maxPerStageDescriptorInlineUniformBlocks] - [Getter][#maxPerStageDescriptorInlineUniformBlocks()] - [Setter][#maxPerStageDescriptorInlineUniformBlocks(int)]
/// ### maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks
/// [VarHandle][#VH_maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks] - [Getter][#maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks()] - [Setter][#maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(int)]
/// ### maxDescriptorSetInlineUniformBlocks
/// [VarHandle][#VH_maxDescriptorSetInlineUniformBlocks] - [Getter][#maxDescriptorSetInlineUniformBlocks()] - [Setter][#maxDescriptorSetInlineUniformBlocks(int)]
/// ### maxDescriptorSetUpdateAfterBindInlineUniformBlocks
/// [VarHandle][#VH_maxDescriptorSetUpdateAfterBindInlineUniformBlocks] - [Getter][#maxDescriptorSetUpdateAfterBindInlineUniformBlocks()] - [Setter][#maxDescriptorSetUpdateAfterBindInlineUniformBlocks(int)]
/// ### maxInlineUniformTotalSize
/// [VarHandle][#VH_maxInlineUniformTotalSize] - [Getter][#maxInlineUniformTotalSize()] - [Setter][#maxInlineUniformTotalSize(int)]
/// ### integerDotProduct8BitUnsignedAccelerated
/// [VarHandle][#VH_integerDotProduct8BitUnsignedAccelerated] - [Getter][#integerDotProduct8BitUnsignedAccelerated()] - [Setter][#integerDotProduct8BitUnsignedAccelerated(int)]
/// ### integerDotProduct8BitSignedAccelerated
/// [VarHandle][#VH_integerDotProduct8BitSignedAccelerated] - [Getter][#integerDotProduct8BitSignedAccelerated()] - [Setter][#integerDotProduct8BitSignedAccelerated(int)]
/// ### integerDotProduct8BitMixedSignednessAccelerated
/// [VarHandle][#VH_integerDotProduct8BitMixedSignednessAccelerated] - [Getter][#integerDotProduct8BitMixedSignednessAccelerated()] - [Setter][#integerDotProduct8BitMixedSignednessAccelerated(int)]
/// ### integerDotProduct4x8BitPackedUnsignedAccelerated
/// [VarHandle][#VH_integerDotProduct4x8BitPackedUnsignedAccelerated] - [Getter][#integerDotProduct4x8BitPackedUnsignedAccelerated()] - [Setter][#integerDotProduct4x8BitPackedUnsignedAccelerated(int)]
/// ### integerDotProduct4x8BitPackedSignedAccelerated
/// [VarHandle][#VH_integerDotProduct4x8BitPackedSignedAccelerated] - [Getter][#integerDotProduct4x8BitPackedSignedAccelerated()] - [Setter][#integerDotProduct4x8BitPackedSignedAccelerated(int)]
/// ### integerDotProduct4x8BitPackedMixedSignednessAccelerated
/// [VarHandle][#VH_integerDotProduct4x8BitPackedMixedSignednessAccelerated] - [Getter][#integerDotProduct4x8BitPackedMixedSignednessAccelerated()] - [Setter][#integerDotProduct4x8BitPackedMixedSignednessAccelerated(int)]
/// ### integerDotProduct16BitUnsignedAccelerated
/// [VarHandle][#VH_integerDotProduct16BitUnsignedAccelerated] - [Getter][#integerDotProduct16BitUnsignedAccelerated()] - [Setter][#integerDotProduct16BitUnsignedAccelerated(int)]
/// ### integerDotProduct16BitSignedAccelerated
/// [VarHandle][#VH_integerDotProduct16BitSignedAccelerated] - [Getter][#integerDotProduct16BitSignedAccelerated()] - [Setter][#integerDotProduct16BitSignedAccelerated(int)]
/// ### integerDotProduct16BitMixedSignednessAccelerated
/// [VarHandle][#VH_integerDotProduct16BitMixedSignednessAccelerated] - [Getter][#integerDotProduct16BitMixedSignednessAccelerated()] - [Setter][#integerDotProduct16BitMixedSignednessAccelerated(int)]
/// ### integerDotProduct32BitUnsignedAccelerated
/// [VarHandle][#VH_integerDotProduct32BitUnsignedAccelerated] - [Getter][#integerDotProduct32BitUnsignedAccelerated()] - [Setter][#integerDotProduct32BitUnsignedAccelerated(int)]
/// ### integerDotProduct32BitSignedAccelerated
/// [VarHandle][#VH_integerDotProduct32BitSignedAccelerated] - [Getter][#integerDotProduct32BitSignedAccelerated()] - [Setter][#integerDotProduct32BitSignedAccelerated(int)]
/// ### integerDotProduct32BitMixedSignednessAccelerated
/// [VarHandle][#VH_integerDotProduct32BitMixedSignednessAccelerated] - [Getter][#integerDotProduct32BitMixedSignednessAccelerated()] - [Setter][#integerDotProduct32BitMixedSignednessAccelerated(int)]
/// ### integerDotProduct64BitUnsignedAccelerated
/// [VarHandle][#VH_integerDotProduct64BitUnsignedAccelerated] - [Getter][#integerDotProduct64BitUnsignedAccelerated()] - [Setter][#integerDotProduct64BitUnsignedAccelerated(int)]
/// ### integerDotProduct64BitSignedAccelerated
/// [VarHandle][#VH_integerDotProduct64BitSignedAccelerated] - [Getter][#integerDotProduct64BitSignedAccelerated()] - [Setter][#integerDotProduct64BitSignedAccelerated(int)]
/// ### integerDotProduct64BitMixedSignednessAccelerated
/// [VarHandle][#VH_integerDotProduct64BitMixedSignednessAccelerated] - [Getter][#integerDotProduct64BitMixedSignednessAccelerated()] - [Setter][#integerDotProduct64BitMixedSignednessAccelerated(int)]
/// ### integerDotProductAccumulatingSaturating8BitUnsignedAccelerated
/// [VarHandle][#VH_integerDotProductAccumulatingSaturating8BitUnsignedAccelerated] - [Getter][#integerDotProductAccumulatingSaturating8BitUnsignedAccelerated()] - [Setter][#integerDotProductAccumulatingSaturating8BitUnsignedAccelerated(int)]
/// ### integerDotProductAccumulatingSaturating8BitSignedAccelerated
/// [VarHandle][#VH_integerDotProductAccumulatingSaturating8BitSignedAccelerated] - [Getter][#integerDotProductAccumulatingSaturating8BitSignedAccelerated()] - [Setter][#integerDotProductAccumulatingSaturating8BitSignedAccelerated(int)]
/// ### integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated
/// [VarHandle][#VH_integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated] - [Getter][#integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated()] - [Setter][#integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(int)]
/// ### integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated
/// [VarHandle][#VH_integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated] - [Getter][#integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated()] - [Setter][#integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(int)]
/// ### integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated
/// [VarHandle][#VH_integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated] - [Getter][#integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated()] - [Setter][#integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(int)]
/// ### integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated
/// [VarHandle][#VH_integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated] - [Getter][#integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated()] - [Setter][#integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(int)]
/// ### integerDotProductAccumulatingSaturating16BitUnsignedAccelerated
/// [VarHandle][#VH_integerDotProductAccumulatingSaturating16BitUnsignedAccelerated] - [Getter][#integerDotProductAccumulatingSaturating16BitUnsignedAccelerated()] - [Setter][#integerDotProductAccumulatingSaturating16BitUnsignedAccelerated(int)]
/// ### integerDotProductAccumulatingSaturating16BitSignedAccelerated
/// [VarHandle][#VH_integerDotProductAccumulatingSaturating16BitSignedAccelerated] - [Getter][#integerDotProductAccumulatingSaturating16BitSignedAccelerated()] - [Setter][#integerDotProductAccumulatingSaturating16BitSignedAccelerated(int)]
/// ### integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated
/// [VarHandle][#VH_integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated] - [Getter][#integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated()] - [Setter][#integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(int)]
/// ### integerDotProductAccumulatingSaturating32BitUnsignedAccelerated
/// [VarHandle][#VH_integerDotProductAccumulatingSaturating32BitUnsignedAccelerated] - [Getter][#integerDotProductAccumulatingSaturating32BitUnsignedAccelerated()] - [Setter][#integerDotProductAccumulatingSaturating32BitUnsignedAccelerated(int)]
/// ### integerDotProductAccumulatingSaturating32BitSignedAccelerated
/// [VarHandle][#VH_integerDotProductAccumulatingSaturating32BitSignedAccelerated] - [Getter][#integerDotProductAccumulatingSaturating32BitSignedAccelerated()] - [Setter][#integerDotProductAccumulatingSaturating32BitSignedAccelerated(int)]
/// ### integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated
/// [VarHandle][#VH_integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated] - [Getter][#integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated()] - [Setter][#integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(int)]
/// ### integerDotProductAccumulatingSaturating64BitUnsignedAccelerated
/// [VarHandle][#VH_integerDotProductAccumulatingSaturating64BitUnsignedAccelerated] - [Getter][#integerDotProductAccumulatingSaturating64BitUnsignedAccelerated()] - [Setter][#integerDotProductAccumulatingSaturating64BitUnsignedAccelerated(int)]
/// ### integerDotProductAccumulatingSaturating64BitSignedAccelerated
/// [VarHandle][#VH_integerDotProductAccumulatingSaturating64BitSignedAccelerated] - [Getter][#integerDotProductAccumulatingSaturating64BitSignedAccelerated()] - [Setter][#integerDotProductAccumulatingSaturating64BitSignedAccelerated(int)]
/// ### integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated
/// [VarHandle][#VH_integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated] - [Getter][#integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated()] - [Setter][#integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(int)]
/// ### storageTexelBufferOffsetAlignmentBytes
/// [VarHandle][#VH_storageTexelBufferOffsetAlignmentBytes] - [Getter][#storageTexelBufferOffsetAlignmentBytes()] - [Setter][#storageTexelBufferOffsetAlignmentBytes(long)]
/// ### storageTexelBufferOffsetSingleTexelAlignment
/// [VarHandle][#VH_storageTexelBufferOffsetSingleTexelAlignment] - [Getter][#storageTexelBufferOffsetSingleTexelAlignment()] - [Setter][#storageTexelBufferOffsetSingleTexelAlignment(int)]
/// ### uniformTexelBufferOffsetAlignmentBytes
/// [VarHandle][#VH_uniformTexelBufferOffsetAlignmentBytes] - [Getter][#uniformTexelBufferOffsetAlignmentBytes()] - [Setter][#uniformTexelBufferOffsetAlignmentBytes(long)]
/// ### uniformTexelBufferOffsetSingleTexelAlignment
/// [VarHandle][#VH_uniformTexelBufferOffsetSingleTexelAlignment] - [Getter][#uniformTexelBufferOffsetSingleTexelAlignment()] - [Setter][#uniformTexelBufferOffsetSingleTexelAlignment(int)]
/// ### maxBufferSize
/// [VarHandle][#VH_maxBufferSize] - [Getter][#maxBufferSize()] - [Setter][#maxBufferSize(long)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkPhysicalDeviceVulkan13Properties {
///     VkStructureType sType;
///     void * pNext;
///     uint32_t minSubgroupSize;
///     uint32_t maxSubgroupSize;
///     uint32_t maxComputeWorkgroupSubgroups;
///     VkShaderStageFlags requiredSubgroupSizeStages;
///     uint32_t maxInlineUniformBlockSize;
///     uint32_t maxPerStageDescriptorInlineUniformBlocks;
///     uint32_t maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks;
///     uint32_t maxDescriptorSetInlineUniformBlocks;
///     uint32_t maxDescriptorSetUpdateAfterBindInlineUniformBlocks;
///     uint32_t maxInlineUniformTotalSize;
///     VkBool32 integerDotProduct8BitUnsignedAccelerated;
///     VkBool32 integerDotProduct8BitSignedAccelerated;
///     VkBool32 integerDotProduct8BitMixedSignednessAccelerated;
///     VkBool32 integerDotProduct4x8BitPackedUnsignedAccelerated;
///     VkBool32 integerDotProduct4x8BitPackedSignedAccelerated;
///     VkBool32 integerDotProduct4x8BitPackedMixedSignednessAccelerated;
///     VkBool32 integerDotProduct16BitUnsignedAccelerated;
///     VkBool32 integerDotProduct16BitSignedAccelerated;
///     VkBool32 integerDotProduct16BitMixedSignednessAccelerated;
///     VkBool32 integerDotProduct32BitUnsignedAccelerated;
///     VkBool32 integerDotProduct32BitSignedAccelerated;
///     VkBool32 integerDotProduct32BitMixedSignednessAccelerated;
///     VkBool32 integerDotProduct64BitUnsignedAccelerated;
///     VkBool32 integerDotProduct64BitSignedAccelerated;
///     VkBool32 integerDotProduct64BitMixedSignednessAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating8BitUnsignedAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating8BitSignedAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating16BitUnsignedAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating16BitSignedAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating32BitUnsignedAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating32BitSignedAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating64BitUnsignedAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating64BitSignedAccelerated;
///     VkBool32 integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated;
///     VkDeviceSize storageTexelBufferOffsetAlignmentBytes;
///     VkBool32 storageTexelBufferOffsetSingleTexelAlignment;
///     VkDeviceSize uniformTexelBufferOffsetAlignmentBytes;
///     VkBool32 uniformTexelBufferOffsetSingleTexelAlignment;
///     VkDeviceSize maxBufferSize;
/// } VkPhysicalDeviceVulkan13Properties;
/// ```
public final class VkPhysicalDeviceVulkan13Properties extends Struct {
    /// The struct layout of `VkPhysicalDeviceVulkan13Properties`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("minSubgroupSize"),
        ValueLayout.JAVA_INT.withName("maxSubgroupSize"),
        ValueLayout.JAVA_INT.withName("maxComputeWorkgroupSubgroups"),
        ValueLayout.JAVA_INT.withName("requiredSubgroupSizeStages"),
        ValueLayout.JAVA_INT.withName("maxInlineUniformBlockSize"),
        ValueLayout.JAVA_INT.withName("maxPerStageDescriptorInlineUniformBlocks"),
        ValueLayout.JAVA_INT.withName("maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetInlineUniformBlocks"),
        ValueLayout.JAVA_INT.withName("maxDescriptorSetUpdateAfterBindInlineUniformBlocks"),
        ValueLayout.JAVA_INT.withName("maxInlineUniformTotalSize"),
        ValueLayout.JAVA_INT.withName("integerDotProduct8BitUnsignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct8BitSignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct8BitMixedSignednessAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct4x8BitPackedUnsignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct4x8BitPackedSignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct4x8BitPackedMixedSignednessAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct16BitUnsignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct16BitSignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct16BitMixedSignednessAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct32BitUnsignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct32BitSignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct32BitMixedSignednessAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct64BitUnsignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct64BitSignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProduct64BitMixedSignednessAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating8BitUnsignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating8BitSignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating16BitUnsignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating16BitSignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating32BitUnsignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating32BitSignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating64BitUnsignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating64BitSignedAccelerated"),
        ValueLayout.JAVA_INT.withName("integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated"),
        ValueLayout.JAVA_LONG.withName("storageTexelBufferOffsetAlignmentBytes"),
        ValueLayout.JAVA_INT.withName("storageTexelBufferOffsetSingleTexelAlignment"),
        ValueLayout.JAVA_LONG.withName("uniformTexelBufferOffsetAlignmentBytes"),
        ValueLayout.JAVA_INT.withName("uniformTexelBufferOffsetSingleTexelAlignment"),
        ValueLayout.JAVA_LONG.withName("maxBufferSize")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `minSubgroupSize` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_minSubgroupSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minSubgroupSize"));
    /// The [VarHandle] of `maxSubgroupSize` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxSubgroupSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSubgroupSize"));
    /// The [VarHandle] of `maxComputeWorkgroupSubgroups` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxComputeWorkgroupSubgroups = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxComputeWorkgroupSubgroups"));
    /// The [VarHandle] of `requiredSubgroupSizeStages` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_requiredSubgroupSizeStages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("requiredSubgroupSizeStages"));
    /// The [VarHandle] of `maxInlineUniformBlockSize` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxInlineUniformBlockSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxInlineUniformBlockSize"));
    /// The [VarHandle] of `maxPerStageDescriptorInlineUniformBlocks` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxPerStageDescriptorInlineUniformBlocks = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorInlineUniformBlocks"));
    /// The [VarHandle] of `maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks"));
    /// The [VarHandle] of `maxDescriptorSetInlineUniformBlocks` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxDescriptorSetInlineUniformBlocks = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetInlineUniformBlocks"));
    /// The [VarHandle] of `maxDescriptorSetUpdateAfterBindInlineUniformBlocks` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxDescriptorSetUpdateAfterBindInlineUniformBlocks = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxDescriptorSetUpdateAfterBindInlineUniformBlocks"));
    /// The [VarHandle] of `maxInlineUniformTotalSize` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxInlineUniformTotalSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxInlineUniformTotalSize"));
    /// The [VarHandle] of `integerDotProduct8BitUnsignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_integerDotProduct8BitUnsignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct8BitUnsignedAccelerated"));
    /// The [VarHandle] of `integerDotProduct8BitSignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_integerDotProduct8BitSignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct8BitSignedAccelerated"));
    /// The [VarHandle] of `integerDotProduct8BitMixedSignednessAccelerated` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_integerDotProduct8BitMixedSignednessAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct8BitMixedSignednessAccelerated"));
    /// The [VarHandle] of `integerDotProduct4x8BitPackedUnsignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_integerDotProduct4x8BitPackedUnsignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct4x8BitPackedUnsignedAccelerated"));
    /// The [VarHandle] of `integerDotProduct4x8BitPackedSignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_integerDotProduct4x8BitPackedSignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct4x8BitPackedSignedAccelerated"));
    /// The [VarHandle] of `integerDotProduct4x8BitPackedMixedSignednessAccelerated` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_integerDotProduct4x8BitPackedMixedSignednessAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct4x8BitPackedMixedSignednessAccelerated"));
    /// The [VarHandle] of `integerDotProduct16BitUnsignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_integerDotProduct16BitUnsignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct16BitUnsignedAccelerated"));
    /// The [VarHandle] of `integerDotProduct16BitSignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_integerDotProduct16BitSignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct16BitSignedAccelerated"));
    /// The [VarHandle] of `integerDotProduct16BitMixedSignednessAccelerated` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_integerDotProduct16BitMixedSignednessAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct16BitMixedSignednessAccelerated"));
    /// The [VarHandle] of `integerDotProduct32BitUnsignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_integerDotProduct32BitUnsignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct32BitUnsignedAccelerated"));
    /// The [VarHandle] of `integerDotProduct32BitSignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_integerDotProduct32BitSignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct32BitSignedAccelerated"));
    /// The [VarHandle] of `integerDotProduct32BitMixedSignednessAccelerated` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_integerDotProduct32BitMixedSignednessAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct32BitMixedSignednessAccelerated"));
    /// The [VarHandle] of `integerDotProduct64BitUnsignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_integerDotProduct64BitUnsignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct64BitUnsignedAccelerated"));
    /// The [VarHandle] of `integerDotProduct64BitSignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_integerDotProduct64BitSignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct64BitSignedAccelerated"));
    /// The [VarHandle] of `integerDotProduct64BitMixedSignednessAccelerated` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_integerDotProduct64BitMixedSignednessAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProduct64BitMixedSignednessAccelerated"));
    /// The [VarHandle] of `integerDotProductAccumulatingSaturating8BitUnsignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_integerDotProductAccumulatingSaturating8BitUnsignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating8BitUnsignedAccelerated"));
    /// The [VarHandle] of `integerDotProductAccumulatingSaturating8BitSignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_integerDotProductAccumulatingSaturating8BitSignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating8BitSignedAccelerated"));
    /// The [VarHandle] of `integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated"));
    /// The [VarHandle] of `integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated"));
    /// The [VarHandle] of `integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated"));
    /// The [VarHandle] of `integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated"));
    /// The [VarHandle] of `integerDotProductAccumulatingSaturating16BitUnsignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_integerDotProductAccumulatingSaturating16BitUnsignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating16BitUnsignedAccelerated"));
    /// The [VarHandle] of `integerDotProductAccumulatingSaturating16BitSignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_integerDotProductAccumulatingSaturating16BitSignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating16BitSignedAccelerated"));
    /// The [VarHandle] of `integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated"));
    /// The [VarHandle] of `integerDotProductAccumulatingSaturating32BitUnsignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_integerDotProductAccumulatingSaturating32BitUnsignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating32BitUnsignedAccelerated"));
    /// The [VarHandle] of `integerDotProductAccumulatingSaturating32BitSignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_integerDotProductAccumulatingSaturating32BitSignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating32BitSignedAccelerated"));
    /// The [VarHandle] of `integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated"));
    /// The [VarHandle] of `integerDotProductAccumulatingSaturating64BitUnsignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_integerDotProductAccumulatingSaturating64BitUnsignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating64BitUnsignedAccelerated"));
    /// The [VarHandle] of `integerDotProductAccumulatingSaturating64BitSignedAccelerated` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_integerDotProductAccumulatingSaturating64BitSignedAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating64BitSignedAccelerated"));
    /// The [VarHandle] of `integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated = LAYOUT.arrayElementVarHandle(PathElement.groupElement("integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated"));
    /// The [VarHandle] of `storageTexelBufferOffsetAlignmentBytes` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_storageTexelBufferOffsetAlignmentBytes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("storageTexelBufferOffsetAlignmentBytes"));
    /// The [VarHandle] of `storageTexelBufferOffsetSingleTexelAlignment` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_storageTexelBufferOffsetSingleTexelAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("storageTexelBufferOffsetSingleTexelAlignment"));
    /// The [VarHandle] of `uniformTexelBufferOffsetAlignmentBytes` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_uniformTexelBufferOffsetAlignmentBytes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("uniformTexelBufferOffsetAlignmentBytes"));
    /// The [VarHandle] of `uniformTexelBufferOffsetSingleTexelAlignment` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_uniformTexelBufferOffsetSingleTexelAlignment = LAYOUT.arrayElementVarHandle(PathElement.groupElement("uniformTexelBufferOffsetSingleTexelAlignment"));
    /// The [VarHandle] of `maxBufferSize` of type `(MemorySegment base, long baseOffset, long index)long`.
    public static final VarHandle VH_maxBufferSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxBufferSize"));

    /// Creates `VkPhysicalDeviceVulkan13Properties` with the given segment.
    /// @param segment the memory segment
    public VkPhysicalDeviceVulkan13Properties(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkPhysicalDeviceVulkan13Properties` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVulkan13Properties of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkan13Properties(segment); }

    /// Creates `VkPhysicalDeviceVulkan13Properties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVulkan13Properties ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkan13Properties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkPhysicalDeviceVulkan13Properties` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkPhysicalDeviceVulkan13Properties ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkPhysicalDeviceVulkan13Properties(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkPhysicalDeviceVulkan13Properties` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkPhysicalDeviceVulkan13Properties`
    public static VkPhysicalDeviceVulkan13Properties alloc(SegmentAllocator allocator) { return new VkPhysicalDeviceVulkan13Properties(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkPhysicalDeviceVulkan13Properties` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkPhysicalDeviceVulkan13Properties`
    public static VkPhysicalDeviceVulkan13Properties alloc(SegmentAllocator allocator, long count) { return new VkPhysicalDeviceVulkan13Properties(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkPhysicalDeviceVulkan13Properties.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkPhysicalDeviceVulkan13Properties.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkPhysicalDeviceVulkan13Properties.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkPhysicalDeviceVulkan13Properties.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties sTypeAt(long index, @CType("VkStructureType") int value) { VkPhysicalDeviceVulkan13Properties.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties sType(@CType("VkStructureType") int value) { VkPhysicalDeviceVulkan13Properties.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkPhysicalDeviceVulkan13Properties.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkPhysicalDeviceVulkan13Properties.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkPhysicalDeviceVulkan13Properties.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceVulkan13Properties.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceVulkan13Properties.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkPhysicalDeviceVulkan13Properties.set_pNext(this.segment(), value); return this; }

    /// {@return `minSubgroupSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_minSubgroupSize(MemorySegment segment, long index) { return (int) VH_minSubgroupSize.get(segment, 0L, index); }
    /// {@return `minSubgroupSize`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_minSubgroupSize(MemorySegment segment) { return VkPhysicalDeviceVulkan13Properties.get_minSubgroupSize(segment, 0L); }
    /// {@return `minSubgroupSize` at the given index}
    /// @param index the index
    public @CType("uint32_t") int minSubgroupSizeAt(long index) { return VkPhysicalDeviceVulkan13Properties.get_minSubgroupSize(this.segment(), index); }
    /// {@return `minSubgroupSize`}
    public @CType("uint32_t") int minSubgroupSize() { return VkPhysicalDeviceVulkan13Properties.get_minSubgroupSize(this.segment()); }
    /// Sets `minSubgroupSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_minSubgroupSize(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_minSubgroupSize.set(segment, 0L, index, value); }
    /// Sets `minSubgroupSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_minSubgroupSize(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan13Properties.set_minSubgroupSize(segment, 0L, value); }
    /// Sets `minSubgroupSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties minSubgroupSizeAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan13Properties.set_minSubgroupSize(this.segment(), index, value); return this; }
    /// Sets `minSubgroupSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties minSubgroupSize(@CType("uint32_t") int value) { VkPhysicalDeviceVulkan13Properties.set_minSubgroupSize(this.segment(), value); return this; }

    /// {@return `maxSubgroupSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxSubgroupSize(MemorySegment segment, long index) { return (int) VH_maxSubgroupSize.get(segment, 0L, index); }
    /// {@return `maxSubgroupSize`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxSubgroupSize(MemorySegment segment) { return VkPhysicalDeviceVulkan13Properties.get_maxSubgroupSize(segment, 0L); }
    /// {@return `maxSubgroupSize` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxSubgroupSizeAt(long index) { return VkPhysicalDeviceVulkan13Properties.get_maxSubgroupSize(this.segment(), index); }
    /// {@return `maxSubgroupSize`}
    public @CType("uint32_t") int maxSubgroupSize() { return VkPhysicalDeviceVulkan13Properties.get_maxSubgroupSize(this.segment()); }
    /// Sets `maxSubgroupSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxSubgroupSize(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxSubgroupSize.set(segment, 0L, index, value); }
    /// Sets `maxSubgroupSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxSubgroupSize(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan13Properties.set_maxSubgroupSize(segment, 0L, value); }
    /// Sets `maxSubgroupSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties maxSubgroupSizeAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan13Properties.set_maxSubgroupSize(this.segment(), index, value); return this; }
    /// Sets `maxSubgroupSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties maxSubgroupSize(@CType("uint32_t") int value) { VkPhysicalDeviceVulkan13Properties.set_maxSubgroupSize(this.segment(), value); return this; }

    /// {@return `maxComputeWorkgroupSubgroups` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxComputeWorkgroupSubgroups(MemorySegment segment, long index) { return (int) VH_maxComputeWorkgroupSubgroups.get(segment, 0L, index); }
    /// {@return `maxComputeWorkgroupSubgroups`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxComputeWorkgroupSubgroups(MemorySegment segment) { return VkPhysicalDeviceVulkan13Properties.get_maxComputeWorkgroupSubgroups(segment, 0L); }
    /// {@return `maxComputeWorkgroupSubgroups` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxComputeWorkgroupSubgroupsAt(long index) { return VkPhysicalDeviceVulkan13Properties.get_maxComputeWorkgroupSubgroups(this.segment(), index); }
    /// {@return `maxComputeWorkgroupSubgroups`}
    public @CType("uint32_t") int maxComputeWorkgroupSubgroups() { return VkPhysicalDeviceVulkan13Properties.get_maxComputeWorkgroupSubgroups(this.segment()); }
    /// Sets `maxComputeWorkgroupSubgroups` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxComputeWorkgroupSubgroups(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxComputeWorkgroupSubgroups.set(segment, 0L, index, value); }
    /// Sets `maxComputeWorkgroupSubgroups` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxComputeWorkgroupSubgroups(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan13Properties.set_maxComputeWorkgroupSubgroups(segment, 0L, value); }
    /// Sets `maxComputeWorkgroupSubgroups` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties maxComputeWorkgroupSubgroupsAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan13Properties.set_maxComputeWorkgroupSubgroups(this.segment(), index, value); return this; }
    /// Sets `maxComputeWorkgroupSubgroups` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties maxComputeWorkgroupSubgroups(@CType("uint32_t") int value) { VkPhysicalDeviceVulkan13Properties.set_maxComputeWorkgroupSubgroups(this.segment(), value); return this; }

    /// {@return `requiredSubgroupSizeStages` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkShaderStageFlags") int get_requiredSubgroupSizeStages(MemorySegment segment, long index) { return (int) VH_requiredSubgroupSizeStages.get(segment, 0L, index); }
    /// {@return `requiredSubgroupSizeStages`}
    /// @param segment the segment of the struct
    public static @CType("VkShaderStageFlags") int get_requiredSubgroupSizeStages(MemorySegment segment) { return VkPhysicalDeviceVulkan13Properties.get_requiredSubgroupSizeStages(segment, 0L); }
    /// {@return `requiredSubgroupSizeStages` at the given index}
    /// @param index the index
    public @CType("VkShaderStageFlags") int requiredSubgroupSizeStagesAt(long index) { return VkPhysicalDeviceVulkan13Properties.get_requiredSubgroupSizeStages(this.segment(), index); }
    /// {@return `requiredSubgroupSizeStages`}
    public @CType("VkShaderStageFlags") int requiredSubgroupSizeStages() { return VkPhysicalDeviceVulkan13Properties.get_requiredSubgroupSizeStages(this.segment()); }
    /// Sets `requiredSubgroupSizeStages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_requiredSubgroupSizeStages(MemorySegment segment, long index, @CType("VkShaderStageFlags") int value) { VH_requiredSubgroupSizeStages.set(segment, 0L, index, value); }
    /// Sets `requiredSubgroupSizeStages` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_requiredSubgroupSizeStages(MemorySegment segment, @CType("VkShaderStageFlags") int value) { VkPhysicalDeviceVulkan13Properties.set_requiredSubgroupSizeStages(segment, 0L, value); }
    /// Sets `requiredSubgroupSizeStages` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties requiredSubgroupSizeStagesAt(long index, @CType("VkShaderStageFlags") int value) { VkPhysicalDeviceVulkan13Properties.set_requiredSubgroupSizeStages(this.segment(), index, value); return this; }
    /// Sets `requiredSubgroupSizeStages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties requiredSubgroupSizeStages(@CType("VkShaderStageFlags") int value) { VkPhysicalDeviceVulkan13Properties.set_requiredSubgroupSizeStages(this.segment(), value); return this; }

    /// {@return `maxInlineUniformBlockSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxInlineUniformBlockSize(MemorySegment segment, long index) { return (int) VH_maxInlineUniformBlockSize.get(segment, 0L, index); }
    /// {@return `maxInlineUniformBlockSize`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxInlineUniformBlockSize(MemorySegment segment) { return VkPhysicalDeviceVulkan13Properties.get_maxInlineUniformBlockSize(segment, 0L); }
    /// {@return `maxInlineUniformBlockSize` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxInlineUniformBlockSizeAt(long index) { return VkPhysicalDeviceVulkan13Properties.get_maxInlineUniformBlockSize(this.segment(), index); }
    /// {@return `maxInlineUniformBlockSize`}
    public @CType("uint32_t") int maxInlineUniformBlockSize() { return VkPhysicalDeviceVulkan13Properties.get_maxInlineUniformBlockSize(this.segment()); }
    /// Sets `maxInlineUniformBlockSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxInlineUniformBlockSize(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxInlineUniformBlockSize.set(segment, 0L, index, value); }
    /// Sets `maxInlineUniformBlockSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxInlineUniformBlockSize(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan13Properties.set_maxInlineUniformBlockSize(segment, 0L, value); }
    /// Sets `maxInlineUniformBlockSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties maxInlineUniformBlockSizeAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan13Properties.set_maxInlineUniformBlockSize(this.segment(), index, value); return this; }
    /// Sets `maxInlineUniformBlockSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties maxInlineUniformBlockSize(@CType("uint32_t") int value) { VkPhysicalDeviceVulkan13Properties.set_maxInlineUniformBlockSize(this.segment(), value); return this; }

    /// {@return `maxPerStageDescriptorInlineUniformBlocks` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxPerStageDescriptorInlineUniformBlocks(MemorySegment segment, long index) { return (int) VH_maxPerStageDescriptorInlineUniformBlocks.get(segment, 0L, index); }
    /// {@return `maxPerStageDescriptorInlineUniformBlocks`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxPerStageDescriptorInlineUniformBlocks(MemorySegment segment) { return VkPhysicalDeviceVulkan13Properties.get_maxPerStageDescriptorInlineUniformBlocks(segment, 0L); }
    /// {@return `maxPerStageDescriptorInlineUniformBlocks` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxPerStageDescriptorInlineUniformBlocksAt(long index) { return VkPhysicalDeviceVulkan13Properties.get_maxPerStageDescriptorInlineUniformBlocks(this.segment(), index); }
    /// {@return `maxPerStageDescriptorInlineUniformBlocks`}
    public @CType("uint32_t") int maxPerStageDescriptorInlineUniformBlocks() { return VkPhysicalDeviceVulkan13Properties.get_maxPerStageDescriptorInlineUniformBlocks(this.segment()); }
    /// Sets `maxPerStageDescriptorInlineUniformBlocks` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxPerStageDescriptorInlineUniformBlocks(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxPerStageDescriptorInlineUniformBlocks.set(segment, 0L, index, value); }
    /// Sets `maxPerStageDescriptorInlineUniformBlocks` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxPerStageDescriptorInlineUniformBlocks(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan13Properties.set_maxPerStageDescriptorInlineUniformBlocks(segment, 0L, value); }
    /// Sets `maxPerStageDescriptorInlineUniformBlocks` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties maxPerStageDescriptorInlineUniformBlocksAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan13Properties.set_maxPerStageDescriptorInlineUniformBlocks(this.segment(), index, value); return this; }
    /// Sets `maxPerStageDescriptorInlineUniformBlocks` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties maxPerStageDescriptorInlineUniformBlocks(@CType("uint32_t") int value) { VkPhysicalDeviceVulkan13Properties.set_maxPerStageDescriptorInlineUniformBlocks(this.segment(), value); return this; }

    /// {@return `maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(MemorySegment segment, long index) { return (int) VH_maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks.get(segment, 0L, index); }
    /// {@return `maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(MemorySegment segment) { return VkPhysicalDeviceVulkan13Properties.get_maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(segment, 0L); }
    /// {@return `maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxPerStageDescriptorUpdateAfterBindInlineUniformBlocksAt(long index) { return VkPhysicalDeviceVulkan13Properties.get_maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(this.segment(), index); }
    /// {@return `maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks`}
    public @CType("uint32_t") int maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks() { return VkPhysicalDeviceVulkan13Properties.get_maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(this.segment()); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks.set(segment, 0L, index, value); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan13Properties.set_maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(segment, 0L, value); }
    /// Sets `maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties maxPerStageDescriptorUpdateAfterBindInlineUniformBlocksAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan13Properties.set_maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(this.segment(), index, value); return this; }
    /// Sets `maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(@CType("uint32_t") int value) { VkPhysicalDeviceVulkan13Properties.set_maxPerStageDescriptorUpdateAfterBindInlineUniformBlocks(this.segment(), value); return this; }

    /// {@return `maxDescriptorSetInlineUniformBlocks` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxDescriptorSetInlineUniformBlocks(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetInlineUniformBlocks.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetInlineUniformBlocks`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxDescriptorSetInlineUniformBlocks(MemorySegment segment) { return VkPhysicalDeviceVulkan13Properties.get_maxDescriptorSetInlineUniformBlocks(segment, 0L); }
    /// {@return `maxDescriptorSetInlineUniformBlocks` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxDescriptorSetInlineUniformBlocksAt(long index) { return VkPhysicalDeviceVulkan13Properties.get_maxDescriptorSetInlineUniformBlocks(this.segment(), index); }
    /// {@return `maxDescriptorSetInlineUniformBlocks`}
    public @CType("uint32_t") int maxDescriptorSetInlineUniformBlocks() { return VkPhysicalDeviceVulkan13Properties.get_maxDescriptorSetInlineUniformBlocks(this.segment()); }
    /// Sets `maxDescriptorSetInlineUniformBlocks` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxDescriptorSetInlineUniformBlocks(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxDescriptorSetInlineUniformBlocks.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetInlineUniformBlocks` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxDescriptorSetInlineUniformBlocks(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan13Properties.set_maxDescriptorSetInlineUniformBlocks(segment, 0L, value); }
    /// Sets `maxDescriptorSetInlineUniformBlocks` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties maxDescriptorSetInlineUniformBlocksAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan13Properties.set_maxDescriptorSetInlineUniformBlocks(this.segment(), index, value); return this; }
    /// Sets `maxDescriptorSetInlineUniformBlocks` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties maxDescriptorSetInlineUniformBlocks(@CType("uint32_t") int value) { VkPhysicalDeviceVulkan13Properties.set_maxDescriptorSetInlineUniformBlocks(this.segment(), value); return this; }

    /// {@return `maxDescriptorSetUpdateAfterBindInlineUniformBlocks` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxDescriptorSetUpdateAfterBindInlineUniformBlocks(MemorySegment segment, long index) { return (int) VH_maxDescriptorSetUpdateAfterBindInlineUniformBlocks.get(segment, 0L, index); }
    /// {@return `maxDescriptorSetUpdateAfterBindInlineUniformBlocks`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxDescriptorSetUpdateAfterBindInlineUniformBlocks(MemorySegment segment) { return VkPhysicalDeviceVulkan13Properties.get_maxDescriptorSetUpdateAfterBindInlineUniformBlocks(segment, 0L); }
    /// {@return `maxDescriptorSetUpdateAfterBindInlineUniformBlocks` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxDescriptorSetUpdateAfterBindInlineUniformBlocksAt(long index) { return VkPhysicalDeviceVulkan13Properties.get_maxDescriptorSetUpdateAfterBindInlineUniformBlocks(this.segment(), index); }
    /// {@return `maxDescriptorSetUpdateAfterBindInlineUniformBlocks`}
    public @CType("uint32_t") int maxDescriptorSetUpdateAfterBindInlineUniformBlocks() { return VkPhysicalDeviceVulkan13Properties.get_maxDescriptorSetUpdateAfterBindInlineUniformBlocks(this.segment()); }
    /// Sets `maxDescriptorSetUpdateAfterBindInlineUniformBlocks` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxDescriptorSetUpdateAfterBindInlineUniformBlocks(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxDescriptorSetUpdateAfterBindInlineUniformBlocks.set(segment, 0L, index, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindInlineUniformBlocks` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxDescriptorSetUpdateAfterBindInlineUniformBlocks(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan13Properties.set_maxDescriptorSetUpdateAfterBindInlineUniformBlocks(segment, 0L, value); }
    /// Sets `maxDescriptorSetUpdateAfterBindInlineUniformBlocks` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties maxDescriptorSetUpdateAfterBindInlineUniformBlocksAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan13Properties.set_maxDescriptorSetUpdateAfterBindInlineUniformBlocks(this.segment(), index, value); return this; }
    /// Sets `maxDescriptorSetUpdateAfterBindInlineUniformBlocks` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties maxDescriptorSetUpdateAfterBindInlineUniformBlocks(@CType("uint32_t") int value) { VkPhysicalDeviceVulkan13Properties.set_maxDescriptorSetUpdateAfterBindInlineUniformBlocks(this.segment(), value); return this; }

    /// {@return `maxInlineUniformTotalSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxInlineUniformTotalSize(MemorySegment segment, long index) { return (int) VH_maxInlineUniformTotalSize.get(segment, 0L, index); }
    /// {@return `maxInlineUniformTotalSize`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxInlineUniformTotalSize(MemorySegment segment) { return VkPhysicalDeviceVulkan13Properties.get_maxInlineUniformTotalSize(segment, 0L); }
    /// {@return `maxInlineUniformTotalSize` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxInlineUniformTotalSizeAt(long index) { return VkPhysicalDeviceVulkan13Properties.get_maxInlineUniformTotalSize(this.segment(), index); }
    /// {@return `maxInlineUniformTotalSize`}
    public @CType("uint32_t") int maxInlineUniformTotalSize() { return VkPhysicalDeviceVulkan13Properties.get_maxInlineUniformTotalSize(this.segment()); }
    /// Sets `maxInlineUniformTotalSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxInlineUniformTotalSize(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxInlineUniformTotalSize.set(segment, 0L, index, value); }
    /// Sets `maxInlineUniformTotalSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxInlineUniformTotalSize(MemorySegment segment, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan13Properties.set_maxInlineUniformTotalSize(segment, 0L, value); }
    /// Sets `maxInlineUniformTotalSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties maxInlineUniformTotalSizeAt(long index, @CType("uint32_t") int value) { VkPhysicalDeviceVulkan13Properties.set_maxInlineUniformTotalSize(this.segment(), index, value); return this; }
    /// Sets `maxInlineUniformTotalSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties maxInlineUniformTotalSize(@CType("uint32_t") int value) { VkPhysicalDeviceVulkan13Properties.set_maxInlineUniformTotalSize(this.segment(), value); return this; }

    /// {@return `integerDotProduct8BitUnsignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_integerDotProduct8BitUnsignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProduct8BitUnsignedAccelerated.get(segment, 0L, index); }
    /// {@return `integerDotProduct8BitUnsignedAccelerated`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_integerDotProduct8BitUnsignedAccelerated(MemorySegment segment) { return VkPhysicalDeviceVulkan13Properties.get_integerDotProduct8BitUnsignedAccelerated(segment, 0L); }
    /// {@return `integerDotProduct8BitUnsignedAccelerated` at the given index}
    /// @param index the index
    public @CType("VkBool32") int integerDotProduct8BitUnsignedAcceleratedAt(long index) { return VkPhysicalDeviceVulkan13Properties.get_integerDotProduct8BitUnsignedAccelerated(this.segment(), index); }
    /// {@return `integerDotProduct8BitUnsignedAccelerated`}
    public @CType("VkBool32") int integerDotProduct8BitUnsignedAccelerated() { return VkPhysicalDeviceVulkan13Properties.get_integerDotProduct8BitUnsignedAccelerated(this.segment()); }
    /// Sets `integerDotProduct8BitUnsignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_integerDotProduct8BitUnsignedAccelerated(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_integerDotProduct8BitUnsignedAccelerated.set(segment, 0L, index, value); }
    /// Sets `integerDotProduct8BitUnsignedAccelerated` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_integerDotProduct8BitUnsignedAccelerated(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProduct8BitUnsignedAccelerated(segment, 0L, value); }
    /// Sets `integerDotProduct8BitUnsignedAccelerated` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProduct8BitUnsignedAcceleratedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProduct8BitUnsignedAccelerated(this.segment(), index, value); return this; }
    /// Sets `integerDotProduct8BitUnsignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProduct8BitUnsignedAccelerated(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProduct8BitUnsignedAccelerated(this.segment(), value); return this; }

    /// {@return `integerDotProduct8BitSignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_integerDotProduct8BitSignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProduct8BitSignedAccelerated.get(segment, 0L, index); }
    /// {@return `integerDotProduct8BitSignedAccelerated`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_integerDotProduct8BitSignedAccelerated(MemorySegment segment) { return VkPhysicalDeviceVulkan13Properties.get_integerDotProduct8BitSignedAccelerated(segment, 0L); }
    /// {@return `integerDotProduct8BitSignedAccelerated` at the given index}
    /// @param index the index
    public @CType("VkBool32") int integerDotProduct8BitSignedAcceleratedAt(long index) { return VkPhysicalDeviceVulkan13Properties.get_integerDotProduct8BitSignedAccelerated(this.segment(), index); }
    /// {@return `integerDotProduct8BitSignedAccelerated`}
    public @CType("VkBool32") int integerDotProduct8BitSignedAccelerated() { return VkPhysicalDeviceVulkan13Properties.get_integerDotProduct8BitSignedAccelerated(this.segment()); }
    /// Sets `integerDotProduct8BitSignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_integerDotProduct8BitSignedAccelerated(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_integerDotProduct8BitSignedAccelerated.set(segment, 0L, index, value); }
    /// Sets `integerDotProduct8BitSignedAccelerated` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_integerDotProduct8BitSignedAccelerated(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProduct8BitSignedAccelerated(segment, 0L, value); }
    /// Sets `integerDotProduct8BitSignedAccelerated` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProduct8BitSignedAcceleratedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProduct8BitSignedAccelerated(this.segment(), index, value); return this; }
    /// Sets `integerDotProduct8BitSignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProduct8BitSignedAccelerated(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProduct8BitSignedAccelerated(this.segment(), value); return this; }

    /// {@return `integerDotProduct8BitMixedSignednessAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_integerDotProduct8BitMixedSignednessAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProduct8BitMixedSignednessAccelerated.get(segment, 0L, index); }
    /// {@return `integerDotProduct8BitMixedSignednessAccelerated`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_integerDotProduct8BitMixedSignednessAccelerated(MemorySegment segment) { return VkPhysicalDeviceVulkan13Properties.get_integerDotProduct8BitMixedSignednessAccelerated(segment, 0L); }
    /// {@return `integerDotProduct8BitMixedSignednessAccelerated` at the given index}
    /// @param index the index
    public @CType("VkBool32") int integerDotProduct8BitMixedSignednessAcceleratedAt(long index) { return VkPhysicalDeviceVulkan13Properties.get_integerDotProduct8BitMixedSignednessAccelerated(this.segment(), index); }
    /// {@return `integerDotProduct8BitMixedSignednessAccelerated`}
    public @CType("VkBool32") int integerDotProduct8BitMixedSignednessAccelerated() { return VkPhysicalDeviceVulkan13Properties.get_integerDotProduct8BitMixedSignednessAccelerated(this.segment()); }
    /// Sets `integerDotProduct8BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_integerDotProduct8BitMixedSignednessAccelerated(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_integerDotProduct8BitMixedSignednessAccelerated.set(segment, 0L, index, value); }
    /// Sets `integerDotProduct8BitMixedSignednessAccelerated` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_integerDotProduct8BitMixedSignednessAccelerated(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProduct8BitMixedSignednessAccelerated(segment, 0L, value); }
    /// Sets `integerDotProduct8BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProduct8BitMixedSignednessAcceleratedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProduct8BitMixedSignednessAccelerated(this.segment(), index, value); return this; }
    /// Sets `integerDotProduct8BitMixedSignednessAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProduct8BitMixedSignednessAccelerated(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProduct8BitMixedSignednessAccelerated(this.segment(), value); return this; }

    /// {@return `integerDotProduct4x8BitPackedUnsignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_integerDotProduct4x8BitPackedUnsignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProduct4x8BitPackedUnsignedAccelerated.get(segment, 0L, index); }
    /// {@return `integerDotProduct4x8BitPackedUnsignedAccelerated`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_integerDotProduct4x8BitPackedUnsignedAccelerated(MemorySegment segment) { return VkPhysicalDeviceVulkan13Properties.get_integerDotProduct4x8BitPackedUnsignedAccelerated(segment, 0L); }
    /// {@return `integerDotProduct4x8BitPackedUnsignedAccelerated` at the given index}
    /// @param index the index
    public @CType("VkBool32") int integerDotProduct4x8BitPackedUnsignedAcceleratedAt(long index) { return VkPhysicalDeviceVulkan13Properties.get_integerDotProduct4x8BitPackedUnsignedAccelerated(this.segment(), index); }
    /// {@return `integerDotProduct4x8BitPackedUnsignedAccelerated`}
    public @CType("VkBool32") int integerDotProduct4x8BitPackedUnsignedAccelerated() { return VkPhysicalDeviceVulkan13Properties.get_integerDotProduct4x8BitPackedUnsignedAccelerated(this.segment()); }
    /// Sets `integerDotProduct4x8BitPackedUnsignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_integerDotProduct4x8BitPackedUnsignedAccelerated(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_integerDotProduct4x8BitPackedUnsignedAccelerated.set(segment, 0L, index, value); }
    /// Sets `integerDotProduct4x8BitPackedUnsignedAccelerated` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_integerDotProduct4x8BitPackedUnsignedAccelerated(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProduct4x8BitPackedUnsignedAccelerated(segment, 0L, value); }
    /// Sets `integerDotProduct4x8BitPackedUnsignedAccelerated` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProduct4x8BitPackedUnsignedAcceleratedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProduct4x8BitPackedUnsignedAccelerated(this.segment(), index, value); return this; }
    /// Sets `integerDotProduct4x8BitPackedUnsignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProduct4x8BitPackedUnsignedAccelerated(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProduct4x8BitPackedUnsignedAccelerated(this.segment(), value); return this; }

    /// {@return `integerDotProduct4x8BitPackedSignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_integerDotProduct4x8BitPackedSignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProduct4x8BitPackedSignedAccelerated.get(segment, 0L, index); }
    /// {@return `integerDotProduct4x8BitPackedSignedAccelerated`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_integerDotProduct4x8BitPackedSignedAccelerated(MemorySegment segment) { return VkPhysicalDeviceVulkan13Properties.get_integerDotProduct4x8BitPackedSignedAccelerated(segment, 0L); }
    /// {@return `integerDotProduct4x8BitPackedSignedAccelerated` at the given index}
    /// @param index the index
    public @CType("VkBool32") int integerDotProduct4x8BitPackedSignedAcceleratedAt(long index) { return VkPhysicalDeviceVulkan13Properties.get_integerDotProduct4x8BitPackedSignedAccelerated(this.segment(), index); }
    /// {@return `integerDotProduct4x8BitPackedSignedAccelerated`}
    public @CType("VkBool32") int integerDotProduct4x8BitPackedSignedAccelerated() { return VkPhysicalDeviceVulkan13Properties.get_integerDotProduct4x8BitPackedSignedAccelerated(this.segment()); }
    /// Sets `integerDotProduct4x8BitPackedSignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_integerDotProduct4x8BitPackedSignedAccelerated(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_integerDotProduct4x8BitPackedSignedAccelerated.set(segment, 0L, index, value); }
    /// Sets `integerDotProduct4x8BitPackedSignedAccelerated` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_integerDotProduct4x8BitPackedSignedAccelerated(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProduct4x8BitPackedSignedAccelerated(segment, 0L, value); }
    /// Sets `integerDotProduct4x8BitPackedSignedAccelerated` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProduct4x8BitPackedSignedAcceleratedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProduct4x8BitPackedSignedAccelerated(this.segment(), index, value); return this; }
    /// Sets `integerDotProduct4x8BitPackedSignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProduct4x8BitPackedSignedAccelerated(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProduct4x8BitPackedSignedAccelerated(this.segment(), value); return this; }

    /// {@return `integerDotProduct4x8BitPackedMixedSignednessAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_integerDotProduct4x8BitPackedMixedSignednessAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProduct4x8BitPackedMixedSignednessAccelerated.get(segment, 0L, index); }
    /// {@return `integerDotProduct4x8BitPackedMixedSignednessAccelerated`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_integerDotProduct4x8BitPackedMixedSignednessAccelerated(MemorySegment segment) { return VkPhysicalDeviceVulkan13Properties.get_integerDotProduct4x8BitPackedMixedSignednessAccelerated(segment, 0L); }
    /// {@return `integerDotProduct4x8BitPackedMixedSignednessAccelerated` at the given index}
    /// @param index the index
    public @CType("VkBool32") int integerDotProduct4x8BitPackedMixedSignednessAcceleratedAt(long index) { return VkPhysicalDeviceVulkan13Properties.get_integerDotProduct4x8BitPackedMixedSignednessAccelerated(this.segment(), index); }
    /// {@return `integerDotProduct4x8BitPackedMixedSignednessAccelerated`}
    public @CType("VkBool32") int integerDotProduct4x8BitPackedMixedSignednessAccelerated() { return VkPhysicalDeviceVulkan13Properties.get_integerDotProduct4x8BitPackedMixedSignednessAccelerated(this.segment()); }
    /// Sets `integerDotProduct4x8BitPackedMixedSignednessAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_integerDotProduct4x8BitPackedMixedSignednessAccelerated(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_integerDotProduct4x8BitPackedMixedSignednessAccelerated.set(segment, 0L, index, value); }
    /// Sets `integerDotProduct4x8BitPackedMixedSignednessAccelerated` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_integerDotProduct4x8BitPackedMixedSignednessAccelerated(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProduct4x8BitPackedMixedSignednessAccelerated(segment, 0L, value); }
    /// Sets `integerDotProduct4x8BitPackedMixedSignednessAccelerated` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProduct4x8BitPackedMixedSignednessAcceleratedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProduct4x8BitPackedMixedSignednessAccelerated(this.segment(), index, value); return this; }
    /// Sets `integerDotProduct4x8BitPackedMixedSignednessAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProduct4x8BitPackedMixedSignednessAccelerated(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProduct4x8BitPackedMixedSignednessAccelerated(this.segment(), value); return this; }

    /// {@return `integerDotProduct16BitUnsignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_integerDotProduct16BitUnsignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProduct16BitUnsignedAccelerated.get(segment, 0L, index); }
    /// {@return `integerDotProduct16BitUnsignedAccelerated`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_integerDotProduct16BitUnsignedAccelerated(MemorySegment segment) { return VkPhysicalDeviceVulkan13Properties.get_integerDotProduct16BitUnsignedAccelerated(segment, 0L); }
    /// {@return `integerDotProduct16BitUnsignedAccelerated` at the given index}
    /// @param index the index
    public @CType("VkBool32") int integerDotProduct16BitUnsignedAcceleratedAt(long index) { return VkPhysicalDeviceVulkan13Properties.get_integerDotProduct16BitUnsignedAccelerated(this.segment(), index); }
    /// {@return `integerDotProduct16BitUnsignedAccelerated`}
    public @CType("VkBool32") int integerDotProduct16BitUnsignedAccelerated() { return VkPhysicalDeviceVulkan13Properties.get_integerDotProduct16BitUnsignedAccelerated(this.segment()); }
    /// Sets `integerDotProduct16BitUnsignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_integerDotProduct16BitUnsignedAccelerated(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_integerDotProduct16BitUnsignedAccelerated.set(segment, 0L, index, value); }
    /// Sets `integerDotProduct16BitUnsignedAccelerated` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_integerDotProduct16BitUnsignedAccelerated(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProduct16BitUnsignedAccelerated(segment, 0L, value); }
    /// Sets `integerDotProduct16BitUnsignedAccelerated` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProduct16BitUnsignedAcceleratedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProduct16BitUnsignedAccelerated(this.segment(), index, value); return this; }
    /// Sets `integerDotProduct16BitUnsignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProduct16BitUnsignedAccelerated(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProduct16BitUnsignedAccelerated(this.segment(), value); return this; }

    /// {@return `integerDotProduct16BitSignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_integerDotProduct16BitSignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProduct16BitSignedAccelerated.get(segment, 0L, index); }
    /// {@return `integerDotProduct16BitSignedAccelerated`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_integerDotProduct16BitSignedAccelerated(MemorySegment segment) { return VkPhysicalDeviceVulkan13Properties.get_integerDotProduct16BitSignedAccelerated(segment, 0L); }
    /// {@return `integerDotProduct16BitSignedAccelerated` at the given index}
    /// @param index the index
    public @CType("VkBool32") int integerDotProduct16BitSignedAcceleratedAt(long index) { return VkPhysicalDeviceVulkan13Properties.get_integerDotProduct16BitSignedAccelerated(this.segment(), index); }
    /// {@return `integerDotProduct16BitSignedAccelerated`}
    public @CType("VkBool32") int integerDotProduct16BitSignedAccelerated() { return VkPhysicalDeviceVulkan13Properties.get_integerDotProduct16BitSignedAccelerated(this.segment()); }
    /// Sets `integerDotProduct16BitSignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_integerDotProduct16BitSignedAccelerated(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_integerDotProduct16BitSignedAccelerated.set(segment, 0L, index, value); }
    /// Sets `integerDotProduct16BitSignedAccelerated` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_integerDotProduct16BitSignedAccelerated(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProduct16BitSignedAccelerated(segment, 0L, value); }
    /// Sets `integerDotProduct16BitSignedAccelerated` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProduct16BitSignedAcceleratedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProduct16BitSignedAccelerated(this.segment(), index, value); return this; }
    /// Sets `integerDotProduct16BitSignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProduct16BitSignedAccelerated(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProduct16BitSignedAccelerated(this.segment(), value); return this; }

    /// {@return `integerDotProduct16BitMixedSignednessAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_integerDotProduct16BitMixedSignednessAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProduct16BitMixedSignednessAccelerated.get(segment, 0L, index); }
    /// {@return `integerDotProduct16BitMixedSignednessAccelerated`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_integerDotProduct16BitMixedSignednessAccelerated(MemorySegment segment) { return VkPhysicalDeviceVulkan13Properties.get_integerDotProduct16BitMixedSignednessAccelerated(segment, 0L); }
    /// {@return `integerDotProduct16BitMixedSignednessAccelerated` at the given index}
    /// @param index the index
    public @CType("VkBool32") int integerDotProduct16BitMixedSignednessAcceleratedAt(long index) { return VkPhysicalDeviceVulkan13Properties.get_integerDotProduct16BitMixedSignednessAccelerated(this.segment(), index); }
    /// {@return `integerDotProduct16BitMixedSignednessAccelerated`}
    public @CType("VkBool32") int integerDotProduct16BitMixedSignednessAccelerated() { return VkPhysicalDeviceVulkan13Properties.get_integerDotProduct16BitMixedSignednessAccelerated(this.segment()); }
    /// Sets `integerDotProduct16BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_integerDotProduct16BitMixedSignednessAccelerated(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_integerDotProduct16BitMixedSignednessAccelerated.set(segment, 0L, index, value); }
    /// Sets `integerDotProduct16BitMixedSignednessAccelerated` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_integerDotProduct16BitMixedSignednessAccelerated(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProduct16BitMixedSignednessAccelerated(segment, 0L, value); }
    /// Sets `integerDotProduct16BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProduct16BitMixedSignednessAcceleratedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProduct16BitMixedSignednessAccelerated(this.segment(), index, value); return this; }
    /// Sets `integerDotProduct16BitMixedSignednessAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProduct16BitMixedSignednessAccelerated(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProduct16BitMixedSignednessAccelerated(this.segment(), value); return this; }

    /// {@return `integerDotProduct32BitUnsignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_integerDotProduct32BitUnsignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProduct32BitUnsignedAccelerated.get(segment, 0L, index); }
    /// {@return `integerDotProduct32BitUnsignedAccelerated`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_integerDotProduct32BitUnsignedAccelerated(MemorySegment segment) { return VkPhysicalDeviceVulkan13Properties.get_integerDotProduct32BitUnsignedAccelerated(segment, 0L); }
    /// {@return `integerDotProduct32BitUnsignedAccelerated` at the given index}
    /// @param index the index
    public @CType("VkBool32") int integerDotProduct32BitUnsignedAcceleratedAt(long index) { return VkPhysicalDeviceVulkan13Properties.get_integerDotProduct32BitUnsignedAccelerated(this.segment(), index); }
    /// {@return `integerDotProduct32BitUnsignedAccelerated`}
    public @CType("VkBool32") int integerDotProduct32BitUnsignedAccelerated() { return VkPhysicalDeviceVulkan13Properties.get_integerDotProduct32BitUnsignedAccelerated(this.segment()); }
    /// Sets `integerDotProduct32BitUnsignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_integerDotProduct32BitUnsignedAccelerated(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_integerDotProduct32BitUnsignedAccelerated.set(segment, 0L, index, value); }
    /// Sets `integerDotProduct32BitUnsignedAccelerated` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_integerDotProduct32BitUnsignedAccelerated(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProduct32BitUnsignedAccelerated(segment, 0L, value); }
    /// Sets `integerDotProduct32BitUnsignedAccelerated` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProduct32BitUnsignedAcceleratedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProduct32BitUnsignedAccelerated(this.segment(), index, value); return this; }
    /// Sets `integerDotProduct32BitUnsignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProduct32BitUnsignedAccelerated(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProduct32BitUnsignedAccelerated(this.segment(), value); return this; }

    /// {@return `integerDotProduct32BitSignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_integerDotProduct32BitSignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProduct32BitSignedAccelerated.get(segment, 0L, index); }
    /// {@return `integerDotProduct32BitSignedAccelerated`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_integerDotProduct32BitSignedAccelerated(MemorySegment segment) { return VkPhysicalDeviceVulkan13Properties.get_integerDotProduct32BitSignedAccelerated(segment, 0L); }
    /// {@return `integerDotProduct32BitSignedAccelerated` at the given index}
    /// @param index the index
    public @CType("VkBool32") int integerDotProduct32BitSignedAcceleratedAt(long index) { return VkPhysicalDeviceVulkan13Properties.get_integerDotProduct32BitSignedAccelerated(this.segment(), index); }
    /// {@return `integerDotProduct32BitSignedAccelerated`}
    public @CType("VkBool32") int integerDotProduct32BitSignedAccelerated() { return VkPhysicalDeviceVulkan13Properties.get_integerDotProduct32BitSignedAccelerated(this.segment()); }
    /// Sets `integerDotProduct32BitSignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_integerDotProduct32BitSignedAccelerated(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_integerDotProduct32BitSignedAccelerated.set(segment, 0L, index, value); }
    /// Sets `integerDotProduct32BitSignedAccelerated` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_integerDotProduct32BitSignedAccelerated(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProduct32BitSignedAccelerated(segment, 0L, value); }
    /// Sets `integerDotProduct32BitSignedAccelerated` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProduct32BitSignedAcceleratedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProduct32BitSignedAccelerated(this.segment(), index, value); return this; }
    /// Sets `integerDotProduct32BitSignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProduct32BitSignedAccelerated(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProduct32BitSignedAccelerated(this.segment(), value); return this; }

    /// {@return `integerDotProduct32BitMixedSignednessAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_integerDotProduct32BitMixedSignednessAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProduct32BitMixedSignednessAccelerated.get(segment, 0L, index); }
    /// {@return `integerDotProduct32BitMixedSignednessAccelerated`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_integerDotProduct32BitMixedSignednessAccelerated(MemorySegment segment) { return VkPhysicalDeviceVulkan13Properties.get_integerDotProduct32BitMixedSignednessAccelerated(segment, 0L); }
    /// {@return `integerDotProduct32BitMixedSignednessAccelerated` at the given index}
    /// @param index the index
    public @CType("VkBool32") int integerDotProduct32BitMixedSignednessAcceleratedAt(long index) { return VkPhysicalDeviceVulkan13Properties.get_integerDotProduct32BitMixedSignednessAccelerated(this.segment(), index); }
    /// {@return `integerDotProduct32BitMixedSignednessAccelerated`}
    public @CType("VkBool32") int integerDotProduct32BitMixedSignednessAccelerated() { return VkPhysicalDeviceVulkan13Properties.get_integerDotProduct32BitMixedSignednessAccelerated(this.segment()); }
    /// Sets `integerDotProduct32BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_integerDotProduct32BitMixedSignednessAccelerated(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_integerDotProduct32BitMixedSignednessAccelerated.set(segment, 0L, index, value); }
    /// Sets `integerDotProduct32BitMixedSignednessAccelerated` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_integerDotProduct32BitMixedSignednessAccelerated(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProduct32BitMixedSignednessAccelerated(segment, 0L, value); }
    /// Sets `integerDotProduct32BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProduct32BitMixedSignednessAcceleratedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProduct32BitMixedSignednessAccelerated(this.segment(), index, value); return this; }
    /// Sets `integerDotProduct32BitMixedSignednessAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProduct32BitMixedSignednessAccelerated(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProduct32BitMixedSignednessAccelerated(this.segment(), value); return this; }

    /// {@return `integerDotProduct64BitUnsignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_integerDotProduct64BitUnsignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProduct64BitUnsignedAccelerated.get(segment, 0L, index); }
    /// {@return `integerDotProduct64BitUnsignedAccelerated`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_integerDotProduct64BitUnsignedAccelerated(MemorySegment segment) { return VkPhysicalDeviceVulkan13Properties.get_integerDotProduct64BitUnsignedAccelerated(segment, 0L); }
    /// {@return `integerDotProduct64BitUnsignedAccelerated` at the given index}
    /// @param index the index
    public @CType("VkBool32") int integerDotProduct64BitUnsignedAcceleratedAt(long index) { return VkPhysicalDeviceVulkan13Properties.get_integerDotProduct64BitUnsignedAccelerated(this.segment(), index); }
    /// {@return `integerDotProduct64BitUnsignedAccelerated`}
    public @CType("VkBool32") int integerDotProduct64BitUnsignedAccelerated() { return VkPhysicalDeviceVulkan13Properties.get_integerDotProduct64BitUnsignedAccelerated(this.segment()); }
    /// Sets `integerDotProduct64BitUnsignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_integerDotProduct64BitUnsignedAccelerated(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_integerDotProduct64BitUnsignedAccelerated.set(segment, 0L, index, value); }
    /// Sets `integerDotProduct64BitUnsignedAccelerated` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_integerDotProduct64BitUnsignedAccelerated(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProduct64BitUnsignedAccelerated(segment, 0L, value); }
    /// Sets `integerDotProduct64BitUnsignedAccelerated` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProduct64BitUnsignedAcceleratedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProduct64BitUnsignedAccelerated(this.segment(), index, value); return this; }
    /// Sets `integerDotProduct64BitUnsignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProduct64BitUnsignedAccelerated(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProduct64BitUnsignedAccelerated(this.segment(), value); return this; }

    /// {@return `integerDotProduct64BitSignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_integerDotProduct64BitSignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProduct64BitSignedAccelerated.get(segment, 0L, index); }
    /// {@return `integerDotProduct64BitSignedAccelerated`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_integerDotProduct64BitSignedAccelerated(MemorySegment segment) { return VkPhysicalDeviceVulkan13Properties.get_integerDotProduct64BitSignedAccelerated(segment, 0L); }
    /// {@return `integerDotProduct64BitSignedAccelerated` at the given index}
    /// @param index the index
    public @CType("VkBool32") int integerDotProduct64BitSignedAcceleratedAt(long index) { return VkPhysicalDeviceVulkan13Properties.get_integerDotProduct64BitSignedAccelerated(this.segment(), index); }
    /// {@return `integerDotProduct64BitSignedAccelerated`}
    public @CType("VkBool32") int integerDotProduct64BitSignedAccelerated() { return VkPhysicalDeviceVulkan13Properties.get_integerDotProduct64BitSignedAccelerated(this.segment()); }
    /// Sets `integerDotProduct64BitSignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_integerDotProduct64BitSignedAccelerated(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_integerDotProduct64BitSignedAccelerated.set(segment, 0L, index, value); }
    /// Sets `integerDotProduct64BitSignedAccelerated` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_integerDotProduct64BitSignedAccelerated(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProduct64BitSignedAccelerated(segment, 0L, value); }
    /// Sets `integerDotProduct64BitSignedAccelerated` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProduct64BitSignedAcceleratedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProduct64BitSignedAccelerated(this.segment(), index, value); return this; }
    /// Sets `integerDotProduct64BitSignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProduct64BitSignedAccelerated(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProduct64BitSignedAccelerated(this.segment(), value); return this; }

    /// {@return `integerDotProduct64BitMixedSignednessAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_integerDotProduct64BitMixedSignednessAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProduct64BitMixedSignednessAccelerated.get(segment, 0L, index); }
    /// {@return `integerDotProduct64BitMixedSignednessAccelerated`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_integerDotProduct64BitMixedSignednessAccelerated(MemorySegment segment) { return VkPhysicalDeviceVulkan13Properties.get_integerDotProduct64BitMixedSignednessAccelerated(segment, 0L); }
    /// {@return `integerDotProduct64BitMixedSignednessAccelerated` at the given index}
    /// @param index the index
    public @CType("VkBool32") int integerDotProduct64BitMixedSignednessAcceleratedAt(long index) { return VkPhysicalDeviceVulkan13Properties.get_integerDotProduct64BitMixedSignednessAccelerated(this.segment(), index); }
    /// {@return `integerDotProduct64BitMixedSignednessAccelerated`}
    public @CType("VkBool32") int integerDotProduct64BitMixedSignednessAccelerated() { return VkPhysicalDeviceVulkan13Properties.get_integerDotProduct64BitMixedSignednessAccelerated(this.segment()); }
    /// Sets `integerDotProduct64BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_integerDotProduct64BitMixedSignednessAccelerated(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_integerDotProduct64BitMixedSignednessAccelerated.set(segment, 0L, index, value); }
    /// Sets `integerDotProduct64BitMixedSignednessAccelerated` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_integerDotProduct64BitMixedSignednessAccelerated(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProduct64BitMixedSignednessAccelerated(segment, 0L, value); }
    /// Sets `integerDotProduct64BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProduct64BitMixedSignednessAcceleratedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProduct64BitMixedSignednessAccelerated(this.segment(), index, value); return this; }
    /// Sets `integerDotProduct64BitMixedSignednessAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProduct64BitMixedSignednessAccelerated(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProduct64BitMixedSignednessAccelerated(this.segment(), value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating8BitUnsignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_integerDotProductAccumulatingSaturating8BitUnsignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProductAccumulatingSaturating8BitUnsignedAccelerated.get(segment, 0L, index); }
    /// {@return `integerDotProductAccumulatingSaturating8BitUnsignedAccelerated`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_integerDotProductAccumulatingSaturating8BitUnsignedAccelerated(MemorySegment segment) { return VkPhysicalDeviceVulkan13Properties.get_integerDotProductAccumulatingSaturating8BitUnsignedAccelerated(segment, 0L); }
    /// {@return `integerDotProductAccumulatingSaturating8BitUnsignedAccelerated` at the given index}
    /// @param index the index
    public @CType("VkBool32") int integerDotProductAccumulatingSaturating8BitUnsignedAcceleratedAt(long index) { return VkPhysicalDeviceVulkan13Properties.get_integerDotProductAccumulatingSaturating8BitUnsignedAccelerated(this.segment(), index); }
    /// {@return `integerDotProductAccumulatingSaturating8BitUnsignedAccelerated`}
    public @CType("VkBool32") int integerDotProductAccumulatingSaturating8BitUnsignedAccelerated() { return VkPhysicalDeviceVulkan13Properties.get_integerDotProductAccumulatingSaturating8BitUnsignedAccelerated(this.segment()); }
    /// Sets `integerDotProductAccumulatingSaturating8BitUnsignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_integerDotProductAccumulatingSaturating8BitUnsignedAccelerated(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_integerDotProductAccumulatingSaturating8BitUnsignedAccelerated.set(segment, 0L, index, value); }
    /// Sets `integerDotProductAccumulatingSaturating8BitUnsignedAccelerated` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_integerDotProductAccumulatingSaturating8BitUnsignedAccelerated(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProductAccumulatingSaturating8BitUnsignedAccelerated(segment, 0L, value); }
    /// Sets `integerDotProductAccumulatingSaturating8BitUnsignedAccelerated` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating8BitUnsignedAcceleratedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProductAccumulatingSaturating8BitUnsignedAccelerated(this.segment(), index, value); return this; }
    /// Sets `integerDotProductAccumulatingSaturating8BitUnsignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating8BitUnsignedAccelerated(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProductAccumulatingSaturating8BitUnsignedAccelerated(this.segment(), value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating8BitSignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_integerDotProductAccumulatingSaturating8BitSignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProductAccumulatingSaturating8BitSignedAccelerated.get(segment, 0L, index); }
    /// {@return `integerDotProductAccumulatingSaturating8BitSignedAccelerated`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_integerDotProductAccumulatingSaturating8BitSignedAccelerated(MemorySegment segment) { return VkPhysicalDeviceVulkan13Properties.get_integerDotProductAccumulatingSaturating8BitSignedAccelerated(segment, 0L); }
    /// {@return `integerDotProductAccumulatingSaturating8BitSignedAccelerated` at the given index}
    /// @param index the index
    public @CType("VkBool32") int integerDotProductAccumulatingSaturating8BitSignedAcceleratedAt(long index) { return VkPhysicalDeviceVulkan13Properties.get_integerDotProductAccumulatingSaturating8BitSignedAccelerated(this.segment(), index); }
    /// {@return `integerDotProductAccumulatingSaturating8BitSignedAccelerated`}
    public @CType("VkBool32") int integerDotProductAccumulatingSaturating8BitSignedAccelerated() { return VkPhysicalDeviceVulkan13Properties.get_integerDotProductAccumulatingSaturating8BitSignedAccelerated(this.segment()); }
    /// Sets `integerDotProductAccumulatingSaturating8BitSignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_integerDotProductAccumulatingSaturating8BitSignedAccelerated(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_integerDotProductAccumulatingSaturating8BitSignedAccelerated.set(segment, 0L, index, value); }
    /// Sets `integerDotProductAccumulatingSaturating8BitSignedAccelerated` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_integerDotProductAccumulatingSaturating8BitSignedAccelerated(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProductAccumulatingSaturating8BitSignedAccelerated(segment, 0L, value); }
    /// Sets `integerDotProductAccumulatingSaturating8BitSignedAccelerated` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating8BitSignedAcceleratedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProductAccumulatingSaturating8BitSignedAccelerated(this.segment(), index, value); return this; }
    /// Sets `integerDotProductAccumulatingSaturating8BitSignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating8BitSignedAccelerated(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProductAccumulatingSaturating8BitSignedAccelerated(this.segment(), value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated.get(segment, 0L, index); }
    /// {@return `integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(MemorySegment segment) { return VkPhysicalDeviceVulkan13Properties.get_integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(segment, 0L); }
    /// {@return `integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated` at the given index}
    /// @param index the index
    public @CType("VkBool32") int integerDotProductAccumulatingSaturating8BitMixedSignednessAcceleratedAt(long index) { return VkPhysicalDeviceVulkan13Properties.get_integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(this.segment(), index); }
    /// {@return `integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated`}
    public @CType("VkBool32") int integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated() { return VkPhysicalDeviceVulkan13Properties.get_integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(this.segment()); }
    /// Sets `integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated.set(segment, 0L, index, value); }
    /// Sets `integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(segment, 0L, value); }
    /// Sets `integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating8BitMixedSignednessAcceleratedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(this.segment(), index, value); return this; }
    /// Sets `integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProductAccumulatingSaturating8BitMixedSignednessAccelerated(this.segment(), value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated.get(segment, 0L, index); }
    /// {@return `integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(MemorySegment segment) { return VkPhysicalDeviceVulkan13Properties.get_integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(segment, 0L); }
    /// {@return `integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated` at the given index}
    /// @param index the index
    public @CType("VkBool32") int integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAcceleratedAt(long index) { return VkPhysicalDeviceVulkan13Properties.get_integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(this.segment(), index); }
    /// {@return `integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated`}
    public @CType("VkBool32") int integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated() { return VkPhysicalDeviceVulkan13Properties.get_integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(this.segment()); }
    /// Sets `integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated.set(segment, 0L, index, value); }
    /// Sets `integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(segment, 0L, value); }
    /// Sets `integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAcceleratedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(this.segment(), index, value); return this; }
    /// Sets `integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProductAccumulatingSaturating4x8BitPackedUnsignedAccelerated(this.segment(), value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated.get(segment, 0L, index); }
    /// {@return `integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(MemorySegment segment) { return VkPhysicalDeviceVulkan13Properties.get_integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(segment, 0L); }
    /// {@return `integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated` at the given index}
    /// @param index the index
    public @CType("VkBool32") int integerDotProductAccumulatingSaturating4x8BitPackedSignedAcceleratedAt(long index) { return VkPhysicalDeviceVulkan13Properties.get_integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(this.segment(), index); }
    /// {@return `integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated`}
    public @CType("VkBool32") int integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated() { return VkPhysicalDeviceVulkan13Properties.get_integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(this.segment()); }
    /// Sets `integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated.set(segment, 0L, index, value); }
    /// Sets `integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(segment, 0L, value); }
    /// Sets `integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating4x8BitPackedSignedAcceleratedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(this.segment(), index, value); return this; }
    /// Sets `integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProductAccumulatingSaturating4x8BitPackedSignedAccelerated(this.segment(), value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated.get(segment, 0L, index); }
    /// {@return `integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(MemorySegment segment) { return VkPhysicalDeviceVulkan13Properties.get_integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(segment, 0L); }
    /// {@return `integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated` at the given index}
    /// @param index the index
    public @CType("VkBool32") int integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAcceleratedAt(long index) { return VkPhysicalDeviceVulkan13Properties.get_integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(this.segment(), index); }
    /// {@return `integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated`}
    public @CType("VkBool32") int integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated() { return VkPhysicalDeviceVulkan13Properties.get_integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(this.segment()); }
    /// Sets `integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated.set(segment, 0L, index, value); }
    /// Sets `integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(segment, 0L, value); }
    /// Sets `integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAcceleratedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(this.segment(), index, value); return this; }
    /// Sets `integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProductAccumulatingSaturating4x8BitPackedMixedSignednessAccelerated(this.segment(), value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating16BitUnsignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_integerDotProductAccumulatingSaturating16BitUnsignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProductAccumulatingSaturating16BitUnsignedAccelerated.get(segment, 0L, index); }
    /// {@return `integerDotProductAccumulatingSaturating16BitUnsignedAccelerated`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_integerDotProductAccumulatingSaturating16BitUnsignedAccelerated(MemorySegment segment) { return VkPhysicalDeviceVulkan13Properties.get_integerDotProductAccumulatingSaturating16BitUnsignedAccelerated(segment, 0L); }
    /// {@return `integerDotProductAccumulatingSaturating16BitUnsignedAccelerated` at the given index}
    /// @param index the index
    public @CType("VkBool32") int integerDotProductAccumulatingSaturating16BitUnsignedAcceleratedAt(long index) { return VkPhysicalDeviceVulkan13Properties.get_integerDotProductAccumulatingSaturating16BitUnsignedAccelerated(this.segment(), index); }
    /// {@return `integerDotProductAccumulatingSaturating16BitUnsignedAccelerated`}
    public @CType("VkBool32") int integerDotProductAccumulatingSaturating16BitUnsignedAccelerated() { return VkPhysicalDeviceVulkan13Properties.get_integerDotProductAccumulatingSaturating16BitUnsignedAccelerated(this.segment()); }
    /// Sets `integerDotProductAccumulatingSaturating16BitUnsignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_integerDotProductAccumulatingSaturating16BitUnsignedAccelerated(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_integerDotProductAccumulatingSaturating16BitUnsignedAccelerated.set(segment, 0L, index, value); }
    /// Sets `integerDotProductAccumulatingSaturating16BitUnsignedAccelerated` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_integerDotProductAccumulatingSaturating16BitUnsignedAccelerated(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProductAccumulatingSaturating16BitUnsignedAccelerated(segment, 0L, value); }
    /// Sets `integerDotProductAccumulatingSaturating16BitUnsignedAccelerated` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating16BitUnsignedAcceleratedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProductAccumulatingSaturating16BitUnsignedAccelerated(this.segment(), index, value); return this; }
    /// Sets `integerDotProductAccumulatingSaturating16BitUnsignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating16BitUnsignedAccelerated(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProductAccumulatingSaturating16BitUnsignedAccelerated(this.segment(), value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating16BitSignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_integerDotProductAccumulatingSaturating16BitSignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProductAccumulatingSaturating16BitSignedAccelerated.get(segment, 0L, index); }
    /// {@return `integerDotProductAccumulatingSaturating16BitSignedAccelerated`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_integerDotProductAccumulatingSaturating16BitSignedAccelerated(MemorySegment segment) { return VkPhysicalDeviceVulkan13Properties.get_integerDotProductAccumulatingSaturating16BitSignedAccelerated(segment, 0L); }
    /// {@return `integerDotProductAccumulatingSaturating16BitSignedAccelerated` at the given index}
    /// @param index the index
    public @CType("VkBool32") int integerDotProductAccumulatingSaturating16BitSignedAcceleratedAt(long index) { return VkPhysicalDeviceVulkan13Properties.get_integerDotProductAccumulatingSaturating16BitSignedAccelerated(this.segment(), index); }
    /// {@return `integerDotProductAccumulatingSaturating16BitSignedAccelerated`}
    public @CType("VkBool32") int integerDotProductAccumulatingSaturating16BitSignedAccelerated() { return VkPhysicalDeviceVulkan13Properties.get_integerDotProductAccumulatingSaturating16BitSignedAccelerated(this.segment()); }
    /// Sets `integerDotProductAccumulatingSaturating16BitSignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_integerDotProductAccumulatingSaturating16BitSignedAccelerated(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_integerDotProductAccumulatingSaturating16BitSignedAccelerated.set(segment, 0L, index, value); }
    /// Sets `integerDotProductAccumulatingSaturating16BitSignedAccelerated` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_integerDotProductAccumulatingSaturating16BitSignedAccelerated(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProductAccumulatingSaturating16BitSignedAccelerated(segment, 0L, value); }
    /// Sets `integerDotProductAccumulatingSaturating16BitSignedAccelerated` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating16BitSignedAcceleratedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProductAccumulatingSaturating16BitSignedAccelerated(this.segment(), index, value); return this; }
    /// Sets `integerDotProductAccumulatingSaturating16BitSignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating16BitSignedAccelerated(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProductAccumulatingSaturating16BitSignedAccelerated(this.segment(), value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated.get(segment, 0L, index); }
    /// {@return `integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(MemorySegment segment) { return VkPhysicalDeviceVulkan13Properties.get_integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(segment, 0L); }
    /// {@return `integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated` at the given index}
    /// @param index the index
    public @CType("VkBool32") int integerDotProductAccumulatingSaturating16BitMixedSignednessAcceleratedAt(long index) { return VkPhysicalDeviceVulkan13Properties.get_integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(this.segment(), index); }
    /// {@return `integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated`}
    public @CType("VkBool32") int integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated() { return VkPhysicalDeviceVulkan13Properties.get_integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(this.segment()); }
    /// Sets `integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated.set(segment, 0L, index, value); }
    /// Sets `integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(segment, 0L, value); }
    /// Sets `integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating16BitMixedSignednessAcceleratedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(this.segment(), index, value); return this; }
    /// Sets `integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProductAccumulatingSaturating16BitMixedSignednessAccelerated(this.segment(), value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating32BitUnsignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_integerDotProductAccumulatingSaturating32BitUnsignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProductAccumulatingSaturating32BitUnsignedAccelerated.get(segment, 0L, index); }
    /// {@return `integerDotProductAccumulatingSaturating32BitUnsignedAccelerated`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_integerDotProductAccumulatingSaturating32BitUnsignedAccelerated(MemorySegment segment) { return VkPhysicalDeviceVulkan13Properties.get_integerDotProductAccumulatingSaturating32BitUnsignedAccelerated(segment, 0L); }
    /// {@return `integerDotProductAccumulatingSaturating32BitUnsignedAccelerated` at the given index}
    /// @param index the index
    public @CType("VkBool32") int integerDotProductAccumulatingSaturating32BitUnsignedAcceleratedAt(long index) { return VkPhysicalDeviceVulkan13Properties.get_integerDotProductAccumulatingSaturating32BitUnsignedAccelerated(this.segment(), index); }
    /// {@return `integerDotProductAccumulatingSaturating32BitUnsignedAccelerated`}
    public @CType("VkBool32") int integerDotProductAccumulatingSaturating32BitUnsignedAccelerated() { return VkPhysicalDeviceVulkan13Properties.get_integerDotProductAccumulatingSaturating32BitUnsignedAccelerated(this.segment()); }
    /// Sets `integerDotProductAccumulatingSaturating32BitUnsignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_integerDotProductAccumulatingSaturating32BitUnsignedAccelerated(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_integerDotProductAccumulatingSaturating32BitUnsignedAccelerated.set(segment, 0L, index, value); }
    /// Sets `integerDotProductAccumulatingSaturating32BitUnsignedAccelerated` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_integerDotProductAccumulatingSaturating32BitUnsignedAccelerated(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProductAccumulatingSaturating32BitUnsignedAccelerated(segment, 0L, value); }
    /// Sets `integerDotProductAccumulatingSaturating32BitUnsignedAccelerated` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating32BitUnsignedAcceleratedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProductAccumulatingSaturating32BitUnsignedAccelerated(this.segment(), index, value); return this; }
    /// Sets `integerDotProductAccumulatingSaturating32BitUnsignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating32BitUnsignedAccelerated(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProductAccumulatingSaturating32BitUnsignedAccelerated(this.segment(), value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating32BitSignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_integerDotProductAccumulatingSaturating32BitSignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProductAccumulatingSaturating32BitSignedAccelerated.get(segment, 0L, index); }
    /// {@return `integerDotProductAccumulatingSaturating32BitSignedAccelerated`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_integerDotProductAccumulatingSaturating32BitSignedAccelerated(MemorySegment segment) { return VkPhysicalDeviceVulkan13Properties.get_integerDotProductAccumulatingSaturating32BitSignedAccelerated(segment, 0L); }
    /// {@return `integerDotProductAccumulatingSaturating32BitSignedAccelerated` at the given index}
    /// @param index the index
    public @CType("VkBool32") int integerDotProductAccumulatingSaturating32BitSignedAcceleratedAt(long index) { return VkPhysicalDeviceVulkan13Properties.get_integerDotProductAccumulatingSaturating32BitSignedAccelerated(this.segment(), index); }
    /// {@return `integerDotProductAccumulatingSaturating32BitSignedAccelerated`}
    public @CType("VkBool32") int integerDotProductAccumulatingSaturating32BitSignedAccelerated() { return VkPhysicalDeviceVulkan13Properties.get_integerDotProductAccumulatingSaturating32BitSignedAccelerated(this.segment()); }
    /// Sets `integerDotProductAccumulatingSaturating32BitSignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_integerDotProductAccumulatingSaturating32BitSignedAccelerated(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_integerDotProductAccumulatingSaturating32BitSignedAccelerated.set(segment, 0L, index, value); }
    /// Sets `integerDotProductAccumulatingSaturating32BitSignedAccelerated` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_integerDotProductAccumulatingSaturating32BitSignedAccelerated(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProductAccumulatingSaturating32BitSignedAccelerated(segment, 0L, value); }
    /// Sets `integerDotProductAccumulatingSaturating32BitSignedAccelerated` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating32BitSignedAcceleratedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProductAccumulatingSaturating32BitSignedAccelerated(this.segment(), index, value); return this; }
    /// Sets `integerDotProductAccumulatingSaturating32BitSignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating32BitSignedAccelerated(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProductAccumulatingSaturating32BitSignedAccelerated(this.segment(), value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated.get(segment, 0L, index); }
    /// {@return `integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(MemorySegment segment) { return VkPhysicalDeviceVulkan13Properties.get_integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(segment, 0L); }
    /// {@return `integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated` at the given index}
    /// @param index the index
    public @CType("VkBool32") int integerDotProductAccumulatingSaturating32BitMixedSignednessAcceleratedAt(long index) { return VkPhysicalDeviceVulkan13Properties.get_integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(this.segment(), index); }
    /// {@return `integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated`}
    public @CType("VkBool32") int integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated() { return VkPhysicalDeviceVulkan13Properties.get_integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(this.segment()); }
    /// Sets `integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated.set(segment, 0L, index, value); }
    /// Sets `integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(segment, 0L, value); }
    /// Sets `integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating32BitMixedSignednessAcceleratedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(this.segment(), index, value); return this; }
    /// Sets `integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProductAccumulatingSaturating32BitMixedSignednessAccelerated(this.segment(), value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating64BitUnsignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_integerDotProductAccumulatingSaturating64BitUnsignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProductAccumulatingSaturating64BitUnsignedAccelerated.get(segment, 0L, index); }
    /// {@return `integerDotProductAccumulatingSaturating64BitUnsignedAccelerated`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_integerDotProductAccumulatingSaturating64BitUnsignedAccelerated(MemorySegment segment) { return VkPhysicalDeviceVulkan13Properties.get_integerDotProductAccumulatingSaturating64BitUnsignedAccelerated(segment, 0L); }
    /// {@return `integerDotProductAccumulatingSaturating64BitUnsignedAccelerated` at the given index}
    /// @param index the index
    public @CType("VkBool32") int integerDotProductAccumulatingSaturating64BitUnsignedAcceleratedAt(long index) { return VkPhysicalDeviceVulkan13Properties.get_integerDotProductAccumulatingSaturating64BitUnsignedAccelerated(this.segment(), index); }
    /// {@return `integerDotProductAccumulatingSaturating64BitUnsignedAccelerated`}
    public @CType("VkBool32") int integerDotProductAccumulatingSaturating64BitUnsignedAccelerated() { return VkPhysicalDeviceVulkan13Properties.get_integerDotProductAccumulatingSaturating64BitUnsignedAccelerated(this.segment()); }
    /// Sets `integerDotProductAccumulatingSaturating64BitUnsignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_integerDotProductAccumulatingSaturating64BitUnsignedAccelerated(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_integerDotProductAccumulatingSaturating64BitUnsignedAccelerated.set(segment, 0L, index, value); }
    /// Sets `integerDotProductAccumulatingSaturating64BitUnsignedAccelerated` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_integerDotProductAccumulatingSaturating64BitUnsignedAccelerated(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProductAccumulatingSaturating64BitUnsignedAccelerated(segment, 0L, value); }
    /// Sets `integerDotProductAccumulatingSaturating64BitUnsignedAccelerated` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating64BitUnsignedAcceleratedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProductAccumulatingSaturating64BitUnsignedAccelerated(this.segment(), index, value); return this; }
    /// Sets `integerDotProductAccumulatingSaturating64BitUnsignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating64BitUnsignedAccelerated(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProductAccumulatingSaturating64BitUnsignedAccelerated(this.segment(), value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating64BitSignedAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_integerDotProductAccumulatingSaturating64BitSignedAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProductAccumulatingSaturating64BitSignedAccelerated.get(segment, 0L, index); }
    /// {@return `integerDotProductAccumulatingSaturating64BitSignedAccelerated`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_integerDotProductAccumulatingSaturating64BitSignedAccelerated(MemorySegment segment) { return VkPhysicalDeviceVulkan13Properties.get_integerDotProductAccumulatingSaturating64BitSignedAccelerated(segment, 0L); }
    /// {@return `integerDotProductAccumulatingSaturating64BitSignedAccelerated` at the given index}
    /// @param index the index
    public @CType("VkBool32") int integerDotProductAccumulatingSaturating64BitSignedAcceleratedAt(long index) { return VkPhysicalDeviceVulkan13Properties.get_integerDotProductAccumulatingSaturating64BitSignedAccelerated(this.segment(), index); }
    /// {@return `integerDotProductAccumulatingSaturating64BitSignedAccelerated`}
    public @CType("VkBool32") int integerDotProductAccumulatingSaturating64BitSignedAccelerated() { return VkPhysicalDeviceVulkan13Properties.get_integerDotProductAccumulatingSaturating64BitSignedAccelerated(this.segment()); }
    /// Sets `integerDotProductAccumulatingSaturating64BitSignedAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_integerDotProductAccumulatingSaturating64BitSignedAccelerated(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_integerDotProductAccumulatingSaturating64BitSignedAccelerated.set(segment, 0L, index, value); }
    /// Sets `integerDotProductAccumulatingSaturating64BitSignedAccelerated` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_integerDotProductAccumulatingSaturating64BitSignedAccelerated(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProductAccumulatingSaturating64BitSignedAccelerated(segment, 0L, value); }
    /// Sets `integerDotProductAccumulatingSaturating64BitSignedAccelerated` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating64BitSignedAcceleratedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProductAccumulatingSaturating64BitSignedAccelerated(this.segment(), index, value); return this; }
    /// Sets `integerDotProductAccumulatingSaturating64BitSignedAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating64BitSignedAccelerated(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProductAccumulatingSaturating64BitSignedAccelerated(this.segment(), value); return this; }

    /// {@return `integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(MemorySegment segment, long index) { return (int) VH_integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated.get(segment, 0L, index); }
    /// {@return `integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(MemorySegment segment) { return VkPhysicalDeviceVulkan13Properties.get_integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(segment, 0L); }
    /// {@return `integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated` at the given index}
    /// @param index the index
    public @CType("VkBool32") int integerDotProductAccumulatingSaturating64BitMixedSignednessAcceleratedAt(long index) { return VkPhysicalDeviceVulkan13Properties.get_integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(this.segment(), index); }
    /// {@return `integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated`}
    public @CType("VkBool32") int integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated() { return VkPhysicalDeviceVulkan13Properties.get_integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(this.segment()); }
    /// Sets `integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated.set(segment, 0L, index, value); }
    /// Sets `integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(segment, 0L, value); }
    /// Sets `integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating64BitMixedSignednessAcceleratedAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(this.segment(), index, value); return this; }
    /// Sets `integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_integerDotProductAccumulatingSaturating64BitMixedSignednessAccelerated(this.segment(), value); return this; }

    /// {@return `storageTexelBufferOffsetAlignmentBytes` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_storageTexelBufferOffsetAlignmentBytes(MemorySegment segment, long index) { return (long) VH_storageTexelBufferOffsetAlignmentBytes.get(segment, 0L, index); }
    /// {@return `storageTexelBufferOffsetAlignmentBytes`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_storageTexelBufferOffsetAlignmentBytes(MemorySegment segment) { return VkPhysicalDeviceVulkan13Properties.get_storageTexelBufferOffsetAlignmentBytes(segment, 0L); }
    /// {@return `storageTexelBufferOffsetAlignmentBytes` at the given index}
    /// @param index the index
    public @CType("VkDeviceSize") long storageTexelBufferOffsetAlignmentBytesAt(long index) { return VkPhysicalDeviceVulkan13Properties.get_storageTexelBufferOffsetAlignmentBytes(this.segment(), index); }
    /// {@return `storageTexelBufferOffsetAlignmentBytes`}
    public @CType("VkDeviceSize") long storageTexelBufferOffsetAlignmentBytes() { return VkPhysicalDeviceVulkan13Properties.get_storageTexelBufferOffsetAlignmentBytes(this.segment()); }
    /// Sets `storageTexelBufferOffsetAlignmentBytes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_storageTexelBufferOffsetAlignmentBytes(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_storageTexelBufferOffsetAlignmentBytes.set(segment, 0L, index, value); }
    /// Sets `storageTexelBufferOffsetAlignmentBytes` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_storageTexelBufferOffsetAlignmentBytes(MemorySegment segment, @CType("VkDeviceSize") long value) { VkPhysicalDeviceVulkan13Properties.set_storageTexelBufferOffsetAlignmentBytes(segment, 0L, value); }
    /// Sets `storageTexelBufferOffsetAlignmentBytes` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties storageTexelBufferOffsetAlignmentBytesAt(long index, @CType("VkDeviceSize") long value) { VkPhysicalDeviceVulkan13Properties.set_storageTexelBufferOffsetAlignmentBytes(this.segment(), index, value); return this; }
    /// Sets `storageTexelBufferOffsetAlignmentBytes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties storageTexelBufferOffsetAlignmentBytes(@CType("VkDeviceSize") long value) { VkPhysicalDeviceVulkan13Properties.set_storageTexelBufferOffsetAlignmentBytes(this.segment(), value); return this; }

    /// {@return `storageTexelBufferOffsetSingleTexelAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_storageTexelBufferOffsetSingleTexelAlignment(MemorySegment segment, long index) { return (int) VH_storageTexelBufferOffsetSingleTexelAlignment.get(segment, 0L, index); }
    /// {@return `storageTexelBufferOffsetSingleTexelAlignment`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_storageTexelBufferOffsetSingleTexelAlignment(MemorySegment segment) { return VkPhysicalDeviceVulkan13Properties.get_storageTexelBufferOffsetSingleTexelAlignment(segment, 0L); }
    /// {@return `storageTexelBufferOffsetSingleTexelAlignment` at the given index}
    /// @param index the index
    public @CType("VkBool32") int storageTexelBufferOffsetSingleTexelAlignmentAt(long index) { return VkPhysicalDeviceVulkan13Properties.get_storageTexelBufferOffsetSingleTexelAlignment(this.segment(), index); }
    /// {@return `storageTexelBufferOffsetSingleTexelAlignment`}
    public @CType("VkBool32") int storageTexelBufferOffsetSingleTexelAlignment() { return VkPhysicalDeviceVulkan13Properties.get_storageTexelBufferOffsetSingleTexelAlignment(this.segment()); }
    /// Sets `storageTexelBufferOffsetSingleTexelAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_storageTexelBufferOffsetSingleTexelAlignment(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_storageTexelBufferOffsetSingleTexelAlignment.set(segment, 0L, index, value); }
    /// Sets `storageTexelBufferOffsetSingleTexelAlignment` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_storageTexelBufferOffsetSingleTexelAlignment(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_storageTexelBufferOffsetSingleTexelAlignment(segment, 0L, value); }
    /// Sets `storageTexelBufferOffsetSingleTexelAlignment` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties storageTexelBufferOffsetSingleTexelAlignmentAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_storageTexelBufferOffsetSingleTexelAlignment(this.segment(), index, value); return this; }
    /// Sets `storageTexelBufferOffsetSingleTexelAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties storageTexelBufferOffsetSingleTexelAlignment(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_storageTexelBufferOffsetSingleTexelAlignment(this.segment(), value); return this; }

    /// {@return `uniformTexelBufferOffsetAlignmentBytes` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_uniformTexelBufferOffsetAlignmentBytes(MemorySegment segment, long index) { return (long) VH_uniformTexelBufferOffsetAlignmentBytes.get(segment, 0L, index); }
    /// {@return `uniformTexelBufferOffsetAlignmentBytes`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_uniformTexelBufferOffsetAlignmentBytes(MemorySegment segment) { return VkPhysicalDeviceVulkan13Properties.get_uniformTexelBufferOffsetAlignmentBytes(segment, 0L); }
    /// {@return `uniformTexelBufferOffsetAlignmentBytes` at the given index}
    /// @param index the index
    public @CType("VkDeviceSize") long uniformTexelBufferOffsetAlignmentBytesAt(long index) { return VkPhysicalDeviceVulkan13Properties.get_uniformTexelBufferOffsetAlignmentBytes(this.segment(), index); }
    /// {@return `uniformTexelBufferOffsetAlignmentBytes`}
    public @CType("VkDeviceSize") long uniformTexelBufferOffsetAlignmentBytes() { return VkPhysicalDeviceVulkan13Properties.get_uniformTexelBufferOffsetAlignmentBytes(this.segment()); }
    /// Sets `uniformTexelBufferOffsetAlignmentBytes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_uniformTexelBufferOffsetAlignmentBytes(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_uniformTexelBufferOffsetAlignmentBytes.set(segment, 0L, index, value); }
    /// Sets `uniformTexelBufferOffsetAlignmentBytes` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_uniformTexelBufferOffsetAlignmentBytes(MemorySegment segment, @CType("VkDeviceSize") long value) { VkPhysicalDeviceVulkan13Properties.set_uniformTexelBufferOffsetAlignmentBytes(segment, 0L, value); }
    /// Sets `uniformTexelBufferOffsetAlignmentBytes` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties uniformTexelBufferOffsetAlignmentBytesAt(long index, @CType("VkDeviceSize") long value) { VkPhysicalDeviceVulkan13Properties.set_uniformTexelBufferOffsetAlignmentBytes(this.segment(), index, value); return this; }
    /// Sets `uniformTexelBufferOffsetAlignmentBytes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties uniformTexelBufferOffsetAlignmentBytes(@CType("VkDeviceSize") long value) { VkPhysicalDeviceVulkan13Properties.set_uniformTexelBufferOffsetAlignmentBytes(this.segment(), value); return this; }

    /// {@return `uniformTexelBufferOffsetSingleTexelAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_uniformTexelBufferOffsetSingleTexelAlignment(MemorySegment segment, long index) { return (int) VH_uniformTexelBufferOffsetSingleTexelAlignment.get(segment, 0L, index); }
    /// {@return `uniformTexelBufferOffsetSingleTexelAlignment`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_uniformTexelBufferOffsetSingleTexelAlignment(MemorySegment segment) { return VkPhysicalDeviceVulkan13Properties.get_uniformTexelBufferOffsetSingleTexelAlignment(segment, 0L); }
    /// {@return `uniformTexelBufferOffsetSingleTexelAlignment` at the given index}
    /// @param index the index
    public @CType("VkBool32") int uniformTexelBufferOffsetSingleTexelAlignmentAt(long index) { return VkPhysicalDeviceVulkan13Properties.get_uniformTexelBufferOffsetSingleTexelAlignment(this.segment(), index); }
    /// {@return `uniformTexelBufferOffsetSingleTexelAlignment`}
    public @CType("VkBool32") int uniformTexelBufferOffsetSingleTexelAlignment() { return VkPhysicalDeviceVulkan13Properties.get_uniformTexelBufferOffsetSingleTexelAlignment(this.segment()); }
    /// Sets `uniformTexelBufferOffsetSingleTexelAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_uniformTexelBufferOffsetSingleTexelAlignment(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_uniformTexelBufferOffsetSingleTexelAlignment.set(segment, 0L, index, value); }
    /// Sets `uniformTexelBufferOffsetSingleTexelAlignment` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_uniformTexelBufferOffsetSingleTexelAlignment(MemorySegment segment, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_uniformTexelBufferOffsetSingleTexelAlignment(segment, 0L, value); }
    /// Sets `uniformTexelBufferOffsetSingleTexelAlignment` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties uniformTexelBufferOffsetSingleTexelAlignmentAt(long index, @CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_uniformTexelBufferOffsetSingleTexelAlignment(this.segment(), index, value); return this; }
    /// Sets `uniformTexelBufferOffsetSingleTexelAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties uniformTexelBufferOffsetSingleTexelAlignment(@CType("VkBool32") int value) { VkPhysicalDeviceVulkan13Properties.set_uniformTexelBufferOffsetSingleTexelAlignment(this.segment(), value); return this; }

    /// {@return `maxBufferSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkDeviceSize") long get_maxBufferSize(MemorySegment segment, long index) { return (long) VH_maxBufferSize.get(segment, 0L, index); }
    /// {@return `maxBufferSize`}
    /// @param segment the segment of the struct
    public static @CType("VkDeviceSize") long get_maxBufferSize(MemorySegment segment) { return VkPhysicalDeviceVulkan13Properties.get_maxBufferSize(segment, 0L); }
    /// {@return `maxBufferSize` at the given index}
    /// @param index the index
    public @CType("VkDeviceSize") long maxBufferSizeAt(long index) { return VkPhysicalDeviceVulkan13Properties.get_maxBufferSize(this.segment(), index); }
    /// {@return `maxBufferSize`}
    public @CType("VkDeviceSize") long maxBufferSize() { return VkPhysicalDeviceVulkan13Properties.get_maxBufferSize(this.segment()); }
    /// Sets `maxBufferSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxBufferSize(MemorySegment segment, long index, @CType("VkDeviceSize") long value) { VH_maxBufferSize.set(segment, 0L, index, value); }
    /// Sets `maxBufferSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxBufferSize(MemorySegment segment, @CType("VkDeviceSize") long value) { VkPhysicalDeviceVulkan13Properties.set_maxBufferSize(segment, 0L, value); }
    /// Sets `maxBufferSize` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties maxBufferSizeAt(long index, @CType("VkDeviceSize") long value) { VkPhysicalDeviceVulkan13Properties.set_maxBufferSize(this.segment(), index, value); return this; }
    /// Sets `maxBufferSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkPhysicalDeviceVulkan13Properties maxBufferSize(@CType("VkDeviceSize") long value) { VkPhysicalDeviceVulkan13Properties.set_maxBufferSize(this.segment(), value); return this; }

}
