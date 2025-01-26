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
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkVideoEncodeH264QualityLevelPropertiesKHR {
///     VkStructureType sType;
///     void* pNext;
///     VkVideoEncodeH264RateControlFlagsKHR preferredRateControlFlags;
///     uint32_t preferredGopFrameCount;
///     uint32_t preferredIdrPeriod;
///     uint32_t preferredConsecutiveBFrameCount;
///     uint32_t preferredTemporalLayerCount;
///     VkVideoEncodeH264QpKHR preferredConstantQp;
///     uint32_t preferredMaxL0ReferenceCount;
///     uint32_t preferredMaxL1ReferenceCount;
///     VkBool32 preferredStdEntropyCodingModeFlag;
/// };
/// ```
public sealed class VkVideoEncodeH264QualityLevelPropertiesKHR extends GroupType {
    /// The struct layout of `VkVideoEncodeH264QualityLevelPropertiesKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
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
    /// The byte offset of `preferredTemporalLayerCount`.
    public static final long OFFSET_preferredTemporalLayerCount = LAYOUT.byteOffset(PathElement.groupElement("preferredTemporalLayerCount"));
    /// The memory layout of `preferredTemporalLayerCount`.
    public static final MemoryLayout LAYOUT_preferredTemporalLayerCount = LAYOUT.select(PathElement.groupElement("preferredTemporalLayerCount"));
    /// The [VarHandle] of `preferredTemporalLayerCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_preferredTemporalLayerCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredTemporalLayerCount"));
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
    /// The byte offset of `preferredStdEntropyCodingModeFlag`.
    public static final long OFFSET_preferredStdEntropyCodingModeFlag = LAYOUT.byteOffset(PathElement.groupElement("preferredStdEntropyCodingModeFlag"));
    /// The memory layout of `preferredStdEntropyCodingModeFlag`.
    public static final MemoryLayout LAYOUT_preferredStdEntropyCodingModeFlag = LAYOUT.select(PathElement.groupElement("preferredStdEntropyCodingModeFlag"));
    /// The [VarHandle] of `preferredStdEntropyCodingModeFlag` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_preferredStdEntropyCodingModeFlag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredStdEntropyCodingModeFlag"));

    /// Creates `VkVideoEncodeH264QualityLevelPropertiesKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoEncodeH264QualityLevelPropertiesKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoEncodeH264QualityLevelPropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeH264QualityLevelPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH264QualityLevelPropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH264QualityLevelPropertiesKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoEncodeH264QualityLevelPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkVideoEncodeH264QualityLevelPropertiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeH264QualityLevelPropertiesKHR`
    public static VkVideoEncodeH264QualityLevelPropertiesKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH264QualityLevelPropertiesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoEncodeH264QualityLevelPropertiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeH264QualityLevelPropertiesKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeH264QualityLevelPropertiesKHR copyFrom(VkVideoEncodeH264QualityLevelPropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkVideoEncodeH264QualityLevelPropertiesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoEncodeH264QualityLevelPropertiesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

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
    public VkVideoEncodeH264QualityLevelPropertiesKHR preferredRateControlFlags(int value) { preferredRateControlFlags(this.segment(), 0L, value); return this; }

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
    public VkVideoEncodeH264QualityLevelPropertiesKHR preferredGopFrameCount(int value) { preferredGopFrameCount(this.segment(), 0L, value); return this; }

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
    public VkVideoEncodeH264QualityLevelPropertiesKHR preferredIdrPeriod(int value) { preferredIdrPeriod(this.segment(), 0L, value); return this; }

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
    public VkVideoEncodeH264QualityLevelPropertiesKHR preferredConsecutiveBFrameCount(int value) { preferredConsecutiveBFrameCount(this.segment(), 0L, value); return this; }

    /// {@return `preferredTemporalLayerCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int preferredTemporalLayerCount(MemorySegment segment, long index) { return (int) VH_preferredTemporalLayerCount.get(segment, 0L, index); }
    /// {@return `preferredTemporalLayerCount`}
    public int preferredTemporalLayerCount() { return preferredTemporalLayerCount(this.segment(), 0L); }
    /// Sets `preferredTemporalLayerCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void preferredTemporalLayerCount(MemorySegment segment, long index, int value) { VH_preferredTemporalLayerCount.set(segment, 0L, index, value); }
    /// Sets `preferredTemporalLayerCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264QualityLevelPropertiesKHR preferredTemporalLayerCount(int value) { preferredTemporalLayerCount(this.segment(), 0L, value); return this; }

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
    public VkVideoEncodeH264QualityLevelPropertiesKHR preferredConstantQp(MemorySegment value) { preferredConstantQp(this.segment(), 0L, value); return this; }

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
    public VkVideoEncodeH264QualityLevelPropertiesKHR preferredMaxL0ReferenceCount(int value) { preferredMaxL0ReferenceCount(this.segment(), 0L, value); return this; }

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
    public VkVideoEncodeH264QualityLevelPropertiesKHR preferredMaxL1ReferenceCount(int value) { preferredMaxL1ReferenceCount(this.segment(), 0L, value); return this; }

    /// {@return `preferredStdEntropyCodingModeFlag` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int preferredStdEntropyCodingModeFlag(MemorySegment segment, long index) { return (int) VH_preferredStdEntropyCodingModeFlag.get(segment, 0L, index); }
    /// {@return `preferredStdEntropyCodingModeFlag`}
    public int preferredStdEntropyCodingModeFlag() { return preferredStdEntropyCodingModeFlag(this.segment(), 0L); }
    /// Sets `preferredStdEntropyCodingModeFlag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void preferredStdEntropyCodingModeFlag(MemorySegment segment, long index, int value) { VH_preferredStdEntropyCodingModeFlag.set(segment, 0L, index, value); }
    /// Sets `preferredStdEntropyCodingModeFlag` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264QualityLevelPropertiesKHR preferredStdEntropyCodingModeFlag(int value) { preferredStdEntropyCodingModeFlag(this.segment(), 0L, value); return this; }

    /// A buffer of [VkVideoEncodeH264QualityLevelPropertiesKHR].
    public static final class Buffer extends VkVideoEncodeH264QualityLevelPropertiesKHR {
        private final long elementCount;

        /// Creates `VkVideoEncodeH264QualityLevelPropertiesKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkVideoEncodeH264QualityLevelPropertiesKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkVideoEncodeH264QualityLevelPropertiesKHR`
        public VkVideoEncodeH264QualityLevelPropertiesKHR asSlice(long index) { return new VkVideoEncodeH264QualityLevelPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkVideoEncodeH264QualityLevelPropertiesKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkVideoEncodeH264QualityLevelPropertiesKHR`
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

        /// {@return `preferredRateControlFlags` at the given index}
        /// @param index the index of the struct buffer
        public int preferredRateControlFlagsAt(long index) { return preferredRateControlFlags(this.segment(), index); }
        /// Sets `preferredRateControlFlags` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer preferredRateControlFlagsAt(long index, int value) { preferredRateControlFlags(this.segment(), index, value); return this; }

        /// {@return `preferredGopFrameCount` at the given index}
        /// @param index the index of the struct buffer
        public int preferredGopFrameCountAt(long index) { return preferredGopFrameCount(this.segment(), index); }
        /// Sets `preferredGopFrameCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer preferredGopFrameCountAt(long index, int value) { preferredGopFrameCount(this.segment(), index, value); return this; }

        /// {@return `preferredIdrPeriod` at the given index}
        /// @param index the index of the struct buffer
        public int preferredIdrPeriodAt(long index) { return preferredIdrPeriod(this.segment(), index); }
        /// Sets `preferredIdrPeriod` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer preferredIdrPeriodAt(long index, int value) { preferredIdrPeriod(this.segment(), index, value); return this; }

        /// {@return `preferredConsecutiveBFrameCount` at the given index}
        /// @param index the index of the struct buffer
        public int preferredConsecutiveBFrameCountAt(long index) { return preferredConsecutiveBFrameCount(this.segment(), index); }
        /// Sets `preferredConsecutiveBFrameCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer preferredConsecutiveBFrameCountAt(long index, int value) { preferredConsecutiveBFrameCount(this.segment(), index, value); return this; }

        /// {@return `preferredTemporalLayerCount` at the given index}
        /// @param index the index of the struct buffer
        public int preferredTemporalLayerCountAt(long index) { return preferredTemporalLayerCount(this.segment(), index); }
        /// Sets `preferredTemporalLayerCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer preferredTemporalLayerCountAt(long index, int value) { preferredTemporalLayerCount(this.segment(), index, value); return this; }

        /// {@return `preferredConstantQp` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment preferredConstantQpAt(long index) { return preferredConstantQp(this.segment(), index); }
        /// Sets `preferredConstantQp` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer preferredConstantQpAt(long index, MemorySegment value) { preferredConstantQp(this.segment(), index, value); return this; }

        /// {@return `preferredMaxL0ReferenceCount` at the given index}
        /// @param index the index of the struct buffer
        public int preferredMaxL0ReferenceCountAt(long index) { return preferredMaxL0ReferenceCount(this.segment(), index); }
        /// Sets `preferredMaxL0ReferenceCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer preferredMaxL0ReferenceCountAt(long index, int value) { preferredMaxL0ReferenceCount(this.segment(), index, value); return this; }

        /// {@return `preferredMaxL1ReferenceCount` at the given index}
        /// @param index the index of the struct buffer
        public int preferredMaxL1ReferenceCountAt(long index) { return preferredMaxL1ReferenceCount(this.segment(), index); }
        /// Sets `preferredMaxL1ReferenceCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer preferredMaxL1ReferenceCountAt(long index, int value) { preferredMaxL1ReferenceCount(this.segment(), index, value); return this; }

        /// {@return `preferredStdEntropyCodingModeFlag` at the given index}
        /// @param index the index of the struct buffer
        public int preferredStdEntropyCodingModeFlagAt(long index) { return preferredStdEntropyCodingModeFlag(this.segment(), index); }
        /// Sets `preferredStdEntropyCodingModeFlag` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer preferredStdEntropyCodingModeFlagAt(long index, int value) { preferredStdEntropyCodingModeFlag(this.segment(), index, value); return this; }

    }
}
