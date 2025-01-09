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
/// ### preferredRateControlFlags
/// [VarHandle][#VH_preferredRateControlFlags] - [Getter][#preferredRateControlFlags()] - [Setter][#preferredRateControlFlags(int)]
/// ### preferredGopFrameCount
/// [VarHandle][#VH_preferredGopFrameCount] - [Getter][#preferredGopFrameCount()] - [Setter][#preferredGopFrameCount(int)]
/// ### preferredKeyFramePeriod
/// [VarHandle][#VH_preferredKeyFramePeriod] - [Getter][#preferredKeyFramePeriod()] - [Setter][#preferredKeyFramePeriod(int)]
/// ### preferredConsecutiveBipredictiveFrameCount
/// [VarHandle][#VH_preferredConsecutiveBipredictiveFrameCount] - [Getter][#preferredConsecutiveBipredictiveFrameCount()] - [Setter][#preferredConsecutiveBipredictiveFrameCount(int)]
/// ### preferredTemporalLayerCount
/// [VarHandle][#VH_preferredTemporalLayerCount] - [Getter][#preferredTemporalLayerCount()] - [Setter][#preferredTemporalLayerCount(int)]
/// ### preferredConstantQIndex
/// [Byte offset][#OFFSET_preferredConstantQIndex] - [Memory layout][#ML_preferredConstantQIndex] - [Getter][#preferredConstantQIndex()] - [Setter][#preferredConstantQIndex(java.lang.foreign.MemorySegment)]
/// ### preferredMaxSingleReferenceCount
/// [VarHandle][#VH_preferredMaxSingleReferenceCount] - [Getter][#preferredMaxSingleReferenceCount()] - [Setter][#preferredMaxSingleReferenceCount(int)]
/// ### preferredSingleReferenceNameMask
/// [VarHandle][#VH_preferredSingleReferenceNameMask] - [Getter][#preferredSingleReferenceNameMask()] - [Setter][#preferredSingleReferenceNameMask(int)]
/// ### preferredMaxUnidirectionalCompoundReferenceCount
/// [VarHandle][#VH_preferredMaxUnidirectionalCompoundReferenceCount] - [Getter][#preferredMaxUnidirectionalCompoundReferenceCount()] - [Setter][#preferredMaxUnidirectionalCompoundReferenceCount(int)]
/// ### preferredMaxUnidirectionalCompoundGroup1ReferenceCount
/// [VarHandle][#VH_preferredMaxUnidirectionalCompoundGroup1ReferenceCount] - [Getter][#preferredMaxUnidirectionalCompoundGroup1ReferenceCount()] - [Setter][#preferredMaxUnidirectionalCompoundGroup1ReferenceCount(int)]
/// ### preferredUnidirectionalCompoundReferenceNameMask
/// [VarHandle][#VH_preferredUnidirectionalCompoundReferenceNameMask] - [Getter][#preferredUnidirectionalCompoundReferenceNameMask()] - [Setter][#preferredUnidirectionalCompoundReferenceNameMask(int)]
/// ### preferredMaxBidirectionalCompoundReferenceCount
/// [VarHandle][#VH_preferredMaxBidirectionalCompoundReferenceCount] - [Getter][#preferredMaxBidirectionalCompoundReferenceCount()] - [Setter][#preferredMaxBidirectionalCompoundReferenceCount(int)]
/// ### preferredMaxBidirectionalCompoundGroup1ReferenceCount
/// [VarHandle][#VH_preferredMaxBidirectionalCompoundGroup1ReferenceCount] - [Getter][#preferredMaxBidirectionalCompoundGroup1ReferenceCount()] - [Setter][#preferredMaxBidirectionalCompoundGroup1ReferenceCount(int)]
/// ### preferredMaxBidirectionalCompoundGroup2ReferenceCount
/// [VarHandle][#VH_preferredMaxBidirectionalCompoundGroup2ReferenceCount] - [Getter][#preferredMaxBidirectionalCompoundGroup2ReferenceCount()] - [Setter][#preferredMaxBidirectionalCompoundGroup2ReferenceCount(int)]
/// ### preferredBidirectionalCompoundReferenceNameMask
/// [VarHandle][#VH_preferredBidirectionalCompoundReferenceNameMask] - [Getter][#preferredBidirectionalCompoundReferenceNameMask()] - [Setter][#preferredBidirectionalCompoundReferenceNameMask(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoEncodeAV1QualityLevelPropertiesKHR {
///     VkStructureType sType;
///     void * pNext;
///     VkVideoEncodeAV1RateControlFlagsKHR preferredRateControlFlags;
///     uint32_t preferredGopFrameCount;
///     uint32_t preferredKeyFramePeriod;
///     uint32_t preferredConsecutiveBipredictiveFrameCount;
///     uint32_t preferredTemporalLayerCount;
///     VkVideoEncodeAV1QIndexKHR preferredConstantQIndex;
///     uint32_t preferredMaxSingleReferenceCount;
///     uint32_t preferredSingleReferenceNameMask;
///     uint32_t preferredMaxUnidirectionalCompoundReferenceCount;
///     uint32_t preferredMaxUnidirectionalCompoundGroup1ReferenceCount;
///     uint32_t preferredUnidirectionalCompoundReferenceNameMask;
///     uint32_t preferredMaxBidirectionalCompoundReferenceCount;
///     uint32_t preferredMaxBidirectionalCompoundGroup1ReferenceCount;
///     uint32_t preferredMaxBidirectionalCompoundGroup2ReferenceCount;
///     uint32_t preferredBidirectionalCompoundReferenceNameMask;
/// } VkVideoEncodeAV1QualityLevelPropertiesKHR;
/// ```
public final class VkVideoEncodeAV1QualityLevelPropertiesKHR extends Struct {
    /// The struct layout of `VkVideoEncodeAV1QualityLevelPropertiesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("preferredRateControlFlags"),
        ValueLayout.JAVA_INT.withName("preferredGopFrameCount"),
        ValueLayout.JAVA_INT.withName("preferredKeyFramePeriod"),
        ValueLayout.JAVA_INT.withName("preferredConsecutiveBipredictiveFrameCount"),
        ValueLayout.JAVA_INT.withName("preferredTemporalLayerCount"),
        overrungl.vulkan.khr.struct.VkVideoEncodeAV1QIndexKHR.LAYOUT.withName("preferredConstantQIndex"),
        ValueLayout.JAVA_INT.withName("preferredMaxSingleReferenceCount"),
        ValueLayout.JAVA_INT.withName("preferredSingleReferenceNameMask"),
        ValueLayout.JAVA_INT.withName("preferredMaxUnidirectionalCompoundReferenceCount"),
        ValueLayout.JAVA_INT.withName("preferredMaxUnidirectionalCompoundGroup1ReferenceCount"),
        ValueLayout.JAVA_INT.withName("preferredUnidirectionalCompoundReferenceNameMask"),
        ValueLayout.JAVA_INT.withName("preferredMaxBidirectionalCompoundReferenceCount"),
        ValueLayout.JAVA_INT.withName("preferredMaxBidirectionalCompoundGroup1ReferenceCount"),
        ValueLayout.JAVA_INT.withName("preferredMaxBidirectionalCompoundGroup2ReferenceCount"),
        ValueLayout.JAVA_INT.withName("preferredBidirectionalCompoundReferenceNameMask")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `preferredRateControlFlags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_preferredRateControlFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredRateControlFlags"));
    /// The [VarHandle] of `preferredGopFrameCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_preferredGopFrameCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredGopFrameCount"));
    /// The [VarHandle] of `preferredKeyFramePeriod` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_preferredKeyFramePeriod = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredKeyFramePeriod"));
    /// The [VarHandle] of `preferredConsecutiveBipredictiveFrameCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_preferredConsecutiveBipredictiveFrameCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredConsecutiveBipredictiveFrameCount"));
    /// The [VarHandle] of `preferredTemporalLayerCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_preferredTemporalLayerCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredTemporalLayerCount"));
    /// The byte offset of `preferredConstantQIndex`.
    public static final long OFFSET_preferredConstantQIndex = LAYOUT.byteOffset(PathElement.groupElement("preferredConstantQIndex"));
    /// The memory layout of `preferredConstantQIndex`.
    public static final MemoryLayout ML_preferredConstantQIndex = LAYOUT.select(PathElement.groupElement("preferredConstantQIndex"));
    /// The [VarHandle] of `preferredMaxSingleReferenceCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_preferredMaxSingleReferenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredMaxSingleReferenceCount"));
    /// The [VarHandle] of `preferredSingleReferenceNameMask` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_preferredSingleReferenceNameMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredSingleReferenceNameMask"));
    /// The [VarHandle] of `preferredMaxUnidirectionalCompoundReferenceCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_preferredMaxUnidirectionalCompoundReferenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredMaxUnidirectionalCompoundReferenceCount"));
    /// The [VarHandle] of `preferredMaxUnidirectionalCompoundGroup1ReferenceCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_preferredMaxUnidirectionalCompoundGroup1ReferenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredMaxUnidirectionalCompoundGroup1ReferenceCount"));
    /// The [VarHandle] of `preferredUnidirectionalCompoundReferenceNameMask` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_preferredUnidirectionalCompoundReferenceNameMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredUnidirectionalCompoundReferenceNameMask"));
    /// The [VarHandle] of `preferredMaxBidirectionalCompoundReferenceCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_preferredMaxBidirectionalCompoundReferenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredMaxBidirectionalCompoundReferenceCount"));
    /// The [VarHandle] of `preferredMaxBidirectionalCompoundGroup1ReferenceCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_preferredMaxBidirectionalCompoundGroup1ReferenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredMaxBidirectionalCompoundGroup1ReferenceCount"));
    /// The [VarHandle] of `preferredMaxBidirectionalCompoundGroup2ReferenceCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_preferredMaxBidirectionalCompoundGroup2ReferenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredMaxBidirectionalCompoundGroup2ReferenceCount"));
    /// The [VarHandle] of `preferredBidirectionalCompoundReferenceNameMask` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_preferredBidirectionalCompoundReferenceNameMask = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredBidirectionalCompoundReferenceNameMask"));

