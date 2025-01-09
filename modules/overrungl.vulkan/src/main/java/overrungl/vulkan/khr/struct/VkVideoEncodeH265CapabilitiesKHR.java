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
/// [VarHandle][#VH_pNext] - [Getter][#pNext()] - [Setter][#pNext(java.lang.foreign.MemorySegment)]
/// ### flags
/// [VarHandle][#VH_flags] - [Getter][#flags()] - [Setter][#flags(int)]
/// ### maxLevelIdc
/// [VarHandle][#VH_maxLevelIdc] - [Getter][#maxLevelIdc()] - [Setter][#maxLevelIdc(int)]
/// ### maxSliceSegmentCount
/// [VarHandle][#VH_maxSliceSegmentCount] - [Getter][#maxSliceSegmentCount()] - [Setter][#maxSliceSegmentCount(int)]
/// ### maxTiles
/// [Byte offset][#OFFSET_maxTiles] - [Memory layout][#ML_maxTiles] - [Getter][#maxTiles()] - [Setter][#maxTiles(java.lang.foreign.MemorySegment)]
/// ### ctbSizes
/// [VarHandle][#VH_ctbSizes] - [Getter][#ctbSizes()] - [Setter][#ctbSizes(int)]
/// ### transformBlockSizes
/// [VarHandle][#VH_transformBlockSizes] - [Getter][#transformBlockSizes()] - [Setter][#transformBlockSizes(int)]
/// ### maxPPictureL0ReferenceCount
/// [VarHandle][#VH_maxPPictureL0ReferenceCount] - [Getter][#maxPPictureL0ReferenceCount()] - [Setter][#maxPPictureL0ReferenceCount(int)]
/// ### maxBPictureL0ReferenceCount
/// [VarHandle][#VH_maxBPictureL0ReferenceCount] - [Getter][#maxBPictureL0ReferenceCount()] - [Setter][#maxBPictureL0ReferenceCount(int)]
/// ### maxL1ReferenceCount
/// [VarHandle][#VH_maxL1ReferenceCount] - [Getter][#maxL1ReferenceCount()] - [Setter][#maxL1ReferenceCount(int)]
/// ### maxSubLayerCount
/// [VarHandle][#VH_maxSubLayerCount] - [Getter][#maxSubLayerCount()] - [Setter][#maxSubLayerCount(int)]
/// ### expectDyadicTemporalSubLayerPattern
/// [VarHandle][#VH_expectDyadicTemporalSubLayerPattern] - [Getter][#expectDyadicTemporalSubLayerPattern()] - [Setter][#expectDyadicTemporalSubLayerPattern(int)]
/// ### minQp
/// [VarHandle][#VH_minQp] - [Getter][#minQp()] - [Setter][#minQp(int)]
/// ### maxQp
/// [VarHandle][#VH_maxQp] - [Getter][#maxQp()] - [Setter][#maxQp(int)]
/// ### prefersGopRemainingFrames
/// [VarHandle][#VH_prefersGopRemainingFrames] - [Getter][#prefersGopRemainingFrames()] - [Setter][#prefersGopRemainingFrames(int)]
/// ### requiresGopRemainingFrames
/// [VarHandle][#VH_requiresGopRemainingFrames] - [Getter][#requiresGopRemainingFrames()] - [Setter][#requiresGopRemainingFrames(int)]
/// ### stdSyntaxFlags
/// [VarHandle][#VH_stdSyntaxFlags] - [Getter][#stdSyntaxFlags()] - [Setter][#stdSyntaxFlags(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoEncodeH265CapabilitiesKHR {
///     VkStructureType sType;
///     void * pNext;
///     VkVideoEncodeH265CapabilityFlagsKHR flags;
///     StdVideoH265LevelIdc maxLevelIdc;
///     uint32_t maxSliceSegmentCount;
///     VkExtent2D maxTiles;
///     VkVideoEncodeH265CtbSizeFlagsKHR ctbSizes;
///     VkVideoEncodeH265TransformBlockSizeFlagsKHR transformBlockSizes;
///     uint32_t maxPPictureL0ReferenceCount;
///     uint32_t maxBPictureL0ReferenceCount;
///     uint32_t maxL1ReferenceCount;
///     uint32_t maxSubLayerCount;
///     VkBool32 expectDyadicTemporalSubLayerPattern;
///     int32_t minQp;
///     int32_t maxQp;
///     VkBool32 prefersGopRemainingFrames;
///     VkBool32 requiresGopRemainingFrames;
///     VkVideoEncodeH265StdFlagsKHR stdSyntaxFlags;
/// } VkVideoEncodeH265CapabilitiesKHR;
/// ```
public final class VkVideoEncodeH265CapabilitiesKHR extends Struct {
    /// The struct layout of `VkVideoEncodeH265CapabilitiesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("maxLevelIdc"),
        ValueLayout.JAVA_INT.withName("maxSliceSegmentCount"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("maxTiles"),
        ValueLayout.JAVA_INT.withName("ctbSizes"),
        ValueLayout.JAVA_INT.withName("transformBlockSizes"),
        ValueLayout.JAVA_INT.withName("maxPPictureL0ReferenceCount"),
        ValueLayout.JAVA_INT.withName("maxBPictureL0ReferenceCount"),
        ValueLayout.JAVA_INT.withName("maxL1ReferenceCount"),
        ValueLayout.JAVA_INT.withName("maxSubLayerCount"),
        ValueLayout.JAVA_INT.withName("expectDyadicTemporalSubLayerPattern"),
        ValueLayout.JAVA_INT.withName("minQp"),
        ValueLayout.JAVA_INT.withName("maxQp"),
        ValueLayout.JAVA_INT.withName("prefersGopRemainingFrames"),
        ValueLayout.JAVA_INT.withName("requiresGopRemainingFrames"),
        ValueLayout.JAVA_INT.withName("stdSyntaxFlags")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The [VarHandle] of `maxLevelIdc` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxLevelIdc = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxLevelIdc"));
    /// The [VarHandle] of `maxSliceSegmentCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxSliceSegmentCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSliceSegmentCount"));
    /// The byte offset of `maxTiles`.
    public static final long OFFSET_maxTiles = LAYOUT.byteOffset(PathElement.groupElement("maxTiles"));
    /// The memory layout of `maxTiles`.
    public static final MemoryLayout ML_maxTiles = LAYOUT.select(PathElement.groupElement("maxTiles"));
    /// The [VarHandle] of `ctbSizes` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_ctbSizes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("ctbSizes"));
    /// The [VarHandle] of `transformBlockSizes` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_transformBlockSizes = LAYOUT.arrayElementVarHandle(PathElement.groupElement("transformBlockSizes"));
    /// The [VarHandle] of `maxPPictureL0ReferenceCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxPPictureL0ReferenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPPictureL0ReferenceCount"));
    /// The [VarHandle] of `maxBPictureL0ReferenceCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxBPictureL0ReferenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxBPictureL0ReferenceCount"));
    /// The [VarHandle] of `maxL1ReferenceCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxL1ReferenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxL1ReferenceCount"));
    /// The [VarHandle] of `maxSubLayerCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxSubLayerCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSubLayerCount"));
    /// The [VarHandle] of `expectDyadicTemporalSubLayerPattern` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_expectDyadicTemporalSubLayerPattern = LAYOUT.arrayElementVarHandle(PathElement.groupElement("expectDyadicTemporalSubLayerPattern"));
    /// The [VarHandle] of `minQp` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_minQp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minQp"));
    /// The [VarHandle] of `maxQp` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxQp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxQp"));
    /// The [VarHandle] of `prefersGopRemainingFrames` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_prefersGopRemainingFrames = LAYOUT.arrayElementVarHandle(PathElement.groupElement("prefersGopRemainingFrames"));
    /// The [VarHandle] of `requiresGopRemainingFrames` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_requiresGopRemainingFrames = LAYOUT.arrayElementVarHandle(PathElement.groupElement("requiresGopRemainingFrames"));
    /// The [VarHandle] of `stdSyntaxFlags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_stdSyntaxFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("stdSyntaxFlags"));

    /// Creates `VkVideoEncodeH265CapabilitiesKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoEncodeH265CapabilitiesKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoEncodeH265CapabilitiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH265CapabilitiesKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH265CapabilitiesKHR(segment); }

    /// Creates `VkVideoEncodeH265CapabilitiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH265CapabilitiesKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH265CapabilitiesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoEncodeH265CapabilitiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH265CapabilitiesKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH265CapabilitiesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkVideoEncodeH265CapabilitiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeH265CapabilitiesKHR`
    public static VkVideoEncodeH265CapabilitiesKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH265CapabilitiesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoEncodeH265CapabilitiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeH265CapabilitiesKHR`
    public static VkVideoEncodeH265CapabilitiesKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeH265CapabilitiesKHR(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkVideoEncodeH265CapabilitiesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVideoEncodeH265CapabilitiesKHR`
    public VkVideoEncodeH265CapabilitiesKHR asSlice(long index) { return new VkVideoEncodeH265CapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkVideoEncodeH265CapabilitiesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVideoEncodeH265CapabilitiesKHR`
    public VkVideoEncodeH265CapabilitiesKHR asSlice(long index, long count) { return new VkVideoEncodeH265CapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoEncodeH265CapabilitiesKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoEncodeH265CapabilitiesKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoEncodeH265CapabilitiesKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoEncodeH265CapabilitiesKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoEncodeH265CapabilitiesKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR sType(@CType("VkStructureType") int value) { VkVideoEncodeH265CapabilitiesKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkVideoEncodeH265CapabilitiesKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkVideoEncodeH265CapabilitiesKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkVideoEncodeH265CapabilitiesKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH265CapabilitiesKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH265CapabilitiesKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH265CapabilitiesKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkVideoEncodeH265CapabilityFlagsKHR") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkVideoEncodeH265CapabilityFlagsKHR") int get_flags(MemorySegment segment) { return VkVideoEncodeH265CapabilitiesKHR.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkVideoEncodeH265CapabilityFlagsKHR") int flagsAt(long index) { return VkVideoEncodeH265CapabilitiesKHR.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkVideoEncodeH265CapabilityFlagsKHR") int flags() { return VkVideoEncodeH265CapabilitiesKHR.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkVideoEncodeH265CapabilityFlagsKHR") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkVideoEncodeH265CapabilityFlagsKHR") int value) { VkVideoEncodeH265CapabilitiesKHR.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR flagsAt(long index, @CType("VkVideoEncodeH265CapabilityFlagsKHR") int value) { VkVideoEncodeH265CapabilitiesKHR.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR flags(@CType("VkVideoEncodeH265CapabilityFlagsKHR") int value) { VkVideoEncodeH265CapabilitiesKHR.set_flags(this.segment(), value); return this; }

    /// {@return `maxLevelIdc` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoH265LevelIdc") int get_maxLevelIdc(MemorySegment segment, long index) { return (int) VH_maxLevelIdc.get(segment, 0L, index); }
    /// {@return `maxLevelIdc`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoH265LevelIdc") int get_maxLevelIdc(MemorySegment segment) { return VkVideoEncodeH265CapabilitiesKHR.get_maxLevelIdc(segment, 0L); }
    /// {@return `maxLevelIdc` at the given index}
    /// @param index the index
    public @CType("StdVideoH265LevelIdc") int maxLevelIdcAt(long index) { return VkVideoEncodeH265CapabilitiesKHR.get_maxLevelIdc(this.segment(), index); }
    /// {@return `maxLevelIdc`}
    public @CType("StdVideoH265LevelIdc") int maxLevelIdc() { return VkVideoEncodeH265CapabilitiesKHR.get_maxLevelIdc(this.segment()); }
    /// Sets `maxLevelIdc` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxLevelIdc(MemorySegment segment, long index, @CType("StdVideoH265LevelIdc") int value) { VH_maxLevelIdc.set(segment, 0L, index, value); }
    /// Sets `maxLevelIdc` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxLevelIdc(MemorySegment segment, @CType("StdVideoH265LevelIdc") int value) { VkVideoEncodeH265CapabilitiesKHR.set_maxLevelIdc(segment, 0L, value); }
    /// Sets `maxLevelIdc` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR maxLevelIdcAt(long index, @CType("StdVideoH265LevelIdc") int value) { VkVideoEncodeH265CapabilitiesKHR.set_maxLevelIdc(this.segment(), index, value); return this; }
    /// Sets `maxLevelIdc` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR maxLevelIdc(@CType("StdVideoH265LevelIdc") int value) { VkVideoEncodeH265CapabilitiesKHR.set_maxLevelIdc(this.segment(), value); return this; }

    /// {@return `maxSliceSegmentCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxSliceSegmentCount(MemorySegment segment, long index) { return (int) VH_maxSliceSegmentCount.get(segment, 0L, index); }
    /// {@return `maxSliceSegmentCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxSliceSegmentCount(MemorySegment segment) { return VkVideoEncodeH265CapabilitiesKHR.get_maxSliceSegmentCount(segment, 0L); }
    /// {@return `maxSliceSegmentCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxSliceSegmentCountAt(long index) { return VkVideoEncodeH265CapabilitiesKHR.get_maxSliceSegmentCount(this.segment(), index); }
    /// {@return `maxSliceSegmentCount`}
    public @CType("uint32_t") int maxSliceSegmentCount() { return VkVideoEncodeH265CapabilitiesKHR.get_maxSliceSegmentCount(this.segment()); }
    /// Sets `maxSliceSegmentCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxSliceSegmentCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxSliceSegmentCount.set(segment, 0L, index, value); }
    /// Sets `maxSliceSegmentCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxSliceSegmentCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeH265CapabilitiesKHR.set_maxSliceSegmentCount(segment, 0L, value); }
    /// Sets `maxSliceSegmentCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR maxSliceSegmentCountAt(long index, @CType("uint32_t") int value) { VkVideoEncodeH265CapabilitiesKHR.set_maxSliceSegmentCount(this.segment(), index, value); return this; }
    /// Sets `maxSliceSegmentCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR maxSliceSegmentCount(@CType("uint32_t") int value) { VkVideoEncodeH265CapabilitiesKHR.set_maxSliceSegmentCount(this.segment(), value); return this; }

    /// {@return `maxTiles` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_maxTiles(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_maxTiles, index), ML_maxTiles); }
    /// {@return `maxTiles`}
    /// @param segment the segment of the struct
    public static @CType("VkExtent2D") java.lang.foreign.MemorySegment get_maxTiles(MemorySegment segment) { return VkVideoEncodeH265CapabilitiesKHR.get_maxTiles(segment, 0L); }
    /// {@return `maxTiles` at the given index}
    /// @param index the index
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment maxTilesAt(long index) { return VkVideoEncodeH265CapabilitiesKHR.get_maxTiles(this.segment(), index); }
    /// {@return `maxTiles`}
    public @CType("VkExtent2D") java.lang.foreign.MemorySegment maxTiles() { return VkVideoEncodeH265CapabilitiesKHR.get_maxTiles(this.segment()); }
    /// Sets `maxTiles` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxTiles(MemorySegment segment, long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_maxTiles, index), ML_maxTiles.byteSize()); }
    /// Sets `maxTiles` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxTiles(MemorySegment segment, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkVideoEncodeH265CapabilitiesKHR.set_maxTiles(segment, 0L, value); }
    /// Sets `maxTiles` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR maxTilesAt(long index, @CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkVideoEncodeH265CapabilitiesKHR.set_maxTiles(this.segment(), index, value); return this; }
    /// Sets `maxTiles` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR maxTiles(@CType("VkExtent2D") java.lang.foreign.MemorySegment value) { VkVideoEncodeH265CapabilitiesKHR.set_maxTiles(this.segment(), value); return this; }

    /// {@return `ctbSizes` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkVideoEncodeH265CtbSizeFlagsKHR") int get_ctbSizes(MemorySegment segment, long index) { return (int) VH_ctbSizes.get(segment, 0L, index); }
    /// {@return `ctbSizes`}
    /// @param segment the segment of the struct
    public static @CType("VkVideoEncodeH265CtbSizeFlagsKHR") int get_ctbSizes(MemorySegment segment) { return VkVideoEncodeH265CapabilitiesKHR.get_ctbSizes(segment, 0L); }
    /// {@return `ctbSizes` at the given index}
    /// @param index the index
    public @CType("VkVideoEncodeH265CtbSizeFlagsKHR") int ctbSizesAt(long index) { return VkVideoEncodeH265CapabilitiesKHR.get_ctbSizes(this.segment(), index); }
    /// {@return `ctbSizes`}
    public @CType("VkVideoEncodeH265CtbSizeFlagsKHR") int ctbSizes() { return VkVideoEncodeH265CapabilitiesKHR.get_ctbSizes(this.segment()); }
    /// Sets `ctbSizes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_ctbSizes(MemorySegment segment, long index, @CType("VkVideoEncodeH265CtbSizeFlagsKHR") int value) { VH_ctbSizes.set(segment, 0L, index, value); }
    /// Sets `ctbSizes` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_ctbSizes(MemorySegment segment, @CType("VkVideoEncodeH265CtbSizeFlagsKHR") int value) { VkVideoEncodeH265CapabilitiesKHR.set_ctbSizes(segment, 0L, value); }
    /// Sets `ctbSizes` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR ctbSizesAt(long index, @CType("VkVideoEncodeH265CtbSizeFlagsKHR") int value) { VkVideoEncodeH265CapabilitiesKHR.set_ctbSizes(this.segment(), index, value); return this; }
    /// Sets `ctbSizes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR ctbSizes(@CType("VkVideoEncodeH265CtbSizeFlagsKHR") int value) { VkVideoEncodeH265CapabilitiesKHR.set_ctbSizes(this.segment(), value); return this; }

    /// {@return `transformBlockSizes` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkVideoEncodeH265TransformBlockSizeFlagsKHR") int get_transformBlockSizes(MemorySegment segment, long index) { return (int) VH_transformBlockSizes.get(segment, 0L, index); }
    /// {@return `transformBlockSizes`}
    /// @param segment the segment of the struct
    public static @CType("VkVideoEncodeH265TransformBlockSizeFlagsKHR") int get_transformBlockSizes(MemorySegment segment) { return VkVideoEncodeH265CapabilitiesKHR.get_transformBlockSizes(segment, 0L); }
    /// {@return `transformBlockSizes` at the given index}
    /// @param index the index
    public @CType("VkVideoEncodeH265TransformBlockSizeFlagsKHR") int transformBlockSizesAt(long index) { return VkVideoEncodeH265CapabilitiesKHR.get_transformBlockSizes(this.segment(), index); }
    /// {@return `transformBlockSizes`}
    public @CType("VkVideoEncodeH265TransformBlockSizeFlagsKHR") int transformBlockSizes() { return VkVideoEncodeH265CapabilitiesKHR.get_transformBlockSizes(this.segment()); }
    /// Sets `transformBlockSizes` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_transformBlockSizes(MemorySegment segment, long index, @CType("VkVideoEncodeH265TransformBlockSizeFlagsKHR") int value) { VH_transformBlockSizes.set(segment, 0L, index, value); }
    /// Sets `transformBlockSizes` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_transformBlockSizes(MemorySegment segment, @CType("VkVideoEncodeH265TransformBlockSizeFlagsKHR") int value) { VkVideoEncodeH265CapabilitiesKHR.set_transformBlockSizes(segment, 0L, value); }
    /// Sets `transformBlockSizes` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR transformBlockSizesAt(long index, @CType("VkVideoEncodeH265TransformBlockSizeFlagsKHR") int value) { VkVideoEncodeH265CapabilitiesKHR.set_transformBlockSizes(this.segment(), index, value); return this; }
    /// Sets `transformBlockSizes` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR transformBlockSizes(@CType("VkVideoEncodeH265TransformBlockSizeFlagsKHR") int value) { VkVideoEncodeH265CapabilitiesKHR.set_transformBlockSizes(this.segment(), value); return this; }

    /// {@return `maxPPictureL0ReferenceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxPPictureL0ReferenceCount(MemorySegment segment, long index) { return (int) VH_maxPPictureL0ReferenceCount.get(segment, 0L, index); }
    /// {@return `maxPPictureL0ReferenceCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxPPictureL0ReferenceCount(MemorySegment segment) { return VkVideoEncodeH265CapabilitiesKHR.get_maxPPictureL0ReferenceCount(segment, 0L); }
    /// {@return `maxPPictureL0ReferenceCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxPPictureL0ReferenceCountAt(long index) { return VkVideoEncodeH265CapabilitiesKHR.get_maxPPictureL0ReferenceCount(this.segment(), index); }
    /// {@return `maxPPictureL0ReferenceCount`}
    public @CType("uint32_t") int maxPPictureL0ReferenceCount() { return VkVideoEncodeH265CapabilitiesKHR.get_maxPPictureL0ReferenceCount(this.segment()); }
    /// Sets `maxPPictureL0ReferenceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxPPictureL0ReferenceCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxPPictureL0ReferenceCount.set(segment, 0L, index, value); }
    /// Sets `maxPPictureL0ReferenceCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxPPictureL0ReferenceCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeH265CapabilitiesKHR.set_maxPPictureL0ReferenceCount(segment, 0L, value); }
    /// Sets `maxPPictureL0ReferenceCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR maxPPictureL0ReferenceCountAt(long index, @CType("uint32_t") int value) { VkVideoEncodeH265CapabilitiesKHR.set_maxPPictureL0ReferenceCount(this.segment(), index, value); return this; }
    /// Sets `maxPPictureL0ReferenceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR maxPPictureL0ReferenceCount(@CType("uint32_t") int value) { VkVideoEncodeH265CapabilitiesKHR.set_maxPPictureL0ReferenceCount(this.segment(), value); return this; }

    /// {@return `maxBPictureL0ReferenceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxBPictureL0ReferenceCount(MemorySegment segment, long index) { return (int) VH_maxBPictureL0ReferenceCount.get(segment, 0L, index); }
    /// {@return `maxBPictureL0ReferenceCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxBPictureL0ReferenceCount(MemorySegment segment) { return VkVideoEncodeH265CapabilitiesKHR.get_maxBPictureL0ReferenceCount(segment, 0L); }
    /// {@return `maxBPictureL0ReferenceCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxBPictureL0ReferenceCountAt(long index) { return VkVideoEncodeH265CapabilitiesKHR.get_maxBPictureL0ReferenceCount(this.segment(), index); }
    /// {@return `maxBPictureL0ReferenceCount`}
    public @CType("uint32_t") int maxBPictureL0ReferenceCount() { return VkVideoEncodeH265CapabilitiesKHR.get_maxBPictureL0ReferenceCount(this.segment()); }
    /// Sets `maxBPictureL0ReferenceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxBPictureL0ReferenceCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxBPictureL0ReferenceCount.set(segment, 0L, index, value); }
    /// Sets `maxBPictureL0ReferenceCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxBPictureL0ReferenceCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeH265CapabilitiesKHR.set_maxBPictureL0ReferenceCount(segment, 0L, value); }
    /// Sets `maxBPictureL0ReferenceCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR maxBPictureL0ReferenceCountAt(long index, @CType("uint32_t") int value) { VkVideoEncodeH265CapabilitiesKHR.set_maxBPictureL0ReferenceCount(this.segment(), index, value); return this; }
    /// Sets `maxBPictureL0ReferenceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR maxBPictureL0ReferenceCount(@CType("uint32_t") int value) { VkVideoEncodeH265CapabilitiesKHR.set_maxBPictureL0ReferenceCount(this.segment(), value); return this; }

    /// {@return `maxL1ReferenceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxL1ReferenceCount(MemorySegment segment, long index) { return (int) VH_maxL1ReferenceCount.get(segment, 0L, index); }
    /// {@return `maxL1ReferenceCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxL1ReferenceCount(MemorySegment segment) { return VkVideoEncodeH265CapabilitiesKHR.get_maxL1ReferenceCount(segment, 0L); }
    /// {@return `maxL1ReferenceCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxL1ReferenceCountAt(long index) { return VkVideoEncodeH265CapabilitiesKHR.get_maxL1ReferenceCount(this.segment(), index); }
    /// {@return `maxL1ReferenceCount`}
    public @CType("uint32_t") int maxL1ReferenceCount() { return VkVideoEncodeH265CapabilitiesKHR.get_maxL1ReferenceCount(this.segment()); }
    /// Sets `maxL1ReferenceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxL1ReferenceCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxL1ReferenceCount.set(segment, 0L, index, value); }
    /// Sets `maxL1ReferenceCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxL1ReferenceCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeH265CapabilitiesKHR.set_maxL1ReferenceCount(segment, 0L, value); }
    /// Sets `maxL1ReferenceCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR maxL1ReferenceCountAt(long index, @CType("uint32_t") int value) { VkVideoEncodeH265CapabilitiesKHR.set_maxL1ReferenceCount(this.segment(), index, value); return this; }
    /// Sets `maxL1ReferenceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR maxL1ReferenceCount(@CType("uint32_t") int value) { VkVideoEncodeH265CapabilitiesKHR.set_maxL1ReferenceCount(this.segment(), value); return this; }

    /// {@return `maxSubLayerCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxSubLayerCount(MemorySegment segment, long index) { return (int) VH_maxSubLayerCount.get(segment, 0L, index); }
    /// {@return `maxSubLayerCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxSubLayerCount(MemorySegment segment) { return VkVideoEncodeH265CapabilitiesKHR.get_maxSubLayerCount(segment, 0L); }
    /// {@return `maxSubLayerCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxSubLayerCountAt(long index) { return VkVideoEncodeH265CapabilitiesKHR.get_maxSubLayerCount(this.segment(), index); }
    /// {@return `maxSubLayerCount`}
    public @CType("uint32_t") int maxSubLayerCount() { return VkVideoEncodeH265CapabilitiesKHR.get_maxSubLayerCount(this.segment()); }
    /// Sets `maxSubLayerCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxSubLayerCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxSubLayerCount.set(segment, 0L, index, value); }
    /// Sets `maxSubLayerCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxSubLayerCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeH265CapabilitiesKHR.set_maxSubLayerCount(segment, 0L, value); }
    /// Sets `maxSubLayerCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR maxSubLayerCountAt(long index, @CType("uint32_t") int value) { VkVideoEncodeH265CapabilitiesKHR.set_maxSubLayerCount(this.segment(), index, value); return this; }
    /// Sets `maxSubLayerCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR maxSubLayerCount(@CType("uint32_t") int value) { VkVideoEncodeH265CapabilitiesKHR.set_maxSubLayerCount(this.segment(), value); return this; }

    /// {@return `expectDyadicTemporalSubLayerPattern` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_expectDyadicTemporalSubLayerPattern(MemorySegment segment, long index) { return (int) VH_expectDyadicTemporalSubLayerPattern.get(segment, 0L, index); }
    /// {@return `expectDyadicTemporalSubLayerPattern`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_expectDyadicTemporalSubLayerPattern(MemorySegment segment) { return VkVideoEncodeH265CapabilitiesKHR.get_expectDyadicTemporalSubLayerPattern(segment, 0L); }
    /// {@return `expectDyadicTemporalSubLayerPattern` at the given index}
    /// @param index the index
    public @CType("VkBool32") int expectDyadicTemporalSubLayerPatternAt(long index) { return VkVideoEncodeH265CapabilitiesKHR.get_expectDyadicTemporalSubLayerPattern(this.segment(), index); }
    /// {@return `expectDyadicTemporalSubLayerPattern`}
    public @CType("VkBool32") int expectDyadicTemporalSubLayerPattern() { return VkVideoEncodeH265CapabilitiesKHR.get_expectDyadicTemporalSubLayerPattern(this.segment()); }
    /// Sets `expectDyadicTemporalSubLayerPattern` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_expectDyadicTemporalSubLayerPattern(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_expectDyadicTemporalSubLayerPattern.set(segment, 0L, index, value); }
    /// Sets `expectDyadicTemporalSubLayerPattern` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_expectDyadicTemporalSubLayerPattern(MemorySegment segment, @CType("VkBool32") int value) { VkVideoEncodeH265CapabilitiesKHR.set_expectDyadicTemporalSubLayerPattern(segment, 0L, value); }
    /// Sets `expectDyadicTemporalSubLayerPattern` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR expectDyadicTemporalSubLayerPatternAt(long index, @CType("VkBool32") int value) { VkVideoEncodeH265CapabilitiesKHR.set_expectDyadicTemporalSubLayerPattern(this.segment(), index, value); return this; }
    /// Sets `expectDyadicTemporalSubLayerPattern` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR expectDyadicTemporalSubLayerPattern(@CType("VkBool32") int value) { VkVideoEncodeH265CapabilitiesKHR.set_expectDyadicTemporalSubLayerPattern(this.segment(), value); return this; }

    /// {@return `minQp` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int32_t") int get_minQp(MemorySegment segment, long index) { return (int) VH_minQp.get(segment, 0L, index); }
    /// {@return `minQp`}
    /// @param segment the segment of the struct
    public static @CType("int32_t") int get_minQp(MemorySegment segment) { return VkVideoEncodeH265CapabilitiesKHR.get_minQp(segment, 0L); }
    /// {@return `minQp` at the given index}
    /// @param index the index
    public @CType("int32_t") int minQpAt(long index) { return VkVideoEncodeH265CapabilitiesKHR.get_minQp(this.segment(), index); }
    /// {@return `minQp`}
    public @CType("int32_t") int minQp() { return VkVideoEncodeH265CapabilitiesKHR.get_minQp(this.segment()); }
    /// Sets `minQp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_minQp(MemorySegment segment, long index, @CType("int32_t") int value) { VH_minQp.set(segment, 0L, index, value); }
    /// Sets `minQp` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_minQp(MemorySegment segment, @CType("int32_t") int value) { VkVideoEncodeH265CapabilitiesKHR.set_minQp(segment, 0L, value); }
    /// Sets `minQp` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR minQpAt(long index, @CType("int32_t") int value) { VkVideoEncodeH265CapabilitiesKHR.set_minQp(this.segment(), index, value); return this; }
    /// Sets `minQp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR minQp(@CType("int32_t") int value) { VkVideoEncodeH265CapabilitiesKHR.set_minQp(this.segment(), value); return this; }

    /// {@return `maxQp` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int32_t") int get_maxQp(MemorySegment segment, long index) { return (int) VH_maxQp.get(segment, 0L, index); }
    /// {@return `maxQp`}
    /// @param segment the segment of the struct
    public static @CType("int32_t") int get_maxQp(MemorySegment segment) { return VkVideoEncodeH265CapabilitiesKHR.get_maxQp(segment, 0L); }
    /// {@return `maxQp` at the given index}
    /// @param index the index
    public @CType("int32_t") int maxQpAt(long index) { return VkVideoEncodeH265CapabilitiesKHR.get_maxQp(this.segment(), index); }
    /// {@return `maxQp`}
    public @CType("int32_t") int maxQp() { return VkVideoEncodeH265CapabilitiesKHR.get_maxQp(this.segment()); }
    /// Sets `maxQp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxQp(MemorySegment segment, long index, @CType("int32_t") int value) { VH_maxQp.set(segment, 0L, index, value); }
    /// Sets `maxQp` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxQp(MemorySegment segment, @CType("int32_t") int value) { VkVideoEncodeH265CapabilitiesKHR.set_maxQp(segment, 0L, value); }
    /// Sets `maxQp` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR maxQpAt(long index, @CType("int32_t") int value) { VkVideoEncodeH265CapabilitiesKHR.set_maxQp(this.segment(), index, value); return this; }
    /// Sets `maxQp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR maxQp(@CType("int32_t") int value) { VkVideoEncodeH265CapabilitiesKHR.set_maxQp(this.segment(), value); return this; }

    /// {@return `prefersGopRemainingFrames` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_prefersGopRemainingFrames(MemorySegment segment, long index) { return (int) VH_prefersGopRemainingFrames.get(segment, 0L, index); }
    /// {@return `prefersGopRemainingFrames`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_prefersGopRemainingFrames(MemorySegment segment) { return VkVideoEncodeH265CapabilitiesKHR.get_prefersGopRemainingFrames(segment, 0L); }
    /// {@return `prefersGopRemainingFrames` at the given index}
    /// @param index the index
    public @CType("VkBool32") int prefersGopRemainingFramesAt(long index) { return VkVideoEncodeH265CapabilitiesKHR.get_prefersGopRemainingFrames(this.segment(), index); }
    /// {@return `prefersGopRemainingFrames`}
    public @CType("VkBool32") int prefersGopRemainingFrames() { return VkVideoEncodeH265CapabilitiesKHR.get_prefersGopRemainingFrames(this.segment()); }
    /// Sets `prefersGopRemainingFrames` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_prefersGopRemainingFrames(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_prefersGopRemainingFrames.set(segment, 0L, index, value); }
    /// Sets `prefersGopRemainingFrames` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_prefersGopRemainingFrames(MemorySegment segment, @CType("VkBool32") int value) { VkVideoEncodeH265CapabilitiesKHR.set_prefersGopRemainingFrames(segment, 0L, value); }
    /// Sets `prefersGopRemainingFrames` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR prefersGopRemainingFramesAt(long index, @CType("VkBool32") int value) { VkVideoEncodeH265CapabilitiesKHR.set_prefersGopRemainingFrames(this.segment(), index, value); return this; }
    /// Sets `prefersGopRemainingFrames` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR prefersGopRemainingFrames(@CType("VkBool32") int value) { VkVideoEncodeH265CapabilitiesKHR.set_prefersGopRemainingFrames(this.segment(), value); return this; }

    /// {@return `requiresGopRemainingFrames` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_requiresGopRemainingFrames(MemorySegment segment, long index) { return (int) VH_requiresGopRemainingFrames.get(segment, 0L, index); }
    /// {@return `requiresGopRemainingFrames`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_requiresGopRemainingFrames(MemorySegment segment) { return VkVideoEncodeH265CapabilitiesKHR.get_requiresGopRemainingFrames(segment, 0L); }
    /// {@return `requiresGopRemainingFrames` at the given index}
    /// @param index the index
    public @CType("VkBool32") int requiresGopRemainingFramesAt(long index) { return VkVideoEncodeH265CapabilitiesKHR.get_requiresGopRemainingFrames(this.segment(), index); }
    /// {@return `requiresGopRemainingFrames`}
    public @CType("VkBool32") int requiresGopRemainingFrames() { return VkVideoEncodeH265CapabilitiesKHR.get_requiresGopRemainingFrames(this.segment()); }
    /// Sets `requiresGopRemainingFrames` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_requiresGopRemainingFrames(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_requiresGopRemainingFrames.set(segment, 0L, index, value); }
    /// Sets `requiresGopRemainingFrames` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_requiresGopRemainingFrames(MemorySegment segment, @CType("VkBool32") int value) { VkVideoEncodeH265CapabilitiesKHR.set_requiresGopRemainingFrames(segment, 0L, value); }
    /// Sets `requiresGopRemainingFrames` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR requiresGopRemainingFramesAt(long index, @CType("VkBool32") int value) { VkVideoEncodeH265CapabilitiesKHR.set_requiresGopRemainingFrames(this.segment(), index, value); return this; }
    /// Sets `requiresGopRemainingFrames` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR requiresGopRemainingFrames(@CType("VkBool32") int value) { VkVideoEncodeH265CapabilitiesKHR.set_requiresGopRemainingFrames(this.segment(), value); return this; }

    /// {@return `stdSyntaxFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkVideoEncodeH265StdFlagsKHR") int get_stdSyntaxFlags(MemorySegment segment, long index) { return (int) VH_stdSyntaxFlags.get(segment, 0L, index); }
    /// {@return `stdSyntaxFlags`}
    /// @param segment the segment of the struct
    public static @CType("VkVideoEncodeH265StdFlagsKHR") int get_stdSyntaxFlags(MemorySegment segment) { return VkVideoEncodeH265CapabilitiesKHR.get_stdSyntaxFlags(segment, 0L); }
    /// {@return `stdSyntaxFlags` at the given index}
    /// @param index the index
    public @CType("VkVideoEncodeH265StdFlagsKHR") int stdSyntaxFlagsAt(long index) { return VkVideoEncodeH265CapabilitiesKHR.get_stdSyntaxFlags(this.segment(), index); }
    /// {@return `stdSyntaxFlags`}
    public @CType("VkVideoEncodeH265StdFlagsKHR") int stdSyntaxFlags() { return VkVideoEncodeH265CapabilitiesKHR.get_stdSyntaxFlags(this.segment()); }
    /// Sets `stdSyntaxFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stdSyntaxFlags(MemorySegment segment, long index, @CType("VkVideoEncodeH265StdFlagsKHR") int value) { VH_stdSyntaxFlags.set(segment, 0L, index, value); }
    /// Sets `stdSyntaxFlags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stdSyntaxFlags(MemorySegment segment, @CType("VkVideoEncodeH265StdFlagsKHR") int value) { VkVideoEncodeH265CapabilitiesKHR.set_stdSyntaxFlags(segment, 0L, value); }
    /// Sets `stdSyntaxFlags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR stdSyntaxFlagsAt(long index, @CType("VkVideoEncodeH265StdFlagsKHR") int value) { VkVideoEncodeH265CapabilitiesKHR.set_stdSyntaxFlags(this.segment(), index, value); return this; }
    /// Sets `stdSyntaxFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265CapabilitiesKHR stdSyntaxFlags(@CType("VkVideoEncodeH265StdFlagsKHR") int value) { VkVideoEncodeH265CapabilitiesKHR.set_stdSyntaxFlags(this.segment(), value); return this; }

}
