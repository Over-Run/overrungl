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
package overrungl.vulkan.ext.struct;

import java.lang.foreign.*;
import java.lang.foreign.MemoryLayout.PathElement;
import java.lang.invoke.*;
import overrungl.struct.*;
import overrungl.util.*;

/// ## Layout
/// ```
/// struct VkFrameBoundaryEXT {
///     VkStructureType sType;
///     const void* pNext;
///     VkFrameBoundaryFlagsEXT flags;
///     uint64_t frameID;
///     uint32_t imageCount;
///     const VkImage* pImages;
///     uint32_t bufferCount;
///     const VkBuffer* pBuffers;
///     uint64_t tagName;
///     size_t tagSize;
///     const void* pTag;
/// };
/// ```
public sealed class VkFrameBoundaryEXT extends GroupType {
    /// The struct layout of `VkFrameBoundaryEXT`.
    public static final GroupLayout LAYOUT = LayoutBuilder.struct(
        ValueLayout.JAVA_INT.withName("sType"),
        ValueLayout.ADDRESS.withName("pNext"),
        ValueLayout.JAVA_INT.withName("flags"),
        ValueLayout.JAVA_LONG.withName("frameID"),
        ValueLayout.JAVA_INT.withName("imageCount"),
        ValueLayout.ADDRESS.withName("pImages"),
        ValueLayout.JAVA_INT.withName("bufferCount"),
        ValueLayout.ADDRESS.withName("pBuffers"),
        ValueLayout.JAVA_LONG.withName("tagName"),
        CanonicalTypes.SIZE_T.withName("tagSize"),
        ValueLayout.ADDRESS.withName("pTag")
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
    /// The byte offset of `flags`.
    public static final long OFFSET_flags = LAYOUT.byteOffset(PathElement.groupElement("flags"));
    /// The memory layout of `flags`.
    public static final MemoryLayout LAYOUT_flags = LAYOUT.select(PathElement.groupElement("flags"));
    /// The [VarHandle] of `flags` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_flags = LAYOUT.arrayElementVarHandle(PathElement.groupElement("flags"));
    /// The byte offset of `frameID`.
    public static final long OFFSET_frameID = LAYOUT.byteOffset(PathElement.groupElement("frameID"));
    /// The memory layout of `frameID`.
    public static final MemoryLayout LAYOUT_frameID = LAYOUT.select(PathElement.groupElement("frameID"));
    /// The [VarHandle] of `frameID` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_frameID = LAYOUT.arrayElementVarHandle(PathElement.groupElement("frameID"));
    /// The byte offset of `imageCount`.
    public static final long OFFSET_imageCount = LAYOUT.byteOffset(PathElement.groupElement("imageCount"));
    /// The memory layout of `imageCount`.
    public static final MemoryLayout LAYOUT_imageCount = LAYOUT.select(PathElement.groupElement("imageCount"));
    /// The [VarHandle] of `imageCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_imageCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("imageCount"));
    /// The byte offset of `pImages`.
    public static final long OFFSET_pImages = LAYOUT.byteOffset(PathElement.groupElement("pImages"));
    /// The memory layout of `pImages`.
    public static final MemoryLayout LAYOUT_pImages = LAYOUT.select(PathElement.groupElement("pImages"));
    /// The [VarHandle] of `pImages` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pImages = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pImages"));
    /// The byte offset of `bufferCount`.
    public static final long OFFSET_bufferCount = LAYOUT.byteOffset(PathElement.groupElement("bufferCount"));
    /// The memory layout of `bufferCount`.
    public static final MemoryLayout LAYOUT_bufferCount = LAYOUT.select(PathElement.groupElement("bufferCount"));
    /// The [VarHandle] of `bufferCount` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_bufferCount = LAYOUT.arrayElementVarHandle(PathElement.groupElement("bufferCount"));
    /// The byte offset of `pBuffers`.
    public static final long OFFSET_pBuffers = LAYOUT.byteOffset(PathElement.groupElement("pBuffers"));
    /// The memory layout of `pBuffers`.
    public static final MemoryLayout LAYOUT_pBuffers = LAYOUT.select(PathElement.groupElement("pBuffers"));
    /// The [VarHandle] of `pBuffers` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pBuffers = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pBuffers"));
    /// The byte offset of `tagName`.
    public static final long OFFSET_tagName = LAYOUT.byteOffset(PathElement.groupElement("tagName"));
    /// The memory layout of `tagName`.
    public static final MemoryLayout LAYOUT_tagName = LAYOUT.select(PathElement.groupElement("tagName"));
    /// The [VarHandle] of `tagName` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_tagName = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tagName"));
    /// The byte offset of `tagSize`.
    public static final long OFFSET_tagSize = LAYOUT.byteOffset(PathElement.groupElement("tagSize"));
    /// The memory layout of `tagSize`.
    public static final MemoryLayout LAYOUT_tagSize = LAYOUT.select(PathElement.groupElement("tagSize"));
    /// The [VarHandle] of `tagSize` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_tagSize = LAYOUT.arrayElementVarHandle(PathElement.groupElement("tagSize"));
    /// The byte offset of `pTag`.
    public static final long OFFSET_pTag = LAYOUT.byteOffset(PathElement.groupElement("pTag"));
    /// The memory layout of `pTag`.
    public static final MemoryLayout LAYOUT_pTag = LAYOUT.select(PathElement.groupElement("pTag"));
    /// The [VarHandle] of `pTag` of type `(MemorySegment base, long baseOffset, long index)MemorySegment`.
    public static final VarHandle VH_pTag = LAYOUT.arrayElementVarHandle(PathElement.groupElement("pTag"));

    /// Creates `VkFrameBoundaryEXT` with the given segment.
    /// @param segment the memory segment
    public VkFrameBoundaryEXT(MemorySegment segment) { super(segment, LAYOUT); }

    /// Creates `VkFrameBoundaryEXT` with the given segment.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer of(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment, estimateCount(segment, LAYOUT)); }

    /// Creates `VkFrameBoundaryEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @return the created instance or `null` if the segment is `NULL`
    public static VkFrameBoundaryEXT ofNative(MemorySegment segment) { return MemoryUtil.isNullPointer(segment) ? null : new VkFrameBoundaryEXT(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.byteSize()) : segment); }

