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
/// ### maxSliceCount
/// [VarHandle][#VH_maxSliceCount] - [Getter][#maxSliceCount()] - [Setter][#maxSliceCount(int)]
/// ### maxPPictureL0ReferenceCount
/// [VarHandle][#VH_maxPPictureL0ReferenceCount] - [Getter][#maxPPictureL0ReferenceCount()] - [Setter][#maxPPictureL0ReferenceCount(int)]
/// ### maxBPictureL0ReferenceCount
/// [VarHandle][#VH_maxBPictureL0ReferenceCount] - [Getter][#maxBPictureL0ReferenceCount()] - [Setter][#maxBPictureL0ReferenceCount(int)]
/// ### maxL1ReferenceCount
/// [VarHandle][#VH_maxL1ReferenceCount] - [Getter][#maxL1ReferenceCount()] - [Setter][#maxL1ReferenceCount(int)]
/// ### maxTemporalLayerCount
/// [VarHandle][#VH_maxTemporalLayerCount] - [Getter][#maxTemporalLayerCount()] - [Setter][#maxTemporalLayerCount(int)]
/// ### expectDyadicTemporalLayerPattern
/// [VarHandle][#VH_expectDyadicTemporalLayerPattern] - [Getter][#expectDyadicTemporalLayerPattern()] - [Setter][#expectDyadicTemporalLayerPattern(int)]
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
/// typedef struct VkVideoEncodeH264CapabilitiesKHR {
///     VkStructureType sType;
///     void * pNext;
///     VkVideoEncodeH264CapabilityFlagsKHR flags;
///     StdVideoH264LevelIdc maxLevelIdc;
///     uint32_t maxSliceCount;
///     uint32_t maxPPictureL0ReferenceCount;
///     uint32_t maxBPictureL0ReferenceCount;
///     uint32_t maxL1ReferenceCount;
///     uint32_t maxTemporalLayerCount;
///     VkBool32 expectDyadicTemporalLayerPattern;
///     int32_t minQp;
///     int32_t maxQp;
///     VkBool32 prefersGopRemainingFrames;
///     VkBool32 requiresGopRemainingFrames;
///     VkVideoEncodeH264StdFlagsKHR stdSyntaxFlags;
/// } VkVideoEncodeH264CapabilitiesKHR;
/// ```
public final class VkVideoEncodeH264CapabilitiesKHR extends Struct {
    /// The struct layout of `VkVideoEncodeH264CapabilitiesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_INT.withName("maxLevelIdc"),
        ValueLayout.JAVA_INT.withName("maxSliceCount"),
        ValueLayout.JAVA_INT.withName("maxPPictureL0ReferenceCount"),
        ValueLayout.JAVA_INT.withName("maxBPictureL0ReferenceCount"),
        ValueLayout.JAVA_INT.withName("maxL1ReferenceCount"),
        ValueLayout.JAVA_INT.withName("maxTemporalLayerCount"),
        ValueLayout.JAVA_INT.withName("expectDyadicTemporalLayerPattern"),
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
    /// The [VarHandle] of `maxSliceCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxSliceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxSliceCount"));
    /// The [VarHandle] of `maxPPictureL0ReferenceCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxPPictureL0ReferenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxPPictureL0ReferenceCount"));
    /// The [VarHandle] of `maxBPictureL0ReferenceCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxBPictureL0ReferenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxBPictureL0ReferenceCount"));
    /// The [VarHandle] of `maxL1ReferenceCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxL1ReferenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxL1ReferenceCount"));
    /// The [VarHandle] of `maxTemporalLayerCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_maxTemporalLayerCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxTemporalLayerCount"));
    /// The [VarHandle] of `expectDyadicTemporalLayerPattern` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_expectDyadicTemporalLayerPattern = LAYOUT.arrayElementVarHandle(PathElement.groupElement("expectDyadicTemporalLayerPattern"));
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

    /// Creates `VkVideoEncodeH264CapabilitiesKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoEncodeH264CapabilitiesKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoEncodeH264CapabilitiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH264CapabilitiesKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH264CapabilitiesKHR(segment); }

