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
package overrungl.vulkan.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkSpecializationInfo {
///     uint32_t mapEntryCount;
///     const VkSpecializationMapEntry* pMapEntries;
///     size_t dataSize;
///     const void* pData;
/// };
/// ```
public sealed class VkSpecializationInfo extends GroupType {
    /// The struct layout of `VkSpecializationInfo`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("mapEntryCount"),
        ValueLayout.ADDRESS.withName("pMapEntries"),
        CanonicalTypes.SIZE_T.withName("dataSize"),
        ValueLayout.ADDRESS.withName("pData")
    );
    /// The byte offset of `mapEntryCount`.
    public static final long OFFSET_mapEntryCount = LAYOUT.byteOffset(PathElement.groupElement("mapEntryCount"));
    /// The memory layout of `mapEntryCount`.
    public static final MemoryLayout LAYOUT_mapEntryCount = LAYOUT.select(PathElement.groupElement("mapEntryCount"));
    /// The [VarHandle] of `mapEntryCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_mapEntryCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("mapEntryCount"));
    /// The byte offset of `pMapEntries`.
    public static final long OFFSET_pMapEntries = LAYOUT.byteOffset(PathElement.groupElement("pMapEntries"));
    /// The memory layout of `pMapEntries`.
    public static final MemoryLayout LAYOUT_pMapEntries = LAYOUT.select(PathElement.groupElement("pMapEntries"));
    /// The [VarHandle] of `pMapEntries` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pMapEntries = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pMapEntries"));
    /// The byte offset of `dataSize`.
    public static final long OFFSET_dataSize = LAYOUT.byteOffset(PathElement.groupElement("dataSize"));
    /// The memory layout of `dataSize`.
    public static final MemoryLayout LAYOUT_dataSize = LAYOUT.select(PathElement.groupElement("dataSize"));
    /// The [VarHandle] of `dataSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dataSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dataSize"));
    /// The byte offset of `pData`.
    public static final long OFFSET_pData = LAYOUT.byteOffset(PathElement.groupElement("pData"));
    /// The memory layout of `pData`.
    public static final MemoryLayout LAYOUT_pData = LAYOUT.select(PathElement.groupElement("pData"));
    /// The [VarHandle] of `pData` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pData = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pData"));

    /// Creates `VkSpecializationInfo` with the given segment.
    /// @param segment the memory segment
    public VkSpecializationInfo(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkSpecializationInfo` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkSpecializationInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkSpecializationInfo ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkSpecializationInfo(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkSpecializationInfo` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkSpecializationInfo` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkSpecializationInfo`
    public static VkSpecializationInfo alloc(SegmentAllocator allocator) { return new VkSpecializationInfo(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkSpecializationInfo` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkSpecializationInfo`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkSpecializationInfo copyFrom(VkSpecializationInfo src) { this.segment().copyFrom(src.segment()); return this; }

    /// Converts this instance to a buffer.
    /// @return the buffer
    public Buffer asBuffer() { if (this instanceof Buffer buf) return buf; else return new Buffer(this.segment(), this.estimateCount()); }

    /// {@return `mapEntryCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int mapEntryCount(MemorySegment segment, long index) { return (int) VH_mapEntryCount.get(segment, 0L, index); }
    /// {@return `mapEntryCount`}
    public int mapEntryCount() { return mapEntryCount(this.segment(), 0L); }
    /// Sets `mapEntryCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void mapEntryCount(MemorySegment segment, long index, int value) { VH_mapEntryCount.set(segment, 0L, index, value); }
    /// Sets `mapEntryCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSpecializationInfo mapEntryCount(int value) { mapEntryCount(this.segment(), 0L, value); return this; }

    /// {@return `pMapEntries` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pMapEntries(MemorySegment segment, long index) { return (MemorySegment) VH_pMapEntries.get(segment, 0L, index); }
    /// {@return `pMapEntries`}
    public MemorySegment pMapEntries() { return pMapEntries(this.segment(), 0L); }
    /// Sets `pMapEntries` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pMapEntries(MemorySegment segment, long index, MemorySegment value) { VH_pMapEntries.set(segment, 0L, index, value); }
    /// Sets `pMapEntries` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSpecializationInfo pMapEntries(MemorySegment value) { pMapEntries(this.segment(), 0L, value); return this; }

    /// {@return `dataSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long dataSize(MemorySegment segment, long index) { return MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, VH_dataSize.get(segment, 0L, index)); }
    /// {@return `dataSize`}
    public long dataSize() { return dataSize(this.segment(), 0L); }
    /// Sets `dataSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dataSize(MemorySegment segment, long index, long value) { VH_dataSize.set(segment, 0L, index, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, value)); }
    /// Sets `dataSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSpecializationInfo dataSize(long value) { dataSize(this.segment(), 0L, value); return this; }

    /// {@return `pData` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pData(MemorySegment segment, long index) { return (MemorySegment) VH_pData.get(segment, 0L, index); }
    /// {@return `pData`}
    public MemorySegment pData() { return pData(this.segment(), 0L); }
    /// Sets `pData` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pData(MemorySegment segment, long index, MemorySegment value) { VH_pData.set(segment, 0L, index, value); }
    /// Sets `pData` with the given value.
    /// @param value the value
    /// @return `this`
    public VkSpecializationInfo pData(MemorySegment value) { pData(this.segment(), 0L, value); return this; }

    /// A buffer of [VkSpecializationInfo].
    public static final class Buffer extends VkSpecializationInfo {
        private final long elementCount;

        /// Creates `VkSpecializationInfo.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkSpecializationInfo`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkSpecializationInfo`
        public VkSpecializationInfo asSlice(long index) { return new VkSpecializationInfo(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkSpecializationInfo`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkSpecializationInfo`
        public Buffer asSlice(long index, long count) { return new Buffer(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT.byteSize() * count), count); }

        /// {@return `mapEntryCount` at the given index}
        /// @param index the index of the struct buffer
        public int mapEntryCountAt(long index) { return mapEntryCount(this.segment(), index); }
        /// Sets `mapEntryCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer mapEntryCountAt(long index, int value) { mapEntryCount(this.segment(), index, value); return this; }

        /// {@return `pMapEntries` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pMapEntriesAt(long index) { return pMapEntries(this.segment(), index); }
        /// Sets `pMapEntries` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pMapEntriesAt(long index, MemorySegment value) { pMapEntries(this.segment(), index, value); return this; }

        /// {@return `dataSize` at the given index}
        /// @param index the index of the struct buffer
        public long dataSizeAt(long index) { return dataSize(this.segment(), index); }
        /// Sets `dataSize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer dataSizeAt(long index, long value) { dataSize(this.segment(), index, value); return this; }

        /// {@return `pData` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pDataAt(long index) { return pData(this.segment(), index); }
        /// Sets `pData` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pDataAt(long index, MemorySegment value) { pData(this.segment(), index, value); return this; }

    }
}
