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
/// struct VkVideoEncodeH264PictureInfoKHR {
///     (int) VkStructureType sType;
///     const void* pNext;
///     uint32_t naluSliceEntryCount;
///     const VkVideoEncodeH264NaluSliceInfoKHR* pNaluSliceEntries;
///     const StdVideoEncodeH264PictureInfo* pStdPictureInfo;
///     (uint32_t) VkBool32 generatePrefixNalu;
/// };
/// ```
public sealed class VkVideoEncodeH264PictureInfoKHR extends GroupType {
    /// The struct layout of `VkVideoEncodeH264PictureInfoKHR`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("naluSliceEntryCount"),
        ValueLayout.ADDRESS.withName("pNaluSliceEntries"),
        ValueLayout.ADDRESS.withName("pStdPictureInfo"),
        ValueLayout.JAVA_INT.withName("generatePrefixNalu")
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
    /// The byte offset of `naluSliceEntryCount`.
    public static final long OFFSET_naluSliceEntryCount = LAYOUT.byteOffset(PathElement.groupElement("naluSliceEntryCount"));
    /// The memory layout of `naluSliceEntryCount`.
    public static final MemoryLayout LAYOUT_naluSliceEntryCount = LAYOUT.select(PathElement.groupElement("naluSliceEntryCount"));
    /// The [VarHandle] of `naluSliceEntryCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_naluSliceEntryCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("naluSliceEntryCount"));
    /// The byte offset of `pNaluSliceEntries`.
    public static final long OFFSET_pNaluSliceEntries = LAYOUT.byteOffset(PathElement.groupElement("pNaluSliceEntries"));
    /// The memory layout of `pNaluSliceEntries`.
    public static final MemoryLayout LAYOUT_pNaluSliceEntries = LAYOUT.select(PathElement.groupElement("pNaluSliceEntries"));
    /// The [VarHandle] of `pNaluSliceEntries` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pNaluSliceEntries = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pNaluSliceEntries"));
    /// The byte offset of `pStdPictureInfo`.
    public static final long OFFSET_pStdPictureInfo = LAYOUT.byteOffset(PathElement.groupElement("pStdPictureInfo"));
    /// The memory layout of `pStdPictureInfo`.
    public static final MemoryLayout LAYOUT_pStdPictureInfo = LAYOUT.select(PathElement.groupElement("pStdPictureInfo"));
    /// The [VarHandle] of `pStdPictureInfo` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pStdPictureInfo = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pStdPictureInfo"));
    /// The byte offset of `generatePrefixNalu`.
    public static final long OFFSET_generatePrefixNalu = LAYOUT.byteOffset(PathElement.groupElement("generatePrefixNalu"));
    /// The memory layout of `generatePrefixNalu`.
    public static final MemoryLayout LAYOUT_generatePrefixNalu = LAYOUT.select(PathElement.groupElement("generatePrefixNalu"));
    /// The [VarHandle] of `generatePrefixNalu` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_generatePrefixNalu = LAYOUT.arrayElementVarHandle(PathElement.groupElement("generatePrefixNalu"));