    /// Creates `VkVideoEncodeH264CapabilitiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH264CapabilitiesKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH264CapabilitiesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoEncodeH264CapabilitiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH264CapabilitiesKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH264CapabilitiesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkVideoEncodeH264CapabilitiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeH264CapabilitiesKHR`
    public static VkVideoEncodeH264CapabilitiesKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH264CapabilitiesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoEncodeH264CapabilitiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeH264CapabilitiesKHR`
    public static VkVideoEncodeH264CapabilitiesKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeH264CapabilitiesKHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoEncodeH264CapabilitiesKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoEncodeH264CapabilitiesKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoEncodeH264CapabilitiesKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoEncodeH264CapabilitiesKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264CapabilitiesKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoEncodeH264CapabilitiesKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264CapabilitiesKHR sType(@CType("VkStructureType") int value) { VkVideoEncodeH264CapabilitiesKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkVideoEncodeH264CapabilitiesKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkVideoEncodeH264CapabilitiesKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkVideoEncodeH264CapabilitiesKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH264CapabilitiesKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264CapabilitiesKHR pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH264CapabilitiesKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264CapabilitiesKHR pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH264CapabilitiesKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkVideoEncodeH264CapabilityFlagsKHR") int get_flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    /// @param segment the segment of the struct
    public static @CType("VkVideoEncodeH264CapabilityFlagsKHR") int get_flags(MemorySegment segment) { return VkVideoEncodeH264CapabilitiesKHR.get_flags(segment, 0L); }
    /// {@return `flags` at the given index}
    /// @param index the index
    public @CType("VkVideoEncodeH264CapabilityFlagsKHR") int flagsAt(long index) { return VkVideoEncodeH264CapabilitiesKHR.get_flags(this.segment(), index); }
    /// {@return `flags`}
    public @CType("VkVideoEncodeH264CapabilityFlagsKHR") int flags() { return VkVideoEncodeH264CapabilitiesKHR.get_flags(this.segment()); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_flags(MemorySegment segment, long index, @CType("VkVideoEncodeH264CapabilityFlagsKHR") int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_flags(MemorySegment segment, @CType("VkVideoEncodeH264CapabilityFlagsKHR") int value) { VkVideoEncodeH264CapabilitiesKHR.set_flags(segment, 0L, value); }
    /// Sets `flags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264CapabilitiesKHR flagsAt(long index, @CType("VkVideoEncodeH264CapabilityFlagsKHR") int value) { VkVideoEncodeH264CapabilitiesKHR.set_flags(this.segment(), index, value); return this; }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264CapabilitiesKHR flags(@CType("VkVideoEncodeH264CapabilityFlagsKHR") int value) { VkVideoEncodeH264CapabilitiesKHR.set_flags(this.segment(), value); return this; }

    /// {@return `maxLevelIdc` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("StdVideoH264LevelIdc") int get_maxLevelIdc(MemorySegment segment, long index) { return (int) VH_maxLevelIdc.get(segment, 0L, index); }
    /// {@return `maxLevelIdc`}
    /// @param segment the segment of the struct
    public static @CType("StdVideoH264LevelIdc") int get_maxLevelIdc(MemorySegment segment) { return VkVideoEncodeH264CapabilitiesKHR.get_maxLevelIdc(segment, 0L); }
    /// {@return `maxLevelIdc` at the given index}
    /// @param index the index
    public @CType("StdVideoH264LevelIdc") int maxLevelIdcAt(long index) { return VkVideoEncodeH264CapabilitiesKHR.get_maxLevelIdc(this.segment(), index); }
    /// {@return `maxLevelIdc`}
    public @CType("StdVideoH264LevelIdc") int maxLevelIdc() { return VkVideoEncodeH264CapabilitiesKHR.get_maxLevelIdc(this.segment()); }
    /// Sets `maxLevelIdc` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxLevelIdc(MemorySegment segment, long index, @CType("StdVideoH264LevelIdc") int value) { VH_maxLevelIdc.set(segment, 0L, index, value); }
    /// Sets `maxLevelIdc` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxLevelIdc(MemorySegment segment, @CType("StdVideoH264LevelIdc") int value) { VkVideoEncodeH264CapabilitiesKHR.set_maxLevelIdc(segment, 0L, value); }
    /// Sets `maxLevelIdc` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264CapabilitiesKHR maxLevelIdcAt(long index, @CType("StdVideoH264LevelIdc") int value) { VkVideoEncodeH264CapabilitiesKHR.set_maxLevelIdc(this.segment(), index, value); return this; }
    /// Sets `maxLevelIdc` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264CapabilitiesKHR maxLevelIdc(@CType("StdVideoH264LevelIdc") int value) { VkVideoEncodeH264CapabilitiesKHR.set_maxLevelIdc(this.segment(), value); return this; }