    /// Creates `VkFrameBoundaryEXT` with the given segment.
    ///
    /// Reinterprets the segment if zero-length.
    /// @param segment the memory segment
    /// @param count   the count of the buffer
    /// @return the created instance or `null` if the segment is `NULL`
    public static Buffer ofNative(MemorySegment segment, long count) { return MemoryUtil.isNullPointer(segment) ? null : new Buffer(segment.byteSize() == 0 ? segment.reinterpret(LAYOUT.scale(0, count)) : segment, count); }

    /// Allocates a `VkFrameBoundaryEXT` with the given segment allocator.
    /// @param allocator the segment allocator
    /// @return the allocated `VkFrameBoundaryEXT`
    public static VkFrameBoundaryEXT alloc(SegmentAllocator allocator) { return new VkFrameBoundaryEXT(allocator.allocate(LAYOUT)); }

    /// Allocates a `VkFrameBoundaryEXT` with the given segment allocator and count.
    /// @param allocator the segment allocator
    /// @param count     the count
    /// @return the allocated `VkFrameBoundaryEXT`
    public static Buffer alloc(SegmentAllocator allocator, long count) { return new Buffer(allocator.allocate(LAYOUT, count), count); }

    /// Copies from the given source.
    /// @param src the source
    /// @return `this`
    public VkFrameBoundaryEXT copyFrom(VkFrameBoundaryEXT src) { this.segment().copyFrom(src.segment()); return this; }

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
    public VkFrameBoundaryEXT sType(int value) { sType(this.segment(), 0L, value); return this; }

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
    public VkFrameBoundaryEXT pNext(MemorySegment value) { pNext(this.segment(), 0L, value); return this; }

    /// {@return `flags` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int flags(MemorySegment segment, long index) { return (int) VH_flags.get(segment, 0L, index); }
    /// {@return `flags`}
    public int flags() { return flags(this.segment(), 0L); }
    /// Sets `flags` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void flags(MemorySegment segment, long index, int value) { VH_flags.set(segment, 0L, index, value); }
    /// Sets `flags` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFrameBoundaryEXT flags(int value) { flags(this.segment(), 0L, value); return this; }

