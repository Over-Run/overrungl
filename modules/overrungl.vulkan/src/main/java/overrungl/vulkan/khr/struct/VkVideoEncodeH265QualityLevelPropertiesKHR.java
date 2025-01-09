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
/// ### preferredSubLayerCount
/// [VarHandle][#VH_preferredSubLayerCount] - [Getter][#preferredSubLayerCount()] - [Setter][#preferredSubLayerCount(int)]
/// ### preferredConstantQp
/// [Byte offset][#OFFSET_preferredConstantQp] - [Memory layout][#ML_preferredConstantQp] - [Getter][#preferredConstantQp()] - [Setter][#preferredConstantQp(java.lang.foreign.MemorySegment)]
/// ### preferredMaxL0ReferenceCount
/// [VarHandle][#VH_preferredMaxL0ReferenceCount] - [Getter][#preferredMaxL0ReferenceCount()] - [Setter][#preferredMaxL0ReferenceCount(int)]
/// ### preferredMaxL1ReferenceCount
/// [VarHandle][#VH_preferredMaxL1ReferenceCount] - [Getter][#preferredMaxL1ReferenceCount()] - [Setter][#preferredMaxL1ReferenceCount(int)]
/// ## Layout
/// [Java definition][#LAYOUT]
/// ```c
/// typedef struct VkVideoEncodeH265QualityLevelPropertiesKHR {
///     VkStructureType sType;
///     void * pNext;
///     VkVideoEncodeH265RateControlFlagsKHR preferredRateControlFlags;
///     uint32_t preferredGopFrameCount;
///     uint32_t preferredIdrPeriod;
///     uint32_t preferredConsecutiveBFrameCount;
///     uint32_t preferredSubLayerCount;
///     VkVideoEncodeH265QpKHR preferredConstantQp;
///     uint32_t preferredMaxL0ReferenceCount;
///     uint32_t preferredMaxL1ReferenceCount;
/// } VkVideoEncodeH265QualityLevelPropertiesKHR;
/// ```
public final class VkVideoEncodeH265QualityLevelPropertiesKHR extends Struct {
    /// The struct layout of `VkVideoEncodeH265QualityLevelPropertiesKHR`.
    public static final StructLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("preferredRateControlFlags"),
        ValueLayout.JAVA_INT.withName("preferredGopFrameCount"),
        ValueLayout.JAVA_INT.withName("preferredIdrPeriod"),
        ValueLayout.JAVA_INT.withName("preferredConsecutiveBFrameCount"),
        ValueLayout.JAVA_INT.withName("preferredSubLayerCount"),
        overrungl.vulkan.khr.struct.VkVideoEncodeH265QpKHR.LAYOUT.withName("preferredConstantQp"),
        ValueLayout.JAVA_INT.withName("preferredMaxL0ReferenceCount"),
        ValueLayout.JAVA_INT.withName("preferredMaxL1ReferenceCount")
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
    /// The [VarHandle] of `preferredSubLayerCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_preferredSubLayerCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredSubLayerCount"));
    /// The byte offset of `preferredConstantQp`.
    public static final long OFFSET_preferredConstantQp = LAYOUT.byteOffset(PathElement.groupElement("preferredConstantQp"));
    /// The memory layout of `preferredConstantQp`.
    public static final MemoryLayout ML_preferredConstantQp = LAYOUT.select(PathElement.groupElement("preferredConstantQp"));
    /// The [VarHandle] of `preferredMaxL0ReferenceCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_preferredMaxL0ReferenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredMaxL0ReferenceCount"));
    /// The [VarHandle] of `preferredMaxL1ReferenceCount` of type `(MemorySegment base, long baseOffset, long index)int`.
    public static final VarHandle VH_preferredMaxL1ReferenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredMaxL1ReferenceCount"));

    /// Creates `VkVideoEncodeH265QualityLevelPropertiesKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoEncodeH265QualityLevelPropertiesKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoEncodeH265QualityLevelPropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH265QualityLevelPropertiesKHR of(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH265QualityLevelPropertiesKHR(segment); }

    /// Creates `VkVideoEncodeH265QualityLevelPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH265QualityLevelPropertiesKHR ofNative(MemorySegment segment) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH265QualityLevelPropertiesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoEncodeH265QualityLevelPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH265QualityLevelPropertiesKHR ofNative(MemorySegment segment, long count) { return Unmarshal.isNullPointer(segment) ? null : new VkVideoEncodeH265QualityLevelPropertiesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment); }