    /// {@return `maxSliceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxSliceCount(MemorySegment segment, long index) { return (int) VH_maxSliceCount.get(segment, 0L, index); }
    /// {@return `maxSliceCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxSliceCount(MemorySegment segment) { return VkVideoEncodeH264CapabilitiesKHR.get_maxSliceCount(segment, 0L); }
    /// {@return `maxSliceCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxSliceCountAt(long index) { return VkVideoEncodeH264CapabilitiesKHR.get_maxSliceCount(this.segment(), index); }
    /// {@return `maxSliceCount`}
    public @CType("uint32_t") int maxSliceCount() { return VkVideoEncodeH264CapabilitiesKHR.get_maxSliceCount(this.segment()); }
    /// Sets `maxSliceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxSliceCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxSliceCount.set(segment, 0L, index, value); }
    /// Sets `maxSliceCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxSliceCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeH264CapabilitiesKHR.set_maxSliceCount(segment, 0L, value); }
    /// Sets `maxSliceCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264CapabilitiesKHR maxSliceCountAt(long index, @CType("uint32_t") int value) { VkVideoEncodeH264CapabilitiesKHR.set_maxSliceCount(this.segment(), index, value); return this; }
    /// Sets `maxSliceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264CapabilitiesKHR maxSliceCount(@CType("uint32_t") int value) { VkVideoEncodeH264CapabilitiesKHR.set_maxSliceCount(this.segment(), value); return this; }

    /// {@return `maxPPictureL0ReferenceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxPPictureL0ReferenceCount(MemorySegment segment, long index) { return (int) VH_maxPPictureL0ReferenceCount.get(segment, 0L, index); }
    /// {@return `maxPPictureL0ReferenceCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxPPictureL0ReferenceCount(MemorySegment segment) { return VkVideoEncodeH264CapabilitiesKHR.get_maxPPictureL0ReferenceCount(segment, 0L); }
    /// {@return `maxPPictureL0ReferenceCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxPPictureL0ReferenceCountAt(long index) { return VkVideoEncodeH264CapabilitiesKHR.get_maxPPictureL0ReferenceCount(this.segment(), index); }
    /// {@return `maxPPictureL0ReferenceCount`}
    public @CType("uint32_t") int maxPPictureL0ReferenceCount() { return VkVideoEncodeH264CapabilitiesKHR.get_maxPPictureL0ReferenceCount(this.segment()); }
    /// Sets `maxPPictureL0ReferenceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxPPictureL0ReferenceCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxPPictureL0ReferenceCount.set(segment, 0L, index, value); }
    /// Sets `maxPPictureL0ReferenceCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxPPictureL0ReferenceCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeH264CapabilitiesKHR.set_maxPPictureL0ReferenceCount(segment, 0L, value); }
    /// Sets `maxPPictureL0ReferenceCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264CapabilitiesKHR maxPPictureL0ReferenceCountAt(long index, @CType("uint32_t") int value) { VkVideoEncodeH264CapabilitiesKHR.set_maxPPictureL0ReferenceCount(this.segment(), index, value); return this; }
    /// Sets `maxPPictureL0ReferenceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264CapabilitiesKHR maxPPictureL0ReferenceCount(@CType("uint32_t") int value) { VkVideoEncodeH264CapabilitiesKHR.set_maxPPictureL0ReferenceCount(this.segment(), value); return this; }

