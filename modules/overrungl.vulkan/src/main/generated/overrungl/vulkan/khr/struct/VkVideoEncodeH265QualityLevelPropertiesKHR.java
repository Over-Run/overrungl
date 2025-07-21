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
package overrungl.vulkan.khr.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import java.util.function.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkVideoEncodeH265QualityLevelPropertiesKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     ((uint32_t) VkFlags) VkVideoEncodeH265RateControlFlagsKHR preferredRateControlFlags;
///     uint32_t preferredGopFrameCount;
///     uint32_t preferredIdrPeriod;
///     uint32_t preferredConsecutiveBFrameCount;
///     uint32_t preferredSubLayerCount;
///     (struct VkVideoEncodeH265QpKHR) VkVideoEncodeH265QpKHR preferredConstantQp;
///     uint32_t preferredMaxL0ReferenceCount;
///     uint32_t preferredMaxL1ReferenceCount;
/// };
/// ```
public final class VkVideoEncodeH265QualityLevelPropertiesKHR extends GroupType {
    /// The struct layout of `VkVideoEncodeH265QualityLevelPropertiesKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
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
    /// The byte offset of `preferredRateControlFlags`.
    public static final long OFFSET_preferredRateControlFlags = LAYOUT.byteOffset(PathElement.groupElement("preferredRateControlFlags"));
    /// The memory layout of `preferredRateControlFlags`.
    public static final MemoryLayout LAYOUT_preferredRateControlFlags = LAYOUT.select(PathElement.groupElement("preferredRateControlFlags"));
    /// The [VarHandle] of `preferredRateControlFlags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_preferredRateControlFlags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredRateControlFlags"));
    /// The byte offset of `preferredGopFrameCount`.
    public static final long OFFSET_preferredGopFrameCount = LAYOUT.byteOffset(PathElement.groupElement("preferredGopFrameCount"));
    /// The memory layout of `preferredGopFrameCount`.
    public static final MemoryLayout LAYOUT_preferredGopFrameCount = LAYOUT.select(PathElement.groupElement("preferredGopFrameCount"));
    /// The [VarHandle] of `preferredGopFrameCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_preferredGopFrameCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredGopFrameCount"));
    /// The byte offset of `preferredIdrPeriod`.
    public static final long OFFSET_preferredIdrPeriod = LAYOUT.byteOffset(PathElement.groupElement("preferredIdrPeriod"));
    /// The memory layout of `preferredIdrPeriod`.
    public static final MemoryLayout LAYOUT_preferredIdrPeriod = LAYOUT.select(PathElement.groupElement("preferredIdrPeriod"));
    /// The [VarHandle] of `preferredIdrPeriod` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_preferredIdrPeriod = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredIdrPeriod"));
    /// The byte offset of `preferredConsecutiveBFrameCount`.
    public static final long OFFSET_preferredConsecutiveBFrameCount = LAYOUT.byteOffset(PathElement.groupElement("preferredConsecutiveBFrameCount"));
    /// The memory layout of `preferredConsecutiveBFrameCount`.
    public static final MemoryLayout LAYOUT_preferredConsecutiveBFrameCount = LAYOUT.select(PathElement.groupElement("preferredConsecutiveBFrameCount"));
    /// The [VarHandle] of `preferredConsecutiveBFrameCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_preferredConsecutiveBFrameCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredConsecutiveBFrameCount"));
    /// The byte offset of `preferredSubLayerCount`.
    public static final long OFFSET_preferredSubLayerCount = LAYOUT.byteOffset(PathElement.groupElement("preferredSubLayerCount"));
    /// The memory layout of `preferredSubLayerCount`.
    public static final MemoryLayout LAYOUT_preferredSubLayerCount = LAYOUT.select(PathElement.groupElement("preferredSubLayerCount"));
    /// The [VarHandle] of `preferredSubLayerCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_preferredSubLayerCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredSubLayerCount"));
    /// The byte offset of `preferredConstantQp`.
    public static final long OFFSET_preferredConstantQp = LAYOUT.byteOffset(PathElement.groupElement("preferredConstantQp"));
    /// The memory layout of `preferredConstantQp`.
    public static final MemoryLayout LAYOUT_preferredConstantQp = LAYOUT.select(PathElement.groupElement("preferredConstantQp"));
    /// The byte offset of `preferredMaxL0ReferenceCount`.
    public static final long OFFSET_preferredMaxL0ReferenceCount = LAYOUT.byteOffset(PathElement.groupElement("preferredMaxL0ReferenceCount"));
    /// The memory layout of `preferredMaxL0ReferenceCount`.
    public static final MemoryLayout LAYOUT_preferredMaxL0ReferenceCount = LAYOUT.select(PathElement.groupElement("preferredMaxL0ReferenceCount"));
    /// The [VarHandle] of `preferredMaxL0ReferenceCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_preferredMaxL0ReferenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredMaxL0ReferenceCount"));
    /// The byte offset of `preferredMaxL1ReferenceCount`.
    public static final long OFFSET_preferredMaxL1ReferenceCount = LAYOUT.byteOffset(PathElement.groupElement("preferredMaxL1ReferenceCount"));
    /// The memory layout of `preferredMaxL1ReferenceCount`.
    public static final MemoryLayout LAYOUT_preferredMaxL1ReferenceCount = LAYOUT.select(PathElement.groupElement("preferredMaxL1ReferenceCount"));
    /// The [VarHandle] of `preferredMaxL1ReferenceCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_preferredMaxL1ReferenceCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredMaxL1ReferenceCount"));

