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
/// struct VkBlitImageInfo2 {
///     (int) VkStructureType sType;
///     const void* pNext;
///     (uint64_t) VkImage srcImage;
///     (int) VkImageLayout srcImageLayout;
///     (uint64_t) VkImage dstImage;
///     (int) VkImageLayout dstImageLayout;
///     uint32_t regionCount;
///     const VkImageBlit2* pRegions;
///     (int) VkFilter filter;
/// };
/// ```
public sealed class VkBlitImageInfo2 extends GroupType {
    /// The struct layout of `VkBlitImageInfo2`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_LONG.withName("srcImage"),
        ValueLayout.JAVA_INT.withName("srcImageLayout"),
        ValueLayout.JAVA_LONG.withName("dstImage"),
        ValueLayout.JAVA_INT.withName("dstImageLayout"),
        ValueLayout.JAVA_INT.withName("regionCount"),
        ValueLayout.ADDRESS.withName("pRegions"),
        ValueLayout.JAVA_INT.withName("filter")
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
    /// The byte offset of `srcImage`.
    public static final long OFFSET_srcImage = LAYOUT.byteOffset(PathElement.groupElement("srcImage"));
    /// The memory layout of `srcImage`.
    public static final MemoryLayout LAYOUT_srcImage = LAYOUT.select(PathElement.groupElement("srcImage"));
    /// The [VarHandle] of `srcImage` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_srcImage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcImage"));
    /// The byte offset of `srcImageLayout`.
    public static final long OFFSET_srcImageLayout = LAYOUT.byteOffset(PathElement.groupElement("srcImageLayout"));
    /// The memory layout of `srcImageLayout`.
    public static final MemoryLayout LAYOUT_srcImageLayout = LAYOUT.select(PathElement.groupElement("srcImageLayout"));
    /// The [VarHandle] of `srcImageLayout` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_srcImageLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("srcImageLayout"));
    /// The byte offset of `dstImage`.
    public static final long OFFSET_dstImage = LAYOUT.byteOffset(PathElement.groupElement("dstImage"));
    /// The memory layout of `dstImage`.
    public static final MemoryLayout LAYOUT_dstImage = LAYOUT.select(PathElement.groupElement("dstImage"));
    /// The [VarHandle] of `dstImage` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dstImage = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstImage"));
    /// The byte offset of `dstImageLayout`.
    public static final long OFFSET_dstImageLayout = LAYOUT.byteOffset(PathElement.groupElement("dstImageLayout"));
    /// The memory layout of `dstImageLayout`.
    public static final MemoryLayout LAYOUT_dstImageLayout = LAYOUT.select(PathElement.groupElement("dstImageLayout"));
    /// The [VarHandle] of `dstImageLayout` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_dstImageLayout = LAYOUT.arrayElementVarHandle(PathElement.groupElement("dstImageLayout"));
    /// The byte offset of `regionCount`.
    public static final long OFFSET_regionCount = LAYOUT.byteOffset(PathElement.groupElement("regionCount"));
    /// The memory layout of `regionCount`.
    public static final MemoryLayout LAYOUT_regionCount = LAYOUT.select(PathElement.groupElement("regionCount"));
    /// The [VarHandle] of `regionCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_regionCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("regionCount"));
    /// The byte offset of `pRegions`.
    public static final long OFFSET_pRegions = LAYOUT.byteOffset(PathElement.groupElement("pRegions"));
    /// The memory layout of `pRegions`.
    public static final MemoryLayout LAYOUT_pRegions = LAYOUT.select(PathElement.groupElement("pRegions"));
    /// The [VarHandle] of `pRegions` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pRegions = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pRegions"));
    /// The byte offset of `filter`.
    public static final long OFFSET_filter = LAYOUT.byteOffset(PathElement.groupElement("filter"));
    /// The memory layout of `filter`.
    public static final MemoryLayout LAYOUT_filter = LAYOUT.select(PathElement.groupElement("filter"));
    /// The [VarHandle] of `filter` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_filter = LAYOUT.arrayElementVarHandle(PathElement.groupElement("filter"));