    /// Creates `VkVideoEncodeAV1QualityLevelPropertiesKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoEncodeAV1QualityLevelPropertiesKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoEncodeAV1QualityLevelPropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeAV1QualityLevelPropertiesKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeAV1QualityLevelPropertiesKHR(segment); }

    /// Creates `VkVideoEncodeAV1QualityLevelPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeAV1QualityLevelPropertiesKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeAV1QualityLevelPropertiesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoEncodeAV1QualityLevelPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeAV1QualityLevelPropertiesKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeAV1QualityLevelPropertiesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkVideoEncodeAV1QualityLevelPropertiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeAV1QualityLevelPropertiesKHR`
    public static VkVideoEncodeAV1QualityLevelPropertiesKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeAV1QualityLevelPropertiesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoEncodeAV1QualityLevelPropertiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeAV1QualityLevelPropertiesKHR`
    public static VkVideoEncodeAV1QualityLevelPropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeAV1QualityLevelPropertiesKHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoEncodeAV1QualityLevelPropertiesKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoEncodeAV1QualityLevelPropertiesKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoEncodeAV1QualityLevelPropertiesKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoEncodeAV1QualityLevelPropertiesKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoEncodeAV1QualityLevelPropertiesKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR sType(@CType("VkStructureType") int value) { VkVideoEncodeAV1QualityLevelPropertiesKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkVideoEncodeAV1QualityLevelPropertiesKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkVideoEncodeAV1QualityLevelPropertiesKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkVideoEncodeAV1QualityLevelPropertiesKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeAV1QualityLevelPropertiesKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeAV1QualityLevelPropertiesKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeAV1QualityLevelPropertiesKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `preferredRateControlFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkVideoEncodeAV1RateControlFlagsKHR") int get_preferredRateControlFlags(MemorySegment segment, long index) { return (int) VH_preferredRateControlFlags.get(segment, 0L, index); }
    /// {@return `preferredRateControlFlags`}
    /// @param segment the segment of the struct
    public static @CType("VkVideoEncodeAV1RateControlFlagsKHR") int get_preferredRateControlFlags(MemorySegment segment) { return VkVideoEncodeAV1QualityLevelPropertiesKHR.get_preferredRateControlFlags(segment, 0L); }
    /// {@return `preferredRateControlFlags` at the given index}
    /// @param index the index
    public @CType("VkVideoEncodeAV1RateControlFlagsKHR") int preferredRateControlFlagsAt(long index) { return VkVideoEncodeAV1QualityLevelPropertiesKHR.get_preferredRateControlFlags(this.segment(), index); }
    /// {@return `preferredRateControlFlags`}
    public @CType("VkVideoEncodeAV1RateControlFlagsKHR") int preferredRateControlFlags() { return VkVideoEncodeAV1QualityLevelPropertiesKHR.get_preferredRateControlFlags(this.segment()); }
    /// Sets `preferredRateControlFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_preferredRateControlFlags(MemorySegment segment, long index, @CType("VkVideoEncodeAV1RateControlFlagsKHR") int value) { VH_preferredRateControlFlags.set(segment, 0L, index, value); }
    /// Sets `preferredRateControlFlags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_preferredRateControlFlags(MemorySegment segment, @CType("VkVideoEncodeAV1RateControlFlagsKHR") int value) { VkVideoEncodeAV1QualityLevelPropertiesKHR.set_preferredRateControlFlags(segment, 0L, value); }
    /// Sets `preferredRateControlFlags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredRateControlFlagsAt(long index, @CType("VkVideoEncodeAV1RateControlFlagsKHR") int value) { VkVideoEncodeAV1QualityLevelPropertiesKHR.set_preferredRateControlFlags(this.segment(), index, value); return this; }
    /// Sets `preferredRateControlFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredRateControlFlags(@CType("VkVideoEncodeAV1RateControlFlagsKHR") int value) { VkVideoEncodeAV1QualityLevelPropertiesKHR.set_preferredRateControlFlags(this.segment(), value); return this; }