    /// {@return `maxBPictureL0ReferenceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxBPictureL0ReferenceCount(MemorySegment segment, long index) { return (int) VH_maxBPictureL0ReferenceCount.get(segment, 0L, index); }
    /// {@return `maxBPictureL0ReferenceCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxBPictureL0ReferenceCount(MemorySegment segment) { return VkVideoEncodeH264CapabilitiesKHR.get_maxBPictureL0ReferenceCount(segment, 0L); }
    /// {@return `maxBPictureL0ReferenceCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxBPictureL0ReferenceCountAt(long index) { return VkVideoEncodeH264CapabilitiesKHR.get_maxBPictureL0ReferenceCount(this.segment(), index); }
    /// {@return `maxBPictureL0ReferenceCount`}
    public @CType("uint32_t") int maxBPictureL0ReferenceCount() { return VkVideoEncodeH264CapabilitiesKHR.get_maxBPictureL0ReferenceCount(this.segment()); }
    /// Sets `maxBPictureL0ReferenceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxBPictureL0ReferenceCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxBPictureL0ReferenceCount.set(segment, 0L, index, value); }
    /// Sets `maxBPictureL0ReferenceCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxBPictureL0ReferenceCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeH264CapabilitiesKHR.set_maxBPictureL0ReferenceCount(segment, 0L, value); }
    /// Sets `maxBPictureL0ReferenceCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264CapabilitiesKHR maxBPictureL0ReferenceCountAt(long index, @CType("uint32_t") int value) { VkVideoEncodeH264CapabilitiesKHR.set_maxBPictureL0ReferenceCount(this.segment(), index, value); return this; }
    /// Sets `maxBPictureL0ReferenceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264CapabilitiesKHR maxBPictureL0ReferenceCount(@CType("uint32_t") int value) { VkVideoEncodeH264CapabilitiesKHR.set_maxBPictureL0ReferenceCount(this.segment(), value); return this; }

    /// {@return `maxL1ReferenceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxL1ReferenceCount(MemorySegment segment, long index) { return (int) VH_maxL1ReferenceCount.get(segment, 0L, index); }
    /// {@return `maxL1ReferenceCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxL1ReferenceCount(MemorySegment segment) { return VkVideoEncodeH264CapabilitiesKHR.get_maxL1ReferenceCount(segment, 0L); }
    /// {@return `maxL1ReferenceCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxL1ReferenceCountAt(long index) { return VkVideoEncodeH264CapabilitiesKHR.get_maxL1ReferenceCount(this.segment(), index); }
    /// {@return `maxL1ReferenceCount`}
    public @CType("uint32_t") int maxL1ReferenceCount() { return VkVideoEncodeH264CapabilitiesKHR.get_maxL1ReferenceCount(this.segment()); }
    /// Sets `maxL1ReferenceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxL1ReferenceCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxL1ReferenceCount.set(segment, 0L, index, value); }
    /// Sets `maxL1ReferenceCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxL1ReferenceCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeH264CapabilitiesKHR.set_maxL1ReferenceCount(segment, 0L, value); }
    /// Sets `maxL1ReferenceCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264CapabilitiesKHR maxL1ReferenceCountAt(long index, @CType("uint32_t") int value) { VkVideoEncodeH264CapabilitiesKHR.set_maxL1ReferenceCount(this.segment(), index, value); return this; }
    /// Sets `maxL1ReferenceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264CapabilitiesKHR maxL1ReferenceCount(@CType("uint32_t") int value) { VkVideoEncodeH264CapabilitiesKHR.set_maxL1ReferenceCount(this.segment(), value); return this; }