    /// Allocates a `VkVideoEncodeH265QualityLevelPropertiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeH265QualityLevelPropertiesKHR`
    public static VkVideoEncodeH265QualityLevelPropertiesKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH265QualityLevelPropertiesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoEncodeH265QualityLevelPropertiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeH265QualityLevelPropertiesKHR`
    public static VkVideoEncodeH265QualityLevelPropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeH265QualityLevelPropertiesKHR(allocator.allocate(LAYOUT, count)); }

    /// Creates a slice of `VkVideoEncodeH265QualityLevelPropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVideoEncodeH265QualityLevelPropertiesKHR`
    public VkVideoEncodeH265QualityLevelPropertiesKHR asSlice(long index) { return new VkVideoEncodeH265QualityLevelPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

    /// Creates a slice of `VkVideoEncodeH265QualityLevelPropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVideoEncodeH265QualityLevelPropertiesKHR`
    public VkVideoEncodeH265QualityLevelPropertiesKHR asSlice(long index, long count) { return new VkVideoEncodeH265QualityLevelPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count)); }

    /// {@return `sType` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkStructureType") int get_sType(MemorySegment segment, long index) { return (int) VH_sType.get(segment, 0L, index); }
    /// {@return `sType`}
    /// @param segment the segment of the struct
    public static @CType("VkStructureType") int get_sType(MemorySegment segment) { return VkVideoEncodeH265QualityLevelPropertiesKHR.get_sType(segment, 0L); }
    /// {@return `sType` at the given index}
    /// @param index the index
    public @CType("VkStructureType") int sTypeAt(long index) { return VkVideoEncodeH265QualityLevelPropertiesKHR.get_sType(this.segment(), index); }
    /// {@return `sType`}
    public @CType("VkStructureType") int sType() { return VkVideoEncodeH265QualityLevelPropertiesKHR.get_sType(this.segment()); }
    /// Sets `sType` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_sType(MemorySegment segment, long index, @CType("VkStructureType") int value) { VH_sType.set(segment, 0L, index, value); }
    /// Sets `sType` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_sType(MemorySegment segment, @CType("VkStructureType") int value) { VkVideoEncodeH265QualityLevelPropertiesKHR.set_sType(segment, 0L, value); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265QualityLevelPropertiesKHR sTypeAt(long index, @CType("VkStructureType") int value) { VkVideoEncodeH265QualityLevelPropertiesKHR.set_sType(this.segment(), index, value); return this; }
    /// Sets `sType` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265QualityLevelPropertiesKHR sType(@CType("VkStructureType") int value) { VkVideoEncodeH265QualityLevelPropertiesKHR.set_sType(this.segment(), value); return this; }

    /// {@return `pNext` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment, long index) { return (java.lang.foreign.MemorySegment) VH_pNext.get(segment, 0L, index); }
    /// {@return `pNext`}
    /// @param segment the segment of the struct
    public static @CType("void *") java.lang.foreign.MemorySegment get_pNext(MemorySegment segment) { return VkVideoEncodeH265QualityLevelPropertiesKHR.get_pNext(segment, 0L); }
    /// {@return `pNext` at the given index}
    /// @param index the index
    public @CType("void *") java.lang.foreign.MemorySegment pNextAt(long index) { return VkVideoEncodeH265QualityLevelPropertiesKHR.get_pNext(this.segment(), index); }
    /// {@return `pNext`}
    public @CType("void *") java.lang.foreign.MemorySegment pNext() { return VkVideoEncodeH265QualityLevelPropertiesKHR.get_pNext(this.segment()); }
    /// Sets `pNext` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, long index, @CType("void *") java.lang.foreign.MemorySegment value) { VH_pNext.set(segment, 0L, index, value); }
    /// Sets `pNext` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_pNext(MemorySegment segment, @CType("void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH265QualityLevelPropertiesKHR.set_pNext(segment, 0L, value); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265QualityLevelPropertiesKHR pNextAt(long index, @CType("void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH265QualityLevelPropertiesKHR.set_pNext(this.segment(), index, value); return this; }
    /// Sets `pNext` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265QualityLevelPropertiesKHR pNext(@CType("void *") java.lang.foreign.MemorySegment value) { VkVideoEncodeH265QualityLevelPropertiesKHR.set_pNext(this.segment(), value); return this; }

    /// {@return `preferredRateControlFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkVideoEncodeH265RateControlFlagsKHR") int get_preferredRateControlFlags(MemorySegment segment, long index) { return (int) VH_preferredRateControlFlags.get(segment, 0L, index); }
    /// {@return `preferredRateControlFlags`}
    /// @param segment the segment of the struct
    public static @CType("VkVideoEncodeH265RateControlFlagsKHR") int get_preferredRateControlFlags(MemorySegment segment) { return VkVideoEncodeH265QualityLevelPropertiesKHR.get_preferredRateControlFlags(segment, 0L); }
    /// {@return `preferredRateControlFlags` at the given index}
    /// @param index the index
    public @CType("VkVideoEncodeH265RateControlFlagsKHR") int preferredRateControlFlagsAt(long index) { return VkVideoEncodeH265QualityLevelPropertiesKHR.get_preferredRateControlFlags(this.segment(), index); }
    /// {@return `preferredRateControlFlags`}
    public @CType("VkVideoEncodeH265RateControlFlagsKHR") int preferredRateControlFlags() { return VkVideoEncodeH265QualityLevelPropertiesKHR.get_preferredRateControlFlags(this.segment()); }
    /// Sets `preferredRateControlFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_preferredRateControlFlags(MemorySegment segment, long index, @CType("VkVideoEncodeH265RateControlFlagsKHR") int value) { VH_preferredRateControlFlags.set(segment, 0L, index, value); }
    /// Sets `preferredRateControlFlags` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_preferredRateControlFlags(MemorySegment segment, @CType("VkVideoEncodeH265RateControlFlagsKHR") int value) { VkVideoEncodeH265QualityLevelPropertiesKHR.set_preferredRateControlFlags(segment, 0L, value); }
    /// Sets `preferredRateControlFlags` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265QualityLevelPropertiesKHR preferredRateControlFlagsAt(long index, @CType("VkVideoEncodeH265RateControlFlagsKHR") int value) { VkVideoEncodeH265QualityLevelPropertiesKHR.set_preferredRateControlFlags(this.segment(), index, value); return this; }
    /// Sets `preferredRateControlFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265QualityLevelPropertiesKHR preferredRateControlFlags(@CType("VkVideoEncodeH265RateControlFlagsKHR") int value) { VkVideoEncodeH265QualityLevelPropertiesKHR.set_preferredRateControlFlags(this.segment(), value); return this; }