    /// {@return `preferredGopFrameCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_preferredGopFrameCount(MemorySegment segment, long index) { return (int) VH_preferredGopFrameCount.get(segment, 0L, index); }
    /// {@return `preferredGopFrameCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_preferredGopFrameCount(MemorySegment segment) { return VkVideoEncodeAV1QualityLevelPropertiesKHR.get_preferredGopFrameCount(segment, 0L); }
    /// {@return `preferredGopFrameCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int preferredGopFrameCountAt(long index) { return VkVideoEncodeAV1QualityLevelPropertiesKHR.get_preferredGopFrameCount(this.segment(), index); }
    /// {@return `preferredGopFrameCount`}
    public @CType("uint32_t") int preferredGopFrameCount() { return VkVideoEncodeAV1QualityLevelPropertiesKHR.get_preferredGopFrameCount(this.segment()); }
    /// Sets `preferredGopFrameCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_preferredGopFrameCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_preferredGopFrameCount.set(segment, 0L, index, value); }
    /// Sets `preferredGopFrameCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_preferredGopFrameCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeAV1QualityLevelPropertiesKHR.set_preferredGopFrameCount(segment, 0L, value); }
    /// Sets `preferredGopFrameCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredGopFrameCountAt(long index, @CType("uint32_t") int value) { VkVideoEncodeAV1QualityLevelPropertiesKHR.set_preferredGopFrameCount(this.segment(), index, value); return this; }
    /// Sets `preferredGopFrameCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredGopFrameCount(@CType("uint32_t") int value) { VkVideoEncodeAV1QualityLevelPropertiesKHR.set_preferredGopFrameCount(this.segment(), value); return this; }

    /// {@return `preferredKeyFramePeriod` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_preferredKeyFramePeriod(MemorySegment segment, long index) { return (int) VH_preferredKeyFramePeriod.get(segment, 0L, index); }
    /// {@return `preferredKeyFramePeriod`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_preferredKeyFramePeriod(MemorySegment segment) { return VkVideoEncodeAV1QualityLevelPropertiesKHR.get_preferredKeyFramePeriod(segment, 0L); }
    /// {@return `preferredKeyFramePeriod` at the given index}
    /// @param index the index
    public @CType("uint32_t") int preferredKeyFramePeriodAt(long index) { return VkVideoEncodeAV1QualityLevelPropertiesKHR.get_preferredKeyFramePeriod(this.segment(), index); }
    /// {@return `preferredKeyFramePeriod`}
    public @CType("uint32_t") int preferredKeyFramePeriod() { return VkVideoEncodeAV1QualityLevelPropertiesKHR.get_preferredKeyFramePeriod(this.segment()); }
    /// Sets `preferredKeyFramePeriod` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_preferredKeyFramePeriod(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_preferredKeyFramePeriod.set(segment, 0L, index, value); }
    /// Sets `preferredKeyFramePeriod` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_preferredKeyFramePeriod(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeAV1QualityLevelPropertiesKHR.set_preferredKeyFramePeriod(segment, 0L, value); }
    /// Sets `preferredKeyFramePeriod` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredKeyFramePeriodAt(long index, @CType("uint32_t") int value) { VkVideoEncodeAV1QualityLevelPropertiesKHR.set_preferredKeyFramePeriod(this.segment(), index, value); return this; }
    /// Sets `preferredKeyFramePeriod` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredKeyFramePeriod(@CType("uint32_t") int value) { VkVideoEncodeAV1QualityLevelPropertiesKHR.set_preferredKeyFramePeriod(this.segment(), value); return this; }