    /// {@return `maxTemporalLayerCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_maxTemporalLayerCount(MemorySegment segment, long index) { return (int) VH_maxTemporalLayerCount.get(segment, 0L, index); }
    /// {@return `maxTemporalLayerCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_maxTemporalLayerCount(MemorySegment segment) { return VkVideoEncodeH264CapabilitiesKHR.get_maxTemporalLayerCount(segment, 0L); }
    /// {@return `maxTemporalLayerCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int maxTemporalLayerCountAt(long index) { return VkVideoEncodeH264CapabilitiesKHR.get_maxTemporalLayerCount(this.segment(), index); }
    /// {@return `maxTemporalLayerCount`}
    public @CType("uint32_t") int maxTemporalLayerCount() { return VkVideoEncodeH264CapabilitiesKHR.get_maxTemporalLayerCount(this.segment()); }
    /// Sets `maxTemporalLayerCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxTemporalLayerCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_maxTemporalLayerCount.set(segment, 0L, index, value); }
    /// Sets `maxTemporalLayerCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxTemporalLayerCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeH264CapabilitiesKHR.set_maxTemporalLayerCount(segment, 0L, value); }
    /// Sets `maxTemporalLayerCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264CapabilitiesKHR maxTemporalLayerCountAt(long index, @CType("uint32_t") int value) { VkVideoEncodeH264CapabilitiesKHR.set_maxTemporalLayerCount(this.segment(), index, value); return this; }
    /// Sets `maxTemporalLayerCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264CapabilitiesKHR maxTemporalLayerCount(@CType("uint32_t") int value) { VkVideoEncodeH264CapabilitiesKHR.set_maxTemporalLayerCount(this.segment(), value); return this; }

    /// {@return `expectDyadicTemporalLayerPattern` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_expectDyadicTemporalLayerPattern(MemorySegment segment, long index) { return (int) VH_expectDyadicTemporalLayerPattern.get(segment, 0L, index); }
    /// {@return `expectDyadicTemporalLayerPattern`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_expectDyadicTemporalLayerPattern(MemorySegment segment) { return VkVideoEncodeH264CapabilitiesKHR.get_expectDyadicTemporalLayerPattern(segment, 0L); }
    /// {@return `expectDyadicTemporalLayerPattern` at the given index}
    /// @param index the index
    public @CType("VkBool32") int expectDyadicTemporalLayerPatternAt(long index) { return VkVideoEncodeH264CapabilitiesKHR.get_expectDyadicTemporalLayerPattern(this.segment(), index); }
    /// {@return `expectDyadicTemporalLayerPattern`}
    public @CType("VkBool32") int expectDyadicTemporalLayerPattern() { return VkVideoEncodeH264CapabilitiesKHR.get_expectDyadicTemporalLayerPattern(this.segment()); }
    /// Sets `expectDyadicTemporalLayerPattern` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_expectDyadicTemporalLayerPattern(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_expectDyadicTemporalLayerPattern.set(segment, 0L, index, value); }
    /// Sets `expectDyadicTemporalLayerPattern` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_expectDyadicTemporalLayerPattern(MemorySegment segment, @CType("VkBool32") int value) { VkVideoEncodeH264CapabilitiesKHR.set_expectDyadicTemporalLayerPattern(segment, 0L, value); }
    /// Sets `expectDyadicTemporalLayerPattern` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264CapabilitiesKHR expectDyadicTemporalLayerPatternAt(long index, @CType("VkBool32") int value) { VkVideoEncodeH264CapabilitiesKHR.set_expectDyadicTemporalLayerPattern(this.segment(), index, value); return this; }
    /// Sets `expectDyadicTemporalLayerPattern` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264CapabilitiesKHR expectDyadicTemporalLayerPattern(@CType("VkBool32") int value) { VkVideoEncodeH264CapabilitiesKHR.set_expectDyadicTemporalLayerPattern(this.segment(), value); return this; }

    /// {@return `minQp` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int32_t") int get_minQp(MemorySegment segment, long index) { return (int) VH_minQp.get(segment, 0L, index); }
    /// {@return `minQp`}
    /// @param segment the segment of the struct
    public static @CType("int32_t") int get_minQp(MemorySegment segment) { return VkVideoEncodeH264CapabilitiesKHR.get_minQp(segment, 0L); }
    /// {@return `minQp` at the given index}
    /// @param index the index
    public @CType("int32_t") int minQpAt(long index) { return VkVideoEncodeH264CapabilitiesKHR.get_minQp(this.segment(), index); }
    /// {@return `minQp`}
    public @CType("int32_t") int minQp() { return VkVideoEncodeH264CapabilitiesKHR.get_minQp(this.segment()); }
    /// Sets `minQp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_minQp(MemorySegment segment, long index, @CType("int32_t") int value) { VH_minQp.set(segment, 0L, index, value); }
    /// Sets `minQp` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_minQp(MemorySegment segment, @CType("int32_t") int value) { VkVideoEncodeH264CapabilitiesKHR.set_minQp(segment, 0L, value); }
    /// Sets `minQp` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264CapabilitiesKHR minQpAt(long index, @CType("int32_t") int value) { VkVideoEncodeH264CapabilitiesKHR.set_minQp(this.segment(), index, value); return this; }
    /// Sets `minQp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264CapabilitiesKHR minQp(@CType("int32_t") int value) { VkVideoEncodeH264CapabilitiesKHR.set_minQp(this.segment(), value); return this; }

