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
/// struct VkVideoEncodeH265PictureInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t naluSliceSegmentEntryCount;
///     const VkVideoEncodeH265NaluSliceSegmentInfoKHR* pNaluSliceSegmentEntries;
///     const StdVideoEncodeH265PictureInfo* pStdPictureInfo;
/// };
/// ```
public sealed class VkVideoEncodeH265PictureInfoKHR extends GroupType {
    /// The struct layout of `VkVideoEncodeH265PictureInfoKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("naluSliceSegmentEntryCount"),
        ValueLayout.ADDRESS.withName("pNaluSliceSegmentEntries"),
        ValueLayout.ADDRESS.withName("pStdPictureInfo")
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
    /// The byte offset of `naluSliceSegmentEntryCount`.
    public static final long OFFSET_naluSliceSegmentEntryCount = LAYOUT.byteOffset(PathElement.groupElement("naluSliceSegmentEntryCount"));
    /// The memory layout of `naluSliceSegmentEntryCount`.
    public static final MemoryLayout LAYOUT_naluSliceSegmentEntryCount = LAYOUT.select(PathElement.groupElement("naluSliceSegmentEntryCount"));
    /// The [VarHandle] of `naluSliceSegmentEntryCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_naluSliceSegmentEntryCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("naluSliceSegmentEntryCount"));
    /// The byte offset of `pNaluSliceSegmentEntries`.
    public static final long OFFSET_pNaluSliceSegmentEntries = LAYOUT.byteOffset(PathElement.groupElement("pNaluSliceSegmentEntries"));
    /// The memory layout of `pNaluSliceSegmentEntries`.
    public static final MemoryLayout LAYOUT_pNaluSliceSegmentEntries = LAYOUT.select(PathElement.groupElement("pNaluSliceSegmentEntries"));
    /// The [VarHandle] of `pNaluSliceSegmentEntries` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNaluSliceSegmentEntries = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNaluSliceSegmentEntries"));
    /// The byte offset of `pStdPictureInfo`.
    public static final long OFFSET_pStdPictureInfo = LAYOUT.byteOffset(PathElement.groupElement("pStdPictureInfo"));
    /// The memory layout of `pStdPictureInfo`.
    public static final MemoryLayout LAYOUT_pStdPictureInfo = LAYOUT.select(PathElement.groupElement("pStdPictureInfo"));
    /// The [VarHandle] of `pStdPictureInfo` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pStdPictureInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStdPictureInfo"));

    /// Creates `VkVideoEncodeH265PictureInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoEncodeH265PictureInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoEncodeH265PictureInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeH265PictureInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH265PictureInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH265PictureInfoKHR(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkVideoEncodeH265PictureInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkVideoEncodeH265PictureInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeH265PictureInfoKHR`
    public static VkVideoEncodeH265PictureInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH265PictureInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoEncodeH265PictureInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeH265PictureInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeH265PictureInfoKHR copyFrom(VkVideoEncodeH265PictureInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkVideoEncodeH265PictureInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoEncodeH265PictureInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `naluSliceSegmentEntryCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int naluSliceSegmentEntryCount(MemorySegment segment, long index) { return (int) VH_naluSliceSegmentEntryCount.get(segment, 0L, index); }
    /// {@return `naluSliceSegmentEntryCount`}
    public int naluSliceSegmentEntryCount() { return naluSliceSegmentEntryCount(this.segment(), 0L); }
    /// Sets `naluSliceSegmentEntryCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void naluSliceSegmentEntryCount(MemorySegment segment, long index, int value) { VH_naluSliceSegmentEntryCount.set(segment, 0L, index, value); }
    /// Sets `naluSliceSegmentEntryCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265PictureInfoKHR naluSliceSegmentEntryCount(int value) { naluSliceSegmentEntryCount(this.segment(), 0L, value); return this; }

    /// {@return `pNaluSliceSegmentEntries` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNaluSliceSegmentEntries(MemorySegment segment, long index) { return (MemorySegment) VH_pNaluSliceSegmentEntries.get(segment, 0L, index); }
    /// {@return `pNaluSliceSegmentEntries`}
    public MemorySegment pNaluSliceSegmentEntries() { return pNaluSliceSegmentEntries(this.segment(), 0L); }
    /// Sets `pNaluSliceSegmentEntries` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNaluSliceSegmentEntries(MemorySegment segment, long index, MemorySegment value) { VH_pNaluSliceSegmentEntries.set(segment, 0L, index, value); }
    /// Sets `pNaluSliceSegmentEntries` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265PictureInfoKHR pNaluSliceSegmentEntries(MemorySegment value) { pNaluSliceSegmentEntries(this.segment(), 0L, value); return this; }

    /// {@return `pStdPictureInfo` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pStdPictureInfo(MemorySegment segment, long index) { return (MemorySegment) VH_pStdPictureInfo.get(segment, 0L, index); }
    /// {@return `pStdPictureInfo`}
    public MemorySegment pStdPictureInfo() { return pStdPictureInfo(this.segment(), 0L); }
    /// Sets `pStdPictureInfo` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pStdPictureInfo(MemorySegment segment, long index, MemorySegment value) { VH_pStdPictureInfo.set(segment, 0L, index, value); }
    /// Sets `pStdPictureInfo` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH265PictureInfoKHR pStdPictureInfo(MemorySegment value) { pStdPictureInfo(this.segment(), 0L, value); return this; }

    /// A buffer of [VkVideoEncodeH265PictureInfoKHR].
    public static final class Buffer extends VkVideoEncodeH265PictureInfoKHR {
        private final long elementCount;

        /// Creates `VkVideoEncodeH265PictureInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkVideoEncodeH265PictureInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkVideoEncodeH265PictureInfoKHR`
        public VkVideoEncodeH265PictureInfoKHR asSlice(long index) { return new VkVideoEncodeH265PictureInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkVideoEncodeH265PictureInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkVideoEncodeH265PictureInfoKHR`
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

        /// {@return `naluSliceSegmentEntryCount` at the given index}
        /// @param index the index of the struct buffer
        public int naluSliceSegmentEntryCountAt(long index) { return naluSliceSegmentEntryCount(this.segment(), index); }
        /// Sets `naluSliceSegmentEntryCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer naluSliceSegmentEntryCountAt(long index, int value) { naluSliceSegmentEntryCount(this.segment(), index, value); return this; }

        /// {@return `pNaluSliceSegmentEntries` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pNaluSliceSegmentEntriesAt(long index) { return pNaluSliceSegmentEntries(this.segment(), index); }
        /// Sets `pNaluSliceSegmentEntries` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pNaluSliceSegmentEntriesAt(long index, MemorySegment value) { pNaluSliceSegmentEntries(this.segment(), index, value); return this; }

        /// {@return `pStdPictureInfo` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pStdPictureInfoAt(long index) { return pStdPictureInfo(this.segment(), index); }
        /// Sets `pStdPictureInfo` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pStdPictureInfoAt(long index, MemorySegment value) { pStdPictureInfo(this.segment(), index, value); return this; }

    }
}