    /// {@return `preferredGopFrameCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_preferredGopFrameCount(MemorySegment segment, long index) { return (int) VH_preferredGopFrameCount.get(segment, 0L, index); }
    /// {@return `preferredGopFrameCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_preferredGopFrameCount(MemorySegment segment) { return VkVideoEncodeH265QualityLevelPropertiesKHR.get_preferredGopFrameCount(segment, 0L); }
    /// {@return `preferredGopFrameCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int preferredGopFrameCountAt(long index) { return VkVideoEncodeH265QualityLevelPropertiesKHR.get_preferredGopFrameCount(this.segment(), index); }
    /// {@return `preferredGopFrameCount`}
    public @CType("uint32_t") int preferredGopFrameCount() { return VkVideoEncodeH265QualityLevelPropertiesKHR.get_preferredGopFrameCount(this.segment()); }
    /// Sets `preferredGopFrameCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_preferredGopFrameCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_preferredGopFrameCount.set(segment, 0L, index, value); }
    /// Sets `preferredGopFrameCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_preferredGopFrameCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeH265QualityLevelPropertiesKHR.set_preferredGopFrameCount(segment, 0L, value); }
    /// Sets `preferredGopFrameCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265QualityLevelPropertiesKHR preferredGopFrameCountAt(long index, @CType("uint32_t") int value) { VkVideoEncodeH265QualityLevelPropertiesKHR.set_preferredGopFrameCount(this.segment(), index, value); return this; }
    /// Sets `preferredGopFrameCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265QualityLevelPropertiesKHR preferredGopFrameCount(@CType("uint32_t") int value) { VkVideoEncodeH265QualityLevelPropertiesKHR.set_preferredGopFrameCount(this.segment(), value); return this; }

