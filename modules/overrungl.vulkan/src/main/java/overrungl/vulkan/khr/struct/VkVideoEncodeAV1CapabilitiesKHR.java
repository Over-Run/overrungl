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
package overrungl.vulkan.khr.struct;

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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(MemorySegment)]
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### maxLevel
/// [VarHandle][#VH_maxLevel] - [Getter][#maxLevel()] - [Setter][#maxLevel(int)]
/// ### codedPictureAlignment
/// [Byte offset][#OFFSET_codedPictureAlignment] - [Memory layout][#ML_codedPictureAlignment] - [Getter][#codedPictureAlignment()] - [Setter][#codedPictureAlignment(MemorySegment)]
/// ### maxTiles
/// [Byte offset][#OFFSET_maxTiles] - [Memory layout][#ML_maxTiles] - [Getter][#maxTiles()] - [Setter][#maxTiles(MemorySegment)]
/// ### minTileSize
/// [Byte offset][#OFFSET_minTileSize] - [Memory layout][#ML_minTileSize] - [Getter][#minTileSize()] - [Setter][#minTileSize(MemorySegment)]
/// ### maxTileSize
/// [Byte offset][#OFFSET_maxTileSize] - [Memory layout][#ML_maxTileSize] - [Getter][#maxTileSize()] - [Setter][#maxTileSize(MemorySegment)]
/// ### superblockSizes
/// [VarHandle][#VH_superblockSizes] - [Getter][#superblockSizes()] - [Setter][#superblockSizes(int)]
/// ### maxSingleReferenceCount
/// [VarHandle][#VH_maxSingleReferenceCount] - [Getter][#maxSingleReferenceCount()] - [Setter][#maxSingleReferenceCount(int)]
/// ### singleReferenceNameMask
/// [VarHandle][#VH_singleReferenceNameMask] - [Getter][#singleReferenceNameMask()] - [Setter][#singleReferenceNameMask(int)]
/// ### maxUnidirectionalCompoundReferenceCount
/// [VarHandle][#VH_maxUnidirectionalCompoundReferenceCount] - [Getter][#maxUnidirectionalCompoundReferenceCount()] - [Setter][#maxUnidirectionalCompoundReferenceCount(int)]
/// ### maxUnidirectionalCompoundGroup1ReferenceCount
/// [VarHandle][#VH_maxUnidirectionalCompoundGroup1ReferenceCount] - [Getter][#maxUnidirectionalCompoundGroup1ReferenceCount()] - [Setter][#maxUnidirectionalCompoundGroup1ReferenceCount(int)]
/// ### unidirectionalCompoundReferenceNameMask
/// [VarHandle][#VH_unidirectionalCompoundReferenceNameMask] - [Getter][#unidirectionalCompoundReferenceNameMask()] - [Setter][#unidirectionalCompoundReferenceNameMask(int)]
/// ### maxBidirectionalCompoundReferenceCount
/// [VarHandle][#VH_maxBidirectionalCompoundReferenceCount] - [Getter][#maxBidirectionalCompoundReferenceCount()] - [Setter][#maxBidirectionalCompoundReferenceCount(int)]
/// ### maxBidirectionalCompoundGroup1ReferenceCount
/// [VarHandle][#VH_maxBidirectionalCompoundGroup1ReferenceCount] - [Getter][#maxBidirectionalCompoundGroup1ReferenceCount()] - [Setter][#maxBidirectionalCompoundGroup1ReferenceCount(int)]
/// ### maxBidirectionalCompoundGroup2ReferenceCount
/// [VarHandle][#VH_maxBidirectionalCompoundGroup2ReferenceCount] - [Getter][#maxBidirectionalCompoundGroup2ReferenceCount()] - [Setter][#maxBidirectionalCompoundGroup2ReferenceCount(int)]
/// ### bidirectionalCompoundReferenceNameMask
/// [VarHandle][#VH_bidirectionalCompoundReferenceNameMask] - [Getter][#bidirectionalCompoundReferenceNameMask()] - [Setter][#bidirectionalCompoundReferenceNameMask(int)]
/// ### maxTemporalLayerCount
/// [VarHandle][#VH_maxTemporalLayerCount] - [Getter][#maxTemporalLayerCount()] - [Setter][#maxTemporalLayerCount(int)]
/// ### maxSpatialLayerCount
/// [VarHandle][#VH_maxSpatialLayerCount] - [Getter][#maxSpatialLayerCount()] - [Setter][#maxSpatialLayerCount(int)]
/// ### maxOperatingPoints
/// [VarHandle][#VH_maxOperatingPoints] - [Getter][#maxOperatingPoints()] - [Setter][#maxOperatingPoints(int)]
/// ### minQIndex
/// [VarHandle][#VH_minQIndex] - [Getter][#minQIndex()] - [Setter][#minQIndex(int)]
/// ### maxQIndex
/// [VarHandle][#VH_maxQIndex] - [Getter][#maxQIndex()] - [Setter][#maxQIndex(int)]
/// ### prefersGopRemainingFrames
/// [VarHandle][#VH_prefersGopRemainingFrames] - [Getter][#prefersGopRemainingFrames()] - [Setter][#prefersGopRemainingFrames(int)]
/// ### requiresGopRemainingFrames
/// [VarHandle][#VH_requiresGopRemainingFrames] - [Getter][#requiresGopRemainingFrames()] - [Setter][#requiresGopRemainingFrames(int)]
/// ### stdSyntaxFlags
/// [VarHandle][#VH_stdSyntaxFlags] - [Getter][#stdSyntaxFlags()] - [Setter][#stdSyntaxFlags(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoEncodeAV1CapabilitiesKHR {
///     VkStructureType sType;
///     void * pNext;
///     VkVideoEncodeAV1CapabilityFlagsKHR flags;
///     StdVideoAV1Level maxLevel;
///     VkExtent2D codedPictureAlignment;
///     VkExtent2D maxTiles;
///     VkExtent2D minTileSize;
///     VkExtent2D maxTileSize;
///     VkVideoEncodeAV1SuperblockSizeFlagsKHR superblockSizes;
///     uint32_t maxSingleReferenceCount;
///     uint32_t singleReferenceNameMask;
///     uint32_t maxUnidirectionalCompoundReferenceCount;
///     uint32_t maxUnidirectionalCompoundGroup1ReferenceCount;
///     uint32_t unidirectionalCompoundReferenceNameMask;
///     uint32_t maxBidirectionalCompoundReferenceCount;
///     uint32_t maxBidirectionalCompoundGroup1ReferenceCount;
///     uint32_t maxBidirectionalCompoundGroup2ReferenceCount;
///     uint32_t bidirectionalCompoundReferenceNameMask;
///     uint32_t maxTemporalLayerCount;
///     uint32_t maxSpatialLayerCount;
///     uint32_t maxOperatingPoints;
///     uint32_t minQIndex;
///     uint32_t maxQIndex;
///     VkBool32 prefersGopRemainingFrames;
///     VkBool32 requiresGopRemainingFrames;
///     VkVideoEncodeAV1StdFlagsKHR stdSyntaxFlags;
/// } VkVideoEncodeAV1CapabilitiesKHR;
/// ```
public sealed class VkVideoEncodeAV1CapabilitiesKHR extends Struct {
    /// The struct layout of `VkVideoEncodeAV1CapabilitiesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("maxLevel"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("codedPictureAlignment"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("maxTiles"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("minTileSize"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("maxTileSize"),
        ValueLayout.JAVA_INT.withName("superblockSizes"),
        ValueLayout.JAVA_INT.withName("maxSingleReferenceCount"),
        ValueLayout.JAVA_INT.withName("singleReferenceNameMask"),
        ValueLayout.JAVA_INT.withName("maxUnidirectionalCompoundReferenceCount"),
        ValueLayout.JAVA_INT.withName("maxUnidirectionalCompoundGroup1ReferenceCount"),
        ValueLayout.JAVA_INT.withName("unidirectionalCompoundReferenceNameMask"),
        ValueLayout.JAVA_INT.withName("maxBidirectionalCompoundReferenceCount"),
        ValueLayout.JAVA_INT.withName("maxBidirectionalCompoundGroup1ReferenceCount"),
        ValueLayout.JAVA_INT.withName("maxBidirectionalCompoundGroup2ReferenceCount"),
        ValueLayout.JAVA_INT.withName("bidirectionalCompoundReferenceNameMask"),
        ValueLayout.JAVA_INT.withName("maxTemporalLayerCount"),
        ValueLayout.JAVA_INT.withName("maxSpatialLayerCount"),
        ValueLayout.JAVA_INT.withName("maxOperatingPoints"),
        ValueLayout.JAVA_INT.withName("minQIndex"),
        ValueLayout.JAVA_INT.withName("maxQIndex"),
        ValueLayout.JAVA_INT.withName("prefersGopRemainingFrames"),
        ValueLayout.JAVA_INT.withName("requiresGopRemainingFrames"),
        ValueLayout.JAVA_INT.withName("stdSyntaxFlags")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `maxLevel` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxLevel = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxLevel"));
    /// The byte offset of `codedPictureAlignment`.
    public static final long OFFSET_codedPictureAlignment = LAYOUT.byteOffset(PathElement.groupElement("codedPictureAlignment"));
    /// The memory layout of `codedPictureAlignment`.
    public static final MemoryLayout ML_codedPictureAlignment = LAYOUT.select(PathElement.groupElement("codedPictureAlignment"));
    /// The byte offset of `maxTiles`.
    public static final long OFFSET_maxTiles = LAYOUT.byteOffset(PathElement.groupElement("maxTiles"));
    /// The memory layout of `maxTiles`.
    public static final MemoryLayout ML_maxTiles = LAYOUT.select(PathElement.groupElement("maxTiles"));
    /// The byte offset of `minTileSize`.
    public static final long OFFSET_minTileSize = LAYOUT.byteOffset(PathElement.groupElement("minTileSize"));
    /// The memory layout of `minTileSize`.
    public static final MemoryLayout ML_minTileSize = LAYOUT.select(PathElement.groupElement("minTileSize"));
    /// The byte offset of `maxTileSize`.
    public static final long OFFSET_maxTileSize = LAYOUT.byteOffset(PathElement.groupElement("maxTileSize"));
    /// The memory layout of `maxTileSize`.
    public static final MemoryLayout ML_maxTileSize = LAYOUT.select(PathElement.groupElement("maxTileSize"));
    /// The [VarHandle] of `superblockSizes` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_superblockSizes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("superblockSizes"));
    /// The [VarHandle] of `maxSingleReferenceCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxSingleReferenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSingleReferenceCount"));
    /// The [VarHandle] of `singleReferenceNameMask` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_singleReferenceNameMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("singleReferenceNameMask"));
    /// The [VarHandle] of `maxUnidirectionalCompoundReferenceCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxUnidirectionalCompoundReferenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxUnidirectionalCompoundReferenceCount"));
    /// The [VarHandle] of `maxUnidirectionalCompoundGroup1ReferenceCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxUnidirectionalCompoundGroup1ReferenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxUnidirectionalCompoundGroup1ReferenceCount"));
    /// The [VarHandle] of `unidirectionalCompoundReferenceNameMask` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_unidirectionalCompoundReferenceNameMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("unidirectionalCompoundReferenceNameMask"));
    /// The [VarHandle] of `maxBidirectionalCompoundReferenceCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxBidirectionalCompoundReferenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxBidirectionalCompoundReferenceCount"));
    /// The [VarHandle] of `maxBidirectionalCompoundGroup1ReferenceCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxBidirectionalCompoundGroup1ReferenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxBidirectionalCompoundGroup1ReferenceCount"));
    /// The [VarHandle] of `maxBidirectionalCompoundGroup2ReferenceCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxBidirectionalCompoundGroup2ReferenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxBidirectionalCompoundGroup2ReferenceCount"));
    /// The [VarHandle] of `bidirectionalCompoundReferenceNameMask` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_bidirectionalCompoundReferenceNameMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bidirectionalCompoundReferenceNameMask"));
    /// The [VarHandle] of `maxTemporalLayerCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxTemporalLayerCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTemporalLayerCount"));
    /// The [VarHandle] of `maxSpatialLayerCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxSpatialLayerCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSpatialLayerCount"));
    /// The [VarHandle] of `maxOperatingPoints` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxOperatingPoints = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxOperatingPoints"));
    /// The [VarHandle] of `minQIndex` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_minQIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minQIndex"));
    /// The [VarHandle] of `maxQIndex` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxQIndex = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxQIndex"));
    /// The [VarHandle] of `prefersGopRemainingFrames` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_prefersGopRemainingFrames = LAYOUT.arrayElementVarHandle(PathElement.groupElement("prefersGopRemainingFrames"));
    /// The [VarHandle] of `requiresGopRemainingFrames` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_requiresGopRemainingFrames = LAYOUT.arrayElementVarHandle(PathElement.groupElement("requiresGopRemainingFrames"));
    /// The [VarHandle] of `stdSyntaxFlags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_stdSyntaxFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stdSyntaxFlags"));