    /// {@return `frameID` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long frameID(MemorySegment segment, long index) { return (long) VH_frameID.get(segment, 0L, index); }
    /// {@return `frameID`}
    public long frameID() { return frameID(this.segment(), 0L); }
    /// Sets `frameID` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void frameID(MemorySegment segment, long index, long value) { VH_frameID.set(segment, 0L, index, value); }
    /// Sets `frameID` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFrameBoundaryEXT frameID(long value) { frameID(this.segment(), 0L, value); return this; }

    /// {@return `imageCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int imageCount(MemorySegment segment, long index) { return (int) VH_imageCount.get(segment, 0L, index); }
    /// {@return `imageCount`}
    public int imageCount() { return imageCount(this.segment(), 0L); }
    /// Sets `imageCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void imageCount(MemorySegment segment, long index, int value) { VH_imageCount.set(segment, 0L, index, value); }
    /// Sets `imageCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFrameBoundaryEXT imageCount(int value) { imageCount(this.segment(), 0L, value); return this; }

    /// {@return `pImages` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pImages(MemorySegment segment, long index) { return (MemorySegment) VH_pImages.get(segment, 0L, index); }
    /// {@return `pImages`}
    public MemorySegment pImages() { return pImages(this.segment(), 0L); }
    /// Sets `pImages` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pImages(MemorySegment segment, long index, MemorySegment value) { VH_pImages.set(segment, 0L, index, value); }
    /// Sets `pImages` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFrameBoundaryEXT pImages(MemorySegment value) { pImages(this.segment(), 0L, value); return this; }

    /// {@return `bufferCount` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static int bufferCount(MemorySegment segment, long index) { return (int) VH_bufferCount.get(segment, 0L, index); }
    /// {@return `bufferCount`}
    public int bufferCount() { return bufferCount(this.segment(), 0L); }
    /// Sets `bufferCount` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void bufferCount(MemorySegment segment, long index, int value) { VH_bufferCount.set(segment, 0L, index, value); }
    /// Sets `bufferCount` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFrameBoundaryEXT bufferCount(int value) { bufferCount(this.segment(), 0L, value); return this; }

    /// {@return `pBuffers` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pBuffers(MemorySegment segment, long index) { return (MemorySegment) VH_pBuffers.get(segment, 0L, index); }
    /// {@return `pBuffers`}
    public MemorySegment pBuffers() { return pBuffers(this.segment(), 0L); }
    /// Sets `pBuffers` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pBuffers(MemorySegment segment, long index, MemorySegment value) { VH_pBuffers.set(segment, 0L, index, value); }
    /// Sets `pBuffers` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFrameBoundaryEXT pBuffers(MemorySegment value) { pBuffers(this.segment(), 0L, value); return this; }

    /// {@return `tagName` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long tagName(MemorySegment segment, long index) { return (long) VH_tagName.get(segment, 0L, index); }
    /// {@return `tagName`}
    public long tagName() { return tagName(this.segment(), 0L); }
    /// Sets `tagName` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void tagName(MemorySegment segment, long index, long value) { VH_tagName.set(segment, 0L, index, value); }
    /// Sets `tagName` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFrameBoundaryEXT tagName(long value) { tagName(this.segment(), 0L, value); return this; }

    /// {@return `tagSize` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static long tagSize(MemorySegment segment, long index) { return MemoryUtil.wideningToLong(CanonicalTypes.SIZE_T, VH_tagSize.get(segment, 0L, index)); }
    /// {@return `tagSize`}
    public long tagSize() { return tagSize(this.segment(), 0L); }
    /// Sets `tagSize` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void tagSize(MemorySegment segment, long index, long value) { VH_tagSize.set(segment, 0L, index, MemoryUtil.narrowingLong(CanonicalTypes.SIZE_T, value)); }
    /// Sets `tagSize` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFrameBoundaryEXT tagSize(long value) { tagSize(this.segment(), 0L, value); return this; }