    /// {@return `preferredIdrPeriod` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_preferredIdrPeriod(MemorySegment segment, long index) { return (int) VH_preferredIdrPeriod.get(segment, 0L, index); }
    /// {@return `preferredIdrPeriod`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_preferredIdrPeriod(MemorySegment segment) { return VkVideoEncodeH265QualityLevelPropertiesKHR.get_preferredIdrPeriod(segment, 0L); }
    /// {@return `preferredIdrPeriod` at the given index}
    /// @param index the index
    public @CType("uint32_t") int preferredIdrPeriodAt(long index) { return VkVideoEncodeH265QualityLevelPropertiesKHR.get_preferredIdrPeriod(this.segment(), index); }
    /// {@return `preferredIdrPeriod`}
    public @CType("uint32_t") int preferredIdrPeriod() { return VkVideoEncodeH265QualityLevelPropertiesKHR.get_preferredIdrPeriod(this.segment()); }
    /// Sets `preferredIdrPeriod` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_preferredIdrPeriod(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_preferredIdrPeriod.set(segment, 0L, index, value); }
    /// Sets `preferredIdrPeriod` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_preferredIdrPeriod(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeH265QualityLevelPropertiesKHR.set_preferredIdrPeriod(segment, 0L, value); }
    /// Sets `preferredIdrPeriod` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265QualityLevelPropertiesKHR preferredIdrPeriodAt(long index, @CType("uint32_t") int value) { VkVideoEncodeH265QualityLevelPropertiesKHR.set_preferredIdrPeriod(this.segment(), index, value); return this; }
    /// Sets `preferredIdrPeriod` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265QualityLevelPropertiesKHR preferredIdrPeriod(@CType("uint32_t") int value) { VkVideoEncodeH265QualityLevelPropertiesKHR.set_preferredIdrPeriod(this.segment(), value); return this; }

    /// {@return `preferredConsecutiveBFrameCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_preferredConsecutiveBFrameCount(MemorySegment segment, long index) { return (int) VH_preferredConsecutiveBFrameCount.get(segment, 0L, index); }
    /// {@return `preferredConsecutiveBFrameCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_preferredConsecutiveBFrameCount(MemorySegment segment) { return VkVideoEncodeH265QualityLevelPropertiesKHR.get_preferredConsecutiveBFrameCount(segment, 0L); }
    /// {@return `preferredConsecutiveBFrameCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int preferredConsecutiveBFrameCountAt(long index) { return VkVideoEncodeH265QualityLevelPropertiesKHR.get_preferredConsecutiveBFrameCount(this.segment(), index); }
    /// {@return `preferredConsecutiveBFrameCount`}
    public @CType("uint32_t") int preferredConsecutiveBFrameCount() { return VkVideoEncodeH265QualityLevelPropertiesKHR.get_preferredConsecutiveBFrameCount(this.segment()); }
    /// Sets `preferredConsecutiveBFrameCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_preferredConsecutiveBFrameCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_preferredConsecutiveBFrameCount.set(segment, 0L, index, value); }
    /// Sets `preferredConsecutiveBFrameCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_preferredConsecutiveBFrameCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeH265QualityLevelPropertiesKHR.set_preferredConsecutiveBFrameCount(segment, 0L, value); }
    /// Sets `preferredConsecutiveBFrameCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265QualityLevelPropertiesKHR preferredConsecutiveBFrameCountAt(long index, @CType("uint32_t") int value) { VkVideoEncodeH265QualityLevelPropertiesKHR.set_preferredConsecutiveBFrameCount(this.segment(), index, value); return this; }
    /// Sets `preferredConsecutiveBFrameCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265QualityLevelPropertiesKHR preferredConsecutiveBFrameCount(@CType("uint32_t") int value) { VkVideoEncodeH265QualityLevelPropertiesKHR.set_preferredConsecutiveBFrameCount(this.segment(), value); return this; }

