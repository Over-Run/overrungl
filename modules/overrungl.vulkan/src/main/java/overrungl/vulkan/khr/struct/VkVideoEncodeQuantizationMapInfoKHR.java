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
/// struct VkVideoEncodeQuantizationMapInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) VkImageView quantizationMap;
///     (struct VkExtent2D) VkExtent2D quantizationMapExtent;
/// };
/// ```
public sealed class VkVideoEncodeQuantizationMapInfoKHR extends GroupType {
    /// The struct layout of `VkVideoEncodeQuantizationMapInfoKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("quantizationMap"),
        overrungl.vulkan.struct.VkExtent2D.LAYOUT.withName("quantizationMapExtent")
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
    /// The byte offset of `quantizationMap`.
    public static final long OFFSET_quantizationMap = LAYOUT.byteOffset(PathElement.groupElement("quantizationMap"));
    /// The memory layout of `quantizationMap`.
    public static final MemoryLayout LAYOUT_quantizationMap = LAYOUT.select(PathElement.groupElement("quantizationMap"));
    /// The [VarHandle] of `quantizationMap` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_quantizationMap = LAYOUT.arrayElementVarHandle(PathElement.groupElement("quantizationMap"));
    /// The byte offset of `quantizationMapExtent`.
    public static final long OFFSET_quantizationMapExtent = LAYOUT.byteOffset(PathElement.groupElement("quantizationMapExtent"));
    /// The memory layout of `quantizationMapExtent`.
    public static final MemoryLayout LAYOUT_quantizationMapExtent = LAYOUT.select(PathElement.groupElement("quantizationMapExtent"));

    /// Creates `VkVideoEncodeQuantizationMapInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoEncodeQuantizationMapInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoEncodeQuantizationMapInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeQuantizationMapInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeQuantizationMapInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeQuantizationMapInfoKHR(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkVideoEncodeQuantizationMapInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVideoEncodeQuantizationMapInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeQuantizationMapInfoKHR`
    public static VkVideoEncodeQuantizationMapInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeQuantizationMapInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoEncodeQuantizationMapInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeQuantizationMapInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeQuantizationMapInfoKHR copyFrom(VkVideoEncodeQuantizationMapInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkVideoEncodeQuantizationMapInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoEncodeQuantizationMapInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `quantizationMap` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long quantizationMap(MemorySegment segment, long index) { return (long) VH_quantizationMap.get(segment, 0L, index); }
    /// {@return `quantizationMap`}
    public long quantizationMap() { return quantizationMap(this.segment(), 0L); }
    /// Sets `quantizationMap` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void quantizationMap(MemorySegment segment, long index, long value) { VH_quantizationMap.set(segment, 0L, index, value); }
    /// Sets `quantizationMap` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeQuantizationMapInfoKHR quantizationMap(long value) { quantizationMap(this.segment(), 0L, value); return this; }

    /// {@return `quantizationMapExtent` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment quantizationMapExtent(MemorySegment segment, long index) { return segment.asSlice(LAYOUT.scale(OFFSET_quantizationMapExtent, index), LAYOUT_quantizationMapExtent); }
    /// {@return `quantizationMapExtent`}
    public MemorySegment quantizationMapExtent() { return quantizationMapExtent(this.segment(), 0L); }
    /// Sets `quantizationMapExtent` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void quantizationMapExtent(MemorySegment segment, long index, MemorySegment value) { MemorySegment.copy(value, 0L, segment, LAYOUT.scale(OFFSET_quantizationMapExtent, index), LAYOUT_quantizationMapExtent.byteSize()); }
    /// Sets `quantizationMapExtent` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeQuantizationMapInfoKHR quantizationMapExtent(MemorySegment value) { quantizationMapExtent(this.segment(), 0L, value); return this; }

    /// A buffer of [VkVideoEncodeQuantizationMapInfoKHR].
    public static final class Buffer extends VkVideoEncodeQuantizationMapInfoKHR {
        private final long elementCount;

        /// Creates `VkVideoEncodeQuantizationMapInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkVideoEncodeQuantizationMapInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkVideoEncodeQuantizationMapInfoKHR`
        public VkVideoEncodeQuantizationMapInfoKHR asSlice(long index) { return new VkVideoEncodeQuantizationMapInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkVideoEncodeQuantizationMapInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkVideoEncodeQuantizationMapInfoKHR`
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

        /// {@return `quantizationMap` at the given index}
        /// @param index the index of the struct buffer
        public long quantizationMapAt(long index) { return quantizationMap(this.segment(), index); }
        /// Sets `quantizationMap` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer quantizationMapAt(long index, long value) { quantizationMap(this.segment(), index, value); return this; }

        /// {@return `quantizationMapExtent` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment quantizationMapExtentAt(long index) { return quantizationMapExtent(this.segment(), index); }
        /// Sets `quantizationMapExtent` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer quantizationMapExtentAt(long index, MemorySegment value) { quantizationMapExtent(this.segment(), index, value); return this; }

    }
}
