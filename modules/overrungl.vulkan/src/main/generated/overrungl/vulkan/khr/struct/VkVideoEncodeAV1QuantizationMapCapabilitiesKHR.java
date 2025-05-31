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
/// struct VkVideoEncodeAV1QuantizationMapCapabilitiesKHR {
///     (int) VkStructureType sType;
///     void* pNext;
///     int32_t minQIndexDelta;
///     int32_t maxQIndexDelta;
/// };
/// ```
public sealed class VkVideoEncodeAV1QuantizationMapCapabilitiesKHR extends GroupType {
    /// The struct layout of `VkVideoEncodeAV1QuantizationMapCapabilitiesKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("minQIndexDelta"),
        ValueLayout.JAVA_INT.withName("maxQIndexDelta")
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
    /// The byte offset of `minQIndexDelta`.
    public static final long OFFSET_minQIndexDelta = LAYOUT.byteOffset(PathElement.groupElement("minQIndexDelta"));
    /// The memory layout of `minQIndexDelta`.
    public static final MemoryLayout LAYOUT_minQIndexDelta = LAYOUT.select(PathElement.groupElement("minQIndexDelta"));
    /// The [VarHandle] of `minQIndexDelta` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_minQIndexDelta = LAYOUT.arrayElementVarHandle(PathElement.groupElement("minQIndexDelta"));
    /// The byte offset of `maxQIndexDelta`.
    public static final long OFFSET_maxQIndexDelta = LAYOUT.byteOffset(PathElement.groupElement("maxQIndexDelta"));
    /// The memory layout of `maxQIndexDelta`.
    public static final MemoryLayout LAYOUT_maxQIndexDelta = LAYOUT.select(PathElement.groupElement("maxQIndexDelta"));
    /// The [VarHandle] of `maxQIndexDelta` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_maxQIndexDelta = LAYOUT.arrayElementVarHandle(PathElement.groupElement("maxQIndexDelta"));

    /// Creates `VkVideoEncodeAV1QuantizationMapCapabilitiesKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoEncodeAV1QuantizationMapCapabilitiesKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoEncodeAV1QuantizationMapCapabilitiesKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeAV1QuantizationMapCapabilitiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeAV1QuantizationMapCapabilitiesKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeAV1QuantizationMapCapabilitiesKHR(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkVideoEncodeAV1QuantizationMapCapabilitiesKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVideoEncodeAV1QuantizationMapCapabilitiesKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeAV1QuantizationMapCapabilitiesKHR`
    public static VkVideoEncodeAV1QuantizationMapCapabilitiesKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeAV1QuantizationMapCapabilitiesKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoEncodeAV1QuantizationMapCapabilitiesKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeAV1QuantizationMapCapabilitiesKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeAV1QuantizationMapCapabilitiesKHR copyFrom(VkVideoEncodeAV1QuantizationMapCapabilitiesKHR src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkVideoEncodeAV1QuantizationMapCapabilitiesKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoEncodeAV1QuantizationMapCapabilitiesKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `minQIndexDelta` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int minQIndexDelta(MemorySegment segment, long index) { return (int) VH_minQIndexDelta.get(segment, 0L, index); }
    /// {@return `minQIndexDelta`}
    public int minQIndexDelta() { return minQIndexDelta(this.segment(), 0L); }
    /// Sets `minQIndexDelta` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void minQIndexDelta(MemorySegment segment, long index, int value) { VH_minQIndexDelta.set(segment, 0L, index, value); }
    /// Sets `minQIndexDelta` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QuantizationMapCapabilitiesKHR minQIndexDelta(int value) { minQIndexDelta(this.segment(), 0L, value); return this; }

    /// {@return `maxQIndexDelta` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int maxQIndexDelta(MemorySegment segment, long index) { return (int) VH_maxQIndexDelta.get(segment, 0L, index); }
    /// {@return `maxQIndexDelta`}
    public int maxQIndexDelta() { return maxQIndexDelta(this.segment(), 0L); }
    /// Sets `maxQIndexDelta` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void maxQIndexDelta(MemorySegment segment, long index, int value) { VH_maxQIndexDelta.set(segment, 0L, index, value); }
    /// Sets `maxQIndexDelta` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeAV1QuantizationMapCapabilitiesKHR maxQIndexDelta(int value) { maxQIndexDelta(this.segment(), 0L, value); return this; }

    /// A buffer of [VkVideoEncodeAV1QuantizationMapCapabilitiesKHR].
    public static final class Buffer extends VkVideoEncodeAV1QuantizationMapCapabilitiesKHR {
        private final long elementCount;

        /// Creates `VkVideoEncodeAV1QuantizationMapCapabilitiesKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkVideoEncodeAV1QuantizationMapCapabilitiesKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkVideoEncodeAV1QuantizationMapCapabilitiesKHR`
        public VkVideoEncodeAV1QuantizationMapCapabilitiesKHR asSlice(long index) { return new VkVideoEncodeAV1QuantizationMapCapabilitiesKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkVideoEncodeAV1QuantizationMapCapabilitiesKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkVideoEncodeAV1QuantizationMapCapabilitiesKHR`
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

        /// {@return `minQIndexDelta` at the given index}
        /// @param index the index of the struct buffer
        public int minQIndexDeltaAt(long index) { return minQIndexDelta(this.segment(), index); }
        /// Sets `minQIndexDelta` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer minQIndexDeltaAt(long index, int value) { minQIndexDelta(this.segment(), index, value); return this; }

        /// {@return `maxQIndexDelta` at the given index}
        /// @param index the index of the struct buffer
        public int maxQIndexDeltaAt(long index) { return maxQIndexDelta(this.segment(), index); }
        /// Sets `maxQIndexDelta` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer maxQIndexDeltaAt(long index, int value) { maxQIndexDelta(this.segment(), index, value); return this; }

    }
}