    /// {@return `preferredConsecutiveBipredictiveFrameCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_preferredConsecutiveBipredictiveFrameCount(MemorySegment segment, long index) { return (int) VH_preferredConsecutiveBipredictiveFrameCount.get(segment, 0L, index); }
    /// {@return `preferredConsecutiveBipredictiveFrameCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_preferredConsecutiveBipredictiveFrameCount(MemorySegment segment) { return VkVideoEncodeAV1QualityLevelPropertiesKHR.get_preferredConsecutiveBipredictiveFrameCount(segment, 0L); }
    /// {@return `preferredConsecutiveBipredictiveFrameCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int preferredConsecutiveBipredictiveFrameCountAt(long index) { return VkVideoEncodeAV1QualityLevelPropertiesKHR.get_preferredConsecutiveBipredictiveFrameCount(this.segment(), index); }
    /// {@return `preferredConsecutiveBipredictiveFrameCount`}
    public @CType("uint32_t") int preferredConsecutiveBipredictiveFrameCount() { return VkVideoEncodeAV1QualityLevelPropertiesKHR.get_preferredConsecutiveBipredictiveFrameCount(this.segment()); }
    /// Sets `preferredConsecutiveBipredictiveFrameCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_preferredConsecutiveBipredictiveFrameCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_preferredConsecutiveBipredictiveFrameCount.set(segment, 0L, index, value); }
    /// Sets `preferredConsecutiveBipredictiveFrameCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_preferredConsecutiveBipredictiveFrameCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeAV1QualityLevelPropertiesKHR.set_preferredConsecutiveBipredictiveFrameCount(segment, 0L, value); }
    /// Sets `preferredConsecutiveBipredictiveFrameCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredConsecutiveBipredictiveFrameCountAt(long index, @CType("uint32_t") int value) { VkVideoEncodeAV1QualityLevelPropertiesKHR.set_preferredConsecutiveBipredictiveFrameCount(this.segment(), index, value); return this; }
    /// Sets `preferredConsecutiveBipredictiveFrameCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredConsecutiveBipredictiveFrameCount(@CType("uint32_t") int value) { VkVideoEncodeAV1QualityLevelPropertiesKHR.set_preferredConsecutiveBipredictiveFrameCount(this.segment(), value); return this; }

    /// {@return `preferredTemporalLayerCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_preferredTemporalLayerCount(MemorySegment segment, long index) { return (int) VH_preferredTemporalLayerCount.get(segment, 0L, index); }
    /// {@return `preferredTemporalLayerCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_preferredTemporalLayerCount(MemorySegment segment) { return VkVideoEncodeAV1QualityLevelPropertiesKHR.get_preferredTemporalLayerCount(segment, 0L); }
    /// {@return `preferredTemporalLayerCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int preferredTemporalLayerCountAt(long index) { return VkVideoEncodeAV1QualityLevelPropertiesKHR.get_preferredTemporalLayerCount(this.segment(), index); }
    /// {@return `preferredTemporalLayerCount`}
    public @CType("uint32_t") int preferredTemporalLayerCount() { return VkVideoEncodeAV1QualityLevelPropertiesKHR.get_preferredTemporalLayerCount(this.segment()); }
    /// Sets `preferredTemporalLayerCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_preferredTemporalLayerCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_preferredTemporalLayerCount.set(segment, 0L, index, value); }
    /// Sets `preferredTemporalLayerCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_preferredTemporalLayerCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeAV1QualityLevelPropertiesKHR.set_preferredTemporalLayerCount(segment, 0L, value); }
    /// Sets `preferredTemporalLayerCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredTemporalLayerCountAt(long index, @CType("uint32_t") int value) { VkVideoEncodeAV1QualityLevelPropertiesKHR.set_preferredTemporalLayerCount(this.segment(), index, value); return this; }
    /// Sets `preferredTemporalLayerCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredTemporalLayerCount(@CType("uint32_t") int value) { VkVideoEncodeAV1QualityLevelPropertiesKHR.set_preferredTemporalLayerCount(this.segment(), value); return this; }

