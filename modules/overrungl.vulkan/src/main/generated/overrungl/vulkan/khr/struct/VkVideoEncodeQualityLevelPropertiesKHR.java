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
/// struct VkVideoEncodeQualityLevelPropertiesKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     (int) VkVideoEncodeRateControlModeFlagBitsKHR preferredRateControlMode;
///     uint32_t preferredRateControlLayerCount;
/// };
/// ```
public sealed class VkVideoEncodeQualityLevelPropertiesKHR extends GroupType {
    /// The struct layout of `VkVideoEncodeQualityLevelPropertiesKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("preferredRateControlMode"),
        ValueLayout.JAVA_INT.withName("preferredRateControlLayerCount")
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
    /// The byte offset of `preferredRateControlMode`.
    public static final long OFFSET_preferredRateControlMode = LAYOUT.byteOffset(PathElement.groupElement("preferredRateControlMode"));
    /// The memory layout of `preferredRateControlMode`.
    public static final MemoryLayout LAYOUT_preferredRateControlMode = LAYOUT.select(PathElement.groupElement("preferredRateControlMode"));
    /// The [VarHandle] of `preferredRateControlMode` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_preferredRateControlMode = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredRateControlMode"));
    /// The byte offset of `preferredRateControlLayerCount`.
    public static final long OFFSET_preferredRateControlLayerCount = LAYOUT.byteOffset(PathElement.groupElement("preferredRateControlLayerCount"));
    /// The memory layout of `preferredRateControlLayerCount`.
    public static final MemoryLayout LAYOUT_preferredRateControlLayerCount = LAYOUT.select(PathElement.groupElement("preferredRateControlLayerCount"));
    /// The [VarHandle] of `preferredRateControlLayerCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_preferredRateControlLayerCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("preferredRateControlLayerCount"));

    /// Creates `VkVideoEncodeQualityLevelPropertiesKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoEncodeQualityLevelPropertiesKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoEncodeQualityLevelPropertiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeQualityLevelPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeQualityLevelPropertiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeQualityLevelPropertiesKHR(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkVideoEncodeQualityLevelPropertiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVideoEncodeQualityLevelPropertiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeQualityLevelPropertiesKHR`
    public static VkVideoEncodeQualityLevelPropertiesKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeQualityLevelPropertiesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoEncodeQualityLevelPropertiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeQualityLevelPropertiesKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Allocates a `VkVideoEncodeQualityLevelPropertiesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param preferredRateControlMode `preferredRateControlMode`
    /// @param preferredRateControlLayerCount `preferredRateControlLayerCount`
    /// @return the allocated `VkVideoEncodeQualityLevelPropertiesKHR`
    public static VkVideoEncodeQualityLevelPropertiesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int preferredRateControlMode, int preferredRateControlLayerCount) {
        return alloc(allocator).sType(sType).pNext(pNext).preferredRateControlMode(preferredRateControlMode).preferredRateControlLayerCount(preferredRateControlLayerCount);
    }

    /// Allocates a `VkVideoEncodeQualityLevelPropertiesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @param preferredRateControlMode `preferredRateControlMode`
    /// @return the allocated `VkVideoEncodeQualityLevelPropertiesKHR`
    public static VkVideoEncodeQualityLevelPropertiesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext, int preferredRateControlMode) {
        return alloc(allocator).sType(sType).pNext(pNext).preferredRateControlMode(preferredRateControlMode);
    }

    /// Allocates a `VkVideoEncodeQualityLevelPropertiesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @param pNext `pNext`
    /// @return the allocated `VkVideoEncodeQualityLevelPropertiesKHR`
    public static VkVideoEncodeQualityLevelPropertiesKHR allocInit(SegmentAllocator allocator, int sType, MemorySegment pNext) {
        return alloc(allocator).sType(sType).pNext(pNext);
    }

    /// Allocates a `VkVideoEncodeQualityLevelPropertiesKHR` with the given segment allocator and arguments like initializer list.
    /// @param allocator the segment allocator
    /// @param sType `sType`
    /// @return the allocated `VkVideoEncodeQualityLevelPropertiesKHR`
    public static VkVideoEncodeQualityLevelPropertiesKHR allocInit(SegmentAllocator allocator, int sType) {
        return alloc(allocator).sType(sType);
    }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeQualityLevelPropertiesKHR copyFrom(VkVideoEncodeQualityLevelPropertiesKHR src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkVideoEncodeQualityLevelPropertiesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoEncodeQualityLevelPropertiesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `preferredRateControlMode` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int preferredRateControlMode(MemorySegment segment, long index) { return (int) VH_preferredRateControlMode.get(segment, 0L, index); }
    /// {@return `preferredRateControlMode`}
    public int preferredRateControlMode() { return preferredRateControlMode(this.segment(), 0L); }
    /// Sets `preferredRateControlMode` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void preferredRateControlMode(MemorySegment segment, long index, int value) { VH_preferredRateControlMode.set(segment, 0L, index, value); }
    /// Sets `preferredRateControlMode` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeQualityLevelPropertiesKHR preferredRateControlMode(int value) { preferredRateControlMode(this.segment(), 0L, value); return this; }

    /// {@return `preferredRateControlLayerCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int preferredRateControlLayerCount(MemorySegment segment, long index) { return (int) VH_preferredRateControlLayerCount.get(segment, 0L, index); }
    /// {@return `preferredRateControlLayerCount`}
    public int preferredRateControlLayerCount() { return preferredRateControlLayerCount(this.segment(), 0L); }
    /// Sets `preferredRateControlLayerCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void preferredRateControlLayerCount(MemorySegment segment, long index, int value) { VH_preferredRateControlLayerCount.set(segment, 0L, index, value); }
    /// Sets `preferredRateControlLayerCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeQualityLevelPropertiesKHR preferredRateControlLayerCount(int value) { preferredRateControlLayerCount(this.segment(), 0L, value); return this; }

    /// A buffer of [VkVideoEncodeQualityLevelPropertiesKHR].
    public static final class Buffer extends VkVideoEncodeQualityLevelPropertiesKHR {
        private final long elementCount;

        /// Creates `VkVideoEncodeQualityLevelPropertiesKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkVideoEncodeQualityLevelPropertiesKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkVideoEncodeQualityLevelPropertiesKHR`
        public VkVideoEncodeQualityLevelPropertiesKHR asSlice(long index) { return new VkVideoEncodeQualityLevelPropertiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkVideoEncodeQualityLevelPropertiesKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkVideoEncodeQualityLevelPropertiesKHR`
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

        /// {@return `preferredRateControlMode` at the given index}
        /// @param index the index of the struct buffer
        public int preferredRateControlModeAt(long index) { return preferredRateControlMode(this.segment(), index); }
        /// Sets `preferredRateControlMode` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer preferredRateControlModeAt(long index, int value) { preferredRateControlMode(this.segment(), index, value); return this; }

        /// {@return `preferredRateControlLayerCount` at the given index}
        /// @param index the index of the struct buffer
        public int preferredRateControlLayerCountAt(long index) { return preferredRateControlLayerCount(this.segment(), index); }
        /// Sets `preferredRateControlLayerCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer preferredRateControlLayerCountAt(long index, int value) { preferredRateControlLayerCount(this.segment(), index, value); return this; }

    }
}