    /// {@return `maxQp` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("int32_t") int get_maxQp(MemorySegment segment, long index) { return (int) VH_maxQp.get(segment, 0L, index); }
    /// {@return `maxQp`}
    /// @param segment the segment of the struct
    public static @CType("int32_t") int get_maxQp(MemorySegment segment) { return VkVideoEncodeH264CapabilitiesKHR.get_maxQp(segment, 0L); }
    /// {@return `maxQp` at the given index}
    /// @param index the index
    public @CType("int32_t") int maxQpAt(long index) { return VkVideoEncodeH264CapabilitiesKHR.get_maxQp(this.segment(), index); }
    /// {@return `maxQp`}
    public @CType("int32_t") int maxQp() { return VkVideoEncodeH264CapabilitiesKHR.get_maxQp(this.segment()); }
    /// Sets `maxQp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_maxQp(MemorySegment segment, long index, @CType("int32_t") int value) { VH_maxQp.set(segment, 0L, index, value); }
    /// Sets `maxQp` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_maxQp(MemorySegment segment, @CType("int32_t") int value) { VkVideoEncodeH264CapabilitiesKHR.set_maxQp(segment, 0L, value); }
    /// Sets `maxQp` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264CapabilitiesKHR maxQpAt(long index, @CType("int32_t") int value) { VkVideoEncodeH264CapabilitiesKHR.set_maxQp(this.segment(), index, value); return this; }
    /// Sets `maxQp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264CapabilitiesKHR maxQp(@CType("int32_t") int value) { VkVideoEncodeH264CapabilitiesKHR.set_maxQp(this.segment(), value); return this; }

    /// {@return `prefersGopRemainingFrames` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_prefersGopRemainingFrames(MemorySegment segment, long index) { return (int) VH_prefersGopRemainingFrames.get(segment, 0L, index); }
    /// {@return `prefersGopRemainingFrames`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_prefersGopRemainingFrames(MemorySegment segment) { return VkVideoEncodeH264CapabilitiesKHR.get_prefersGopRemainingFrames(segment, 0L); }
    /// {@return `prefersGopRemainingFrames` at the given index}
    /// @param index the index
    public @CType("VkBool32") int prefersGopRemainingFramesAt(long index) { return VkVideoEncodeH264CapabilitiesKHR.get_prefersGopRemainingFrames(this.segment(), index); }
    /// {@return `prefersGopRemainingFrames`}
    public @CType("VkBool32") int prefersGopRemainingFrames() { return VkVideoEncodeH264CapabilitiesKHR.get_prefersGopRemainingFrames(this.segment()); }
    /// Sets `prefersGopRemainingFrames` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_prefersGopRemainingFrames(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_prefersGopRemainingFrames.set(segment, 0L, index, value); }
    /// Sets `prefersGopRemainingFrames` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_prefersGopRemainingFrames(MemorySegment segment, @CType("VkBool32") int value) { VkVideoEncodeH264CapabilitiesKHR.set_prefersGopRemainingFrames(segment, 0L, value); }
    /// Sets `prefersGopRemainingFrames` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264CapabilitiesKHR prefersGopRemainingFramesAt(long index, @CType("VkBool32") int value) { VkVideoEncodeH264CapabilitiesKHR.set_prefersGopRemainingFrames(this.segment(), index, value); return this; }
    /// Sets `prefersGopRemainingFrames` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264CapabilitiesKHR prefersGopRemainingFrames(@CType("VkBool32") int value) { VkVideoEncodeH264CapabilitiesKHR.set_prefersGopRemainingFrames(this.segment(), value); return this; }

