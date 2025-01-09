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
/// ### preferredIdrPeriod
/// [VarHandle][#VH_preferredIdrPeriod] - [Getter][#preferredIdrPeriod()] - [Setter][#preferredIdrPeriod(int)]
/// ### preferredConsecutiveBFrameCount
/// [VarHandle][#VH_preferredConsecutiveBFrameCount] - [Getter][#preferredConsecutiveBFrameCount()] - [Setter][#preferredConsecutiveBFrameCount(int)]
/// ### preferredTemporalLayerCount
/// [VarHandle][#VH_preferredTemporalLayerCount] - [Getter][#preferredTemporalLayerCount()] - [Setter][#preferredTemporalLayerCount(int)]
/// ### preferredConstantQp
/// [Byte offset][#OFFSET_preferredConstantQp] - [Memory layout][#ML_preferredConstantQp] - [Getter][#preferredConstantQp()] - [Setter][#preferredConstantQp(java.lang.foreign.MemorySegment)]
/// ### preferredMaxL0ReferenceCount
/// [VarHandle][#VH_preferredMaxL0ReferenceCount] - [Getter][#preferredMaxL0ReferenceCount()] - [Setter][#preferredMaxL0ReferenceCount(int)]
/// ### preferredMaxL1ReferenceCount
/// [VarHandle][#VH_preferredMaxL1ReferenceCount] - [Getter][#preferredMaxL1ReferenceCount()] - [Setter][#preferredMaxL1ReferenceCount(int)]
/// ### preferredStdEntropyCodingModeFlag
/// [VarHandle][#VH_preferredStdEntropyCodingModeFlag] - [Getter][#preferredStdEntropyCodingModeFlag()] - [Setter][#preferredStdEntropyCodingModeFlag(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoEncodeH264QualityLevelPropertiesKHR {
///     VkStructureType sType;
///     void * pNext;
///     VkVideoEncodeH264RateControlFlagsKHR preferredRateControlFlags;
///     uint32_t preferredGopFrameCount;
///     uint32_t preferredIdrPeriod;
///     uint32_t preferredConsecutiveBFrameCount;
///     uint32_t preferredTemporalLayerCount;
///     VkVideoEncodeH264QpKHR preferredConstantQp;
///     uint32_t preferredMaxL0ReferenceCount;
///     uint32_t preferredMaxL1ReferenceCount;
///     VkBool32 preferredStdEntropyCodingModeFlag;
/// } VkVideoEncodeH264QualityLevelPropertiesKHR;
/// ```
public final class VkVideoEncodeH264QualityLevelPropertiesKHR extends Struct {
    /// The struct layout of `VkVideoEncodeH264QualityLevelPropertiesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("preferredRateControlFlags"),
        ValueLayout.JAVA_INT.withName("preferredGopFrameCount"),
        ValueLayout.JAVA_INT.withName("preferredIdrPeriod"),
        ValueLayout.JAVA_INT.withName("preferredConsecutiveBFrameCount"),
        ValueLayout.JAVA_INT.withName("preferredTemporalLayerCount"),
        overrungl.vulkan.khr.struct.VkVideoEncodeH264QpKHR.LAYOUT.withName("preferredConstantQp"),
        ValueLayout.JAVA_INT.withName("preferredMaxL0ReferenceCount"),
        ValueLayout.JAVA_INT.withName("preferredMaxL1ReferenceCount"),
        ValueLayout.JAVA_INT.withName("preferredStdEntropyCodingModeFlag")
    );
    /// The [VarHandle] of `sType` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_sType = LAYOUT.arrayElementVarHandle(PathElement.groupElement("sType"));
    /// The [VarHandle] of `pNext` of type `(MemorySegment base, long baseOffset, long index)java.lang.foreign.MemorySegment`.
    public static final VarHandle VH_pNext = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNext"));
    /// The [VarHandle] of `preferredRateControlFlags` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_preferredRateControlFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredRateControlFlags"));
    /// The [VarHandle] of `preferredGopFrameCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_preferredGopFrameCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredGopFrameCount"));
    /// The [VarHandle] of `preferredIdrPeriod` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_preferredIdrPeriod = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredIdrPeriod"));
    /// The [VarHandle] of `preferredConsecutiveBFrameCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_preferredConsecutiveBFrameCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredConsecutiveBFrameCount"));
    /// The [VarHandle] of `preferredTemporalLayerCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_preferredTemporalLayerCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredTemporalLayerCount"));
    /// The byte offset of `preferredConstantQp`.
    public static final long OFFSET_preferredConstantQp = LAYOUT.byteOffset(PathElement.groupElement("preferredConstantQp"));
    /// The memory layout of `preferredConstantQp`.
    public static final MemoryLayout ML_preferredConstantQp = LAYOUT.select(PathElement.groupElement("preferredConstantQp"));
    /// The [VarHandle] of `preferredMaxL0ReferenceCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_preferredMaxL0ReferenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredMaxL0ReferenceCount"));
    /// The [VarHandle] of `preferredMaxL1ReferenceCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_preferredMaxL1ReferenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredMaxL1ReferenceCount"));
    /// The [VarHandle] of `preferredStdEntropyCodingModeFlag` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_preferredStdEntropyCodingModeFlag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredStdEntropyCodingModeFlag"));

    /// Creates `VkVideoEncodeH264QualityLevelPropertiesKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoEncodeH264QualityLevelPropertiesKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoEncodeH264QualityLevelPropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH264QualityLevelPropertiesKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH264QualityLevelPropertiesKHR(segment); }

    /// Creates `VkVideoEncodeH264QualityLevelPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH264QualityLevelPropertiesKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH264QualityLevelPropertiesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoEncodeH264QualityLevelPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH264QualityLevelPropertiesKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH264QualityLevelPropertiesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkVideoEncodeH264QualityLevelPropertiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeH264QualityLevelPropertiesKHR`
    public static VkVideoEncodeH264QualityLevelPropertiesKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH264QualityLevelPropertiesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoEncodeH264QualityLevelPropertiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeH264QualityLevelPropertiesKHR`
    public static VkVideoEncodeH264QualityLevelPropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeH264QualityLevelPropertiesKHR(allocator.allocate(LAYOUT, count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoEncodeH264QualityLevelPropertiesKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoEncodeH264QualityLevelPropertiesKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoEncodeH264QualityLevelPropertiesKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoEncodeH264QualityLevelPropertiesKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264QualityLevelPropertiesKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoEncodeH264QualityLevelPropertiesKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264QualityLevelPropertiesKHR sType(@CType("VkStructureType") int value) { VkVideoEncodeH264QualityLevelPropertiesKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkVideoEncodeH264QualityLevelPropertiesKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkVideoEncodeH264QualityLevelPropertiesKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkVideoEncodeH264QualityLevelPropertiesKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH264QualityLevelPropertiesKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264QualityLevelPropertiesKHR pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH264QualityLevelPropertiesKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264QualityLevelPropertiesKHR pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH264QualityLevelPropertiesKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `preferredRateControlFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkVideoEncodeH264RateControlFlagsKHR") int get_preferredRateControlFlags(MemorySegment segment, long index) { return (int) VH_preferredRateControlFlags.get(segment, 0L, index); }
    /// {@return `preferredRateControlFlags`}
    /// @param segment the segment of the struct
    public static @CType("VkVideoEncodeH264RateControlFlagsKHR") int get_preferredRateControlFlags(MemorySegment segment) { return VkVideoEncodeH264QualityLevelPropertiesKHR.get_preferredRateControlFlags(segment, 0L); }
    /// {@return `preferredRateControlFlags` at the given index}
    /// @param index the index
    public @CType("VkVideoEncodeH264RateControlFlagsKHR") int preferredRateControlFlagsAt(long index) { return VkVideoEncodeH264QualityLevelPropertiesKHR.get_preferredRateControlFlags(this.segment(), index); }
    /// {@return `preferredRateControlFlags`}
    public @CType("VkVideoEncodeH264RateControlFlagsKHR") int preferredRateControlFlags() { return VkVideoEncodeH264QualityLevelPropertiesKHR.get_preferredRateControlFlags(this.segment()); }
    /// Sets `preferredRateControlFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_preferredRateControlFlags(MemorySegment segment, long index, @CType("VkVideoEncodeH264RateControlFlagsKHR") int value) { VH_preferredRateControlFlags.set(segment, 0L, index, value); }
    /// Sets `preferredRateControlFlags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_preferredRateControlFlags(MemorySegment segment, @CType("VkVideoEncodeH264RateControlFlagsKHR") int value) { VkVideoEncodeH264QualityLevelPropertiesKHR.set_preferredRateControlFlags(segment, 0L, value); }
    /// Sets `preferredRateControlFlags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264QualityLevelPropertiesKHR preferredRateControlFlagsAt(long index, @CType("VkVideoEncodeH264RateControlFlagsKHR") int value) { VkVideoEncodeH264QualityLevelPropertiesKHR.set_preferredRateControlFlags(this.segment(), index, value); return this; }
    /// Sets `preferredRateControlFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264QualityLevelPropertiesKHR preferredRateControlFlags(@CType("VkVideoEncodeH264RateControlFlagsKHR") int value) { VkVideoEncodeH264QualityLevelPropertiesKHR.set_preferredRateControlFlags(this.segment(), value); return this; }

    /// {@return `preferredGopFrameCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_preferredGopFrameCount(MemorySegment segment, long index) { return (int) VH_preferredGopFrameCount.get(segment, 0L, index); }
    /// {@return `preferredGopFrameCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_preferredGopFrameCount(MemorySegment segment) { return VkVideoEncodeH264QualityLevelPropertiesKHR.get_preferredGopFrameCount(segment, 0L); }
    /// {@return `preferredGopFrameCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int preferredGopFrameCountAt(long index) { return VkVideoEncodeH264QualityLevelPropertiesKHR.get_preferredGopFrameCount(this.segment(), index); }
    /// {@return `preferredGopFrameCount`}
    public @CType("uint32_t") int preferredGopFrameCount() { return VkVideoEncodeH264QualityLevelPropertiesKHR.get_preferredGopFrameCount(this.segment()); }
    /// Sets `preferredGopFrameCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_preferredGopFrameCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_preferredGopFrameCount.set(segment, 0L, index, value); }
    /// Sets `preferredGopFrameCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_preferredGopFrameCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeH264QualityLevelPropertiesKHR.set_preferredGopFrameCount(segment, 0L, value); }
    /// Sets `preferredGopFrameCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264QualityLevelPropertiesKHR preferredGopFrameCountAt(long index, @CType("uint32_t") int value) { VkVideoEncodeH264QualityLevelPropertiesKHR.set_preferredGopFrameCount(this.segment(), index, value); return this; }
    /// Sets `preferredGopFrameCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264QualityLevelPropertiesKHR preferredGopFrameCount(@CType("uint32_t") int value) { VkVideoEncodeH264QualityLevelPropertiesKHR.set_preferredGopFrameCount(this.segment(), value); return this; }

    /// {@return `preferredIdrPeriod` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_preferredIdrPeriod(MemorySegment segment, long index) { return (int) VH_preferredIdrPeriod.get(segment, 0L, index); }
    /// {@return `preferredIdrPeriod`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_preferredIdrPeriod(MemorySegment segment) { return VkVideoEncodeH264QualityLevelPropertiesKHR.get_preferredIdrPeriod(segment, 0L); }
    /// {@return `preferredIdrPeriod` at the given index}
    /// @param index the index
    public @CType("uint32_t") int preferredIdrPeriodAt(long index) { return VkVideoEncodeH264QualityLevelPropertiesKHR.get_preferredIdrPeriod(this.segment(), index); }
    /// {@return `preferredIdrPeriod`}
    public @CType("uint32_t") int preferredIdrPeriod() { return VkVideoEncodeH264QualityLevelPropertiesKHR.get_preferredIdrPeriod(this.segment()); }
    /// Sets `preferredIdrPeriod` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_preferredIdrPeriod(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_preferredIdrPeriod.set(segment, 0L, index, value); }
    /// Sets `preferredIdrPeriod` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_preferredIdrPeriod(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeH264QualityLevelPropertiesKHR.set_preferredIdrPeriod(segment, 0L, value); }
    /// Sets `preferredIdrPeriod` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264QualityLevelPropertiesKHR preferredIdrPeriodAt(long index, @CType("uint32_t") int value) { VkVideoEncodeH264QualityLevelPropertiesKHR.set_preferredIdrPeriod(this.segment(), index, value); return this; }
    /// Sets `preferredIdrPeriod` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264QualityLevelPropertiesKHR preferredIdrPeriod(@CType("uint32_t") int value) { VkVideoEncodeH264QualityLevelPropertiesKHR.set_preferredIdrPeriod(this.segment(), value); return this; }

    /// {@return `preferredConsecutiveBFrameCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_preferredConsecutiveBFrameCount(MemorySegment segment, long index) { return (int) VH_preferredConsecutiveBFrameCount.get(segment, 0L, index); }
    /// {@return `preferredConsecutiveBFrameCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_preferredConsecutiveBFrameCount(MemorySegment segment) { return VkVideoEncodeH264QualityLevelPropertiesKHR.get_preferredConsecutiveBFrameCount(segment, 0L); }
    /// {@return `preferredConsecutiveBFrameCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int preferredConsecutiveBFrameCountAt(long index) { return VkVideoEncodeH264QualityLevelPropertiesKHR.get_preferredConsecutiveBFrameCount(this.segment(), index); }
    /// {@return `preferredConsecutiveBFrameCount`}
    public @CType("uint32_t") int preferredConsecutiveBFrameCount() { return VkVideoEncodeH264QualityLevelPropertiesKHR.get_preferredConsecutiveBFrameCount(this.segment()); }
    /// Sets `preferredConsecutiveBFrameCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_preferredConsecutiveBFrameCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_preferredConsecutiveBFrameCount.set(segment, 0L, index, value); }
    /// Sets `preferredConsecutiveBFrameCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_preferredConsecutiveBFrameCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeH264QualityLevelPropertiesKHR.set_preferredConsecutiveBFrameCount(segment, 0L, value); }
    /// Sets `preferredConsecutiveBFrameCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264QualityLevelPropertiesKHR preferredConsecutiveBFrameCountAt(long index, @CType("uint32_t") int value) { VkVideoEncodeH264QualityLevelPropertiesKHR.set_preferredConsecutiveBFrameCount(this.segment(), index, value); return this; }
    /// Sets `preferredConsecutiveBFrameCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264QualityLevelPropertiesKHR preferredConsecutiveBFrameCount(@CType("uint32_t") int value) { VkVideoEncodeH264QualityLevelPropertiesKHR.set_preferredConsecutiveBFrameCount(this.segment(), value); return this; }

    /// {@return `preferredTemporalLayerCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_preferredTemporalLayerCount(MemorySegment segment, long index) { return (int) VH_preferredTemporalLayerCount.get(segment, 0L, index); }
    /// {@return `preferredTemporalLayerCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_preferredTemporalLayerCount(MemorySegment segment) { return VkVideoEncodeH264QualityLevelPropertiesKHR.get_preferredTemporalLayerCount(segment, 0L); }
    /// {@return `preferredTemporalLayerCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int preferredTemporalLayerCountAt(long index) { return VkVideoEncodeH264QualityLevelPropertiesKHR.get_preferredTemporalLayerCount(this.segment(), index); }
    /// {@return `preferredTemporalLayerCount`}
    public @CType("uint32_t") int preferredTemporalLayerCount() { return VkVideoEncodeH264QualityLevelPropertiesKHR.get_preferredTemporalLayerCount(this.segment()); }
    /// Sets `preferredTemporalLayerCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_preferredTemporalLayerCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_preferredTemporalLayerCount.set(segment, 0L, index, value); }
    /// Sets `preferredTemporalLayerCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_preferredTemporalLayerCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeH264QualityLevelPropertiesKHR.set_preferredTemporalLayerCount(segment, 0L, value); }
    /// Sets `preferredTemporalLayerCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264QualityLevelPropertiesKHR preferredTemporalLayerCountAt(long index, @CType("uint32_t") int value) { VkVideoEncodeH264QualityLevelPropertiesKHR.set_preferredTemporalLayerCount(this.segment(), index, value); return this; }
    /// Sets `preferredTemporalLayerCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264QualityLevelPropertiesKHR preferredTemporalLayerCount(@CType("uint32_t") int value) { VkVideoEncodeH264QualityLevelPropertiesKHR.set_preferredTemporalLayerCount(this.segment(), value); return this; }

    /// {@return `preferredConstantQp` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkVideoEncodeH264QpKHR") java.lang.foreign.MemorySegment get_preferredConstantQp(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_preferredConstantQp, index), ML_preferredConstantQp); }
    /// {@return `preferredConstantQp`}
    /// @param segment the segment of the struct
    public static @CType("VkVideoEncodeH264QpKHR") java.lang.foreign.MemorySegment get_preferredConstantQp(MemorySegment segment) { return VkVideoEncodeH264QualityLevelPropertiesKHR.get_preferredConstantQp(segment, 0L); }
    /// {@return `preferredConstantQp` at the given index}
    /// @param index the index
    public @CType("VkVideoEncodeH264QpKHR") java.lang.foreign.MemorySegment preferredConstantQpAt(long index) { return VkVideoEncodeH264QualityLevelPropertiesKHR.get_preferredConstantQp(this.segment(), index); }
    /// {@return `preferredConstantQp`}
    public @CType("VkVideoEncodeH264QpKHR") java.lang.foreign.MemorySegment preferredConstantQp() { return VkVideoEncodeH264QualityLevelPropertiesKHR.get_preferredConstantQp(this.segment()); }
    /// Sets `preferredConstantQp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_preferredConstantQp(MemorySegment segment, long index, @CType("VkVideoEncodeH264QpKHR") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_preferredConstantQp, index), ML_preferredConstantQp.byteSize()); }
    /// Sets `preferredConstantQp` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_preferredConstantQp(MemorySegment segment, @CType("VkVideoEncodeH264QpKHR") java.lang.foreign.MemorySegment value) { VkVideoEncodeH264QualityLevelPropertiesKHR.set_preferredConstantQp(segment, 0L, value); }
    /// Sets `preferredConstantQp` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264QualityLevelPropertiesKHR preferredConstantQpAt(long index, @CType("VkVideoEncodeH264QpKHR") java.lang.foreign.MemorySegment value) { VkVideoEncodeH264QualityLevelPropertiesKHR.set_preferredConstantQp(this.segment(), index, value); return this; }
    /// Sets `preferredConstantQp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264QualityLevelPropertiesKHR preferredConstantQp(@CType("VkVideoEncodeH264QpKHR") java.lang.foreign.MemorySegment value) { VkVideoEncodeH264QualityLevelPropertiesKHR.set_preferredConstantQp(this.segment(), value); return this; }

    /// {@return `preferredMaxL0ReferenceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_preferredMaxL0ReferenceCount(MemorySegment segment, long index) { return (int) VH_preferredMaxL0ReferenceCount.get(segment, 0L, index); }
    /// {@return `preferredMaxL0ReferenceCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_preferredMaxL0ReferenceCount(MemorySegment segment) { return VkVideoEncodeH264QualityLevelPropertiesKHR.get_preferredMaxL0ReferenceCount(segment, 0L); }
    /// {@return `preferredMaxL0ReferenceCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int preferredMaxL0ReferenceCountAt(long index) { return VkVideoEncodeH264QualityLevelPropertiesKHR.get_preferredMaxL0ReferenceCount(this.segment(), index); }
    /// {@return `preferredMaxL0ReferenceCount`}
    public @CType("uint32_t") int preferredMaxL0ReferenceCount() { return VkVideoEncodeH264QualityLevelPropertiesKHR.get_preferredMaxL0ReferenceCount(this.segment()); }
    /// Sets `preferredMaxL0ReferenceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_preferredMaxL0ReferenceCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_preferredMaxL0ReferenceCount.set(segment, 0L, index, value); }
    /// Sets `preferredMaxL0ReferenceCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_preferredMaxL0ReferenceCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeH264QualityLevelPropertiesKHR.set_preferredMaxL0ReferenceCount(segment, 0L, value); }
    /// Sets `preferredMaxL0ReferenceCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264QualityLevelPropertiesKHR preferredMaxL0ReferenceCountAt(long index, @CType("uint32_t") int value) { VkVideoEncodeH264QualityLevelPropertiesKHR.set_preferredMaxL0ReferenceCount(this.segment(), index, value); return this; }
    /// Sets `preferredMaxL0ReferenceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264QualityLevelPropertiesKHR preferredMaxL0ReferenceCount(@CType("uint32_t") int value) { VkVideoEncodeH264QualityLevelPropertiesKHR.set_preferredMaxL0ReferenceCount(this.segment(), value); return this; }

    /// {@return `preferredMaxL1ReferenceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_preferredMaxL1ReferenceCount(MemorySegment segment, long index) { return (int) VH_preferredMaxL1ReferenceCount.get(segment, 0L, index); }
    /// {@return `preferredMaxL1ReferenceCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_preferredMaxL1ReferenceCount(MemorySegment segment) { return VkVideoEncodeH264QualityLevelPropertiesKHR.get_preferredMaxL1ReferenceCount(segment, 0L); }
    /// {@return `preferredMaxL1ReferenceCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int preferredMaxL1ReferenceCountAt(long index) { return VkVideoEncodeH264QualityLevelPropertiesKHR.get_preferredMaxL1ReferenceCount(this.segment(), index); }
    /// {@return `preferredMaxL1ReferenceCount`}
    public @CType("uint32_t") int preferredMaxL1ReferenceCount() { return VkVideoEncodeH264QualityLevelPropertiesKHR.get_preferredMaxL1ReferenceCount(this.segment()); }
    /// Sets `preferredMaxL1ReferenceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_preferredMaxL1ReferenceCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_preferredMaxL1ReferenceCount.set(segment, 0L, index, value); }
    /// Sets `preferredMaxL1ReferenceCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_preferredMaxL1ReferenceCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeH264QualityLevelPropertiesKHR.set_preferredMaxL1ReferenceCount(segment, 0L, value); }
    /// Sets `preferredMaxL1ReferenceCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264QualityLevelPropertiesKHR preferredMaxL1ReferenceCountAt(long index, @CType("uint32_t") int value) { VkVideoEncodeH264QualityLevelPropertiesKHR.set_preferredMaxL1ReferenceCount(this.segment(), index, value); return this; }
    /// Sets `preferredMaxL1ReferenceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264QualityLevelPropertiesKHR preferredMaxL1ReferenceCount(@CType("uint32_t") int value) { VkVideoEncodeH264QualityLevelPropertiesKHR.set_preferredMaxL1ReferenceCount(this.segment(), value); return this; }

    /// {@return `preferredStdEntropyCodingModeFlag` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkBool32") int get_preferredStdEntropyCodingModeFlag(MemorySegment segment, long index) { return (int) VH_preferredStdEntropyCodingModeFlag.get(segment, 0L, index); }
    /// {@return `preferredStdEntropyCodingModeFlag`}
    /// @param segment the segment of the struct
    public static @CType("VkBool32") int get_preferredStdEntropyCodingModeFlag(MemorySegment segment) { return VkVideoEncodeH264QualityLevelPropertiesKHR.get_preferredStdEntropyCodingModeFlag(segment, 0L); }
    /// {@return `preferredStdEntropyCodingModeFlag` at the given index}
    /// @param index the index
    public @CType("VkBool32") int preferredStdEntropyCodingModeFlagAt(long index) { return VkVideoEncodeH264QualityLevelPropertiesKHR.get_preferredStdEntropyCodingModeFlag(this.segment(), index); }
    /// {@return `preferredStdEntropyCodingModeFlag`}
    public @CType("VkBool32") int preferredStdEntropyCodingModeFlag() { return VkVideoEncodeH264QualityLevelPropertiesKHR.get_preferredStdEntropyCodingModeFlag(this.segment()); }
    /// Sets `preferredStdEntropyCodingModeFlag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_preferredStdEntropyCodingModeFlag(MemorySegment segment, long index, @CType("VkBool32") int value) { VH_preferredStdEntropyCodingModeFlag.set(segment, 0L, index, value); }
    /// Sets `preferredStdEntropyCodingModeFlag` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_preferredStdEntropyCodingModeFlag(MemorySegment segment, @CType("VkBool32") int value) { VkVideoEncodeH264QualityLevelPropertiesKHR.set_preferredStdEntropyCodingModeFlag(segment, 0L, value); }
    /// Sets `preferredStdEntropyCodingModeFlag` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264QualityLevelPropertiesKHR preferredStdEntropyCodingModeFlagAt(long index, @CType("VkBool32") int value) { VkVideoEncodeH264QualityLevelPropertiesKHR.set_preferredStdEntropyCodingModeFlag(this.segment(), index, value); return this; }
    /// Sets `preferredStdEntropyCodingModeFlag` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264QualityLevelPropertiesKHR preferredStdEntropyCodingModeFlag(@CType("VkBool32") int value) { VkVideoEncodeH264QualityLevelPropertiesKHR.set_preferredStdEntropyCodingModeFlag(this.segment(), value); return this; }

}