    /// {@return `preferredSubLayerCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_preferredSubLayerCount(MemorySegment segment, long index) { return (int) VH_preferredSubLayerCount.get(segment, 0L, index); }
    /// {@return `preferredSubLayerCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_preferredSubLayerCount(MemorySegment segment) { return VkVideoEncodeH265QualityLevelPropertiesKHR.get_preferredSubLayerCount(segment, 0L); }
    /// {@return `preferredSubLayerCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int preferredSubLayerCountAt(long index) { return VkVideoEncodeH265QualityLevelPropertiesKHR.get_preferredSubLayerCount(this.segment(), index); }
    /// {@return `preferredSubLayerCount`}
    public @CType("uint32_t") int preferredSubLayerCount() { return VkVideoEncodeH265QualityLevelPropertiesKHR.get_preferredSubLayerCount(this.segment()); }
    /// Sets `preferredSubLayerCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_preferredSubLayerCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_preferredSubLayerCount.set(segment, 0L, index, value); }
    /// Sets `preferredSubLayerCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_preferredSubLayerCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeH265QualityLevelPropertiesKHR.set_preferredSubLayerCount(segment, 0L, value); }
    /// Sets `preferredSubLayerCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265QualityLevelPropertiesKHR preferredSubLayerCountAt(long index, @CType("uint32_t") int value) { VkVideoEncodeH265QualityLevelPropertiesKHR.set_preferredSubLayerCount(this.segment(), index, value); return this; }
    /// Sets `preferredSubLayerCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265QualityLevelPropertiesKHR preferredSubLayerCount(@CType("uint32_t") int value) { VkVideoEncodeH265QualityLevelPropertiesKHR.set_preferredSubLayerCount(this.segment(), value); return this; }

    /// {@return `preferredConstantQp` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("VkVideoEncodeH265QpKHR") java.lang.foreign.MemorySegment get_preferredConstantQp(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_preferredConstantQp, index), ML_preferredConstantQp); }
    /// {@return `preferredConstantQp`}
    /// @param segment the segment of the struct
    public static @CType("VkVideoEncodeH265QpKHR") java.lang.foreign.MemorySegment get_preferredConstantQp(MemorySegment segment) { return VkVideoEncodeH265QualityLevelPropertiesKHR.get_preferredConstantQp(segment, 0L); }
    /// {@return `preferredConstantQp` at the given index}
    /// @param index the index
    public @CType("VkVideoEncodeH265QpKHR") java.lang.foreign.MemorySegment preferredConstantQpAt(long index) { return VkVideoEncodeH265QualityLevelPropertiesKHR.get_preferredConstantQp(this.segment(), index); }
    /// {@return `preferredConstantQp`}
    public @CType("VkVideoEncodeH265QpKHR") java.lang.foreign.MemorySegment preferredConstantQp() { return VkVideoEncodeH265QualityLevelPropertiesKHR.get_preferredConstantQp(this.segment()); }
    /// Sets `preferredConstantQp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_preferredConstantQp(MemorySegment segment, long index, @CType("VkVideoEncodeH265QpKHR") java.lang.foreign.MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_preferredConstantQp, index), ML_preferredConstantQp.byteSize()); }
    /// Sets `preferredConstantQp` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_preferredConstantQp(MemorySegment segment, @CType("VkVideoEncodeH265QpKHR") java.lang.foreign.MemorySegment value) { VkVideoEncodeH265QualityLevelPropertiesKHR.set_preferredConstantQp(segment, 0L, value); }
    /// Sets `preferredConstantQp` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265QualityLevelPropertiesKHR preferredConstantQpAt(long index, @CType("VkVideoEncodeH265QpKHR") java.lang.foreign.MemorySegment value) { VkVideoEncodeH265QualityLevelPropertiesKHR.set_preferredConstantQp(this.segment(), index, value); return this; }
    /// Sets `preferredConstantQp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265QualityLevelPropertiesKHR preferredConstantQp(@CType("VkVideoEncodeH265QpKHR") java.lang.foreign.MemorySegment value) { VkVideoEncodeH265QualityLevelPropertiesKHR.set_preferredConstantQp(this.segment(), value); return this; }