    /// Creates `VkVideoEncodeH265QualityLevelPropertiesKHR` with the given segment.
    /// @param segment      the memory segment
    /// @param elementCount the element count of this struct buffer
    public VkVideoEncodeH265QualityLevelPropertiesKHR(MemorySegment segment, long elementCount) { super(segment, LAYOUT, elementCount); }

    /// Creates `VkVideoEncodeH265QualityLevelPropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH265QualityLevelPropertiesKHR of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH265QualityLevelPropertiesKHR(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeH265QualityLevelPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH265QualityLevelPropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH265QualityLevelPropertiesKHR(segment.reinterpret(LAYOUT.byteSize()), 1); }

    /// Creates `VkVideoEncodeH265QualityLevelPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH265QualityLevelPropertiesKHR ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH265QualityLevelPropertiesKHR(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVideoEncodeH265QualityLevelPropertiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeH265QualityLevelPropertiesKHR`
    public static VkVideoEncodeH265QualityLevelPropertiesKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH265QualityLevelPropertiesKHR(allocator.allocate(LAYOUT), 1); }

    /// Allocates a `VkVideoEncodeH265QualityLevelPropertiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeH265QualityLevelPropertiesKHR`
    public static VkVideoEncodeH265QualityLevelPropertiesKHR alloc(SegmentAllocator allocator, long count) { return new VkVideoEncodeH265QualityLevelPropertiesKHR(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkVideoEncodeH265QualityLevelPropertiesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param preferredRateControlFlags `preferredRateControlFlags`
    /// @param preferredGopFrameCount `preferredGopFrameCount`
    /// @param preferredIdrPeriod `preferredIdrPeriod`
    /// @param preferredConsecutiveBFrameCount `preferredConsecutiveBFrameCount`
    /// @param preferredSubLayerCount `preferredSubLayerCount`
    /// @param preferredConstantQp `preferredConstantQp`
    /// @param preferredMaxL0ReferenceCount `preferredMaxL0ReferenceCount`
    /// @param preferredMaxL1ReferenceCount `preferredMaxL1ReferenceCount`
    /// @return the allocated `VkVideoEncodeH265QualityLevelPropertiesKHR`
    public static VkVideoEncodeH265QualityLevelPropertiesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int preferredRateControlFlags, int preferredGopFrameCount, int preferredIdrPeriod, int preferredConsecutiveBFrameCount, int preferredSubLayerCount, MemorySegment preferredConstantQp, int preferredMaxL0ReferenceCount, int preferredMaxL1ReferenceCount) {
        return alloc(allocator).sType(sType).pNext(pNext).preferredRateControlFlags(preferredRateControlFlags).preferredGopFrameCount(preferredGopFrameCount).preferredIdrPeriod(preferredIdrPeriod).preferredConsecutiveBFrameCount(preferredConsecutiveBFrameCount).preferredSubLayerCount(preferredSubLayerCount).preferredConstantQp(preferredConstantQp).preferredMaxL0ReferenceCount(preferredMaxL0ReferenceCount).preferredMaxL1ReferenceCount(preferredMaxL1ReferenceCount);
    }

    /// Allocates a `VkVideoEncodeH265QualityLevelPropertiesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param preferredRateControlFlags `preferredRateControlFlags`
    /// @param preferredGopFrameCount `preferredGopFrameCount`
    /// @param preferredIdrPeriod `preferredIdrPeriod`
    /// @param preferredConsecutiveBFrameCount `preferredConsecutiveBFrameCount`
    /// @param preferredSubLayerCount `preferredSubLayerCount`
    /// @param preferredConstantQp `preferredConstantQp`
    /// @param preferredMaxL0ReferenceCount `preferredMaxL0ReferenceCount`
    /// @return the allocated `VkVideoEncodeH265QualityLevelPropertiesKHR`
    public static VkVideoEncodeH265QualityLevelPropertiesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int preferredRateControlFlags, int preferredGopFrameCount, int preferredIdrPeriod, int preferredConsecutiveBFrameCount, int preferredSubLayerCount, MemorySegment preferredConstantQp, int preferredMaxL0ReferenceCount) {
        return alloc(allocator).sType(sType).pNext(pNext).preferredRateControlFlags(preferredRateControlFlags).preferredGopFrameCount(preferredGopFrameCount).preferredIdrPeriod(preferredIdrPeriod).preferredConsecutiveBFrameCount(preferredConsecutiveBFrameCount).preferredSubLayerCount(preferredSubLayerCount).preferredConstantQp(preferredConstantQp).preferredMaxL0ReferenceCount(preferredMaxL0ReferenceCount);
    }

    /// Allocates a `VkVideoEncodeH265QualityLevelPropertiesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param preferredRateControlFlags `preferredRateControlFlags`
    /// @param preferredGopFrameCount `preferredGopFrameCount`
    /// @param preferredIdrPeriod `preferredIdrPeriod`
    /// @param preferredConsecutiveBFrameCount `preferredConsecutiveBFrameCount`
    /// @param preferredSubLayerCount `preferredSubLayerCount`
    /// @param preferredConstantQp `preferredConstantQp`
    /// @return the allocated `VkVideoEncodeH265QualityLevelPropertiesKHR`
    public static VkVideoEncodeH265QualityLevelPropertiesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int preferredRateControlFlags, int preferredGopFrameCount, int preferredIdrPeriod, int preferredConsecutiveBFrameCount, int preferredSubLayerCount, MemorySegment preferredConstantQp) {
        return alloc(allocator).sType(sType).pNext(pNext).preferredRateControlFlags(preferredRateControlFlags).preferredGopFrameCount(preferredGopFrameCount).preferredIdrPeriod(preferredIdrPeriod).preferredConsecutiveBFrameCount(preferredConsecutiveBFrameCount).preferredSubLayerCount(preferredSubLayerCount).preferredConstantQp(preferredConstantQp);
    }

    /// Allocates a `VkVideoEncodeH265QualityLevelPropertiesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param preferredRateControlFlags `preferredRateControlFlags`
    /// @param preferredGopFrameCount `preferredGopFrameCount`
    /// @param preferredIdrPeriod `preferredIdrPeriod`
    /// @param preferredConsecutiveBFrameCount `preferredConsecutiveBFrameCount`
    /// @param preferredSubLayerCount `preferredSubLayerCount`
    /// @return the allocated `VkVideoEncodeH265QualityLevelPropertiesKHR`
    public static VkVideoEncodeH265QualityLevelPropertiesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int preferredRateControlFlags, int preferredGopFrameCount, int preferredIdrPeriod, int preferredConsecutiveBFrameCount, int preferredSubLayerCount) {
        return alloc(allocator).sType(sType).pNext(pNext).preferredRateControlFlags(preferredRateControlFlags).preferredGopFrameCount(preferredGopFrameCount).preferredIdrPeriod(preferredIdrPeriod).preferredConsecutiveBFrameCount(preferredConsecutiveBFrameCount).preferredSubLayerCount(preferredSubLayerCount);
    }

    /// Allocates a `VkVideoEncodeH265QualityLevelPropertiesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param preferredRateControlFlags `preferredRateControlFlags`
    /// @param preferredGopFrameCount `preferredGopFrameCount`
    /// @param preferredIdrPeriod `preferredIdrPeriod`
    /// @param preferredConsecutiveBFrameCount `preferredConsecutiveBFrameCount`
    /// @return the allocated `VkVideoEncodeH265QualityLevelPropertiesKHR`
    public static VkVideoEncodeH265QualityLevelPropertiesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int preferredRateControlFlags, int preferredGopFrameCount, int preferredIdrPeriod, int preferredConsecutiveBFrameCount) {
        return alloc(allocator).sType(sType).pNext(pNext).preferredRateControlFlags(preferredRateControlFlags).preferredGopFrameCount(preferredGopFrameCount).preferredIdrPeriod(preferredIdrPeriod).preferredConsecutiveBFrameCount(preferredConsecutiveBFrameCount);
    }

    /// Allocates a `VkVideoEncodeH265QualityLevelPropertiesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param preferredRateControlFlags `preferredRateControlFlags`
    /// @param preferredGopFrameCount `preferredGopFrameCount`
    /// @param preferredIdrPeriod `preferredIdrPeriod`
    /// @return the allocated `VkVideoEncodeH265QualityLevelPropertiesKHR`
    public static VkVideoEncodeH265QualityLevelPropertiesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int preferredRateControlFlags, int preferredGopFrameCount, int preferredIdrPeriod) {
        return alloc(allocator).sType(sType).pNext(pNext).preferredRateControlFlags(preferredRateControlFlags).preferredGopFrameCount(preferredGopFrameCount).preferredIdrPeriod(preferredIdrPeriod);
    }

    /// Allocates a `VkVideoEncodeH265QualityLevelPropertiesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param preferredRateControlFlags `preferredRateControlFlags`
    /// @param preferredGopFrameCount `preferredGopFrameCount`
    /// @return the allocated `VkVideoEncodeH265QualityLevelPropertiesKHR`
    public static VkVideoEncodeH265QualityLevelPropertiesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int preferredRateControlFlags, int preferredGopFrameCount) {
        return alloc(allocator).sType(sType).pNext(pNext).preferredRateControlFlags(preferredRateControlFlags).preferredGopFrameCount(preferredGopFrameCount);
    }

    /// Allocates a `VkVideoEncodeH265QualityLevelPropertiesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param preferredRateControlFlags `preferredRateControlFlags`
    /// @return the allocated `VkVideoEncodeH265QualityLevelPropertiesKHR`
    public static VkVideoEncodeH265QualityLevelPropertiesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int preferredRateControlFlags) {
        return alloc(allocator).sType(sType).pNext(pNext).preferredRateControlFlags(preferredRateControlFlags);
    }

    /// Allocates a `VkVideoEncodeH265QualityLevelPropertiesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkVideoEncodeH265QualityLevelPropertiesKHR`
    public static VkVideoEncodeH265QualityLevelPropertiesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkVideoEncodeH265QualityLevelPropertiesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkVideoEncodeH265QualityLevelPropertiesKHR`
    public static VkVideoEncodeH265QualityLevelPropertiesKHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeH265QualityLevelPropertiesKHR copyFrom(VkVideoEncodeH265QualityLevelPropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }

    /// Reinterprets this buffer with the given count.
    /// @param count the new count
    /// @return the reinterpreted buffer
    public VkVideoEncodeH265QualityLevelPropertiesKHR reinterpret(long count) { return new VkVideoEncodeH265QualityLevelPropertiesKHR(this.segment().reinterpret(LAYOUT.scale(0, count)), count); }

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
    public VkVideoEncodeH265QualityLevelPropertiesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoEncodeH265QualityLevelPropertiesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `preferredRateControlFlags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int preferredRateControlFlags(MemorySegment segment, long index) { return (int) VH_preferredRateControlFlags.get(segment, 0L, index); }
    /// {@return `preferredRateControlFlags`}
    public int preferredRateControlFlags() { return preferredRateControlFlags(this.segment(), 0L); }
    /// Sets `preferredRateControlFlags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void preferredRateControlFlags(MemorySegment segment, long index, int value) { VH_preferredRateControlFlags.set(segment, 0L, index, value); }
    /// Sets `preferredRateControlFlags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265QualityLevelPropertiesKHR preferredRateControlFlags(int value) { preferredRateControlFlags(this.segment(), 0L, value); return this; }

    /// {@return `preferredGopFrameCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int preferredGopFrameCount(MemorySegment segment, long index) { return (int) VH_preferredGopFrameCount.get(segment, 0L, index); }
    /// {@return `preferredGopFrameCount`}
    public int preferredGopFrameCount() { return preferredGopFrameCount(this.segment(), 0L); }
    /// Sets `preferredGopFrameCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void preferredGopFrameCount(MemorySegment segment, long index, int value) { VH_preferredGopFrameCount.set(segment, 0L, index, value); }
    /// Sets `preferredGopFrameCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265QualityLevelPropertiesKHR preferredGopFrameCount(int value) { preferredGopFrameCount(this.segment(), 0L, value); return this; }

    /// {@return `preferredIdrPeriod` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int preferredIdrPeriod(MemorySegment segment, long index) { return (int) VH_preferredIdrPeriod.get(segment, 0L, index); }
    /// {@return `preferredIdrPeriod`}
    public int preferredIdrPeriod() { return preferredIdrPeriod(this.segment(), 0L); }
    /// Sets `preferredIdrPeriod` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void preferredIdrPeriod(MemorySegment segment, long index, int value) { VH_preferredIdrPeriod.set(segment, 0L, index, value); }
    /// Sets `preferredIdrPeriod` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265QualityLevelPropertiesKHR preferredIdrPeriod(int value) { preferredIdrPeriod(this.segment(), 0L, value); return this; }

    /// {@return `preferredConsecutiveBFrameCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int preferredConsecutiveBFrameCount(MemorySegment segment, long index) { return (int) VH_preferredConsecutiveBFrameCount.get(segment, 0L, index); }
    /// {@return `preferredConsecutiveBFrameCount`}
    public int preferredConsecutiveBFrameCount() { return preferredConsecutiveBFrameCount(this.segment(), 0L); }
    /// Sets `preferredConsecutiveBFrameCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void preferredConsecutiveBFrameCount(MemorySegment segment, long index, int value) { VH_preferredConsecutiveBFrameCount.set(segment, 0L, index, value); }
    /// Sets `preferredConsecutiveBFrameCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265QualityLevelPropertiesKHR preferredConsecutiveBFrameCount(int value) { preferredConsecutiveBFrameCount(this.segment(), 0L, value); return this; }

    /// {@return `preferredSubLayerCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int preferredSubLayerCount(MemorySegment segment, long index) { return (int) VH_preferredSubLayerCount.get(segment, 0L, index); }
    /// {@return `preferredSubLayerCount`}
    public int preferredSubLayerCount() { return preferredSubLayerCount(this.segment(), 0L); }
    /// Sets `preferredSubLayerCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void preferredSubLayerCount(MemorySegment segment, long index, int value) { VH_preferredSubLayerCount.set(segment, 0L, index, value); }
    /// Sets `preferredSubLayerCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265QualityLevelPropertiesKHR preferredSubLayerCount(int value) { preferredSubLayerCount(this.segment(), 0L, value); return this; }

    /// {@return `preferredConstantQp` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment preferredConstantQp(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_preferredConstantQp, index), LAYOUT_preferredConstantQp); }
    /// {@return `preferredConstantQp`}
    public MemorySegment preferredConstantQp() { return preferredConstantQp(this.segment(), 0L); }
    /// Sets `preferredConstantQp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void preferredConstantQp(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_preferredConstantQp, index), LAYOUT_preferredConstantQp.byteSize()); }
    /// Sets `preferredConstantQp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265QualityLevelPropertiesKHR preferredConstantQp(MemorySegment value) { preferredConstantQp(this.segment(), 0L, value); return this; }
    /// Accepts `preferredConstantQp` with the given function.
    /// @param func the function
    /// @return `this`
    public VkVideoEncodeH265QualityLevelPropertiesKHR preferredConstantQp(Consumer<overrungl.vulkan.khr.struct.VkVideoEncodeH265QpKHR> func) { func.accept(overrungl.vulkan.khr.struct.VkVideoEncodeH265QpKHR.of(preferredConstantQp())); return this; }

    /// {@return `preferredMaxL0ReferenceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int preferredMaxL0ReferenceCount(MemorySegment segment, long index) { return (int) VH_preferredMaxL0ReferenceCount.get(segment, 0L, index); }
    /// {@return `preferredMaxL0ReferenceCount`}
    public int preferredMaxL0ReferenceCount() { return preferredMaxL0ReferenceCount(this.segment(), 0L); }
    /// Sets `preferredMaxL0ReferenceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void preferredMaxL0ReferenceCount(MemorySegment segment, long index, int value) { VH_preferredMaxL0ReferenceCount.set(segment, 0L, index, value); }
    /// Sets `preferredMaxL0ReferenceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265QualityLevelPropertiesKHR preferredMaxL0ReferenceCount(int value) { preferredMaxL0ReferenceCount(this.segment(), 0L, value); return this; }

    /// {@return `preferredMaxL1ReferenceCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int preferredMaxL1ReferenceCount(MemorySegment segment, long index) { return (int) VH_preferredMaxL1ReferenceCount.get(segment, 0L, index); }
    /// {@return `preferredMaxL1ReferenceCount`}
    public int preferredMaxL1ReferenceCount() { return preferredMaxL1ReferenceCount(this.segment(), 0L); }
    /// Sets `preferredMaxL1ReferenceCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void preferredMaxL1ReferenceCount(MemorySegment segment, long index, int value) { VH_preferredMaxL1ReferenceCount.set(segment, 0L, index, value); }
    /// Sets `preferredMaxL1ReferenceCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265QualityLevelPropertiesKHR preferredMaxL1ReferenceCount(int value) { preferredMaxL1ReferenceCount(this.segment(), 0L, value); return this; }

    /// Creates a slice of `VkVideoEncodeH265QualityLevelPropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @return the slice of `VkVideoEncodeH265QualityLevelPropertiesKHR`
    public VkVideoEncodeH265QualityLevelPropertiesKHR asSlice(long index) { return new VkVideoEncodeH265QualityLevelPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT), 1); }

    /// Creates a slice of `VkVideoEncodeH265QualityLevelPropertiesKHR`.
    /// @param index the index of the struct buffer
    /// @param count the count
    /// @return the slice of `VkVideoEncodeH265QualityLevelPropertiesKHR`
    public VkVideoEncodeH265QualityLevelPropertiesKHR asSlice(long index, long count) { return new VkVideoEncodeH265QualityLevelPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

    /// Visits `VkVideoEncodeH265QualityLevelPropertiesKHR` buffer at the given index.
    /// @param index the index of this buffer
    /// @param func  the function to run with the slice of this buffer
    /// @return `this`
    public VkVideoEncodeH265QualityLevelPropertiesKHR at(long index, Consumer<VkVideoEncodeH265QualityLevelPropertiesKHR> func) { func.accept(asSlice(index)); return this; }

    /// {@return `sType` at the given index}
    /// @param index the index of the struct buffer
    public int sTypeAt(long index) { return sType(this.segment(), index); }
    /// Sets `sType` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265QualityLevelPropertiesKHR sTypeAt(long index, int value) { sType(this.segment(), index, value); return this; }

    /// {@return `pNext` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment pNextAt(long index) { return pNext(this.segment(), index); }
    /// Sets `pNext` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265QualityLevelPropertiesKHR pNextAt(long index, MemorySegment value) { pNext(this.segment(), index, value); return this; }

    /// {@return `preferredRateControlFlags` at the given index}
    /// @param index the index of the struct buffer
    public int preferredRateControlFlagsAt(long index) { return preferredRateControlFlags(this.segment(), index); }
    /// Sets `preferredRateControlFlags` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265QualityLevelPropertiesKHR preferredRateControlFlagsAt(long index, int value) { preferredRateControlFlags(this.segment(), index, value); return this; }

    /// {@return `preferredGopFrameCount` at the given index}
    /// @param index the index of the struct buffer
    public int preferredGopFrameCountAt(long index) { return preferredGopFrameCount(this.segment(), index); }
    /// Sets `preferredGopFrameCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265QualityLevelPropertiesKHR preferredGopFrameCountAt(long index, int value) { preferredGopFrameCount(this.segment(), index, value); return this; }

    /// {@return `preferredIdrPeriod` at the given index}
    /// @param index the index of the struct buffer
    public int preferredIdrPeriodAt(long index) { return preferredIdrPeriod(this.segment(), index); }
    /// Sets `preferredIdrPeriod` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265QualityLevelPropertiesKHR preferredIdrPeriodAt(long index, int value) { preferredIdrPeriod(this.segment(), index, value); return this; }

    /// {@return `preferredConsecutiveBFrameCount` at the given index}
    /// @param index the index of the struct buffer
    public int preferredConsecutiveBFrameCountAt(long index) { return preferredConsecutiveBFrameCount(this.segment(), index); }
    /// Sets `preferredConsecutiveBFrameCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265QualityLevelPropertiesKHR preferredConsecutiveBFrameCountAt(long index, int value) { preferredConsecutiveBFrameCount(this.segment(), index, value); return this; }

    /// {@return `preferredSubLayerCount` at the given index}
    /// @param index the index of the struct buffer
    public int preferredSubLayerCountAt(long index) { return preferredSubLayerCount(this.segment(), index); }
    /// Sets `preferredSubLayerCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265QualityLevelPropertiesKHR preferredSubLayerCountAt(long index, int value) { preferredSubLayerCount(this.segment(), index, value); return this; }

    /// {@return `preferredConstantQp` at the given index}
    /// @param index the index of the struct buffer
    public MemorySegment preferredConstantQpAt(long index) { return preferredConstantQp(this.segment(), index); }
    /// Sets `preferredConstantQp` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265QualityLevelPropertiesKHR preferredConstantQpAt(long index, MemorySegment value) { preferredConstantQp(this.segment(), index, value); return this; }
    /// Accepts `preferredConstantQp` with the given function.
    /// @param index the index of the struct buffer
    /// @param func the function
    /// @return `this`
    public VkVideoEncodeH265QualityLevelPropertiesKHR preferredConstantQpAt(long index, Consumer<overrungl.vulkan.khr.struct.VkVideoEncodeH265QpKHR> func) { func.accept(overrungl.vulkan.khr.struct.VkVideoEncodeH265QpKHR.of(preferredConstantQpAt(index))); return this; }

    /// {@return `preferredMaxL0ReferenceCount` at the given index}
    /// @param index the index of the struct buffer
    public int preferredMaxL0ReferenceCountAt(long index) { return preferredMaxL0ReferenceCount(this.segment(), index); }
    /// Sets `preferredMaxL0ReferenceCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265QualityLevelPropertiesKHR preferredMaxL0ReferenceCountAt(long index, int value) { preferredMaxL0ReferenceCount(this.segment(), index, value); return this; }

    /// {@return `preferredMaxL1ReferenceCount` at the given index}
    /// @param index the index of the struct buffer
    public int preferredMaxL1ReferenceCountAt(long index) { return preferredMaxL1ReferenceCount(this.segment(), index); }
    /// Sets `preferredMaxL1ReferenceCount` with the given value at the given index.
    /// @param index the index of the struct buffer
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265QualityLevelPropertiesKHR preferredMaxL1ReferenceCountAt(long index, int value) { preferredMaxL1ReferenceCount(this.segment(), index, value); return this; }

}