    /// {@return `preferredConstantQIndex` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkVideoEncodeAV1QIndexKHR") java.lang.foreign.MemorySegment get_preferredConstantQIndex(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_preferredConstantQIndex, index), ML_preferredConstantQIndex); }
    /// {@return `preferredConstantQIndex`}
    /// @param segment the segment of the struct
    public static @CType("VkVideoEncodeAV1QIndexKHR") java.lang.foreign.MemorySegment get_preferredConstantQIndex(MemorySegment segment) { return VkVideoEncodeAV1QualityLevelPropertiesKHR.get_preferredConstantQIndex(segment, 0L); }
    /// {@return `preferredConstantQIndex` at the given index}
    /// @param index the index
    public @CType("VkVideoEncodeAV1QIndexKHR") java.lang.foreign.MemorySegment preferredConstantQIndexAt(long index) { return VkVideoEncodeAV1QualityLevelPropertiesKHR.get_preferredConstantQIndex(this.segment(), index); }
    /// {@return `preferredConstantQIndex`}
    public @CType("VkVideoEncodeAV1QIndexKHR") java.lang.foreign.MemorySegment preferredConstantQIndex() { return VkVideoEncodeAV1QualityLevelPropertiesKHR.get_preferredConstantQIndex(this.segment()); }
    /// Sets `preferredConstantQIndex` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_preferredConstantQIndex(MemorySegment segment, long index, @CType("VkVideoEncodeAV1QIndexKHR") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_preferredConstantQIndex, index), ML_preferredConstantQIndex.byteSize()); }
    /// Sets `preferredConstantQIndex` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_preferredConstantQIndex(MemorySegment segment, @CType("VkVideoEncodeAV1QIndexKHR") java.lang.foreign.MemorySegment value) { VkVideoEncodeAV1QualityLevelPropertiesKHR.set_preferredConstantQIndex(segment, 0L, value); }
    /// Sets `preferredConstantQIndex` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredConstantQIndexAt(long index, @CType("VkVideoEncodeAV1QIndexKHR") java.lang.foreign.MemorySegment value) { VkVideoEncodeAV1QualityLevelPropertiesKHR.set_preferredConstantQIndex(this.segment(), index, value); return this; }
    /// Sets `preferredConstantQIndex` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredConstantQIndex(@CType("VkVideoEncodeAV1QIndexKHR") java.lang.foreign.MemorySegment value) { VkVideoEncodeAV1QualityLevelPropertiesKHR.set_preferredConstantQIndex(this.segment(), value); return this; }

    /// {@return `preferredMaxSingleReferenceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_preferredMaxSingleReferenceCount(MemorySegment segment, long index) { return (int) VH_preferredMaxSingleReferenceCount.get(segment, 0L, index); }
    /// {@return `preferredMaxSingleReferenceCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_preferredMaxSingleReferenceCount(MemorySegment segment) { return VkVideoEncodeAV1QualityLevelPropertiesKHR.get_preferredMaxSingleReferenceCount(segment, 0L); }
    /// {@return `preferredMaxSingleReferenceCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int preferredMaxSingleReferenceCountAt(long index) { return VkVideoEncodeAV1QualityLevelPropertiesKHR.get_preferredMaxSingleReferenceCount(this.segment(), index); }
    /// {@return `preferredMaxSingleReferenceCount`}
    public @CType("uint32_t") int preferredMaxSingleReferenceCount() { return VkVideoEncodeAV1QualityLevelPropertiesKHR.get_preferredMaxSingleReferenceCount(this.segment()); }
    /// Sets `preferredMaxSingleReferenceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_preferredMaxSingleReferenceCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_preferredMaxSingleReferenceCount.set(segment, 0L, index, value); }
    /// Sets `preferredMaxSingleReferenceCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_preferredMaxSingleReferenceCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeAV1QualityLevelPropertiesKHR.set_preferredMaxSingleReferenceCount(segment, 0L, value); }
    /// Sets `preferredMaxSingleReferenceCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredMaxSingleReferenceCountAt(long index, @CType("uint32_t") int value) { VkVideoEncodeAV1QualityLevelPropertiesKHR.set_preferredMaxSingleReferenceCount(this.segment(), index, value); return this; }
    /// Sets `preferredMaxSingleReferenceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredMaxSingleReferenceCount(@CType("uint32_t") int value) { VkVideoEncodeAV1QualityLevelPropertiesKHR.set_preferredMaxSingleReferenceCount(this.segment(), value); return this; }

    /// {@return `preferredSingleReferenceNameMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_preferredSingleReferenceNameMask(MemorySegment segment, long index) { return (int) VH_preferredSingleReferenceNameMask.get(segment, 0L, index); }
    /// {@return `preferredSingleReferenceNameMask`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_preferredSingleReferenceNameMask(MemorySegment segment) { return VkVideoEncodeAV1QualityLevelPropertiesKHR.get_preferredSingleReferenceNameMask(segment, 0L); }
    /// {@return `preferredSingleReferenceNameMask` at the given index}
    /// @param index the index
    public @CType("uint32_t") int preferredSingleReferenceNameMaskAt(long index) { return VkVideoEncodeAV1QualityLevelPropertiesKHR.get_preferredSingleReferenceNameMask(this.segment(), index); }
    /// {@return `preferredSingleReferenceNameMask`}
    public @CType("uint32_t") int preferredSingleReferenceNameMask() { return VkVideoEncodeAV1QualityLevelPropertiesKHR.get_preferredSingleReferenceNameMask(this.segment()); }
    /// Sets `preferredSingleReferenceNameMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_preferredSingleReferenceNameMask(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_preferredSingleReferenceNameMask.set(segment, 0L, index, value); }
    /// Sets `preferredSingleReferenceNameMask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_preferredSingleReferenceNameMask(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeAV1QualityLevelPropertiesKHR.set_preferredSingleReferenceNameMask(segment, 0L, value); }
    /// Sets `preferredSingleReferenceNameMask` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredSingleReferenceNameMaskAt(long index, @CType("uint32_t") int value) { VkVideoEncodeAV1QualityLevelPropertiesKHR.set_preferredSingleReferenceNameMask(this.segment(), index, value); return this; }
    /// Sets `preferredSingleReferenceNameMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredSingleReferenceNameMask(@CType("uint32_t") int value) { VkVideoEncodeAV1QualityLevelPropertiesKHR.set_preferredSingleReferenceNameMask(this.segment(), value); return this; }

