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
/// struct VkVideoEncodeH265NaluSliceSegmentInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     int32_t constantQp;
///     const StdVideoEncodeH265SliceSegmentHeader* pStdSliceSegmentHeader;
/// };
/// ```
public sealed class VkVideoEncodeH265NaluSliceSegmentInfoKHR extends GroupType {
    /// The struct layout of `VkVideoEncodeH265NaluSliceSegmentInfoKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("constantQp"),
        ValueLayout.ADDRESS.withName("pStdSliceSegmentHeader")
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
    /// The byte offset of `constantQp`.
    public static final long OFFSET_constantQp = LAYOUT.byteOffset(PathElement.groupElement("constantQp"));
    /// The memory layout of `constantQp`.
    public static final MemoryLayout LAYOUT_constantQp = LAYOUT.select(PathElement.groupElement("constantQp"));
    /// The [VarHandle] of `constantQp` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_constantQp = LAYOUT.arrayElementVarHandle(PathElement.groupElement("constantQp"));
    /// The byte offset of `pStdSliceSegmentHeader`.
    public static final long OFFSET_pStdSliceSegmentHeader = LAYOUT.byteOffset(PathElement.groupElement("pStdSliceSegmentHeader"));
    /// The memory layout of `pStdSliceSegmentHeader`.
    public static final MemoryLayout LAYOUT_pStdSliceSegmentHeader = LAYOUT.select(PathElement.groupElement("pStdSliceSegmentHeader"));
    /// The [VarHandle] of `pStdSliceSegmentHeader` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pStdSliceSegmentHeader = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStdSliceSegmentHeader"));

    /// Creates `VkVideoEncodeH265NaluSliceSegmentInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoEncodeH265NaluSliceSegmentInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoEncodeH265NaluSliceSegmentInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeH265NaluSliceSegmentInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH265NaluSliceSegmentInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH265NaluSliceSegmentInfoKHR(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkVideoEncodeH265NaluSliceSegmentInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVideoEncodeH265NaluSliceSegmentInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeH265NaluSliceSegmentInfoKHR`
    public static VkVideoEncodeH265NaluSliceSegmentInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH265NaluSliceSegmentInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoEncodeH265NaluSliceSegmentInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeH265NaluSliceSegmentInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeH265NaluSliceSegmentInfoKHR copyFrom(VkVideoEncodeH265NaluSliceSegmentInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkVideoEncodeH265NaluSliceSegmentInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoEncodeH265NaluSliceSegmentInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `constantQp` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int constantQp(MemorySegment segment, long index) { return (int) VH_constantQp.get(segment, 0L, index); }
    /// {@return `constantQp`}
    public int constantQp() { return constantQp(this.segment(), 0L); }
    /// Sets `constantQp` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void constantQp(MemorySegment segment, long index, int value) { VH_constantQp.set(segment, 0L, index, value); }
    /// Sets `constantQp` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265NaluSliceSegmentInfoKHR constantQp(int value) { constantQp(this.segment(), 0L, value); return this; }

    /// {@return `pStdSliceSegmentHeader` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pStdSliceSegmentHeader(MemorySegment segment, long index) { return (MemorySegment) VH_pStdSliceSegmentHeader.get(segment, 0L, index); }
    /// {@return `pStdSliceSegmentHeader`}
    public MemorySegment pStdSliceSegmentHeader() { return pStdSliceSegmentHeader(this.segment(), 0L); }
    /// Sets `pStdSliceSegmentHeader` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pStdSliceSegmentHeader(MemorySegment segment, long index, MemorySegment value) { VH_pStdSliceSegmentHeader.set(segment, 0L, index, value); }
    /// Sets `pStdSliceSegmentHeader` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265NaluSliceSegmentInfoKHR pStdSliceSegmentHeader(MemorySegment value) { pStdSliceSegmentHeader(this.segment(), 0L, value); return this; }

    /// A buffer of [VkVideoEncodeH265NaluSliceSegmentInfoKHR].
    public static final class Buffer extends VkVideoEncodeH265NaluSliceSegmentInfoKHR {
        private final long elementCount;

        /// Creates `VkVideoEncodeH265NaluSliceSegmentInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkVideoEncodeH265NaluSliceSegmentInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkVideoEncodeH265NaluSliceSegmentInfoKHR`
        public VkVideoEncodeH265NaluSliceSegmentInfoKHR asSlice(long index) { return new VkVideoEncodeH265NaluSliceSegmentInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkVideoEncodeH265NaluSliceSegmentInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkVideoEncodeH265NaluSliceSegmentInfoKHR`
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

        /// {@return `constantQp` at the given index}
        /// @param index the index of the struct buffer
        public int constantQpAt(long index) { return constantQp(this.segment(), index); }
        /// Sets `constantQp` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer constantQpAt(long index, int value) { constantQp(this.segment(), index, value); return this; }

        /// {@return `pStdSliceSegmentHeader` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pStdSliceSegmentHeaderAt(long index) { return pStdSliceSegmentHeader(this.segment(), index); }
        /// Sets `pStdSliceSegmentHeader` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pStdSliceSegmentHeaderAt(long index, MemorySegment value) { pStdSliceSegmentHeader(this.segment(), index, value); return this; }

    }
}