    /// {@return `pTag` at the given index}
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    public static MemorySegment pTag(MemorySegment segment, long index) { return (MemorySegment) VH_pTag.get(segment, 0L, index); }
    /// {@return `pTag`}
    public MemorySegment pTag() { return pTag(this.segment(), 0L); }
    /// Sets `pTag` with the given value at the given index.
    /// @param segment the segment of the struct
    /// @param index the index of the struct buffer
    /// @param value the value
    public static void pTag(MemorySegment segment, long index, MemorySegment value) { VH_pTag.set(segment, 0L, index, value); }
    /// Sets `pTag` with the given value.
    /// @param value the value
    /// @return `this`
    public VkFrameBoundaryEXT pTag(MemorySegment value) { pTag(this.segment(), 0L, value); return this; }

    /// A buffer of [VkFrameBoundaryEXT].
    public static final class Buffer extends VkFrameBoundaryEXT {
        private final long elementCount;

        /// Creates `VkFrameBoundaryEXT.Buffer` with the given segment.
        /// @param segment      the memory segment
        /// @param elementCount the element count
        public Buffer(MemorySegment segment, long elementCount) { super(segment); this.elementCount = elementCount; }

        @Override public long estimateCount() { return elementCount; }

        /// Creates a slice of `VkFrameBoundaryEXT`.
        /// @param index the index of the struct buffer
        /// @return the slice of `VkFrameBoundaryEXT`
        public VkFrameBoundaryEXT asSlice(long index) { return new VkFrameBoundaryEXT(this.segment().asSlice(LAYOUT.scale(0L, index), LAYOUT)); }

        /// Creates a slice of `VkFrameBoundaryEXT`.
        /// @param index the index of the struct buffer
        /// @param count the count
        /// @return the slice of `VkFrameBoundaryEXT`
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

        /// {@return `flags` at the given index}
        /// @param index the index of the struct buffer
        public int flagsAt(long index) { return flags(this.segment(), index); }
        /// Sets `flags` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer flagsAt(long index, int value) { flags(this.segment(), index, value); return this; }

        /// {@return `frameID` at the given index}
        /// @param index the index of the struct buffer
        public long frameIDAt(long index) { return frameID(this.segment(), index); }
        /// Sets `frameID` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer frameIDAt(long index, long value) { frameID(this.segment(), index, value); return this; }

        /// {@return `imageCount` at the given index}
        /// @param index the index of the struct buffer
        public int imageCountAt(long index) { return imageCount(this.segment(), index); }
        /// Sets `imageCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer imageCountAt(long index, int value) { imageCount(this.segment(), index, value); return this; }

        /// {@return `pImages` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pImagesAt(long index) { return pImages(this.segment(), index); }
        /// Sets `pImages` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pImagesAt(long index, MemorySegment value) { pImages(this.segment(), index, value); return this; }

        /// {@return `bufferCount` at the given index}
        /// @param index the index of the struct buffer
        public int bufferCountAt(long index) { return bufferCount(this.segment(), index); }
        /// Sets `bufferCount` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer bufferCountAt(long index, int value) { bufferCount(this.segment(), index, value); return this; }

        /// {@return `pBuffers` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pBuffersAt(long index) { return pBuffers(this.segment(), index); }
        /// Sets `pBuffers` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pBuffersAt(long index, MemorySegment value) { pBuffers(this.segment(), index, value); return this; }

        /// {@return `tagName` at the given index}
        /// @param index the index of the struct buffer
        public long tagNameAt(long index) { return tagName(this.segment(), index); }
        /// Sets `tagName` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer tagNameAt(long index, long value) { tagName(this.segment(), index, value); return this; }

        /// {@return `tagSize` at the given index}
        /// @param index the index of the struct buffer
        public long tagSizeAt(long index) { return tagSize(this.segment(), index); }
        /// Sets `tagSize` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer tagSizeAt(long index, long value) { tagSize(this.segment(), index, value); return this; }

        /// {@return `pTag` at the given index}
        /// @param index the index of the struct buffer
        public MemorySegment pTagAt(long index) { return pTag(this.segment(), index); }
        /// Sets `pTag` with the given value at the given index.
        /// @param index the index of the struct buffer
        /// @param value the value
        /// @return `this`
        public Buffer pTagAt(long index, MemorySegment value) { pTag(this.segment(), index, value); return this; }

    }
}