    /// {@return `preferredMaxUnidirectionalCompoundReferenceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_preferredMaxUnidirectionalCompoundReferenceCount(MemorySegment segment, long index) { return (int) VH_preferredMaxUnidirectionalCompoundReferenceCount.get(segment, 0L, index); }
    /// {@return `preferredMaxUnidirectionalCompoundReferenceCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_preferredMaxUnidirectionalCompoundReferenceCount(MemorySegment segment) { return VkVideoEncodeAV1QualityLevelPropertiesKHR.get_preferredMaxUnidirectionalCompoundReferenceCount(segment, 0L); }
    /// {@return `preferredMaxUnidirectionalCompoundReferenceCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int preferredMaxUnidirectionalCompoundReferenceCountAt(long index) { return VkVideoEncodeAV1QualityLevelPropertiesKHR.get_preferredMaxUnidirectionalCompoundReferenceCount(this.segment(), index); }
    /// {@return `preferredMaxUnidirectionalCompoundReferenceCount`}
    public @CType("uint32_t") int preferredMaxUnidirectionalCompoundReferenceCount() { return VkVideoEncodeAV1QualityLevelPropertiesKHR.get_preferredMaxUnidirectionalCompoundReferenceCount(this.segment()); }
    /// Sets `preferredMaxUnidirectionalCompoundReferenceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_preferredMaxUnidirectionalCompoundReferenceCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_preferredMaxUnidirectionalCompoundReferenceCount.set(segment, 0L, index, value); }
    /// Sets `preferredMaxUnidirectionalCompoundReferenceCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_preferredMaxUnidirectionalCompoundReferenceCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeAV1QualityLevelPropertiesKHR.set_preferredMaxUnidirectionalCompoundReferenceCount(segment, 0L, value); }
    /// Sets `preferredMaxUnidirectionalCompoundReferenceCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredMaxUnidirectionalCompoundReferenceCountAt(long index, @CType("uint32_t") int value) { VkVideoEncodeAV1QualityLevelPropertiesKHR.set_preferredMaxUnidirectionalCompoundReferenceCount(this.segment(), index, value); return this; }
    /// Sets `preferredMaxUnidirectionalCompoundReferenceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredMaxUnidirectionalCompoundReferenceCount(@CType("uint32_t") int value) { VkVideoEncodeAV1QualityLevelPropertiesKHR.set_preferredMaxUnidirectionalCompoundReferenceCount(this.segment(), value); return this; }

    /// {@return `preferredMaxUnidirectionalCompoundGroup1ReferenceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_preferredMaxUnidirectionalCompoundGroup1ReferenceCount(MemorySegment segment, long index) { return (int) VH_preferredMaxUnidirectionalCompoundGroup1ReferenceCount.get(segment, 0L, index); }
    /// {@return `preferredMaxUnidirectionalCompoundGroup1ReferenceCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_preferredMaxUnidirectionalCompoundGroup1ReferenceCount(MemorySegment segment) { return VkVideoEncodeAV1QualityLevelPropertiesKHR.get_preferredMaxUnidirectionalCompoundGroup1ReferenceCount(segment, 0L); }
    /// {@return `preferredMaxUnidirectionalCompoundGroup1ReferenceCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int preferredMaxUnidirectionalCompoundGroup1ReferenceCountAt(long index) { return VkVideoEncodeAV1QualityLevelPropertiesKHR.get_preferredMaxUnidirectionalCompoundGroup1ReferenceCount(this.segment(), index); }
    /// {@return `preferredMaxUnidirectionalCompoundGroup1ReferenceCount`}
    public @CType("uint32_t") int preferredMaxUnidirectionalCompoundGroup1ReferenceCount() { return VkVideoEncodeAV1QualityLevelPropertiesKHR.get_preferredMaxUnidirectionalCompoundGroup1ReferenceCount(this.segment()); }
    /// Sets `preferredMaxUnidirectionalCompoundGroup1ReferenceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_preferredMaxUnidirectionalCompoundGroup1ReferenceCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_preferredMaxUnidirectionalCompoundGroup1ReferenceCount.set(segment, 0L, index, value); }
    /// Sets `preferredMaxUnidirectionalCompoundGroup1ReferenceCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_preferredMaxUnidirectionalCompoundGroup1ReferenceCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeAV1QualityLevelPropertiesKHR.set_preferredMaxUnidirectionalCompoundGroup1ReferenceCount(segment, 0L, value); }
    /// Sets `preferredMaxUnidirectionalCompoundGroup1ReferenceCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredMaxUnidirectionalCompoundGroup1ReferenceCountAt(long index, @CType("uint32_t") int value) { VkVideoEncodeAV1QualityLevelPropertiesKHR.set_preferredMaxUnidirectionalCompoundGroup1ReferenceCount(this.segment(), index, value); return this; }
    /// Sets `preferredMaxUnidirectionalCompoundGroup1ReferenceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredMaxUnidirectionalCompoundGroup1ReferenceCount(@CType("uint32_t") int value) { VkVideoEncodeAV1QualityLevelPropertiesKHR.set_preferredMaxUnidirectionalCompoundGroup1ReferenceCount(this.segment(), value); return this; }