    /// {@return `requiresGopRemainingFrames` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_requiresGopRemainingFrames(MemorySegment segment, long index) { return (int) VH_requiresGopRemainingFrames.get(segment, 0L, index); }
    /// {@return `requiresGopRemainingFrames`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_requiresGopRemainingFrames(MemorySegment segment) { return VkVideoEncodeH264CapabilitiesKHR.get_requiresGopRemainingFrames(segment, 0L); }
    /// {@return `requiresGopRemainingFrames` at the given index}
    /// @param index the index
    public @CType("VkBool32") int requiresGopRemainingFramesAt(long index) { return VkVideoEncodeH264CapabilitiesKHR.get_requiresGopRemainingFrames(this.segment(), index); }
    /// {@return `requiresGopRemainingFrames`}
    public @CType("VkBool32") int requiresGopRemainingFrames() { return VkVideoEncodeH264CapabilitiesKHR.get_requiresGopRemainingFrames(this.segment()); }
    /// Sets `requiresGopRemainingFrames` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_requiresGopRemainingFrames(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_requiresGopRemainingFrames.set(segment, 0L, index, value); }
    /// Sets `requiresGopRemainingFrames` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_requiresGopRemainingFrames(MemorySegment segment, @CType("VkBool32") int value) { VkVideoEncodeH264CapabilitiesKHR.set_requiresGopRemainingFrames(segment, 0L, value); }
    /// Sets `requiresGopRemainingFrames` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264CapabilitiesKHR requiresGopRemainingFramesAt(long index, @CType("VkBool32") int value) { VkVideoEncodeH264CapabilitiesKHR.set_requiresGopRemainingFrames(this.segment(), index, value); return this; }
    /// Sets `requiresGopRemainingFrames` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264CapabilitiesKHR requiresGopRemainingFrames(@CType("VkBool32") int value) { VkVideoEncodeH264CapabilitiesKHR.set_requiresGopRemainingFrames(this.segment(), value); return this; }

    /// {@return `stdSyntaxFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkVideoEncodeH264StdFlagsKHR") int get_stdSyntaxFlags(MemorySegment segment, long index) { return (int) VH_stdSyntaxFlags.get(segment, 0L, index); }
    /// {@return `stdSyntaxFlags`}
    /// @param segment the segment of the struct
    public static @CType("VkVideoEncodeH264StdFlagsKHR") int get_stdSyntaxFlags(MemorySegment segment) { return VkVideoEncodeH264CapabilitiesKHR.get_stdSyntaxFlags(segment, 0L); }
    /// {@return `stdSyntaxFlags` at the given index}
    /// @param index the index
    public @CType("VkVideoEncodeH264StdFlagsKHR") int stdSyntaxFlagsAt(long index) { return VkVideoEncodeH264CapabilitiesKHR.get_stdSyntaxFlags(this.segment(), index); }
    /// {@return `stdSyntaxFlags`}
    public @CType("VkVideoEncodeH264StdFlagsKHR") int stdSyntaxFlags() { return VkVideoEncodeH264CapabilitiesKHR.get_stdSyntaxFlags(this.segment()); }
    /// Sets `stdSyntaxFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_stdSyntaxFlags(MemorySegment segment, long index, @CType("VkVideoEncodeH264StdFlagsKHR") int value) { VH_stdSyntaxFlags.set(segment, 0L, index, value); }
    /// Sets `stdSyntaxFlags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_stdSyntaxFlags(MemorySegment segment, @CType("VkVideoEncodeH264StdFlagsKHR") int value) { VkVideoEncodeH264CapabilitiesKHR.set_stdSyntaxFlags(segment, 0L, value); }
    /// Sets `stdSyntaxFlags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264CapabilitiesKHR stdSyntaxFlagsAt(long index, @CType("VkVideoEncodeH264StdFlagsKHR") int value) { VkVideoEncodeH264CapabilitiesKHR.set_stdSyntaxFlags(this.segment(), index, value); return this; }
    /// Sets `stdSyntaxFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264CapabilitiesKHR stdSyntaxFlags(@CType("VkVideoEncodeH264StdFlagsKHR") int value) { VkVideoEncodeH264CapabilitiesKHR.set_stdSyntaxFlags(this.segment(), value); return this; }

}