    /// Creates `VkVideoEncodeAV1CapabilitiesKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoEncodeAV1CapabilitiesKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoEncodeAV1CapabilitiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeAV1CapabilitiesKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeAV1CapabilitiesKHR(segment); }

    /// Creates `VkVideoEncodeAV1CapabilitiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofBuffer(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeAV1CapabilitiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeAV1CapabilitiesKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeAV1CapabilitiesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoEncodeAV1CapabilitiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkVideoEncodeAV1CapabilitiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeAV1CapabilitiesKHR`
    public static VkVideoEncodeAV1CapabilitiesKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeAV1CapabilitiesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoEncodeAV1CapabilitiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeAV1CapabilitiesKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkVideoEncodeAV1CapabilitiesKHR` with the given segment allocator and the initializing arguments.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeAV1CapabilitiesKHR`
    public static VkVideoEncodeAV1CapabilitiesKHR allocInit(SegmentAllocator allocator, @CType("VkStructureType") int sType, @CType("void *") MemorySegment pNext, @CType("VkVideoEncodeAV1CapabilityFlagsKHR") int flags, @CType("StdVideoAV1Level") int maxLevel, @CType("VkExtent2D") MemorySegment codedPictureAlignment, @CType("VkExtent2D") MemorySegment maxTiles, @CType("VkExtent2D") MemorySegment minTileSize, @CType("VkExtent2D") MemorySegment maxTileSize, @CType("VkVideoEncodeAV1SuperblockSizeFlagsKHR") int superblockSizes, @CType("uint32_t") int maxSingleReferenceCount, @CType("uint32_t") int singleReferenceNameMask, @CType("uint32_t") int maxUnidirectionalCompoundReferenceCount, @CType("uint32_t") int maxUnidirectionalCompoundGroup1ReferenceCount, @CType("uint32_t") int unidirectionalCompoundReferenceNameMask, @CType("uint32_t") int maxBidirectionalCompoundReferenceCount, @CType("uint32_t") int maxBidirectionalCompoundGroup1ReferenceCount, @CType("uint32_t") int maxBidirectionalCompoundGroup2ReferenceCount, @CType("uint32_t") int bidirectionalCompoundReferenceNameMask, @CType("uint32_t") int maxTemporalLayerCount, @CType("uint32_t") int maxSpatialLayerCount, @CType("uint32_t") int maxOperatingPoints, @CType("uint32_t") int minQIndex, @CType("uint32_t") int maxQIndex, @CType("VkBool32") int prefersGopRemainingFrames, @CType("VkBool32") int requiresGopRemainingFrames, @CType("VkVideoEncodeAV1StdFlagsKHR") int stdSyntaxFlags) { return alloc(allocator).sType(sType).pNext(pNext).flags(flags).maxLevel(maxLevel).codedPictureAlignment(codedPictureAlignment).maxTiles(maxTiles).minTileSize(minTileSize).maxTileSize(maxTileSize).superblockSizes(superblockSizes).maxSingleReferenceCount(maxSingleReferenceCount).singleReferenceNameMask(singleReferenceNameMask).maxUnidirectionalCompoundReferenceCount(maxUnidirectionalCompoundReferenceCount).maxUnidirectionalCompoundGroup1ReferenceCount(maxUnidirectionalCompoundGroup1ReferenceCount).unidirectionalCompoundReferenceNameMask(unidirectionalCompoundReferenceNameMask).maxBidirectionalCompoundReferenceCount(maxBidirectionalCompoundReferenceCount).maxBidirectionalCompoundGroup1ReferenceCount(maxBidirectionalCompoundGroup1ReferenceCount).maxBidirectionalCompoundGroup2ReferenceCount(maxBidirectionalCompoundGroup2ReferenceCount).bidirectionalCompoundReferenceNameMask(bidirectionalCompoundReferenceNameMask).maxTemporalLayerCount(maxTemporalLayerCount).maxSpatialLayerCount(maxSpatialLayerCount).maxOperatingPoints(maxOperatingPoints).minQIndex(minQIndex).maxQIndex(maxQIndex).prefersGopRemainingFrames(prefersGopRemainingFrames).requiresGopRemainingFrames(requiresGopRemainingFrames).stdSyntaxFlags(stdSyntaxFlags); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR copyFrom(VkVideoEncodeAV1CapabilitiesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoEncodeAV1CapabilitiesKHR.get_sType(segment, 0L); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoEncodeAV1CapabilitiesKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoEncodeAV1CapabilitiesKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR sType(@CType("VkStructureType") int value) { VkVideoEncodeAV1CapabilitiesKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment, long index) { return (MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") MemorySegment get_pNext(MemorySegment segment) { return VkVideoEncodeAV1CapabilitiesKHR.get_pNext(segment, 0L); }
    /// {@return `pNext`}
    public @CType("void *") MemorySegment pNext() { return VkVideoEncodeAV1CapabilitiesKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") MemorySegment value) { VkVideoEncodeAV1CapabilitiesKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR pNext(@CType("void *") MemorySegment value) { VkVideoEncodeAV1CapabilitiesKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkVideoEncodeAV1CapabilityFlagsKHR") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkVideoEncodeAV1CapabilityFlagsKHR") int get_flags(MemorySegment segment) { return VkVideoEncodeAV1CapabilitiesKHR.get_flags(segment, 0L); }
    /// {@return `flags`}
    public @CType("VkVideoEncodeAV1CapabilityFlagsKHR") int flags() { return VkVideoEncodeAV1CapabilitiesKHR.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkVideoEncodeAV1CapabilityFlagsKHR") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkVideoEncodeAV1CapabilityFlagsKHR") int value) { VkVideoEncodeAV1CapabilitiesKHR.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR flags(@CType("VkVideoEncodeAV1CapabilityFlagsKHR") int value) { VkVideoEncodeAV1CapabilitiesKHR.set_flags(this.segment(), value); return this; }

    /// {@return `maxLevel` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoAV1Level") int get_maxLevel(MemorySegment segment, long index) { return (int) VH_maxLevel.get(segment, 0L, index); }
    /// {@return `maxLevel`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoAV1Level") int get_maxLevel(MemorySegment segment) { return VkVideoEncodeAV1CapabilitiesKHR.get_maxLevel(segment, 0L); }
    /// {@return `maxLevel`}
    public @CType("StdVideoAV1Level") int maxLevel() { return VkVideoEncodeAV1CapabilitiesKHR.get_maxLevel(this.segment()); }
    /// Sets `maxLevel` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxLevel(MemorySegment segment, long index, @CType("StdVideoAV1Level") int value) { VH_maxLevel.set(segment, 0L, index, value); }
    /// Sets `maxLevel` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxLevel(MemorySegment segment, @CType("StdVideoAV1Level") int value) { VkVideoEncodeAV1CapabilitiesKHR.set_maxLevel(segment, 0L, value); }
    /// Sets `maxLevel` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR maxLevel(@CType("StdVideoAV1Level") int value) { VkVideoEncodeAV1CapabilitiesKHR.set_maxLevel(this.segment(), value); return this; }

    /// {@return `codedPictureAlignment` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent2D") MemorySegment get_codedPictureAlignment(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_codedPictureAlignment, index), ML_codedPictureAlignment); }
    /// {@return `codedPictureAlignment`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent2D") MemorySegment get_codedPictureAlignment(MemorySegment segment) { return VkVideoEncodeAV1CapabilitiesKHR.get_codedPictureAlignment(segment, 0L); }
    /// {@return `codedPictureAlignment`}
    public @CType("VkExtent2D") MemorySegment codedPictureAlignment() { return VkVideoEncodeAV1CapabilitiesKHR.get_codedPictureAlignment(this.segment()); }
    /// Sets `codedPictureAlignment` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_codedPictureAlignment(MemorySegment segment, long index, @CType("VkExtent2D") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_codedPictureAlignment, index), ML_codedPictureAlignment.byteSize()); }
    /// Sets `codedPictureAlignment` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_codedPictureAlignment(MemorySegment segment, @CType("VkExtent2D") MemorySegment value) { VkVideoEncodeAV1CapabilitiesKHR.set_codedPictureAlignment(segment, 0L, value); }
    /// Sets `codedPictureAlignment` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR codedPictureAlignment(@CType("VkExtent2D") MemorySegment value) { VkVideoEncodeAV1CapabilitiesKHR.set_codedPictureAlignment(this.segment(), value); return this; }

    /// {@return `maxTiles` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent2D") MemorySegment get_maxTiles(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxTiles, index), ML_maxTiles); }
    /// {@return `maxTiles`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent2D") MemorySegment get_maxTiles(MemorySegment segment) { return VkVideoEncodeAV1CapabilitiesKHR.get_maxTiles(segment, 0L); }
    /// {@return `maxTiles`}
    public @CType("VkExtent2D") MemorySegment maxTiles() { return VkVideoEncodeAV1CapabilitiesKHR.get_maxTiles(this.segment()); }
    /// Sets `maxTiles` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxTiles(MemorySegment segment, long index, @CType("VkExtent2D") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxTiles, index), ML_maxTiles.byteSize()); }
    /// Sets `maxTiles` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxTiles(MemorySegment segment, @CType("VkExtent2D") MemorySegment value) { VkVideoEncodeAV1CapabilitiesKHR.set_maxTiles(segment, 0L, value); }
    /// Sets `maxTiles` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR maxTiles(@CType("VkExtent2D") MemorySegment value) { VkVideoEncodeAV1CapabilitiesKHR.set_maxTiles(this.segment(), value); return this; }

    /// {@return `minTileSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent2D") MemorySegment get_minTileSize(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_minTileSize, index), ML_minTileSize); }
    /// {@return `minTileSize`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent2D") MemorySegment get_minTileSize(MemorySegment segment) { return VkVideoEncodeAV1CapabilitiesKHR.get_minTileSize(segment, 0L); }
    /// {@return `minTileSize`}
    public @CType("VkExtent2D") MemorySegment minTileSize() { return VkVideoEncodeAV1CapabilitiesKHR.get_minTileSize(this.segment()); }
    /// Sets `minTileSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_minTileSize(MemorySegment segment, long index, @CType("VkExtent2D") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_minTileSize, index), ML_minTileSize.byteSize()); }
    /// Sets `minTileSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_minTileSize(MemorySegment segment, @CType("VkExtent2D") MemorySegment value) { VkVideoEncodeAV1CapabilitiesKHR.set_minTileSize(segment, 0L, value); }
    /// Sets `minTileSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR minTileSize(@CType("VkExtent2D") MemorySegment value) { VkVideoEncodeAV1CapabilitiesKHR.set_minTileSize(this.segment(), value); return this; }

    /// {@return `maxTileSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent2D") MemorySegment get_maxTileSize(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxTileSize, index), ML_maxTileSize); }
    /// {@return `maxTileSize`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent2D") MemorySegment get_maxTileSize(MemorySegment segment) { return VkVideoEncodeAV1CapabilitiesKHR.get_maxTileSize(segment, 0L); }
    /// {@return `maxTileSize`}
    public @CType("VkExtent2D") MemorySegment maxTileSize() { return VkVideoEncodeAV1CapabilitiesKHR.get_maxTileSize(this.segment()); }
    /// Sets `maxTileSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxTileSize(MemorySegment segment, long index, @CType("VkExtent2D") MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxTileSize, index), ML_maxTileSize.byteSize()); }
    /// Sets `maxTileSize` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxTileSize(MemorySegment segment, @CType("VkExtent2D") MemorySegment value) { VkVideoEncodeAV1CapabilitiesKHR.set_maxTileSize(segment, 0L, value); }
    /// Sets `maxTileSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR maxTileSize(@CType("VkExtent2D") MemorySegment value) { VkVideoEncodeAV1CapabilitiesKHR.set_maxTileSize(this.segment(), value); return this; }

    /// {@return `superblockSizes` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkVideoEncodeAV1SuperblockSizeFlagsKHR") int get_superblockSizes(MemorySegment segment, long index) { return (int) VH_superblockSizes.get(segment, 0L, index); }
    /// {@return `superblockSizes`}
    /// @param segment the segment of the struct
    public static @CType("VkVideoEncodeAV1SuperblockSizeFlagsKHR") int get_superblockSizes(MemorySegment segment) { return VkVideoEncodeAV1CapabilitiesKHR.get_superblockSizes(segment, 0L); }
    /// {@return `superblockSizes`}
    public @CType("VkVideoEncodeAV1SuperblockSizeFlagsKHR") int superblockSizes() { return VkVideoEncodeAV1CapabilitiesKHR.get_superblockSizes(this.segment()); }
    /// Sets `superblockSizes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_superblockSizes(MemorySegment segment, long index, @CType("VkVideoEncodeAV1SuperblockSizeFlagsKHR") int value) { VH_superblockSizes.set(segment, 0L, index, value); }
    /// Sets `superblockSizes` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_superblockSizes(MemorySegment segment, @CType("VkVideoEncodeAV1SuperblockSizeFlagsKHR") int value) { VkVideoEncodeAV1CapabilitiesKHR.set_superblockSizes(segment, 0L, value); }
    /// Sets `superblockSizes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR superblockSizes(@CType("VkVideoEncodeAV1SuperblockSizeFlagsKHR") int value) { VkVideoEncodeAV1CapabilitiesKHR.set_superblockSizes(this.segment(), value); return this; }

    /// {@return `maxSingleReferenceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxSingleReferenceCount(MemorySegment segment, long index) { return (int) VH_maxSingleReferenceCount.get(segment, 0L, index); }
    /// {@return `maxSingleReferenceCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxSingleReferenceCount(MemorySegment segment) { return VkVideoEncodeAV1CapabilitiesKHR.get_maxSingleReferenceCount(segment, 0L); }
    /// {@return `maxSingleReferenceCount`}
    public @CType("uint32_t") int maxSingleReferenceCount() { return VkVideoEncodeAV1CapabilitiesKHR.get_maxSingleReferenceCount(this.segment()); }
    /// Sets `maxSingleReferenceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxSingleReferenceCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxSingleReferenceCount.set(segment, 0L, index, value); }
    /// Sets `maxSingleReferenceCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxSingleReferenceCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeAV1CapabilitiesKHR.set_maxSingleReferenceCount(segment, 0L, value); }
    /// Sets `maxSingleReferenceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR maxSingleReferenceCount(@CType("uint32_t") int value) { VkVideoEncodeAV1CapabilitiesKHR.set_maxSingleReferenceCount(this.segment(), value); return this; }

    /// {@return `singleReferenceNameMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_singleReferenceNameMask(MemorySegment segment, long index) { return (int) VH_singleReferenceNameMask.get(segment, 0L, index); }
    /// {@return `singleReferenceNameMask`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_singleReferenceNameMask(MemorySegment segment) { return VkVideoEncodeAV1CapabilitiesKHR.get_singleReferenceNameMask(segment, 0L); }
    /// {@return `singleReferenceNameMask`}
    public @CType("uint32_t") int singleReferenceNameMask() { return VkVideoEncodeAV1CapabilitiesKHR.get_singleReferenceNameMask(this.segment()); }
    /// Sets `singleReferenceNameMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_singleReferenceNameMask(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_singleReferenceNameMask.set(segment, 0L, index, value); }
    /// Sets `singleReferenceNameMask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_singleReferenceNameMask(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeAV1CapabilitiesKHR.set_singleReferenceNameMask(segment, 0L, value); }
    /// Sets `singleReferenceNameMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR singleReferenceNameMask(@CType("uint32_t") int value) { VkVideoEncodeAV1CapabilitiesKHR.set_singleReferenceNameMask(this.segment(), value); return this; }

    /// {@return `maxUnidirectionalCompoundReferenceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxUnidirectionalCompoundReferenceCount(MemorySegment segment, long index) { return (int) VH_maxUnidirectionalCompoundReferenceCount.get(segment, 0L, index); }
    /// {@return `maxUnidirectionalCompoundReferenceCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxUnidirectionalCompoundReferenceCount(MemorySegment segment) { return VkVideoEncodeAV1CapabilitiesKHR.get_maxUnidirectionalCompoundReferenceCount(segment, 0L); }
    /// {@return `maxUnidirectionalCompoundReferenceCount`}
    public @CType("uint32_t") int maxUnidirectionalCompoundReferenceCount() { return VkVideoEncodeAV1CapabilitiesKHR.get_maxUnidirectionalCompoundReferenceCount(this.segment()); }
    /// Sets `maxUnidirectionalCompoundReferenceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxUnidirectionalCompoundReferenceCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxUnidirectionalCompoundReferenceCount.set(segment, 0L, index, value); }
    /// Sets `maxUnidirectionalCompoundReferenceCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxUnidirectionalCompoundReferenceCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeAV1CapabilitiesKHR.set_maxUnidirectionalCompoundReferenceCount(segment, 0L, value); }
    /// Sets `maxUnidirectionalCompoundReferenceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR maxUnidirectionalCompoundReferenceCount(@CType("uint32_t") int value) { VkVideoEncodeAV1CapabilitiesKHR.set_maxUnidirectionalCompoundReferenceCount(this.segment(), value); return this; }

    /// {@return `maxUnidirectionalCompoundGroup1ReferenceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxUnidirectionalCompoundGroup1ReferenceCount(MemorySegment segment, long index) { return (int) VH_maxUnidirectionalCompoundGroup1ReferenceCount.get(segment, 0L, index); }
    /// {@return `maxUnidirectionalCompoundGroup1ReferenceCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxUnidirectionalCompoundGroup1ReferenceCount(MemorySegment segment) { return VkVideoEncodeAV1CapabilitiesKHR.get_maxUnidirectionalCompoundGroup1ReferenceCount(segment, 0L); }
    /// {@return `maxUnidirectionalCompoundGroup1ReferenceCount`}
    public @CType("uint32_t") int maxUnidirectionalCompoundGroup1ReferenceCount() { return VkVideoEncodeAV1CapabilitiesKHR.get_maxUnidirectionalCompoundGroup1ReferenceCount(this.segment()); }
    /// Sets `maxUnidirectionalCompoundGroup1ReferenceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxUnidirectionalCompoundGroup1ReferenceCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxUnidirectionalCompoundGroup1ReferenceCount.set(segment, 0L, index, value); }
    /// Sets `maxUnidirectionalCompoundGroup1ReferenceCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxUnidirectionalCompoundGroup1ReferenceCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeAV1CapabilitiesKHR.set_maxUnidirectionalCompoundGroup1ReferenceCount(segment, 0L, value); }
    /// Sets `maxUnidirectionalCompoundGroup1ReferenceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR maxUnidirectionalCompoundGroup1ReferenceCount(@CType("uint32_t") int value) { VkVideoEncodeAV1CapabilitiesKHR.set_maxUnidirectionalCompoundGroup1ReferenceCount(this.segment(), value); return this; }

    /// {@return `unidirectionalCompoundReferenceNameMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_unidirectionalCompoundReferenceNameMask(MemorySegment segment, long index) { return (int) VH_unidirectionalCompoundReferenceNameMask.get(segment, 0L, index); }
    /// {@return `unidirectionalCompoundReferenceNameMask`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_unidirectionalCompoundReferenceNameMask(MemorySegment segment) { return VkVideoEncodeAV1CapabilitiesKHR.get_unidirectionalCompoundReferenceNameMask(segment, 0L); }
    /// {@return `unidirectionalCompoundReferenceNameMask`}
    public @CType("uint32_t") int unidirectionalCompoundReferenceNameMask() { return VkVideoEncodeAV1CapabilitiesKHR.get_unidirectionalCompoundReferenceNameMask(this.segment()); }
    /// Sets `unidirectionalCompoundReferenceNameMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_unidirectionalCompoundReferenceNameMask(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_unidirectionalCompoundReferenceNameMask.set(segment, 0L, index, value); }
    /// Sets `unidirectionalCompoundReferenceNameMask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_unidirectionalCompoundReferenceNameMask(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeAV1CapabilitiesKHR.set_unidirectionalCompoundReferenceNameMask(segment, 0L, value); }
    /// Sets `unidirectionalCompoundReferenceNameMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR unidirectionalCompoundReferenceNameMask(@CType("uint32_t") int value) { VkVideoEncodeAV1CapabilitiesKHR.set_unidirectionalCompoundReferenceNameMask(this.segment(), value); return this; }

    /// {@return `maxBidirectionalCompoundReferenceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxBidirectionalCompoundReferenceCount(MemorySegment segment, long index) { return (int) VH_maxBidirectionalCompoundReferenceCount.get(segment, 0L, index); }
    /// {@return `maxBidirectionalCompoundReferenceCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxBidirectionalCompoundReferenceCount(MemorySegment segment) { return VkVideoEncodeAV1CapabilitiesKHR.get_maxBidirectionalCompoundReferenceCount(segment, 0L); }
    /// {@return `maxBidirectionalCompoundReferenceCount`}
    public @CType("uint32_t") int maxBidirectionalCompoundReferenceCount() { return VkVideoEncodeAV1CapabilitiesKHR.get_maxBidirectionalCompoundReferenceCount(this.segment()); }
    /// Sets `maxBidirectionalCompoundReferenceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxBidirectionalCompoundReferenceCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxBidirectionalCompoundReferenceCount.set(segment, 0L, index, value); }
    /// Sets `maxBidirectionalCompoundReferenceCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxBidirectionalCompoundReferenceCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeAV1CapabilitiesKHR.set_maxBidirectionalCompoundReferenceCount(segment, 0L, value); }
    /// Sets `maxBidirectionalCompoundReferenceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR maxBidirectionalCompoundReferenceCount(@CType("uint32_t") int value) { VkVideoEncodeAV1CapabilitiesKHR.set_maxBidirectionalCompoundReferenceCount(this.segment(), value); return this; }

    /// {@return `maxBidirectionalCompoundGroup1ReferenceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxBidirectionalCompoundGroup1ReferenceCount(MemorySegment segment, long index) { return (int) VH_maxBidirectionalCompoundGroup1ReferenceCount.get(segment, 0L, index); }
    /// {@return `maxBidirectionalCompoundGroup1ReferenceCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxBidirectionalCompoundGroup1ReferenceCount(MemorySegment segment) { return VkVideoEncodeAV1CapabilitiesKHR.get_maxBidirectionalCompoundGroup1ReferenceCount(segment, 0L); }
    /// {@return `maxBidirectionalCompoundGroup1ReferenceCount`}
    public @CType("uint32_t") int maxBidirectionalCompoundGroup1ReferenceCount() { return VkVideoEncodeAV1CapabilitiesKHR.get_maxBidirectionalCompoundGroup1ReferenceCount(this.segment()); }
    /// Sets `maxBidirectionalCompoundGroup1ReferenceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxBidirectionalCompoundGroup1ReferenceCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxBidirectionalCompoundGroup1ReferenceCount.set(segment, 0L, index, value); }
    /// Sets `maxBidirectionalCompoundGroup1ReferenceCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxBidirectionalCompoundGroup1ReferenceCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeAV1CapabilitiesKHR.set_maxBidirectionalCompoundGroup1ReferenceCount(segment, 0L, value); }
    /// Sets `maxBidirectionalCompoundGroup1ReferenceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR maxBidirectionalCompoundGroup1ReferenceCount(@CType("uint32_t") int value) { VkVideoEncodeAV1CapabilitiesKHR.set_maxBidirectionalCompoundGroup1ReferenceCount(this.segment(), value); return this; }

    /// {@return `maxBidirectionalCompoundGroup2ReferenceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxBidirectionalCompoundGroup2ReferenceCount(MemorySegment segment, long index) { return (int) VH_maxBidirectionalCompoundGroup2ReferenceCount.get(segment, 0L, index); }
    /// {@return `maxBidirectionalCompoundGroup2ReferenceCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxBidirectionalCompoundGroup2ReferenceCount(MemorySegment segment) { return VkVideoEncodeAV1CapabilitiesKHR.get_maxBidirectionalCompoundGroup2ReferenceCount(segment, 0L); }
    /// {@return `maxBidirectionalCompoundGroup2ReferenceCount`}
    public @CType("uint32_t") int maxBidirectionalCompoundGroup2ReferenceCount() { return VkVideoEncodeAV1CapabilitiesKHR.get_maxBidirectionalCompoundGroup2ReferenceCount(this.segment()); }
    /// Sets `maxBidirectionalCompoundGroup2ReferenceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxBidirectionalCompoundGroup2ReferenceCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxBidirectionalCompoundGroup2ReferenceCount.set(segment, 0L, index, value); }
    /// Sets `maxBidirectionalCompoundGroup2ReferenceCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxBidirectionalCompoundGroup2ReferenceCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeAV1CapabilitiesKHR.set_maxBidirectionalCompoundGroup2ReferenceCount(segment, 0L, value); }
    /// Sets `maxBidirectionalCompoundGroup2ReferenceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR maxBidirectionalCompoundGroup2ReferenceCount(@CType("uint32_t") int value) { VkVideoEncodeAV1CapabilitiesKHR.set_maxBidirectionalCompoundGroup2ReferenceCount(this.segment(), value); return this; }

    /// {@return `bidirectionalCompoundReferenceNameMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_bidirectionalCompoundReferenceNameMask(MemorySegment segment, long index) { return (int) VH_bidirectionalCompoundReferenceNameMask.get(segment, 0L, index); }
    /// {@return `bidirectionalCompoundReferenceNameMask`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_bidirectionalCompoundReferenceNameMask(MemorySegment segment) { return VkVideoEncodeAV1CapabilitiesKHR.get_bidirectionalCompoundReferenceNameMask(segment, 0L); }
    /// {@return `bidirectionalCompoundReferenceNameMask`}
    public @CType("uint32_t") int bidirectionalCompoundReferenceNameMask() { return VkVideoEncodeAV1CapabilitiesKHR.get_bidirectionalCompoundReferenceNameMask(this.segment()); }
    /// Sets `bidirectionalCompoundReferenceNameMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_bidirectionalCompoundReferenceNameMask(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_bidirectionalCompoundReferenceNameMask.set(segment, 0L, index, value); }
    /// Sets `bidirectionalCompoundReferenceNameMask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_bidirectionalCompoundReferenceNameMask(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeAV1CapabilitiesKHR.set_bidirectionalCompoundReferenceNameMask(segment, 0L, value); }
    /// Sets `bidirectionalCompoundReferenceNameMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR bidirectionalCompoundReferenceNameMask(@CType("uint32_t") int value) { VkVideoEncodeAV1CapabilitiesKHR.set_bidirectionalCompoundReferenceNameMask(this.segment(), value); return this; }

    /// {@return `maxTemporalLayerCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxTemporalLayerCount(MemorySegment segment, long index) { return (int) VH_maxTemporalLayerCount.get(segment, 0L, index); }
    /// {@return `maxTemporalLayerCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxTemporalLayerCount(MemorySegment segment) { return VkVideoEncodeAV1CapabilitiesKHR.get_maxTemporalLayerCount(segment, 0L); }
    /// {@return `maxTemporalLayerCount`}
    public @CType("uint32_t") int maxTemporalLayerCount() { return VkVideoEncodeAV1CapabilitiesKHR.get_maxTemporalLayerCount(this.segment()); }
    /// Sets `maxTemporalLayerCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxTemporalLayerCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxTemporalLayerCount.set(segment, 0L, index, value); }
    /// Sets `maxTemporalLayerCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxTemporalLayerCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeAV1CapabilitiesKHR.set_maxTemporalLayerCount(segment, 0L, value); }
    /// Sets `maxTemporalLayerCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR maxTemporalLayerCount(@CType("uint32_t") int value) { VkVideoEncodeAV1CapabilitiesKHR.set_maxTemporalLayerCount(this.segment(), value); return this; }

    /// {@return `maxSpatialLayerCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxSpatialLayerCount(MemorySegment segment, long index) { return (int) VH_maxSpatialLayerCount.get(segment, 0L, index); }
    /// {@return `maxSpatialLayerCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxSpatialLayerCount(MemorySegment segment) { return VkVideoEncodeAV1CapabilitiesKHR.get_maxSpatialLayerCount(segment, 0L); }
    /// {@return `maxSpatialLayerCount`}
    public @CType("uint32_t") int maxSpatialLayerCount() { return VkVideoEncodeAV1CapabilitiesKHR.get_maxSpatialLayerCount(this.segment()); }
    /// Sets `maxSpatialLayerCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxSpatialLayerCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxSpatialLayerCount.set(segment, 0L, index, value); }
    /// Sets `maxSpatialLayerCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxSpatialLayerCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeAV1CapabilitiesKHR.set_maxSpatialLayerCount(segment, 0L, value); }
    /// Sets `maxSpatialLayerCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR maxSpatialLayerCount(@CType("uint32_t") int value) { VkVideoEncodeAV1CapabilitiesKHR.set_maxSpatialLayerCount(this.segment(), value); return this; }

    /// {@return `maxOperatingPoints` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxOperatingPoints(MemorySegment segment, long index) { return (int) VH_maxOperatingPoints.get(segment, 0L, index); }
    /// {@return `maxOperatingPoints`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxOperatingPoints(MemorySegment segment) { return VkVideoEncodeAV1CapabilitiesKHR.get_maxOperatingPoints(segment, 0L); }
    /// {@return `maxOperatingPoints`}
    public @CType("uint32_t") int maxOperatingPoints() { return VkVideoEncodeAV1CapabilitiesKHR.get_maxOperatingPoints(this.segment()); }
    /// Sets `maxOperatingPoints` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxOperatingPoints(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxOperatingPoints.set(segment, 0L, index, value); }
    /// Sets `maxOperatingPoints` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxOperatingPoints(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeAV1CapabilitiesKHR.set_maxOperatingPoints(segment, 0L, value); }
    /// Sets `maxOperatingPoints` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR maxOperatingPoints(@CType("uint32_t") int value) { VkVideoEncodeAV1CapabilitiesKHR.set_maxOperatingPoints(this.segment(), value); return this; }

    /// {@return `minQIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_minQIndex(MemorySegment segment, long index) { return (int) VH_minQIndex.get(segment, 0L, index); }
    /// {@return `minQIndex`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_minQIndex(MemorySegment segment) { return VkVideoEncodeAV1CapabilitiesKHR.get_minQIndex(segment, 0L); }
    /// {@return `minQIndex`}
    public @CType("uint32_t") int minQIndex() { return VkVideoEncodeAV1CapabilitiesKHR.get_minQIndex(this.segment()); }
    /// Sets `minQIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_minQIndex(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_minQIndex.set(segment, 0L, index, value); }
    /// Sets `minQIndex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_minQIndex(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeAV1CapabilitiesKHR.set_minQIndex(segment, 0L, value); }
    /// Sets `minQIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR minQIndex(@CType("uint32_t") int value) { VkVideoEncodeAV1CapabilitiesKHR.set_minQIndex(this.segment(), value); return this; }

    /// {@return `maxQIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxQIndex(MemorySegment segment, long index) { return (int) VH_maxQIndex.get(segment, 0L, index); }
    /// {@return `maxQIndex`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxQIndex(MemorySegment segment) { return VkVideoEncodeAV1CapabilitiesKHR.get_maxQIndex(segment, 0L); }
    /// {@return `maxQIndex`}
    public @CType("uint32_t") int maxQIndex() { return VkVideoEncodeAV1CapabilitiesKHR.get_maxQIndex(this.segment()); }
    /// Sets `maxQIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxQIndex(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxQIndex.set(segment, 0L, index, value); }
    /// Sets `maxQIndex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxQIndex(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeAV1CapabilitiesKHR.set_maxQIndex(segment, 0L, value); }
    /// Sets `maxQIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR maxQIndex(@CType("uint32_t") int value) { VkVideoEncodeAV1CapabilitiesKHR.set_maxQIndex(this.segment(), value); return this; }

    /// {@return `prefersGopRemainingFrames` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_prefersGopRemainingFrames(MemorySegment segment, long index) { return (int) VH_prefersGopRemainingFrames.get(segment, 0L, index); }
    /// {@return `prefersGopRemainingFrames`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_prefersGopRemainingFrames(MemorySegment segment) { return VkVideoEncodeAV1CapabilitiesKHR.get_prefersGopRemainingFrames(segment, 0L); }
    /// {@return `prefersGopRemainingFrames`}
    public @CType("VkBool32") int prefersGopRemainingFrames() { return VkVideoEncodeAV1CapabilitiesKHR.get_prefersGopRemainingFrames(this.segment()); }
    /// Sets `prefersGopRemainingFrames` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_prefersGopRemainingFrames(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_prefersGopRemainingFrames.set(segment, 0L, index, value); }
    /// Sets `prefersGopRemainingFrames` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_prefersGopRemainingFrames(MemorySegment segment, @CType("VkBool32") int value) { VkVideoEncodeAV1CapabilitiesKHR.set_prefersGopRemainingFrames(segment, 0L, value); }
    /// Sets `prefersGopRemainingFrames` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR prefersGopRemainingFrames(@CType("VkBool32") int value) { VkVideoEncodeAV1CapabilitiesKHR.set_prefersGopRemainingFrames(this.segment(), value); return this; }

    /// {@return `requiresGopRemainingFrames` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_requiresGopRemainingFrames(MemorySegment segment, long index) { return (int) VH_requiresGopRemainingFrames.get(segment, 0L, index); }
    /// {@return `requiresGopRemainingFrames`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_requiresGopRemainingFrames(MemorySegment segment) { return VkVideoEncodeAV1CapabilitiesKHR.get_requiresGopRemainingFrames(segment, 0L); }
    /// {@return `requiresGopRemainingFrames`}
    public @CType("VkBool32") int requiresGopRemainingFrames() { return VkVideoEncodeAV1CapabilitiesKHR.get_requiresGopRemainingFrames(this.segment()); }
    /// Sets `requiresGopRemainingFrames` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_requiresGopRemainingFrames(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_requiresGopRemainingFrames.set(segment, 0L, index, value); }
    /// Sets `requiresGopRemainingFrames` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_requiresGopRemainingFrames(MemorySegment segment, @CType("VkBool32") int value) { VkVideoEncodeAV1CapabilitiesKHR.set_requiresGopRemainingFrames(segment, 0L, value); }
    /// Sets `requiresGopRemainingFrames` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR requiresGopRemainingFrames(@CType("VkBool32") int value) { VkVideoEncodeAV1CapabilitiesKHR.set_requiresGopRemainingFrames(this.segment(), value); return this; }

    /// {@return `stdSyntaxFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkVideoEncodeAV1StdFlagsKHR") int get_stdSyntaxFlags(MemorySegment segment, long index) { return (int) VH_stdSyntaxFlags.get(segment, 0L, index); }
    /// {@return `stdSyntaxFlags`}
    /// @param segment the segment of the struct
    public static @CType("VkVideoEncodeAV1StdFlagsKHR") int get_stdSyntaxFlags(MemorySegment segment) { return VkVideoEncodeAV1CapabilitiesKHR.get_stdSyntaxFlags(segment, 0L); }
    /// {@return `stdSyntaxFlags`}
    public @CType("VkVideoEncodeAV1StdFlagsKHR") int stdSyntaxFlags() { return VkVideoEncodeAV1CapabilitiesKHR.get_stdSyntaxFlags(this.segment()); }
    /// Sets `stdSyntaxFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stdSyntaxFlags(MemorySegment segment, long index, @CType("VkVideoEncodeAV1StdFlagsKHR") int value) { VH_stdSyntaxFlags.set(segment, 0L, index, value); }
    /// Sets `stdSyntaxFlags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stdSyntaxFlags(MemorySegment segment, @CType("VkVideoEncodeAV1StdFlagsKHR") int value) { VkVideoEncodeAV1CapabilitiesKHR.set_stdSyntaxFlags(segment, 0L, value); }
    /// Sets `stdSyntaxFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1CapabilitiesKHR stdSyntaxFlags(@CType("VkVideoEncodeAV1StdFlagsKHR") int value) { VkVideoEncodeAV1CapabilitiesKHR.set_stdSyntaxFlags(this.segment(), value); return this; }

    /// A buffer of [VkVideoEncodeAV1CapabilitiesKHR].
    public static final class Buffer extends VkVideoEncodeAV1CapabilitiesKHR {
        private final long elementCount;

        /// Creates `VkVideoEncodeAV1CapabilitiesKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkVideoEncodeAV1CapabilitiesKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkVideoEncodeAV1CapabilitiesKHR`
        public VkVideoEncodeAV1CapabilitiesKHR asSlice(long index) { return new VkVideoEncodeAV1CapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkVideoEncodeAV1CapabilitiesKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkVideoEncodeAV1CapabilitiesKHR`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `sType` at the given index}
        /// @param index the index
        public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoEncodeAV1CapabilitiesKHR.get_sType(this.segment(), index); }
        /// Sets `sType` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoEncodeAV1CapabilitiesKHR.set_sType(this.segment(), index, value); return this; }

        /// {@return `pNext` at the given index}
        /// @param index the index
        public @CType("void *") MemorySegment pNextAt(long index) { return VkVideoEncodeAV1CapabilitiesKHR.get_pNext(this.segment(), index); }
        /// Sets `pNext` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer pNextAt(long index, @CType("void *") MemorySegment value) { VkVideoEncodeAV1CapabilitiesKHR.set_pNext(this.segment(), index, value); return this; }

        /// {@return `flags` at the given index}
        /// @param index the index
        public @CType("VkVideoEncodeAV1CapabilityFlagsKHR") int flagsAt(long index) { return VkVideoEncodeAV1CapabilitiesKHR.get_flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, @CType("VkVideoEncodeAV1CapabilityFlagsKHR") int value) { VkVideoEncodeAV1CapabilitiesKHR.set_flags(this.segment(), index, value); return this; }

        /// {@return `maxLevel` at the given index}
        /// @param index the index
        public @CType("StdVideoAV1Level") int maxLevelAt(long index) { return VkVideoEncodeAV1CapabilitiesKHR.get_maxLevel(this.segment(), index); }
        /// Sets `maxLevel` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxLevelAt(long index, @CType("StdVideoAV1Level") int value) { VkVideoEncodeAV1CapabilitiesKHR.set_maxLevel(this.segment(), index, value); return this; }

        /// {@return `codedPictureAlignment` at the given index}
        /// @param index the index
        public @CType("VkExtent2D") MemorySegment codedPictureAlignmentAt(long index) { return VkVideoEncodeAV1CapabilitiesKHR.get_codedPictureAlignment(this.segment(), index); }
        /// Sets `codedPictureAlignment` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer codedPictureAlignmentAt(long index, @CType("VkExtent2D") MemorySegment value) { VkVideoEncodeAV1CapabilitiesKHR.set_codedPictureAlignment(this.segment(), index, value); return this; }

        /// {@return `maxTiles` at the given index}
        /// @param index the index
        public @CType("VkExtent2D") MemorySegment maxTilesAt(long index) { return VkVideoEncodeAV1CapabilitiesKHR.get_maxTiles(this.segment(), index); }
        /// Sets `maxTiles` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxTilesAt(long index, @CType("VkExtent2D") MemorySegment value) { VkVideoEncodeAV1CapabilitiesKHR.set_maxTiles(this.segment(), index, value); return this; }

        /// {@return `minTileSize` at the given index}
        /// @param index the index
        public @CType("VkExtent2D") MemorySegment minTileSizeAt(long index) { return VkVideoEncodeAV1CapabilitiesKHR.get_minTileSize(this.segment(), index); }
        /// Sets `minTileSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer minTileSizeAt(long index, @CType("VkExtent2D") MemorySegment value) { VkVideoEncodeAV1CapabilitiesKHR.set_minTileSize(this.segment(), index, value); return this; }

        /// {@return `maxTileSize` at the given index}
        /// @param index the index
        public @CType("VkExtent2D") MemorySegment maxTileSizeAt(long index) { return VkVideoEncodeAV1CapabilitiesKHR.get_maxTileSize(this.segment(), index); }
        /// Sets `maxTileSize` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxTileSizeAt(long index, @CType("VkExtent2D") MemorySegment value) { VkVideoEncodeAV1CapabilitiesKHR.set_maxTileSize(this.segment(), index, value); return this; }

        /// {@return `superblockSizes` at the given index}
        /// @param index the index
        public @CType("VkVideoEncodeAV1SuperblockSizeFlagsKHR") int superblockSizesAt(long index) { return VkVideoEncodeAV1CapabilitiesKHR.get_superblockSizes(this.segment(), index); }
        /// Sets `superblockSizes` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer superblockSizesAt(long index, @CType("VkVideoEncodeAV1SuperblockSizeFlagsKHR") int value) { VkVideoEncodeAV1CapabilitiesKHR.set_superblockSizes(this.segment(), index, value); return this; }

        /// {@return `maxSingleReferenceCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxSingleReferenceCountAt(long index) { return VkVideoEncodeAV1CapabilitiesKHR.get_maxSingleReferenceCount(this.segment(), index); }
        /// Sets `maxSingleReferenceCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxSingleReferenceCountAt(long index, @CType("uint32_t") int value) { VkVideoEncodeAV1CapabilitiesKHR.set_maxSingleReferenceCount(this.segment(), index, value); return this; }

        /// {@return `singleReferenceNameMask` at the given index}
        /// @param index the index
        public @CType("uint32_t") int singleReferenceNameMaskAt(long index) { return VkVideoEncodeAV1CapabilitiesKHR.get_singleReferenceNameMask(this.segment(), index); }
        /// Sets `singleReferenceNameMask` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer singleReferenceNameMaskAt(long index, @CType("uint32_t") int value) { VkVideoEncodeAV1CapabilitiesKHR.set_singleReferenceNameMask(this.segment(), index, value); return this; }

        /// {@return `maxUnidirectionalCompoundReferenceCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxUnidirectionalCompoundReferenceCountAt(long index) { return VkVideoEncodeAV1CapabilitiesKHR.get_maxUnidirectionalCompoundReferenceCount(this.segment(), index); }
        /// Sets `maxUnidirectionalCompoundReferenceCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxUnidirectionalCompoundReferenceCountAt(long index, @CType("uint32_t") int value) { VkVideoEncodeAV1CapabilitiesKHR.set_maxUnidirectionalCompoundReferenceCount(this.segment(), index, value); return this; }

        /// {@return `maxUnidirectionalCompoundGroup1ReferenceCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxUnidirectionalCompoundGroup1ReferenceCountAt(long index) { return VkVideoEncodeAV1CapabilitiesKHR.get_maxUnidirectionalCompoundGroup1ReferenceCount(this.segment(), index); }
        /// Sets `maxUnidirectionalCompoundGroup1ReferenceCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxUnidirectionalCompoundGroup1ReferenceCountAt(long index, @CType("uint32_t") int value) { VkVideoEncodeAV1CapabilitiesKHR.set_maxUnidirectionalCompoundGroup1ReferenceCount(this.segment(), index, value); return this; }

        /// {@return `unidirectionalCompoundReferenceNameMask` at the given index}
        /// @param index the index
        public @CType("uint32_t") int unidirectionalCompoundReferenceNameMaskAt(long index) { return VkVideoEncodeAV1CapabilitiesKHR.get_unidirectionalCompoundReferenceNameMask(this.segment(), index); }
        /// Sets `unidirectionalCompoundReferenceNameMask` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer unidirectionalCompoundReferenceNameMaskAt(long index, @CType("uint32_t") int value) { VkVideoEncodeAV1CapabilitiesKHR.set_unidirectionalCompoundReferenceNameMask(this.segment(), index, value); return this; }

        /// {@return `maxBidirectionalCompoundReferenceCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxBidirectionalCompoundReferenceCountAt(long index) { return VkVideoEncodeAV1CapabilitiesKHR.get_maxBidirectionalCompoundReferenceCount(this.segment(), index); }
        /// Sets `maxBidirectionalCompoundReferenceCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxBidirectionalCompoundReferenceCountAt(long index, @CType("uint32_t") int value) { VkVideoEncodeAV1CapabilitiesKHR.set_maxBidirectionalCompoundReferenceCount(this.segment(), index, value); return this; }

        /// {@return `maxBidirectionalCompoundGroup1ReferenceCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxBidirectionalCompoundGroup1ReferenceCountAt(long index) { return VkVideoEncodeAV1CapabilitiesKHR.get_maxBidirectionalCompoundGroup1ReferenceCount(this.segment(), index); }
        /// Sets `maxBidirectionalCompoundGroup1ReferenceCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxBidirectionalCompoundGroup1ReferenceCountAt(long index, @CType("uint32_t") int value) { VkVideoEncodeAV1CapabilitiesKHR.set_maxBidirectionalCompoundGroup1ReferenceCount(this.segment(), index, value); return this; }

        /// {@return `maxBidirectionalCompoundGroup2ReferenceCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxBidirectionalCompoundGroup2ReferenceCountAt(long index) { return VkVideoEncodeAV1CapabilitiesKHR.get_maxBidirectionalCompoundGroup2ReferenceCount(this.segment(), index); }
        /// Sets `maxBidirectionalCompoundGroup2ReferenceCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxBidirectionalCompoundGroup2ReferenceCountAt(long index, @CType("uint32_t") int value) { VkVideoEncodeAV1CapabilitiesKHR.set_maxBidirectionalCompoundGroup2ReferenceCount(this.segment(), index, value); return this; }

        /// {@return `bidirectionalCompoundReferenceNameMask` at the given index}
        /// @param index the index
        public @CType("uint32_t") int bidirectionalCompoundReferenceNameMaskAt(long index) { return VkVideoEncodeAV1CapabilitiesKHR.get_bidirectionalCompoundReferenceNameMask(this.segment(), index); }
        /// Sets `bidirectionalCompoundReferenceNameMask` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer bidirectionalCompoundReferenceNameMaskAt(long index, @CType("uint32_t") int value) { VkVideoEncodeAV1CapabilitiesKHR.set_bidirectionalCompoundReferenceNameMask(this.segment(), index, value); return this; }

        /// {@return `maxTemporalLayerCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxTemporalLayerCountAt(long index) { return VkVideoEncodeAV1CapabilitiesKHR.get_maxTemporalLayerCount(this.segment(), index); }
        /// Sets `maxTemporalLayerCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxTemporalLayerCountAt(long index, @CType("uint32_t") int value) { VkVideoEncodeAV1CapabilitiesKHR.set_maxTemporalLayerCount(this.segment(), index, value); return this; }

        /// {@return `maxSpatialLayerCount` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxSpatialLayerCountAt(long index) { return VkVideoEncodeAV1CapabilitiesKHR.get_maxSpatialLayerCount(this.segment(), index); }
        /// Sets `maxSpatialLayerCount` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxSpatialLayerCountAt(long index, @CType("uint32_t") int value) { VkVideoEncodeAV1CapabilitiesKHR.set_maxSpatialLayerCount(this.segment(), index, value); return this; }

        /// {@return `maxOperatingPoints` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxOperatingPointsAt(long index) { return VkVideoEncodeAV1CapabilitiesKHR.get_maxOperatingPoints(this.segment(), index); }
        /// Sets `maxOperatingPoints` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxOperatingPointsAt(long index, @CType("uint32_t") int value) { VkVideoEncodeAV1CapabilitiesKHR.set_maxOperatingPoints(this.segment(), index, value); return this; }

        /// {@return `minQIndex` at the given index}
        /// @param index the index
        public @CType("uint32_t") int minQIndexAt(long index) { return VkVideoEncodeAV1CapabilitiesKHR.get_minQIndex(this.segment(), index); }
        /// Sets `minQIndex` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer minQIndexAt(long index, @CType("uint32_t") int value) { VkVideoEncodeAV1CapabilitiesKHR.set_minQIndex(this.segment(), index, value); return this; }

        /// {@return `maxQIndex` at the given index}
        /// @param index the index
        public @CType("uint32_t") int maxQIndexAt(long index) { return VkVideoEncodeAV1CapabilitiesKHR.get_maxQIndex(this.segment(), index); }
        /// Sets `maxQIndex` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer maxQIndexAt(long index, @CType("uint32_t") int value) { VkVideoEncodeAV1CapabilitiesKHR.set_maxQIndex(this.segment(), index, value); return this; }

        /// {@return `prefersGopRemainingFrames` at the given index}
        /// @param index the index
        public @CType("VkBool32") int prefersGopRemainingFramesAt(long index) { return VkVideoEncodeAV1CapabilitiesKHR.get_prefersGopRemainingFrames(this.segment(), index); }
        /// Sets `prefersGopRemainingFrames` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer prefersGopRemainingFramesAt(long index, @CType("VkBool32") int value) { VkVideoEncodeAV1CapabilitiesKHR.set_prefersGopRemainingFrames(this.segment(), index, value); return this; }

        /// {@return `requiresGopRemainingFrames` at the given index}
        /// @param index the index
        public @CType("VkBool32") int requiresGopRemainingFramesAt(long index) { return VkVideoEncodeAV1CapabilitiesKHR.get_requiresGopRemainingFrames(this.segment(), index); }
        /// Sets `requiresGopRemainingFrames` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer requiresGopRemainingFramesAt(long index, @CType("VkBool32") int value) { VkVideoEncodeAV1CapabilitiesKHR.set_requiresGopRemainingFrames(this.segment(), index, value); return this; }

        /// {@return `stdSyntaxFlags` at the given index}
        /// @param index the index
        public @CType("VkVideoEncodeAV1StdFlagsKHR") int stdSyntaxFlagsAt(long index) { return VkVideoEncodeAV1CapabilitiesKHR.get_stdSyntaxFlags(this.segment(), index); }
        /// Sets `stdSyntaxFlags` with the given value at the given index.
        /// @param index the index
        /// @param value the value
        /// @return `this`
        public Buffer stdSyntaxFlagsAt(long index, @CType("VkVideoEncodeAV1StdFlagsKHR") int value) { VkVideoEncodeAV1CapabilitiesKHR.set_stdSyntaxFlags(this.segment(), index, value); return this; }

    }
}