    /// Creates `VkVideoEncodeH264PictureInfoKHR` with the given segment.
    /// @param segment the memory segment
    public VkVideoEncodeH264PictureInfoKHR(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkVideoEncodeH264PictureInfoKHR` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkVideoEncodeH264PictureInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkVideoEncodeH264PictureInfoKHR ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkVideoEncodeH264PictureInfoKHR(segment.reinterpret(LAYOUT.byteSize())); }

    /// Creates `VkVideoEncodeH264PictureInfoKHR` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.reinterpret(LAYOUT.scale(0, count)), count); }

    /// Allocates a `VkVideoEncodeH264PictureInfoKHR` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkVideoEncodeH264PictureInfoKHR`
    public static VkVideoEncodeH264PictureInfoKHR alloc(SegmentAllocator allocator) { return new VkVideoEncodeH264PictureInfoKHR(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkVideoEncodeH264PictureInfoKHR` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkVideoEncodeH264PictureInfoKHR`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkVideoEncodeH264PictureInfoKHR copyFrom(VkVideoEncodeH264PictureInfoKHR src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkVideoEncodeH264PictureInfoKHR sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkVideoEncodeH264PictureInfoKHR pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `naluSliceEntryCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int naluSliceEntryCount(MemorySegment segment, long index) { return (int) VH_naluSliceEntryCount.get(segment, 0L, index); }
    /// {@return `naluSliceEntryCount`}
    public int naluSliceEntryCount() { return naluSliceEntryCount(this.segment(), 0L); }
    /// Sets `naluSliceEntryCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void naluSliceEntryCount(MemorySegment segment, long index, int value) { VH_naluSliceEntryCount.set(segment, 0L, index, value); }
    /// Sets `naluSliceEntryCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264PictureInfoKHR naluSliceEntryCount(int value) { naluSliceEntryCount(this.segment(), 0L, value); return this; }

    /// {@return `pNaluSliceEntries` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pNaluSliceEntries(MemorySegment segment, long index) { return (MemorySegment) VH_pNaluSliceEntries.get(segment, 0L, index); }
    /// {@return `pNaluSliceEntries`}
    public MemorySegment pNaluSliceEntries() { return pNaluSliceEntries(this.segment(), 0L); }
    /// Sets `pNaluSliceEntries` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pNaluSliceEntries(MemorySegment segment, long index, MemorySegment value) { VH_pNaluSliceEntries.set(segment, 0L, index, value); }
    /// Sets `pNaluSliceEntries` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264PictureInfoKHR pNaluSliceEntries(MemorySegment value) { pNaluSliceEntries(this.segment(), 0L, value); return this; }

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
    public VkVideoEncodeH264PictureInfoKHR pStdPictureInfo(MemorySegment value) { pStdPictureInfo(this.segment(), 0L, value); return this; }

    /// {@return `generatePrefixNalu` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int generatePrefixNalu(MemorySegment segment, long index) { return (int) VH_generatePrefixNalu.get(segment, 0L, index); }
    /// {@return `generatePrefixNalu`}
    public int generatePrefixNalu() { return generatePrefixNalu(this.segment(), 0L); }
    /// Sets `generatePrefixNalu` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void generatePrefixNalu(MemorySegment segment, long index, int value) { VH_generatePrefixNalu.set(segment, 0L, index, value); }
    /// Sets `generatePrefixNalu` with the given value.
    /// @param value the value
    /// @return `this`
    public VkVideoEncodeH264PictureInfoKHR generatePrefixNalu(int value) { generatePrefixNalu(this.segment(), 0L, value); return this; }

    /// A buffer of [VkVideoEncodeH264PictureInfoKHR].
    public static final class Buffer extends VkVideoEncodeH264PictureInfoKHR {
        private final long elementCount;

        /// Creates `VkVideoEncodeH264PictureInfoKHR.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkVideoEncodeH264PictureInfoKHR`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkVideoEncodeH264PictureInfoKHR`
        public VkVideoEncodeH264PictureInfoKHR asSlice(long index) { return new VkVideoEncodeH264PictureInfoKHR(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkVideoEncodeH264PictureInfoKHR`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkVideoEncodeH264PictureInfoKHR`
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

        /// {@return `naluSliceEntryCount` at the given index}
        /// @param index the index of the struct buffer
        public int naluSliceEntryCountAt(long index) { return naluSliceEntryCount(this.segment(), index); }
        /// Sets `naluSliceEntryCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer naluSliceEntryCountAt(long index, int value) { naluSliceEntryCount(this.segment(), index, value); return this; }

        /// {@return `pNaluSliceEntries` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pNaluSliceEntriesAt(long index) { return pNaluSliceEntries(this.segment(), index); }
        /// Sets `pNaluSliceEntries` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pNaluSliceEntriesAt(long index, MemorySegment value) { pNaluSliceEntries(this.segment(), index, value); return this; }

        /// {@return `pStdPictureInfo` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pStdPictureInfoAt(long index) { return pStdPictureInfo(this.segment(), index); }
        /// Sets `pStdPictureInfo` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pStdPictureInfoAt(long index, MemorySegment value) { pStdPictureInfo(this.segment(), index, value); return this; }

        /// {@return `generatePrefixNalu` at the given index}
        /// @param index the index of the struct buffer
        public int generatePrefixNaluAt(long index) { return generatePrefixNalu(this.segment(), index); }
        /// Sets `generatePrefixNalu` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer generatePrefixNaluAt(long index, int value) { generatePrefixNalu(this.segment(), index, value); return this; }

    }
}