    /// {@return `preferredUnidirectionalCompoundReferenceNameMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_preferredUnidirectionalCompoundReferenceNameMask(MemorySegment segment, long index) { return (int) VH_preferredUnidirectionalCompoundReferenceNameMask.get(segment, 0L, index); }
    /// {@return `preferredUnidirectionalCompoundReferenceNameMask`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_preferredUnidirectionalCompoundReferenceNameMask(MemorySegment segment) { return VkVideoEncodeAV1QualityLevelPropertiesKHR.get_preferredUnidirectionalCompoundReferenceNameMask(segment, 0L); }
    /// {@return `preferredUnidirectionalCompoundReferenceNameMask` at the given index}
    /// @param index the index
    public @CType("uint32_t") int preferredUnidirectionalCompoundReferenceNameMaskAt(long index) { return VkVideoEncodeAV1QualityLevelPropertiesKHR.get_preferredUnidirectionalCompoundReferenceNameMask(this.segment(), index); }
    /// {@return `preferredUnidirectionalCompoundReferenceNameMask`}
    public @CType("uint32_t") int preferredUnidirectionalCompoundReferenceNameMask() { return VkVideoEncodeAV1QualityLevelPropertiesKHR.get_preferredUnidirectionalCompoundReferenceNameMask(this.segment()); }
    /// Sets `preferredUnidirectionalCompoundReferenceNameMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_preferredUnidirectionalCompoundReferenceNameMask(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_preferredUnidirectionalCompoundReferenceNameMask.set(segment, 0L, index, value); }
    /// Sets `preferredUnidirectionalCompoundReferenceNameMask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_preferredUnidirectionalCompoundReferenceNameMask(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeAV1QualityLevelPropertiesKHR.set_preferredUnidirectionalCompoundReferenceNameMask(segment, 0L, value); }
    /// Sets `preferredUnidirectionalCompoundReferenceNameMask` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredUnidirectionalCompoundReferenceNameMaskAt(long index, @CType("uint32_t") int value) { VkVideoEncodeAV1QualityLevelPropertiesKHR.set_preferredUnidirectionalCompoundReferenceNameMask(this.segment(), index, value); return this; }
    /// Sets `preferredUnidirectionalCompoundReferenceNameMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredUnidirectionalCompoundReferenceNameMask(@CType("uint32_t") int value) { VkVideoEncodeAV1QualityLevelPropertiesKHR.set_preferredUnidirectionalCompoundReferenceNameMask(this.segment(), value); return this; }

    /// {@return `preferredMaxBidirectionalCompoundReferenceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_preferredMaxBidirectionalCompoundReferenceCount(MemorySegment segment, long index) { return (int) VH_preferredMaxBidirectionalCompoundReferenceCount.get(segment, 0L, index); }
    /// {@return `preferredMaxBidirectionalCompoundReferenceCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_preferredMaxBidirectionalCompoundReferenceCount(MemorySegment segment) { return VkVideoEncodeAV1QualityLevelPropertiesKHR.get_preferredMaxBidirectionalCompoundReferenceCount(segment, 0L); }
    /// {@return `preferredMaxBidirectionalCompoundReferenceCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int preferredMaxBidirectionalCompoundReferenceCountAt(long index) { return VkVideoEncodeAV1QualityLevelPropertiesKHR.get_preferredMaxBidirectionalCompoundReferenceCount(this.segment(), index); }
    /// {@return `preferredMaxBidirectionalCompoundReferenceCount`}
    public @CType("uint32_t") int preferredMaxBidirectionalCompoundReferenceCount() { return VkVideoEncodeAV1QualityLevelPropertiesKHR.get_preferredMaxBidirectionalCompoundReferenceCount(this.segment()); }
    /// Sets `preferredMaxBidirectionalCompoundReferenceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_preferredMaxBidirectionalCompoundReferenceCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_preferredMaxBidirectionalCompoundReferenceCount.set(segment, 0L, index, value); }
    /// Sets `preferredMaxBidirectionalCompoundReferenceCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_preferredMaxBidirectionalCompoundReferenceCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeAV1QualityLevelPropertiesKHR.set_preferredMaxBidirectionalCompoundReferenceCount(segment, 0L, value); }
    /// Sets `preferredMaxBidirectionalCompoundReferenceCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredMaxBidirectionalCompoundReferenceCountAt(long index, @CType("uint32_t") int value) { VkVideoEncodeAV1QualityLevelPropertiesKHR.set_preferredMaxBidirectionalCompoundReferenceCount(this.segment(), index, value); return this; }
    /// Sets `preferredMaxBidirectionalCompoundReferenceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredMaxBidirectionalCompoundReferenceCount(@CType("uint32_t") int value) { VkVideoEncodeAV1QualityLevelPropertiesKHR.set_preferredMaxBidirectionalCompoundReferenceCount(this.segment(), value); return this; }

    /// {@return `preferredMaxBidirectionalCompoundGroup1ReferenceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_preferredMaxBidirectionalCompoundGroup1ReferenceCount(MemorySegment segment, long index) { return (int) VH_preferredMaxBidirectionalCompoundGroup1ReferenceCount.get(segment, 0L, index); }
    /// {@return `preferredMaxBidirectionalCompoundGroup1ReferenceCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_preferredMaxBidirectionalCompoundGroup1ReferenceCount(MemorySegment segment) { return VkVideoEncodeAV1QualityLevelPropertiesKHR.get_preferredMaxBidirectionalCompoundGroup1ReferenceCount(segment, 0L); }
    /// {@return `preferredMaxBidirectionalCompoundGroup1ReferenceCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int preferredMaxBidirectionalCompoundGroup1ReferenceCountAt(long index) { return VkVideoEncodeAV1QualityLevelPropertiesKHR.get_preferredMaxBidirectionalCompoundGroup1ReferenceCount(this.segment(), index); }
    /// {@return `preferredMaxBidirectionalCompoundGroup1ReferenceCount`}
    public @CType("uint32_t") int preferredMaxBidirectionalCompoundGroup1ReferenceCount() { return VkVideoEncodeAV1QualityLevelPropertiesKHR.get_preferredMaxBidirectionalCompoundGroup1ReferenceCount(this.segment()); }
    /// Sets `preferredMaxBidirectionalCompoundGroup1ReferenceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_preferredMaxBidirectionalCompoundGroup1ReferenceCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_preferredMaxBidirectionalCompoundGroup1ReferenceCount.set(segment, 0L, index, value); }
    /// Sets `preferredMaxBidirectionalCompoundGroup1ReferenceCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_preferredMaxBidirectionalCompoundGroup1ReferenceCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeAV1QualityLevelPropertiesKHR.set_preferredMaxBidirectionalCompoundGroup1ReferenceCount(segment, 0L, value); }
    /// Sets `preferredMaxBidirectionalCompoundGroup1ReferenceCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredMaxBidirectionalCompoundGroup1ReferenceCountAt(long index, @CType("uint32_t") int value) { VkVideoEncodeAV1QualityLevelPropertiesKHR.set_preferredMaxBidirectionalCompoundGroup1ReferenceCount(this.segment(), index, value); return this; }
    /// Sets `preferredMaxBidirectionalCompoundGroup1ReferenceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredMaxBidirectionalCompoundGroup1ReferenceCount(@CType("uint32_t") int value) { VkVideoEncodeAV1QualityLevelPropertiesKHR.set_preferredMaxBidirectionalCompoundGroup1ReferenceCount(this.segment(), value); return this; }