    /// {@return `preferredMaxL0ReferenceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_preferredMaxL0ReferenceCount(MemorySegment segment, long index) { return (int) VH_preferredMaxL0ReferenceCount.get(segment, 0L, index); }
    /// {@return `preferredMaxL0ReferenceCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_preferredMaxL0ReferenceCount(MemorySegment segment) { return VkVideoEncodeH265QualityLevelPropertiesKHR.get_preferredMaxL0ReferenceCount(segment, 0L); }
    /// {@return `preferredMaxL0ReferenceCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int preferredMaxL0ReferenceCountAt(long index) { return VkVideoEncodeH265QualityLevelPropertiesKHR.get_preferredMaxL0ReferenceCount(this.segment(), index); }
    /// {@return `preferredMaxL0ReferenceCount`}
    public @CType("uint32_t") int preferredMaxL0ReferenceCount() { return VkVideoEncodeH265QualityLevelPropertiesKHR.get_preferredMaxL0ReferenceCount(this.segment()); }
    /// Sets `preferredMaxL0ReferenceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_preferredMaxL0ReferenceCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_preferredMaxL0ReferenceCount.set(segment, 0L, index, value); }
    /// Sets `preferredMaxL0ReferenceCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_preferredMaxL0ReferenceCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeH265QualityLevelPropertiesKHR.set_preferredMaxL0ReferenceCount(segment, 0L, value); }
    /// Sets `preferredMaxL0ReferenceCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265QualityLevelPropertiesKHR preferredMaxL0ReferenceCountAt(long index, @CType("uint32_t") int value) { VkVideoEncodeH265QualityLevelPropertiesKHR.set_preferredMaxL0ReferenceCount(this.segment(), index, value); return this; }
    /// Sets `preferredMaxL0ReferenceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265QualityLevelPropertiesKHR preferredMaxL0ReferenceCount(@CType("uint32_t") int value) { VkVideoEncodeH265QualityLevelPropertiesKHR.set_preferredMaxL0ReferenceCount(this.segment(), value); return this; }

    /// {@return `preferredMaxL1ReferenceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index   the index
    public static @CType("uint32_t") int get_preferredMaxL1ReferenceCount(MemorySegment segment, long index) { return (int) VH_preferredMaxL1ReferenceCount.get(segment, 0L, index); }
    /// {@return `preferredMaxL1ReferenceCount`}
    /// @param segment the segment of the struct
    public static @CType("uint32_t") int get_preferredMaxL1ReferenceCount(MemorySegment segment) { return VkVideoEncodeH265QualityLevelPropertiesKHR.get_preferredMaxL1ReferenceCount(segment, 0L); }
    /// {@return `preferredMaxL1ReferenceCount` at the given index}
    /// @param index the index
    public @CType("uint32_t") int preferredMaxL1ReferenceCountAt(long index) { return VkVideoEncodeH265QualityLevelPropertiesKHR.get_preferredMaxL1ReferenceCount(this.segment(), index); }
    /// {@return `preferredMaxL1ReferenceCount`}
    public @CType("uint32_t") int preferredMaxL1ReferenceCount() { return VkVideoEncodeH265QualityLevelPropertiesKHR.get_preferredMaxL1ReferenceCount(this.segment()); }
    /// Sets `preferredMaxL1ReferenceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index   the index
    /// @param value   the value
    public static void set_preferredMaxL1ReferenceCount(MemorySegment segment, long index, @CType("uint32_t") int value) { VH_preferredMaxL1ReferenceCount.set(segment, 0L, index, value); }
    /// Sets `preferredMaxL1ReferenceCount` with the given value.
    /// @param segment the segment of the struct
    /// @param value   the value
    public static void set_preferredMaxL1ReferenceCount(MemorySegment segment, @CType("uint32_t") int value) { VkVideoEncodeH265QualityLevelPropertiesKHR.set_preferredMaxL1ReferenceCount(segment, 0L, value); }
    /// Sets `preferredMaxL1ReferenceCount` with the given value at the given index.
    /// @param index the index
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265QualityLevelPropertiesKHR preferredMaxL1ReferenceCountAt(long index, @CType("uint32_t") int value) { VkVideoEncodeH265QualityLevelPropertiesKHR.set_preferredMaxL1ReferenceCount(this.segment(), index, value); return this; }
    /// Sets `preferredMaxL1ReferenceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265QualityLevelPropertiesKHR preferredMaxL1ReferenceCount(@CType("uint32_t") int value) { VkVideoEncodeH265QualityLevelPropertiesKHR.set_preferredMaxL1ReferenceCount(this.segment(), value); return this; }

}