    /// Creates `VkBlitImageInfo2` with the given segment.
    /// @param segment the memory segment
    public VkBlitImageInfo2(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkBlitImageInfo2` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkBlitImageInfo2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkBlitImageInfo2 ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkBlitImageInfo2(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkBlitImageInfo2` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkBlitImageInfo2` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkBlitImageInfo2`
    public static VkBlitImageInfo2 alloc(SegmentAllocator allocator) { return new VkBlitImageInfo2(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkBlitImageInfo2` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkBlitImageInfo2`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkBlitImageInfo2 copyFrom(VkBlitImageInfo2 src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkBlitImageInfo2 sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkBlitImageInfo2 pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `srcImage` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long srcImage(MemorySegment segment, long index) { return (long) VH_srcImage.get(segment, 0L, index); }
    /// {@return `srcImage`}
    public long srcImage() { return srcImage(this.segment(), 0L); }
    /// Sets `srcImage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void srcImage(MemorySegment segment, long index, long value) { VH_srcImage.set(segment, 0L, index, value); }
    /// Sets `srcImage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBlitImageInfo2 srcImage(long value) { srcImage(this.segment(), 0L, value); return this; }

    /// {@return `srcImageLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int srcImageLayout(MemorySegment segment, long index) { return (int) VH_srcImageLayout.get(segment, 0L, index); }
    /// {@return `srcImageLayout`}
    public int srcImageLayout() { return srcImageLayout(this.segment(), 0L); }
    /// Sets `srcImageLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void srcImageLayout(MemorySegment segment, long index, int value) { VH_srcImageLayout.set(segment, 0L, index, value); }
    /// Sets `srcImageLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBlitImageInfo2 srcImageLayout(int value) { srcImageLayout(this.segment(), 0L, value); return this; }

    /// {@return `dstImage` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long dstImage(MemorySegment segment, long index) { return (long) VH_dstImage.get(segment, 0L, index); }
    /// {@return `dstImage`}
    public long dstImage() { return dstImage(this.segment(), 0L); }
    /// Sets `dstImage` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dstImage(MemorySegment segment, long index, long value) { VH_dstImage.set(segment, 0L, index, value); }
    /// Sets `dstImage` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBlitImageInfo2 dstImage(long value) { dstImage(this.segment(), 0L, value); return this; }

    /// {@return `dstImageLayout` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int dstImageLayout(MemorySegment segment, long index) { return (int) VH_dstImageLayout.get(segment, 0L, index); }
    /// {@return `dstImageLayout`}
    public int dstImageLayout() { return dstImageLayout(this.segment(), 0L); }
    /// Sets `dstImageLayout` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void dstImageLayout(MemorySegment segment, long index, int value) { VH_dstImageLayout.set(segment, 0L, index, value); }
    /// Sets `dstImageLayout` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBlitImageInfo2 dstImageLayout(int value) { dstImageLayout(this.segment(), 0L, value); return this; }

    /// {@return `regionCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int regionCount(MemorySegment segment, long index) { return (int) VH_regionCount.get(segment, 0L, index); }
    /// {@return `regionCount`}
    public int regionCount() { return regionCount(this.segment(), 0L); }
    /// Sets `regionCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void regionCount(MemorySegment segment, long index, int value) { VH_regionCount.set(segment, 0L, index, value); }
    /// Sets `regionCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBlitImageInfo2 regionCount(int value) { regionCount(this.segment(), 0L, value); return this; }

    /// {@return `pRegions` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pRegions(MemorySegment segment, long index) { return (MemorySegment) VH_pRegions.get(segment, 0L, index); }
    /// {@return `pRegions`}
    public MemorySegment pRegions() { return pRegions(this.segment(), 0L); }
    /// Sets `pRegions` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pRegions(MemorySegment segment, long index, MemorySegment value) { VH_pRegions.set(segment, 0L, index, value); }
    /// Sets `pRegions` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBlitImageInfo2 pRegions(MemorySegment value) { pRegions(this.segment(), 0L, value); return this; }

    /// {@return `filter` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int filter(MemorySegment segment, long index) { return (int) VH_filter.get(segment, 0L, index); }
    /// {@return `filter`}
    public int filter() { return filter(this.segment(), 0L); }
    /// Sets `filter` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void filter(MemorySegment segment, long index, int value) { VH_filter.set(segment, 0L, index, value); }
    /// Sets `filter` with the given value.
    /// @param value the value
    /// @return `this`
    public VkBlitImageInfo2 filter(int value) { filter(this.segment(), 0L, value); return this; }

    /// A buffer of [VkBlitImageInfo2].
    public static final class Buffer extends VkBlitImageInfo2 {
        private final long elementCount;

        /// Creates `VkBlitImageInfo2.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkBlitImageInfo2`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkBlitImageInfo2`
        public VkBlitImageInfo2 asSlice(long index) { return new VkBlitImageInfo2(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkBlitImageInfo2`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkBlitImageInfo2`
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

        /// {@return `srcImage` at the given index}
        /// @param index the index of the struct buffer
        public long srcImageAt(long index) { return srcImage(this.segment(), index); }
        /// Sets `srcImage` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer srcImageAt(long index, long value) { srcImage(this.segment(), index, value); return this; }

        /// {@return `srcImageLayout` at the given index}
        /// @param index the index of the struct buffer
        public int srcImageLayoutAt(long index) { return srcImageLayout(this.segment(), index); }
        /// Sets `srcImageLayout` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer srcImageLayoutAt(long index, int value) { srcImageLayout(this.segment(), index, value); return this; }

        /// {@return `dstImage` at the given index}
        /// @param index the index of the struct buffer
        public long dstImageAt(long index) { return dstImage(this.segment(), index); }
        /// Sets `dstImage` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer dstImageAt(long index, long value) { dstImage(this.segment(), index, value); return this; }

        /// {@return `dstImageLayout` at the given index}
        /// @param index the index of the struct buffer
        public int dstImageLayoutAt(long index) { return dstImageLayout(this.segment(), index); }
        /// Sets `dstImageLayout` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer dstImageLayoutAt(long index, int value) { dstImageLayout(this.segment(), index, value); return this; }

        /// {@return `regionCount` at the given index}
        /// @param index the index of the struct buffer
        public int regionCountAt(long index) { return regionCount(this.segment(), index); }
        /// Sets `regionCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer regionCountAt(long index, int value) { regionCount(this.segment(), index, value); return this; }

        /// {@return `pRegions` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pRegionsAt(long index) { return pRegions(this.segment(), index); }
        /// Sets `pRegions` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pRegionsAt(long index, MemorySegment value) { pRegions(this.segment(), index, value); return this; }

        /// {@return `filter` at the given index}
        /// @param index the index of the struct buffer
        public int filterAt(long index) { return filter(this.segment(), index); }
        /// Sets `filter` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer filterAt(long index, int value) { filter(this.segment(), index, value); return this; }

    }
}