    /// {@return `preferredMaxBidirectionalCompoundGroup2ReferenceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_preferredMaxBidirectionalCompoundGroup2ReferenceCount(MemorySegment segment, long index) { return (int) VH_preferredMaxBidirectionalCompoundGroup2ReferenceCount.get(segment, 0L, index); }
    /// {@return `preferredMaxBidirectionalCompoundGroup2ReferenceCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_preferredMaxBidirectionalCompoundGroup2ReferenceCount(MemorySegment segment) { return VkVideoEncodeAV1QualityLevelPropertiesKHR.get_preferredMaxBidirectionalCompoundGroup2ReferenceCount(segment, 0L); }
    /// {@return `preferredMaxBidirectionalCompoundGroup2ReferenceCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int preferredMaxBidirectionalCompoundGroup2ReferenceCountAt(long index) { return VkVideoEncodeAV1QualityLevelPropertiesKHR.get_preferredMaxBidirectionalCompoundGroup2ReferenceCount(this.segment(), index); }
    /// {@return `preferredMaxBidirectionalCompoundGroup2ReferenceCount`}
    public @CType("uint32_t") int preferredMaxBidirectionalCompoundGroup2ReferenceCount() { return VkVideoEncodeAV1QualityLevelPropertiesKHR.get_preferredMaxBidirectionalCompoundGroup2ReferenceCount(this.segment()); }
    /// Sets `preferredMaxBidirectionalCompoundGroup2ReferenceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_preferredMaxBidirectionalCompoundGroup2ReferenceCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_preferredMaxBidirectionalCompoundGroup2ReferenceCount.set(segment, 0L, index, value); }
    /// Sets `preferredMaxBidirectionalCompoundGroup2ReferenceCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_preferredMaxBidirectionalCompoundGroup2ReferenceCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeAV1QualityLevelPropertiesKHR.set_preferredMaxBidirectionalCompoundGroup2ReferenceCount(segment, 0L, value); }
    /// Sets `preferredMaxBidirectionalCompoundGroup2ReferenceCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredMaxBidirectionalCompoundGroup2ReferenceCountAt(long index, @CType("uint32_t") int value) { VkVideoEncodeAV1QualityLevelPropertiesKHR.set_preferredMaxBidirectionalCompoundGroup2ReferenceCount(this.segment(), index, value); return this; }
    /// Sets `preferredMaxBidirectionalCompoundGroup2ReferenceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredMaxBidirectionalCompoundGroup2ReferenceCount(@CType("uint32_t") int value) { VkVideoEncodeAV1QualityLevelPropertiesKHR.set_preferredMaxBidirectionalCompoundGroup2ReferenceCount(this.segment(), value); return this; }

    /// {@return `preferredBidirectionalCompoundReferenceNameMask` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_preferredBidirectionalCompoundReferenceNameMask(MemorySegment segment, long index) { return (int) VH_preferredBidirectionalCompoundReferenceNameMask.get(segment, 0L, index); }
    /// {@return `preferredBidirectionalCompoundReferenceNameMask`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_preferredBidirectionalCompoundReferenceNameMask(MemorySegment segment) { return VkVideoEncodeAV1QualityLevelPropertiesKHR.get_preferredBidirectionalCompoundReferenceNameMask(segment, 0L); }
    /// {@return `preferredBidirectionalCompoundReferenceNameMask` at the given index}
    /// @param index the index
    public @CType("uint32_t") int preferredBidirectionalCompoundReferenceNameMaskAt(long index) { return VkVideoEncodeAV1QualityLevelPropertiesKHR.get_preferredBidirectionalCompoundReferenceNameMask(this.segment(), index); }
    /// {@return `preferredBidirectionalCompoundReferenceNameMask`}
    public @CType("uint32_t") int preferredBidirectionalCompoundReferenceNameMask() { return VkVideoEncodeAV1QualityLevelPropertiesKHR.get_preferredBidirectionalCompoundReferenceNameMask(this.segment()); }
    /// Sets `preferredBidirectionalCompoundReferenceNameMask` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_preferredBidirectionalCompoundReferenceNameMask(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_preferredBidirectionalCompoundReferenceNameMask.set(segment, 0L, index, value); }
    /// Sets `preferredBidirectionalCompoundReferenceNameMask` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_preferredBidirectionalCompoundReferenceNameMask(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeAV1QualityLevelPropertiesKHR.set_preferredBidirectionalCompoundReferenceNameMask(segment, 0L, value); }
    /// Sets `preferredBidirectionalCompoundReferenceNameMask` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredBidirectionalCompoundReferenceNameMaskAt(long index, @CType("uint32_t") int value) { VkVideoEncodeAV1QualityLevelPropertiesKHR.set_preferredBidirectionalCompoundReferenceNameMask(this.segment(), index, value); return this; }
    /// Sets `preferredBidirectionalCompoundReferenceNameMask` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QualityLevelPropertiesKHR preferredBidirectionalCompoundReferenceNameMask(@CType("uint32_t") int value) { VkVideoEncodeAV1QualityLevelPropertiesKHR.set_preferredBidirectionalCompoundReferenceNameMask(this.segment(), value); return this; }

}
